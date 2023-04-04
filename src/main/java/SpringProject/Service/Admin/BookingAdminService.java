package SpringProject.Service.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.DAO.BookingDAO;

@Service
public class BookingAdminService implements IBookingAdmin {
	@Autowired
	private BookingDAO bookingDAO;

	public int countBooking() {
		return bookingDAO.countBooking();
	}

	public int deleteBooking(int id) {
		return bookingDAO.deleteBooking(id);
	}

}
