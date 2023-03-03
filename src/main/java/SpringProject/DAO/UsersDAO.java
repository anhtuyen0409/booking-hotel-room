package SpringProject.DAO;

import org.springframework.stereotype.Repository;

import SpringProject.Entity.Users;

@Repository
public class UsersDAO extends BaseDAO {
	public int addUser(Users user) {
		String sql = "INSERT INTO users (name, birthday, phone, email, password, confirm_password) " + "VALUES ('"
				+ user.getName() + "', '" + user.getBirthday() + "', '" + user.getPhone() + "', '" + user.getEmail() + "', '"
				+ user.getPassword() + "', '" + user.getConfirm_password() + "')";
		int insert = _jdbcTemplate.update(sql);
		return insert;
	}
}
