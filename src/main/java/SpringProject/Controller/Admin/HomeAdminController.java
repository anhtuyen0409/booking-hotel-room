package SpringProject.Controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeAdminController {
	@RequestMapping(value = "/quan-tri")
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("admin/index-admin");
		return mv;
	}
	
}
