package SpringProject.Service.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.DAO.RoomsDAO;
import SpringProject.Entity.Rooms;

@Service
public class RoomsAdminService implements IRoomsAdmin {
	@Autowired
	private RoomsDAO roomDAO;

	public int addRoom(Rooms room) {
		return roomDAO.addRoom(room);
	}

	public int deleteRoom(int id) {
		return roomDAO.deleteRoom(id);
	}

	public Rooms getRoom(int id) {
		Rooms room = roomDAO.getRoom(id);
		if (room != null) {
			return room;
		}
		return null;
	}

	public int updateRoom(Rooms room) {
		return roomDAO.updateRoom(room);
	}

}
