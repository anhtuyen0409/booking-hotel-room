package SpringProject.Service.User;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.DAO.UsersDAO;
import SpringProject.Entity.Users;

@Service
public class UsersService implements IUsers {
	@Autowired
	private UsersDAO usersDAO;

	public int addUser(Users user) {
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12)));
		user.setConfirm_password(BCrypt.hashpw(user.getConfirm_password(), BCrypt.gensalt(12)));
		return usersDAO.addUser(user);
	}

	public Users checkUser(Users user) {
		String pass = user.getPassword();
		user = usersDAO.getUser(user);
		if (user != null) {
			if (BCrypt.checkpw(pass, user.getPassword())) {
				return user;
			}
			else {
				return null;
			}
		}
		return null;
	}

}
