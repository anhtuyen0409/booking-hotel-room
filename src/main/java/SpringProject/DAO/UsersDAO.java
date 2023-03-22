package SpringProject.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import SpringProject.Entity.MapperUsers;
import SpringProject.Entity.Users;

@Repository
public class UsersDAO extends BaseDAO {
	public int addUser(Users user) {
		String sql = "INSERT INTO users (name, avatar, birthday, phone, email, password, confirm_password, type_account, is_delete) "
				+ "VALUES ('" + user.getName() + "', 'avatar.jpg', '" + user.getBirthday() + "', '" + user.getPhone()
				+ "', '" + user.getEmail() + "', '" + user.getPassword() + "', '" + user.getConfirm_password()
				+ "', 'user', '0')";
		int insert = _jdbcTemplate.update(sql);
		return insert;
	}

	public Users getUser(Users user) {
		String sql = "SELECT * FROM users WHERE email = '" + user.getEmail() + "' AND is_delete = 0";
		List<Users> result = _jdbcTemplate.query(sql, new MapperUsers());
		if (result.isEmpty() == false) {
			return result.get(0);
		}
		return null;
	}

	// lấy toàn bộ user
	public List<Users> GetDataUsers() {
		List<Users> list = new ArrayList<Users>();
		String sql = "SELECT * FROM users WHERE type_account = 'user' AND is_delete = 0";
		list = _jdbcTemplate.query(sql, new MapperUsers());
		return list;
	}

	// xoá user
	public int deleteUser(int id) {
		String sql = "UPDATE users SET is_delete = 1 WHERE id = " + id;
		int delete = _jdbcTemplate.update(sql);
		return delete;
	}

	// lấy user
	public Users getUser(int id) {
		String sql = "SELECT * FROM users WHERE id = " + id;
		List<Users> result = _jdbcTemplate.query(sql, new MapperUsers());
		if (result.isEmpty() == false) {
			return result.get(0);
		}
		return null;
	}

	// sửa thông tin user
	public int updateUser(Users user) {
		String sql = "UPDATE users SET name = '" + user.getName() + "', avatar = '" + user.getAvatar()
				+ "', birthday = '" + user.getBirthday() + "', phone = '" + user.getPhone() + "' WHERE id = "
				+ user.getId();
		int update = _jdbcTemplate.update(sql);
		return update;
	}
}
