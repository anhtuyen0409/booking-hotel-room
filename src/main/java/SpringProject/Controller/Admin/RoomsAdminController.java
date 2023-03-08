package SpringProject.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import SpringProject.Service.Admin.HomeAdminService;

@Controller
public class RoomsAdminController {
	@Autowired
	HomeAdminService homeAdminService;

	@RequestMapping(value = "/quan-tri/danh-sach-phong")
	public ModelAndView RoomList() {
		ModelAndView mv = new ModelAndView("admin/rooms-admin");
		mv.addObject("rooms", homeAdminService.GetDataRooms());
		return mv;
	}
}
