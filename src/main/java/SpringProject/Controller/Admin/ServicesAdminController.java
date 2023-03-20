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

import SpringProject.Entity.Services;
import SpringProject.Service.Admin.HomeAdminService;
import SpringProject.Service.Admin.ServicesAdminService;

@Controller
public class ServicesAdminController {
	public ModelAndView _myShare = new ModelAndView();
	@Autowired
	HomeAdminService homeAdminService;
	@Autowired
	ServicesAdminService serviceAdminService;

	@RequestMapping(value = "/quan-tri/danh-sach-dich-vu")
	public ModelAndView ServiceList() {
		_myShare.setViewName("admin/services-admin");
		_myShare.addObject("services", homeAdminService.GetDataServices());
		return _myShare;
	}

	@RequestMapping(value = "/quan-tri/add-service", method = RequestMethod.GET)
	public ModelAndView AddService() {
		_myShare.setViewName("admin/add-service-admin");
		_myShare.addObject("service", new Services());
		return _myShare;
	}

	@RequestMapping(value = "/quan-tri/add-service", method = RequestMethod.POST)
	public ModelAndView createService(@ModelAttribute("service") Services service,
			@RequestParam("files") MultipartFile files) {
		String nameImage = uploadFile(files);
		if (nameImage != null) {
			service.setImg(nameImage);
		}
		int count = serviceAdminService.addService(service);
		if (count > 0) {
			_myShare.addObject("status", "Thêm thành công!");
		} else {
			_myShare.addObject("status", "Thêm thất bại!");
		}
		_myShare.setViewName("redirect:danh-sach-dich-vu");
		return _myShare;
	}

	private String uploadFile(MultipartFile file) {
		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();
				// String rootPath = System.getProperty("catalina.home");
				File dir = new File("F:/JavaWeb/SpringProject/src/main/webapp/assets/user/img/services");
				if (!dir.exists()) {
					dir.mkdirs();
				}
				String name = "service-" + String.valueOf(new Date().getTime()) + ".jpg";
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

	@RequestMapping(value = "/quan-tri/id-service={id}", method = RequestMethod.GET)
	public ModelAndView deleteService(@PathVariable int id) {
		int count = serviceAdminService.deleteService(id);
		if (count > 0) {
			_myShare.addObject("status", "Xoá thành công!");

		} else {
			_myShare.addObject("status", "Xoá thất bại!");
		}
		_myShare.setViewName("redirect:danh-sach-dich-vu");
		return _myShare;
	}

	@RequestMapping(value = "quan-tri/update-service/id-service={id}", method = RequestMethod.GET)
	public ModelAndView editService(@PathVariable int id) {
		_myShare.addObject("serviceDetail", serviceAdminService.getService(id));
		_myShare.setViewName("admin/service-detail");
		return _myShare;
	}

	@RequestMapping(value = "quan-tri/update-service/id-service={id}", method = RequestMethod.POST)
	public ModelAndView updateService(@ModelAttribute("serviceDetail") Services service,
			@RequestParam("files") MultipartFile files) {
		String nameImage = uploadFile(files);
		if (nameImage != null) {
			service.setImg(nameImage);
		}
		int count = serviceAdminService.updateService(service);
		if (count > 0) {
			_myShare.addObject("status", "Sửa thành công!");
		} else {
			_myShare.addObject("status", "Sửa thất bại!");
		}
		_myShare.setViewName("redirect:/quan-tri/danh-sach-dich-vu");
		return _myShare;
	}
}
