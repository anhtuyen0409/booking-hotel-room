package SpringProject.Service.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.DAO.TypeRoomDAO;
import SpringProject.Entity.TypeRoom;

@Service
public class TypeRoomAdminService implements ITypeRoomAdmin {
	@Autowired
	private TypeRoomDAO typeRoomDAO;

	public int addTypeRoom(TypeRoom typeRoom) {
		return typeRoomDAO.addTypeRoom(typeRoom);
	}

	public int deleteTypeRoom(int id) {
		return typeRoomDAO.deleteTypeRoom(id);
	}

	public TypeRoom getTypeRoom(int id) {
		TypeRoom typeRoom = typeRoomDAO.getTypeRoom(id);
		if (typeRoom != null) {
			return typeRoom;
		}
		return null;
	}

	public int updateTypeRoom(TypeRoom typeRoom) {
		return typeRoomDAO.updateTypeRoom(typeRoom);
	}

}
