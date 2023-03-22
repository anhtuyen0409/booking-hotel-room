package SpringProject.Service.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.DAO.UsersDAO;

@Service
public class UsersAdminService implements IUsersAdmin {
	@Autowired
	private UsersDAO userDAO;

	public int deleteUser(int id) {
		return userDAO.deleteUser(id);
	}

}
