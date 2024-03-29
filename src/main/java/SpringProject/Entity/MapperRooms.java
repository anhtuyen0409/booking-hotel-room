package SpringProject.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperRooms implements RowMapper<Rooms>{

	public Rooms mapRow(ResultSet rs, int rowNum) throws SQLException {
		Rooms room = new Rooms();
		room.setId(rs.getInt("id"));
		room.setId_typeroom(rs.getInt("id_typeroom"));
		room.setName(rs.getString("name"));
		room.setImg(rs.getString("img"));
		room.setPrice(rs.getInt("price"));
		room.setSizes(rs.getInt("sizes"));
		room.setGuests(rs.getInt("guests"));
		room.setServices(rs.getString("services"));
		room.setDescription(rs.getString("description"));
		room.setStatus(rs.getInt("status"));
		room.setIs_delete(rs.getInt("is_delete"));
		return room;
	}

}
