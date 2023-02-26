package SpringProject.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import SpringProject.Entity.MapperRooms;
import SpringProject.Entity.Rooms;

@Repository
public class RoomsDAO extends BaseDAO {
	public List<Rooms> GetDataNormalRooms() {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE id_typeroom = 1";
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}
	public List<Rooms> GetDataVipRooms() {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE id_typeroom = 2";
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}
	public List<Rooms> GetDataHomestayRooms() {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE id_typeroom = 3";
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}
}
