package SpringProject.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import SpringProject.Entity.MapperUsers;
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
	
	public Users getUser(Users user) {
		String sql = "SELECT * FROM users WHERE email = '"+user.getEmail()+"'";
		List<Users> result = _jdbcTemplate.query(sql, new MapperUsers());
		if(result.isEmpty()==false) {
			return result.get(0);
		}
		return null;
	}	
}
