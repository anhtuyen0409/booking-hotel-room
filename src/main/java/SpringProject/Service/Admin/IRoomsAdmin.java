package SpringProject.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.Entity.Rooms;

@Service
public interface IRoomsAdmin {
	@Autowired
	public int addRoom(Rooms room);

	@Autowired
	public int deleteRoom(int id);

	@Autowired
	public Rooms getRoom(int id);

	@Autowired
	public int updateRoom(Rooms room);

	@Autowired
	public List<Rooms> GetDataRoomsPaginate(int start, int totalPage);
	
	@Autowired
	public int countRoom();
}
