package SpringProject.Service.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface IUsersAdmin {
	@Autowired
	public int deleteUser(int id);
	@Autowired
	public int countUser();
}
