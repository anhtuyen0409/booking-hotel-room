package SpringProject.Service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.Entity.Users;

@Service
public interface IUsers {
	@Autowired
	public int addUser(Users user);

	@Autowired
	public Users checkUser(Users user);

	@Autowired
	public Users getUser(int id);

	@Autowired
	public int updateUser(Users user);
}
