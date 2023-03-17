package SpringProject.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import SpringProject.Entity.MapperTypeRoom;
import SpringProject.Entity.TypeRoom;

@Repository
public class TypeRoomDAO extends BaseDAO {

	public List<TypeRoom> GetDataTypeRoom() {
		List<TypeRoom> list = new ArrayList<TypeRoom>();
		String sql = "SELECT * FROM type_room WHERE is_delete = 0";
		list = _jdbcTemplate.query(sql, new MapperTypeRoom());
		return list;
	}

	// thêm typeroom
	public int addTypeRoom(TypeRoom typeRoom) {
		String sql = "INSERT INTO type_room (name, img, description, is_delete) " + "VALUES ('" + typeRoom.getName()
				+ "', '" + typeRoom.getImg() + "', '" + typeRoom.getDescription() + "', '0')";
		int insert = _jdbcTemplate.update(sql);
		return insert;
	}

	// xoá typeroom
	public int deleteTypeRoom(int id) {
		String sql = "UPDATE type_room SET is_delete = 1 WHERE id = " + id;
		int delete = _jdbcTemplate.update(sql);
		return delete;
	}

	// lấy typeroom
	public TypeRoom getTypeRoom(int id) {
		String sql = "SELECT * FROM type_room WHERE id = " + id;
		List<TypeRoom> result = _jdbcTemplate.query(sql, new MapperTypeRoom());
		if (result.isEmpty() == false) {
			return result.get(0);
		}
		return null;
	}

	// sửa typeroom
	public int updateTypeRoom(TypeRoom typeRoom) {
		String sql = "UPDATE type_room SET name = '" + typeRoom.getName() + "', img = '" + typeRoom.getImg()
				+ "', description = '" + typeRoom.getDescription() + "' WHERE id = " + typeRoom.getId();
		int update = _jdbcTemplate.update(sql);
		return update;
	}
}
