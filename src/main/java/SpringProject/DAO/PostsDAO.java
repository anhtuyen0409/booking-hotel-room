package SpringProject.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import SpringProject.Entity.MapperPosts;
import SpringProject.Entity.Posts;

@Repository
public class PostsDAO extends BaseDAO {
	public List<Posts> GetDataPosts() {
		List<Posts> list = new ArrayList<Posts>();
		String sql = "SELECT * FROM posts";
		list = _jdbcTemplate.query(sql, new MapperPosts());
		return list;
	}

	public List<Posts> GetDataNewPosts() {
		List<Posts> list = new ArrayList<Posts>();
		String sql = "SELECT * FROM posts WHERE status = 0 ORDER BY id DESC LIMIT 3";
		list = _jdbcTemplate.query(sql, new MapperPosts());
		return list;
	}
}
