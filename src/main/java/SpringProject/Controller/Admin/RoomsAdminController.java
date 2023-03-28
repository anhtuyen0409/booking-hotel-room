package SpringProject.Controller.Admin;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import SpringProject.Entity.Rooms;
import SpringProject.Service.Admin.HomeAdminService;
import SpringProject.Service.Admin.RoomsAdminService;

@Controller
public class RoomsAdminController {
	public ModelAndView _myShare = new ModelAndView();
	@Autowired
	HomeAdminService homeAdminService;
	@Autowired
	RoomsAdminService roomAdminService;

	@RequestMapping(value = "/quan-tri/danh-sach-phong")
	public ModelAndView RoomList() {
		_myShare.setViewName("admin/rooms-admin");
		_myShare.addObject("rooms", homeAdminService.GetDataRooms());
		return _myShare;
	}

	@RequestMapping(value = "/quan-tri/add-room", method = RequestMethod.GET)
	public ModelAndView AddRoom() {
		_myShare.setViewName("admin/add-room-admin");
		_myShare.addObject("typeRoom", homeAdminService.GetDataTypeRoom());
		_myShare.addObject("room", new Rooms());
		return _myShare;
	}

	@RequestMapping(value = "/quan-tri/add-room", method = RequestMethod.POST)
	public ModelAndView createRoom(@ModelAttribute("room") Rooms room, @RequestParam("files") MultipartFile files) {
		String nameImage = uploadFile(files);
		if (nameImage != null) {
			room.setImg(nameImage);
		}
		int count = roomAdminService.addRoom(room);
		if (count > 0) {
			_myShare.addObject("status", "Thêm thành công!");
		} else {
			_myShare.addObject("status", "Thêm thất bại!");
		}
		_myShare.setViewName("redirect:danh-sach-phong");
		return _myShare;
	}

	private String uploadFile(MultipartFile file) {
		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();
				// String rootPath = System.getProperty("catalina.home");
				File dir = new File("F:/JavaWeb/SpringProject/src/main/webapp/assets/user/img/room");
				if (!dir.exists()) {
					dir.mkdirs();
				}
				String name = "room-" + String.valueOf(new Date().getTime()) + ".jpg";
				File serverFile = new File(dir.getAbsolutePath() + File.separator + name);
				System.out.println("Path: " + serverFile.getPath());
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
				return name;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {

		}
		return null;
	}

	@RequestMapping(value = "/quan-tri/id-room={id}", method = RequestMethod.GET)
	public ModelAndView deleteRoom(@PathVariable int id) {
		int count = roomAdminService.deleteRoom(id);
		if (count > 0) {
			_myShare.addObject("status", "Xoá thành công!");

		} else {
			_myShare.addObject("status", "Xoá thất bại!");
		}
		_myShare.setViewName("redirect:danh-sach-phong");
		return _myShare;
	}

	@RequestMapping(value = "quan-tri/update-room/id-room={id}", method = RequestMethod.GET)
	public ModelAndView editRoom(@PathVariable int id) {
		_myShare.addObject("roomDetail", roomAdminService.getRoom(id));
		_myShare.setViewName("admin/room-detail");
		return _myShare;
	}

	@RequestMapping(value = "quan-tri/update-room/id-room={id}", method = RequestMethod.POST)
	public ModelAndView updateRoom(@ModelAttribute("roomDetail") Rooms room,
			@RequestParam("files") MultipartFile files) {
		String nameImage = uploadFile(files);
		if (nameImage != null) {
			room.setImg(nameImage);
		}
		int count = roomAdminService.updateRoom(room);
		if (count > 0) {
			_myShare.addObject("status", "Sửa thành công!");
		} else {
			_myShare.addObject("status", "Sửa thất bại!");
		}
		_myShare.setViewName("redirect:/quan-tri/danh-sach-phong");
		return _myShare;
	}
}
