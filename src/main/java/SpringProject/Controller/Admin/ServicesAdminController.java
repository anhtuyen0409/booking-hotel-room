package SpringProject.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import SpringProject.Service.Admin.HomeAdminService;

@Controller
public class ServicesAdminController {
	@Autowired
	HomeAdminService homeAdminService;

	@RequestMapping(value = "/quan-tri/danh-sach-dich-vu")
	public ModelAndView ServiceList() {
		ModelAndView mv = new ModelAndView("admin/services-admin");
		mv.addObject("services", homeAdminService.GetDataServices());
		return mv;
	}
}
