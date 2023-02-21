package SpringProject.Controller.User;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import SpringProject.Service.User.HomeService;

@Controller
public class BaseController {
	@Autowired
	HomeService _homeService;
	public ModelAndView _myShare = new ModelAndView();
	
	//khi run sẽ chạy init trước
	@PostConstruct
	public ModelAndView Init() {
		_myShare.addObject("menus", _homeService.GetDataMenus());
		return _myShare;
	}
}
