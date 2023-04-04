package SpringProject.Service.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface IBookingAdmin {
	@Autowired
	public int countBooking();
	@Autowired
	public int deleteBooking(int id);
}
