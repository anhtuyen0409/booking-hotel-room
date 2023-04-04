package SpringProject.Service.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.DAO.PostsDAO;
import SpringProject.Entity.Posts;

@Service
public class PostsAdminService implements IPostsAdmin {
	@Autowired
	private PostsDAO postDAO;

	public int addPost(Posts post) {
		return postDAO.addPost(post);
	}

	public int deletePost(int id) {
		return postDAO.deletePost(id);
	}

	public Posts getPost(int id) {
		Posts post = postDAO.getPost(id);
		if (post != null) {
			return post;
		}
		return null;
	}

	public int updatePost(Posts post) {
		return postDAO.updatePost(post);
	}

	public int countPost() {
		return postDAO.countPost();
	}

}
