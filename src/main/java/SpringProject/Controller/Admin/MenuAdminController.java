package SpringProject.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import SpringProject.Entity.Menus;
import SpringProject.Service.Admin.HomeAdminService;
import SpringProject.Service.Admin.MenusAdminService;

@Controller
public class MenuAdminController {
	public ModelAndView _myShare = new ModelAndView();
	@Autowired
	HomeAdminService homeAdminService;
	@Autowired
	MenusAdminService menusAdminService;

	@RequestMapping(value = "/quan-tri/danh-sach-menu")
	public ModelAndView MenuList() {
		_myShare.setViewName("admin/menus-admin");
		_myShare.addObject("menus", homeAdminService.GetDataMenus());
		return _myShare;
	}

	@RequestMapping(value = "/quan-tri/add-menu", method = RequestMethod.GET)
	public ModelAndView AddMenu() {
		_myShare.setViewName("admin/add-menu-admin");
		_myShare.addObject("menu", new Menus());
		return _myShare;
	}

	@RequestMapping(value = "/quan-tri/add-menu", method = RequestMethod.POST)
	public ModelAndView createMenu(@ModelAttribute("menu") Menus menu) {
		int count = menusAdminService.addMenu(menu);
		if (count > 0) {
			_myShare.addObject("status", "Thêm thành công!");
		} else {
			_myShare.addObject("status", "Thêm thất bại!");
		}
		_myShare.setViewName("redirect:danh-sach-menu");
		return _myShare;
	}

	@RequestMapping(value = "/quan-tri/id-menu={id}", method = RequestMethod.GET)
	public ModelAndView deleteMenu(@PathVariable int id) {
		int count = menusAdminService.deleteMenu(id);
		if (count > 0) {
			_myShare.addObject("status", "Xoá thành công!");

		} else {
			_myShare.addObject("status", "Xoá thất bại!");
		}
		_myShare.setViewName("redirect:danh-sach-menu");
		return _myShare;
	}

	@RequestMapping(value = "quan-tri/update-menu/id-menu={id}", method = RequestMethod.GET)
	public ModelAndView editMenu(@PathVariable int id) {
		_myShare.addObject("menuDetail", menusAdminService.getMenu(id));
		_myShare.setViewName("admin/menu-detail");
		return _myShare;
	}
	
	@RequestMapping(value = "quan-tri/update-menu/id-menu={id}", method = RequestMethod.POST)
	public ModelAndView updateMenu(@ModelAttribute("menuDetail") Menus menu) {
		int count = menusAdminService.updateMenu(menu);
		if (count > 0) {
			_myShare.addObject("status", "Sửa thành công!");
		} else {
			_myShare.addObject("status", "Sửa thất bại!");
		}
		_myShare.setViewName("redirect:/quan-tri/danh-sach-menu");
		return _myShare;
	}
}
