package SpringProject.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperTypeRoom implements RowMapper<TypeRoom>{

	public TypeRoom mapRow(ResultSet rs, int rowNum) throws SQLException {
		TypeRoom typeRoom = new TypeRoom();
		typeRoom.setId(rs.getInt("id"));
		typeRoom.setName(rs.getString("name"));
		typeRoom.setImg(rs.getString("img"));
		typeRoom.setDescription(rs.getString("description"));
		typeRoom.setStatus(rs.getInt("status"));
		return typeRoom;
	}

}
