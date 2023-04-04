package SpringProject.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperComment implements RowMapper<Comment> {

	public Comment mapRow(ResultSet rs, int rowNum) throws SQLException {
		Comment comment = new Comment();
		comment.setId(rs.getInt("id"));
		comment.setId_room(rs.getInt("id_room"));
		comment.setName(rs.getString("name"));
		comment.setAvatar(rs.getString("avatar"));
		comment.setContent(rs.getString("content"));
		comment.setIs_delete(rs.getInt("is_delete"));
		return comment;
	}

}
