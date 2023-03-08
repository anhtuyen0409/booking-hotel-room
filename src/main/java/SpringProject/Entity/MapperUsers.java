package SpringProject.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperUsers implements RowMapper<Users> {

	public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
		Users user = new Users();
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		user.setBirthday(rs.getDate("birthday"));
		user.setPhone(rs.getString("phone"));
		user.setEmail(rs.getString("email"));
		user.setPassword(rs.getString("password"));
		user.setConfirm_password(rs.getString("confirm_password"));
		user.setType_account(rs.getString("type_account"));
		return user;
	}

}
