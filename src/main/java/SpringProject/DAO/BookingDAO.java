package SpringProject.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import SpringProject.Entity.Booking;
import SpringProject.Entity.MapperBooking;
import SpringProject.Entity.Rooms;

@Repository
public class BookingDAO extends BaseDAO {
	public List<Booking> GetDataBooking() {
		List<Booking> list = new ArrayList<Booking>();
		String sql = "SELECT * FROM booking WHERE is_delete = 0";
		list = _jdbcTemplate.query(sql, new MapperBooking());
		return list;
	}

	// đếm số đơn đặt phòng
	public int countBooking() {
		String sql = "SELECT COUNT(*) FROM booking WHERE is_delete = 0";
		int result = _jdbcTemplate.queryForObject(sql, Integer.class);
		return result;
	}

	// xoá booking
	public int deleteBooking(int id) {
		String sql = "UPDATE booking SET is_delete = 1 WHERE id = " + id;
		int delete = _jdbcTemplate.update(sql);
		return delete;
	}
}
