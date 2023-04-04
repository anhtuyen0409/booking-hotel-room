package SpringProject.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.DAO.CommentDAO;
import SpringProject.Entity.Comment;

@Service
public class CommentService implements IComment {
	@Autowired
	private CommentDAO commentDao;

	public List<Comment> GetDataComments(int id_room) {
		return commentDao.GetDataComments(id_room);
	}

	public int addComment(Comment comment) {
		return commentDao.addComment(comment);
	}

}
