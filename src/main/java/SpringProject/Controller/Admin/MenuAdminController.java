package SpringProject.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import SpringProject.Service.Admin.HomeAdminService;

@Controller
public class MenuAdminController {
	@Autowired
	HomeAdminService homeAdminService;

	@RequestMapping(value = "/quan-tri/danh-sach-menu")
	public ModelAndView MenuList() {
		ModelAndView mv = new ModelAndView("admin/menus-admin");
		mv.addObject("menus", homeAdminService.GetDataMenus());
		return mv;
	}
}
