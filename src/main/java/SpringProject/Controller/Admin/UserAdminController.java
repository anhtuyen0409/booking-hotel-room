package SpringProject.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import SpringProject.Service.Admin.HomeAdminService;

@Controller
public class UserAdminController {
	@Autowired
	HomeAdminService homeAdminService;

	@RequestMapping(value = "/quan-tri/danh-sach-nguoi-dung")
	public ModelAndView UserList() {
		ModelAndView mv = new ModelAndView("admin/user-admin");
		mv.addObject("users", homeAdminService.GetDataUsers());
		return mv;
	}
}
