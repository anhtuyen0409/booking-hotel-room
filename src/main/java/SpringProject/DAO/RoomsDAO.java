package SpringProject.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import SpringProject.Entity.MapperRooms;
import SpringProject.Entity.Rooms;

@Repository
public class RoomsDAO extends BaseDAO {
	//lấy danh sách phòng normal
	public List<Rooms> GetDataNormalRoom() {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE id_typeroom = 1";
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}
	
	//phân trang phòng normal
	public List<Rooms> GetDataNormalRoomPaginate(int start, int totalPage) {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE id_typeroom = 1 LIMIT " + start + ", " + totalPage;
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}

	public List<Rooms> GetDataVipRoom() {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE id_typeroom = 2";
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}

	public List<Rooms> GetDataVipRoomPaginate(int start, int totalPage) {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE id_typeroom = 2 LIMIT " + start + ", " + totalPage;
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}

	public List<Rooms> GetDataHomestayRoom() {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE id_typeroom = 3";
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}

	public List<Rooms> GetDataHomestayRoomPaginate(int start, int totalPage) {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE id_typeroom = 3 LIMIT " + start + ", " + totalPage;
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}

	public List<Rooms> GetDataNewRooms() {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE is_delete = 0 ORDER BY id DESC LIMIT 4";
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}

	public List<Rooms> GetDataRoom(int id) {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE id = " + id;
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}
	
	//lấy toàn bộ phòng
	public List<Rooms> GetDataRooms() {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE is_delete = 0";
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}
}
