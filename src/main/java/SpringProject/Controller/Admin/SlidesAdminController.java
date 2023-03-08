package SpringProject.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import SpringProject.Service.Admin.HomeAdminService;

@Controller
public class SlidesAdminController {
	@Autowired
	HomeAdminService homeAdminService;

	@RequestMapping(value = "/quan-tri/danh-sach-slides")
	public ModelAndView SlidesList() {
		ModelAndView mv = new ModelAndView("admin/slides-admin");
		mv.addObject("slides", homeAdminService.GetDataSlides());
		return mv;
	}
}
