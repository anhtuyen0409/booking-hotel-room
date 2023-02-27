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
		_myShare.addObject("newRooms", _homeService.GetDataNewRooms());
		_myShare.addObject("newPosts", _homeService.GetDataNewPosts());
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
		_myShare.addObject("posts", _homeService.GetDataPosts());
		_myShare.setViewName("user/bai-viet");
		return _myShare;
	}
	
	@RequestMapping(value = "/lien-he")
	public ModelAndView Contact() {
		_myShare.setViewName("user/lien-he");
		return _myShare;
	}
	
	@RequestMapping(value = "/phong-nghi/Normal")
	public ModelAndView Normal() {
		//ModelAndView mv = new ModelAndView("user/phong-nghi");
		_myShare.addObject("normalRooms", _homeService.GetDataNormalRooms());
		_myShare.setViewName("user/Normal");
		return _myShare;
	}
	
	@RequestMapping(value = "/phong-nghi/Vip")
	public ModelAndView Vip() {
		//ModelAndView mv = new ModelAndView("user/phong-nghi");
		_myShare.addObject("vipRooms", _homeService.GetDataVipRooms());
		_myShare.setViewName("user/Vip");
		return _myShare;
	}
	
	@RequestMapping(value = "/phong-nghi/Homestay")
	public ModelAndView Homestay() {
		//ModelAndView mv = new ModelAndView("user/phong-nghi");
		_myShare.addObject("homestayRooms", _homeService.GetDataHomestayRooms());
		_myShare.setViewName("user/Homestay");
		return _myShare;
	}
}

