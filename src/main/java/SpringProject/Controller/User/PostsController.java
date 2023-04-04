package SpringProject.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import SpringProject.DTO.PaginatesDTO;
import SpringProject.Service.User.PaginatesService;

@Controller
public class PostsController extends BaseController {
	@Autowired
	private PaginatesService paginateService;

	private int totalPage = 3;

	@RequestMapping(value = "/bai-viet")
	public ModelAndView Posts() {
		int totalData = _homeService.GetDataPosts().size();
		PaginatesDTO paginateInfo = paginateService.GetInfoPaginates(totalData, totalPage, 1);
		_myShare.addObject("paginateInfo", paginateInfo);
		_myShare.addObject("postsPaginate", _homeService.GetDataPostsPaginate(paginateInfo.getStart(), totalPage));
		_myShare.setViewName("user/bai-viet");
		return _myShare;
	}

	@RequestMapping(value = "/bai-viet/page={currentPage}")
	public ModelAndView PostsPaginate(@PathVariable int currentPage) {
		int totalData = _homeService.GetDataPosts().size();
		PaginatesDTO paginateInfo = paginateService.GetInfoPaginates(totalData, totalPage, currentPage);
		_myShare.addObject("paginateInfo", paginateInfo);
		_myShare.addObject("postsPaginate", _homeService.GetDataPostsPaginate(paginateInfo.getStart(), totalPage));
		_myShare.setViewName("user/bai-viet");
		return _myShare;
	}

	@RequestMapping(value = "/bai-viet/id-post={id}")
	public ModelAndView PostDetail(@PathVariable int id) {
		_myShare.addObject("postDetail", _homeService.GetDataPost(id));
		_myShare.setViewName("user/post-detail");
		return _myShare;
	}
}
