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
		room.setPrice(rs.getDouble("price"));
		room.setSizes(rs.getInt("sizes"));
		room.setGuests(rs.getInt("guests"));
		room.setServices(rs.getString("services"));
		room.setDescription(rs.getString("description"));
		room.setStatus(rs.getInt("status"));
		room.setIs_delete(rs.getInt("is_delete"));
		room.setCreate_at(rs.getDate("create_at"));
		room.setUpdate_at(rs.getDate("update_at"));
		return room;
	}

}
