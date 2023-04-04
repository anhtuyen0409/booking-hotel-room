package SpringProject.Service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.DAO.RoomsDAO;
import SpringProject.Entity.Booking;

@Service
public class BookingService implements IBooking {
	@Autowired
	private RoomsDAO roomDao;

	public int addBooking(Booking booking) {
		return roomDao.addBooking(booking);
	}

}
