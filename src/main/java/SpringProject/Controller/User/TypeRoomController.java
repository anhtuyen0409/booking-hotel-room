package SpringProject.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TypeRoomController extends BaseController {
	@RequestMapping(value = "/phong-nghi")
	public ModelAndView Rooms() {
		_myShare.addObject("typeRoom", _homeService.GetDataTypeRoom());
		_myShare.setViewName("user/phong-nghi");
		return _myShare;
	}
}
