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
import SpringProject.Service.Admin.HomeAdminService;
import SpringProject.Service.Admin.SlidesAdminService;

@Controller
public class SlidesAdminController {
	public ModelAndView _myShare = new ModelAndView();
	@Autowired
	HomeAdminService homeAdminService;
	@Autowired
	SlidesAdminService slidesAdminService;

	@RequestMapping(value = "/quan-tri/danh-sach-slides")
	public ModelAndView SlidesList() {
		_myShare.setViewName("admin/slides-admin");
		_myShare.addObject("slides", homeAdminService.GetDataSlides());
		return _myShare;
	}

	@RequestMapping(value = "/quan-tri/add-slide", method = RequestMethod.GET)
	public ModelAndView AddSlide() {
		_myShare.setViewName("admin/add-slide-admin");
		_myShare.addObject("slide", new Slides());
		return _myShare;
	}

	@RequestMapping(value = "/quan-tri/add-slide", method = RequestMethod.POST)
	public ModelAndView createSlide(@ModelAttribute("slide") Slides slide, @RequestParam("files") MultipartFile files) {
		String nameImage = uploadFile(files);
		if (nameImage != null) {
			slide.setImg(nameImage);
		}
		int count = slidesAdminService.addSlide(slide);
		if (count > 0) {
			_myShare.addObject("status", "Thêm thành công!");
		} else {
			_myShare.addObject("status", "Thêm thất bại!");
		}
		_myShare.setViewName("redirect:danh-sach-slides");
		return _myShare;
	}

	private String uploadFile(MultipartFile file) {
		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();
				// String rootPath = System.getProperty("catalina.home");
				File dir = new File("F:/JavaWeb/SpringProject/src/main/webapp/assets/user/img/hero");
				if (!dir.exists()) {
					dir.mkdirs();
				}
				String name = "hero-" + String.valueOf(new Date().getTime()) + ".jpg";
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

	@RequestMapping(value = "/quan-tri/id-slide={id}", method = RequestMethod.GET)
	public ModelAndView deleteSlide(@PathVariable int id) {
		int count = slidesAdminService.deleteSlide(id);
		if (count > 0) {
			_myShare.addObject("status", "Xoá thành công!");

		} else {
			_myShare.addObject("status", "Xoá thất bại!");
		}
		_myShare.setViewName("redirect:danh-sach-slides");
		return _myShare;
	}

	@RequestMapping(value = "quan-tri/update-slide/id-slide={id}", method = RequestMethod.GET)
	public ModelAndView editSlide(@PathVariable int id) {
		_myShare.addObject("slideDetail", slidesAdminService.getSlide(id));
		_myShare.setViewName("admin/slide-detail");
		return _myShare;
	}

	@RequestMapping(value = "quan-tri/update-slide/id-slide={id}", method = RequestMethod.POST)
	public ModelAndView updateSlide(@ModelAttribute("slideDetail") Slides slide,
			@RequestParam("files") MultipartFile files) {
		String nameImage = uploadFile(files);
		if (nameImage != null) {
			slide.setImg(nameImage);
		}
		int count = slidesAdminService.updateSlide(slide);
		if (count > 0) {
			_myShare.addObject("status", "Sửa thành công!");
		} else {
			_myShare.addObject("status", "Sửa thất bại!");
		}
		_myShare.setViewName("redirect:/quan-tri/danh-sach-slides");
		return _myShare;
	}
}
