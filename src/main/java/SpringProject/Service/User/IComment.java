package SpringProject.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.Entity.Comment;

@Service
public interface IComment {
	@Autowired
	public List<Comment> GetDataComments(int id_room);

	@Autowired
	public int addComment(Comment comment);
}
