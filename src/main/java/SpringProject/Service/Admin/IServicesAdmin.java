package SpringProject.Service.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.Entity.Services;

@Service
public interface IServicesAdmin {
	@Autowired
	public int addService(Services service);

	@Autowired
	public int deleteService(int id);

	@Autowired
	public Services getService(int id);

	@Autowired
	public int updateService(Services service);
	
	@Autowired
	public int countService();
}
