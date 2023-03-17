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

import SpringProject.Entity.Slides;
import SpringProject.Entity.TypeRoom;
import SpringProject.Service.Admin.HomeAdminService;
import SpringProject.Service.Admin.TypeRoomAdminService;

@Controller
public class TypeRoomAdminController {
	public ModelAndView _myShare = new ModelAndView();
	@Autowired
	HomeAdminService homeAdminService;
	@Autowired
	TypeRoomAdminService typeRoomAdminService;

	@RequestMapping(value = "/quan-tri/danh-sach-loai-phong")
	public ModelAndView TypeRoomList() {
		_myShare.setViewName("admin/type-room-admin");
		_myShare.addObject("typeRooms", homeAdminService.GetDataTypeRoom());
		return _myShare;
	}
	
	@RequestMapping(value = "/quan-tri/add-typeroom", method = RequestMethod.GET)
	public ModelAndView AddTypeRoom() {
		_myShare.setViewName("admin/add-typeroom-admin");
		_myShare.addObject("typeRoom", new TypeRoom());
		return _myShare;
	}

	@RequestMapping(value = "/quan-tri/add-typeroom", method = RequestMethod.POST)
	public ModelAndView createTypeRoom(@ModelAttribute("typeRoom") TypeRoom typeRoom, @RequestParam("files") MultipartFile files) {
		String nameImage = uploadFile(files);
		if (nameImage != null) {
			typeRoom.setImg(nameImage);
		}
		int count = typeRoomAdminService.addTypeRoom(typeRoom);
		if (count > 0) {
			_myShare.addObject("status", "Thêm thành công!");
		} else {
			_myShare.addObject("status", "Thêm thất bại!");
		}
		_myShare.setViewName("redirect:danh-sach-loai-phong");
		return _myShare;
	}

	private String uploadFile(MultipartFile file) {
		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();
				// String rootPath = System.getProperty("catalina.home");
				File dir = new File("F:/JavaWeb/SpringProject/src/main/webapp/assets/user/img/typeroom");
				if (!dir.exists()) {
					dir.mkdirs();
				}
				String name = "typeroom-" + String.valueOf(new Date().getTime()) + ".jpg";
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

	@RequestMapping(value = "/quan-tri/id-typeroom={id}", method = RequestMethod.GET)
	public ModelAndView deleteTypeRoom(@PathVariable int id) {
		int count = typeRoomAdminService.deleteTypeRoom(id);
		if (count > 0) {
			_myShare.addObject("status", "Xoá thành công!");

		} else {
			_myShare.addObject("status", "Xoá thất bại!");
		}
		_myShare.setViewName("redirect:danh-sach-loai-phong");
		return _myShare;
	}

	@RequestMapping(value = "quan-tri/update-typeroom/id-typeroom={id}", method = RequestMethod.GET)
	public ModelAndView editTypeRoom(@PathVariable int id) {
		_myShare.addObject("typeRoomDetail", typeRoomAdminService.getTypeRoom(id));
		_myShare.setViewName("admin/typeRoom-detail");
		return _myShare;
	}

	@RequestMapping(value = "quan-tri/update-typeroom/id-typeroom={id}", method = RequestMethod.POST)
	public ModelAndView updateTypeRoom(@ModelAttribute("typeRoomDetail") TypeRoom typeRoom,
			@RequestParam("files") MultipartFile files) {
		String nameImage = uploadFile(files);
		if (nameImage != null) {
			typeRoom.setImg(nameImage);
		}
		int count = typeRoomAdminService.updateTypeRoom(typeRoom);
		if (count > 0) {
			_myShare.addObject("status", "Sửa thành công!");
		} else {
			_myShare.addObject("status", "Sửa thất bại!");
		}
		_myShare.setViewName("redirect:/quan-tri/danh-sach-loai-phong");
		return _myShare;
	}
}
