package SpringProject.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import SpringProject.DTO.PaginatesDTO;
import SpringProject.Service.User.CommentService;
import SpringProject.Service.User.PaginatesService;

@Controller
public class RoomsController extends BaseController {
	@Autowired
	private PaginatesService paginateService;
	@Autowired
	CommentService commentService;

	private int totalPage = 6;

	@RequestMapping(value = "/phong-nghi/type-room=Normal")
	public ModelAndView NormalRoom() {
		int totalData = _homeService.GetDataNormalRoom().size();
		PaginatesDTO paginateInfo = paginateService.GetInfoPaginates(totalData, totalPage, 1);
		_myShare.addObject("paginateInfo", paginateInfo);
		_myShare.addObject("normalRoomsPaginate",
				_homeService.GetDataNormalRoomPaginate(paginateInfo.getStart(), totalPage));
		_myShare.setViewName("user/Normal");
		return _myShare;
	}

	@RequestMapping(value = "/phong-nghi/type-room=Normal/page={currentPage}")
	public ModelAndView NormalRoomPaginate(@PathVariable int currentPage) {
		int totalData = _homeService.GetDataNormalRoom().size();
		PaginatesDTO paginateInfo = paginateService.GetInfoPaginates(totalData, totalPage, currentPage);
		_myShare.addObject("paginateInfo", paginateInfo);
		_myShare.addObject("normalRoomsPaginate",
				_homeService.GetDataNormalRoomPaginate(paginateInfo.getStart(), totalPage));
		_myShare.setViewName("user/Normal");
		return _myShare;
	}

	@RequestMapping(value = "/phong-nghi/type-room=Vip")
	public ModelAndView VipRoom() {
		int totalData = _homeService.GetDataVipRoom().size();
		PaginatesDTO paginateInfo = paginateService.GetInfoPaginates(totalData, totalPage, 1);
		_myShare.addObject("paginateInfo", paginateInfo);
		_myShare.addObject("vipRoomsPaginate", _homeService.GetDataVipRoomPaginate(paginateInfo.getStart(), totalPage));
		_myShare.setViewName("user/Vip");
		return _myShare;
	}

	@RequestMapping(value = "/phong-nghi/type-room=Vip/page={currentPage}")
	public ModelAndView VipRoomPaginate(@PathVariable int currentPage) {
		int totalData = _homeService.GetDataVipRoom().size();
		PaginatesDTO paginateInfo = paginateService.GetInfoPaginates(totalData, totalPage, currentPage);
		_myShare.addObject("paginateInfo", paginateInfo);
		_myShare.addObject("vipRoomsPaginate", _homeService.GetDataVipRoomPaginate(paginateInfo.getStart(), totalPage));
		_myShare.setViewName("user/Vip");
		return _myShare;
	}

	@RequestMapping(value = "/phong-nghi/type-room=Homestay")
	public ModelAndView HomestayRoom() {
		int totalData = _homeService.GetDataHomestayRoom().size();
		PaginatesDTO paginateInfo = paginateService.GetInfoPaginates(totalData, totalPage, 1);
		_myShare.addObject("paginateInfo", paginateInfo);
		_myShare.addObject("homestayRoomsPaginate",
				_homeService.GetDataHomestayRoomPaginate(paginateInfo.getStart(), totalPage));
		_myShare.setViewName("user/Homestay");
		return _myShare;
	}

	@RequestMapping(value = "/phong-nghi/type-room=Homestay/page={currentPage}")
	public ModelAndView HomestayRoomPaginate(@PathVariable int currentPage) {
		int totalData = _homeService.GetDataHomestayRoom().size();
		PaginatesDTO paginateInfo = paginateService.GetInfoPaginates(totalData, totalPage, currentPage);
		_myShare.addObject("paginateInfo", paginateInfo);
		_myShare.addObject("homestayRoomsPaginate",
				_homeService.GetDataHomestayRoomPaginate(paginateInfo.getStart(), totalPage));
		_myShare.setViewName("user/Homestay");
		return _myShare;
	}

	@RequestMapping(value = "/phong-nghi/type-room=Normal/id-room={id}")
	public ModelAndView NormalRoomDetail(@PathVariable int id) {
		_myShare.addObject("roomDetail", _homeService.GetDataRoom(id));
		_myShare.addObject("comments", commentService.GetDataComments(id));
		_myShare.setViewName("user/room-detail");
		return _myShare;
	}

	@RequestMapping(value = "/phong-nghi/type-room=Vip/id-room={id}")
	public ModelAndView VipRoomDetail(@PathVariable int id) {
		_myShare.addObject("roomDetail", _homeService.GetDataRoom(id));
		_myShare.addObject("comments", commentService.GetDataComments(id));
		_myShare.setViewName("user/room-detail");
		return _myShare;
	}

	@RequestMapping(value = "/phong-nghi/type-room=Homestay/id-room={id}")
	public ModelAndView HomestayRoomDetail(@PathVariable int id) {
		_myShare.addObject("roomDetail", _homeService.GetDataRoom(id));
		_myShare.addObject("comments", commentService.GetDataComments(id));
		_myShare.setViewName("user/room-detail");
		return _myShare;
	}

	@RequestMapping(value = "/phong-nghi/danh-sach-phong-trong/id-typeroom={id}")
	public ModelAndView findRooms(@PathVariable int id_typeRoom) {
		_myShare.addObject("rooms", _homeService.FindRooms(id_typeRoom));
		_myShare.setViewName("user/find-rooms");
		return _myShare;
	}

}
