package SpringProject.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import SpringProject.DAO.SlidesDAO;
import SpringProject.Service.User.HomeService;

@Controller
public class HomeController {
	@Autowired
	HomeService homeService;
	
	@RequestMapping(value = {"/", "/trang-chu"})
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("user/index");
		mv.addObject("slides",homeService.GetDataSlides());
		mv.addObject("typeRoom", homeService.GetDataTypeRoom());
		return mv;
	}
	
	@RequestMapping(value = "/rooms")
	public ModelAndView Rooms() {
		ModelAndView mv = new ModelAndView("user/rooms");
		return mv;
	}
}

