package SpringProject.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import SpringProject.Entity.Users;
import SpringProject.Service.User.UsersService;

@Controller
public class UserController extends BaseController {
	@Autowired
	private UsersService usersService;

	@RequestMapping(value = "/dang-ky", method = RequestMethod.GET)
	public ModelAndView Sigup() {
		_myShare.setViewName("user/dang-ky");
		_myShare.addObject("user", new Users());
		return _myShare;
	}

	@RequestMapping(value = "/dang-ky", method = RequestMethod.POST)
	public ModelAndView createAccount(@ModelAttribute("user") Users user) {
		int count = usersService.addUser(user);
		if(count > 0) {
			_myShare.addObject("status", "Đăng ký tài khoản thành công!");
		}
		else {
			_myShare.addObject("status", "Đăng ký tài khoản thất bại!");
		}
		_myShare.setViewName("user/dang-ky");
		//_myShare.addObject("status", true);
		return _myShare;
	}

	@RequestMapping(value = "/dang-nhap")
	public ModelAndView SigIn() {
		_myShare.setViewName("user/dang-nhap");
		return _myShare;
	}
}
