package SpringProject.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import SpringProject.Service.Admin.BookingAdminService;
import SpringProject.Service.Admin.PostsAdminService;
import SpringProject.Service.Admin.RoomsAdminService;
import SpringProject.Service.Admin.ServicesAdminService;
import SpringProject.Service.Admin.TypeRoomAdminService;
import SpringProject.Service.Admin.UsersAdminService;

@Controller
public class HomeAdminController {
	@Autowired
	BookingAdminService bookingAdminService;
	@Autowired
	UsersAdminService userAdminService;
	@Autowired
	RoomsAdminService roomAdminService;
	@Autowired
	TypeRoomAdminService typeroomAdminService;
	@Autowired
	PostsAdminService postAdminService;
	@Autowired
	ServicesAdminService serviceAdminService;

	@RequestMapping(value = "/quan-tri")
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("admin/index-admin");
		mv.addObject("countBooking", bookingAdminService.countBooking());
		mv.addObject("countUser", userAdminService.countUser());
		mv.addObject("countRoom", roomAdminService.countRoom());
		mv.addObject("countTypeRoom", typeroomAdminService.countTypeRoom());
		mv.addObject("countPost", postAdminService.countPost());
		mv.addObject("countService", serviceAdminService.countService());
		return mv;
	}

}
