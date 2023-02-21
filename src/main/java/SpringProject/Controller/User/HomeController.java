package SpringProject.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController{
	
	@RequestMapping(value = {"/", "/trang-chu"})
	public ModelAndView Index() {
		//ModelAndView mv = new ModelAndView("user/index");
		_myShare.addObject("slides",_homeService.GetDataSlides());
		_myShare.addObject("typeRoom", _homeService.GetDataTypeRoom());
		_myShare.addObject("services", _homeService.GetDataServices());
		_myShare.setViewName("user/index");
		return _myShare;
	}
	
	@RequestMapping(value = "/rooms")
	public ModelAndView Rooms() {
		ModelAndView mv = new ModelAndView("user/rooms");
		return mv;
	}
}

