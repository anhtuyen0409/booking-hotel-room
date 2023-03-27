package SpringProject.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import SpringProject.Entity.MapperPosts;
import SpringProject.Entity.Posts;

@Repository
public class PostsDAO extends BaseDAO {
	// lấy danh sách bài viết
	public List<Posts> GetDataPosts() {
		List<Posts> list = new ArrayList<Posts>();
		String sql = "SELECT * FROM posts WHERE is_delete = 0";
		list = _jdbcTemplate.query(sql, new MapperPosts());
		return list;
	}

	// lấy bài viết mới nhất
	public List<Posts> GetDataNewPosts() {
		List<Posts> list = new ArrayList<Posts>();
		String sql = "SELECT * FROM posts WHERE is_delete = 0 ORDER BY id DESC LIMIT 3";
		list = _jdbcTemplate.query(sql, new MapperPosts());
		return list;
	}

	// phân trang bài viết
	public List<Posts> GetDataPostsPaginate(int start, int totalPage) {
		List<Posts> list = new ArrayList<Posts>();
		String sql = "SELECT * FROM posts WHERE is_delete = 0 LIMIT " + start + ", " + totalPage;
		list = _jdbcTemplate.query(sql, new MapperPosts());
		return list;
	}

	// lấy chi tiết bài viết
	public List<Posts> GetDataPost(int id) {
		List<Posts> list = new ArrayList<Posts>();
		String sql = "SELECT * FROM posts WHERE id = " + id;
		list = _jdbcTemplate.query(sql, new MapperPosts());
		return list;
	}

	// thêm post
	public int addPost(Posts post) {
		String sql = "INSERT INTO posts (title, content, img_1, img_2, img_3, img_4, is_delete) " + "VALUES ('"
				+ post.getTitle() + "', '" + post.getContent() + "', '" + post.getImg_1() + "', '" + post.getImg_2()
				+ "', '" + post.getImg_3() + "', '" + post.getImg_4() + "', '0')";
		int insert = _jdbcTemplate.update(sql);
		return insert;
	}

	// xoá post
	public int deletePost(int id) {
		String sql = "UPDATE posts SET is_delete = 1 WHERE id = " + id;
		int delete = _jdbcTemplate.update(sql);
		return delete;
	}

	// lấy post
	public Posts getPost(int id) {
		String sql = "SELECT * FROM posts WHERE id = " + id;
		List<Posts> result = _jdbcTemplate.query(sql, new MapperPosts());
		if (result.isEmpty() == false) {
			return result.get(0);
		}
		return null;
	}

	// sửa post
	public int updatePost(Posts post) {
		String sql = "UPDATE posts SET title = '" + post.getTitle() + "', content = '" + post.getContent()
				+ "', img_1 = '" + post.getImg_1() + "', img_2 = '" + post.getImg_2() + "', img_3 = '" + post.getImg_3()
				+ "', img_4 = '" + post.getImg_4() + "' WHERE id = " + post.getId();
		int update = _jdbcTemplate.update(sql);
		return update;
	}
}
