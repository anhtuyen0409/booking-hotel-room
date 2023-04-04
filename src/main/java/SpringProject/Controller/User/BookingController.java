package SpringProject.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import SpringProject.Entity.Booking;
import SpringProject.Entity.Rooms;
import SpringProject.Service.User.BookingService;
import SpringProject.Service.User.HomeService;

@Controller
public class BookingController extends BaseController {
	@Autowired
	BookingService bookingService;
	@Autowired
	HomeService homeService;

	@RequestMapping(value = "/dat-phong/id-room={id}", method = RequestMethod.GET)
	public ModelAndView AddBooking(@PathVariable int id) {
		_myShare.setViewName("user/room-detail-booking");
		_myShare.addObject("room", homeService.GetDataRoom(id));
		_myShare.addObject("booking", new Booking());
		return _myShare;
	}

	@RequestMapping(value = "/dat-phong/id-room={id}", method = RequestMethod.POST)
	public ModelAndView createBooking(@ModelAttribute("booking") Booking booking) {
		int count = bookingService.addBooking(booking);
		if (count > 0) {
			_myShare.addObject("status", "Thêm thành công!");
		} else {
			_myShare.addObject("status", "Thêm thất bại!");
		}
		_myShare.setViewName("redirect:dat-thanh-cong");
		return _myShare;
	}
	
	@RequestMapping(value = "/dat-phong/dat-thanh-cong")
	public ModelAndView success() {
		_myShare.setViewName("user/success");
		return _myShare;
	}

}
