package SpringProject.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperPosts implements RowMapper<Posts>{

	public Posts mapRow(ResultSet rs, int rowNum) throws SQLException {
		Posts posts = new Posts();
		posts.setId(rs.getInt("id"));
		posts.setTitle(rs.getString("title"));
		posts.setContent(rs.getString("content"));
		posts.setImg_1(rs.getString("img_1"));
		posts.setImg_2(rs.getString("img_2"));
		posts.setImg_3(rs.getString("img_3"));
		posts.setImg_4(rs.getString("img_4"));
		posts.setIs_delete(rs.getInt("is_delete"));
		return posts;
	}

}
