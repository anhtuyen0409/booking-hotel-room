package SpringProject.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import SpringProject.Service.Admin.HomeAdminService;
import SpringProject.Service.Admin.UsersAdminService;

@Controller
public class UserAdminController {
	public ModelAndView _myShare = new ModelAndView();
	@Autowired
	HomeAdminService homeAdminService;
	@Autowired
	UsersAdminService userAdminService;

	@RequestMapping(value = "/quan-tri/danh-sach-nguoi-dung")
	public ModelAndView UserList() {
		_myShare.setViewName("admin/user-admin");
		_myShare.addObject("users", homeAdminService.GetDataUsers());
		return _myShare;
	}

	@RequestMapping(value = "/quan-tri/id-user={id}", method = RequestMethod.GET)
	public ModelAndView deleteUser(@PathVariable int id) {
		int count = userAdminService.deleteUser(id);
		if (count > 0) {
			_myShare.addObject("status", "Xoá thành công!");

		} else {
			_myShare.addObject("status", "Xoá thất bại!");
		}
		_myShare.setViewName("redirect:danh-sach-nguoi-dung");
		return _myShare;
	}
}
