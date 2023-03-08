package SpringProject.Controller.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	public ModelAndView SigUp() {
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
		return _myShare;
	}

	@RequestMapping(value = "/dang-nhap", method = RequestMethod.GET)
	public ModelAndView SigIn(HttpSession session, @ModelAttribute("user") Users user) {
		user = usersService.checkUser(user);    
		_myShare.setViewName("user/dang-nhap");
		if(user != null) {
			if(user.getType_account().equalsIgnoreCase("user")) {
				_myShare.setViewName("redirect:trang-chu");
				session.setAttribute("LoginInfo", user);
			}
			else if(user.getType_account().equalsIgnoreCase("admin")) {
				_myShare.setViewName("redirect:quan-tri/");
				session.setAttribute("LoginInfo", user);
			}
		}
		else {
			_myShare.addObject("status", "Đăng nhập thất bại!");
		}
		return _myShare;
	}
	
	@RequestMapping(value = "/dang-xuat", method = RequestMethod.GET)
	public String SigIn(HttpSession session, HttpServletRequest request) {
		session.removeAttribute("LoginInfo");
		return "redirect:trang-chu";
		//return "redirect:"+request.getHeader("Referer");
	}
}
