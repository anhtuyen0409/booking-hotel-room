package SpringProject.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import SpringProject.Entity.Comment;
import SpringProject.Entity.MapperComment;

@Repository
public class CommentDAO extends BaseDAO {
	public List<Comment> GetDataComments(int id_room) {
		List<Comment> list = new ArrayList<Comment>();
		String sql = "SELECT * FROM comment WHERE is_delete = 0 AND id_room = " + id_room;
		list = _jdbcTemplate.query(sql, new MapperComment());
		return list;
	}

	// thêm comment
	public int addComment(Comment comment) {
		String sql = "INSERT INTO comment (id_room, name, avatar, content, is_delete) " + "VALUES ('"
				+ comment.getId_room() + "', '" + comment.getName() + "', '" + comment.getAvatar() + "', '"
				+ comment.getContent() + "', '0')";
		int insert = _jdbcTemplate.update(sql);
		return insert;
	}
}
