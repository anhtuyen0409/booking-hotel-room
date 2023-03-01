package SpringProject.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostsController extends BaseController {
	@RequestMapping(value = "/bai-viet")
	public ModelAndView Posts() {
		// ModelAndView mv = new ModelAndView("user/bai-viet");
		_myShare.addObject("posts", _homeService.GetDataPosts());
		_myShare.setViewName("user/bai-viet");
		return _myShare;
	}
}
