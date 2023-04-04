package SpringProject.Service.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.Entity.Posts;

@Service
public interface IPostsAdmin {
	@Autowired
	public int addPost(Posts post);

	@Autowired
	public int deletePost(int id);

	@Autowired
	public Posts getPost(int id);

	@Autowired
	public int updatePost(Posts post);
	
	@Autowired
	public int countPost();
}
