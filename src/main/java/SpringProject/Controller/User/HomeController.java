package SpringProject.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController {

	@RequestMapping(value = { "/", "/trang-chu" })
	public ModelAndView Index() {
		// ModelAndView mv = new ModelAndView("user/index");
		_myShare.addObject("slides", _homeService.GetDataSlides());
		_myShare.addObject("typeRoom", _homeService.GetDataTypeRoom());
		_myShare.addObject("services", _homeService.GetDataServices());
		_myShare.addObject("newRooms", _homeService.GetDataNewRooms());
		_myShare.addObject("newPosts", _homeService.GetDataNewPosts());
		_myShare.setViewName("user/index");
		return _myShare;
	}

	@RequestMapping(value = "/ve-chung-toi")
	public ModelAndView About() {
		// ModelAndView mv = new ModelAndView("user/ve-chung-toi");
		_myShare.setViewName("user/ve-chung-toi");
		return _myShare;
	}

	@RequestMapping(value = "/lien-he")
	public ModelAndView Contact() {
		_myShare.setViewName("user/lien-he");
		return _myShare;
	}

}
