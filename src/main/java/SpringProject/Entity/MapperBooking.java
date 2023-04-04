package SpringProject.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperBooking implements RowMapper<Booking> {

	public Booking mapRow(ResultSet rs, int rowNum) throws SQLException {
		Booking booking = new Booking();
		booking.setId(rs.getInt("id"));
		booking.setId_user(rs.getInt("id_user"));
		booking.setEmail(rs.getString("email"));
		booking.setId_room(rs.getInt("id_room"));
		booking.setName_user(rs.getString("name_user"));
		booking.setName_room(rs.getString("name_room"));
		booking.setCheckin(rs.getString("checkin"));
		booking.setCheckout(rs.getString("checkout"));
		booking.setTotal(rs.getInt("total"));
		booking.setIs_delete(rs.getInt("is_delete"));
		booking.setStatus(rs.getString("status"));
		return booking;
	}

}
