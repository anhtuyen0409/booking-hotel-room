package SpringProject.Service.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.Entity.TypeRoom;

@Service
public interface ITypeRoomAdmin {
	@Autowired
	public int addTypeRoom(TypeRoom typeRoom);

	@Autowired
	public int deleteTypeRoom(int id);

	@Autowired
	public TypeRoom getTypeRoom(int id);

	@Autowired
	public int updateTypeRoom(TypeRoom typeRoom);

}
