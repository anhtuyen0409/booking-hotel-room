package SpringProject.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import SpringProject.Service.Admin.HomeAdminService;

@Controller
public class PostsAdminController {
	@Autowired
	HomeAdminService homeAdminService;

	@RequestMapping(value = "/quan-tri/danh-sach-bai-viet")
	public ModelAndView PostsList() {
		ModelAndView mv = new ModelAndView("admin/bai-viet-admin");
		mv.addObject("posts", homeAdminService.GetDataPosts());
		return mv;
	}
}
