package SpringProject.Service.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.DAO.ServicesDAO;
import SpringProject.Entity.Services;

@Service
public class ServicesAdminService implements IServicesAdmin {
	@Autowired
	private ServicesDAO serviceDAO;

	public int addService(Services service) {
		return serviceDAO.addService(service);
	}

	public int deleteService(int id) {
		return serviceDAO.deleteService(id);
	}

	public Services getService(int id) {
		Services service = serviceDAO.getService(id);
		if (service != null) {
			return service;
		}
		return null;
	}

	public int updateService(Services service) {
		return serviceDAO.updateService(service);
	}

	public int countService() {
		return serviceDAO.countService();
	}

}
