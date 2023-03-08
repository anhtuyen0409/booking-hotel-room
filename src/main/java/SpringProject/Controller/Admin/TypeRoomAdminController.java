package SpringProject.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import SpringProject.Service.Admin.HomeAdminService;

@Controller
public class TypeRoomAdminController {
	@Autowired
	HomeAdminService homeAdminService;

	@RequestMapping(value = "/quan-tri/danh-sach-loai-phong")
	public ModelAndView TypeRoomList() {
		ModelAndView mv = new ModelAndView("admin/type-room-admin");
		mv.addObject("typeRooms", homeAdminService.GetDataTypeRoom());
		return mv;
	}
}
