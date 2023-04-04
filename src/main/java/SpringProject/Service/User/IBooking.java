package SpringProject.Service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.Entity.Booking;

@Service
public interface IBooking {
	@Autowired
	public int addBooking(Booking booking);
}
