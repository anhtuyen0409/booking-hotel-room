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
	
	@RequestMapping(value = "/phong-nghi")
	public ModelAndView Rooms() {
		//ModelAndView mv = new ModelAndView("user/phong-nghi");
		_myShare.addObject("typeRoom", _homeService.GetDataTypeRoom());
		_myShare.setViewName("user/phong-nghi");
		return _myShare;
	}
	
	@RequestMapping(value = "/ve-chung-toi")
	public ModelAndView About() {
		//ModelAndView mv = new ModelAndView("user/ve-chung-toi");
		_myShare.setViewName("user/ve-chung-toi");
		return _myShare;
	}
	
	@RequestMapping(value = "/bai-viet")
	public ModelAndView Posts() {
		//ModelAndView mv = new ModelAndView("user/bai-viet");
		_myShare.setViewName("user/bai-viet");
		return _myShare;
	}
	
	@RequestMapping(value = "/lien-he")
	public ModelAndView Contact() {
		_myShare.setViewName("user/lien-he");
		return _myShare;
	}
}

