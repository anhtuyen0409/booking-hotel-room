package SpringProject.Controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import SpringProject.Service.Admin.BookingAdminService;
import SpringProject.Service.Admin.HomeAdminService;

@Controller
public class BookingAdminController {
	public ModelAndView _myShare = new ModelAndView();
	@Autowired
	HomeAdminService homeAdminService;
	@Autowired
	BookingAdminService bookingAdminService;

	@RequestMapping(value = "/quan-tri/danh-sach-dat-phong")
	public ModelAndView BookingList() {
		_myShare.setViewName("admin/booking-admin");
		_myShare.addObject("booking", homeAdminService.GetDataBooking());
		return _myShare;
	}
	
	@RequestMapping(value = "/quan-tri/id-booking={id}", method = RequestMethod.GET)
	public ModelAndView deleteBooking(@PathVariable int id) {
		int count = bookingAdminService.deleteBooking(id);
		if (count > 0) {
			_myShare.addObject("status", "Xoá thành công!");

		} else {
			_myShare.addObject("status", "Xoá thất bại!");
		}
		_myShare.setViewName("redirect:danh-sach-dat-phong");
		return _myShare;
	}

}
