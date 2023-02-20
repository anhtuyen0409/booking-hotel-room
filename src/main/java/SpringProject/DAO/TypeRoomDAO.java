package SpringProject.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import SpringProject.Entity.MapperTypeRoom;
import SpringProject.Entity.TypeRoom;


@Repository
public class TypeRoomDAO {
	@Autowired
	public JdbcTemplate _jdbcTemplate;

	public List<TypeRoom> GetDataTypeRoom() {
		List<TypeRoom> list = new ArrayList<TypeRoom>();
		String sql = "SELECT * FROM type_room";
		list = _jdbcTemplate.query(sql, new MapperTypeRoom());
		return list;
	}
}
