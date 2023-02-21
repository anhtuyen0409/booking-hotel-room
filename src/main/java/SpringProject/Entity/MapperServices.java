package SpringProject.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperServices implements RowMapper<Services>{

	public Services mapRow(ResultSet rs, int rowNum) throws SQLException {
		Services service = new Services();
		service.setId(rs.getInt("id"));
		service.setName(rs.getString("name"));
		service.setImg(rs.getString("img"));
		service.setStatus(rs.getInt("status"));
		return service;
	}

}
