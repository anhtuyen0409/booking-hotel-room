package SpringProject.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import SpringProject.Entity.MapperRooms;
import SpringProject.Entity.Rooms;

@Repository
public class RoomsDAO extends BaseDAO {
	// lấy danh sách phòng normal
	public List<Rooms> GetDataNormalRoom() {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE id_typeroom = 1 AND is_delete = 0";
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}

	// phân trang phòng normal
	public List<Rooms> GetDataNormalRoomPaginate(int start, int totalPage) {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE id_typeroom = 1 LIMIT " + start + ", " + totalPage;
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}

	// lấy danh sách phòng vip
	public List<Rooms> GetDataVipRoom() {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE id_typeroom = 2 AND is_delete = 0";
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}

	// phân trang phòng vip
	public List<Rooms> GetDataVipRoomPaginate(int start, int totalPage) {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE id_typeroom = 2 LIMIT " + start + ", " + totalPage;
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}

	// lấy danh sách phòng homestay
	public List<Rooms> GetDataHomestayRoom() {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE id_typeroom = 3 AND is_delete = 0";
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}

	// phân trang homestay
	public List<Rooms> GetDataHomestayRoomPaginate(int start, int totalPage) {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE id_typeroom = 3 LIMIT " + start + ", " + totalPage;
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}

	// lấy danh sách phòng mới
	public List<Rooms> GetDataNewRooms() {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE is_delete = 0 ORDER BY id DESC LIMIT 4";
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}

	// lấy chi tiết phòng
	public List<Rooms> GetDataRoom(int id) {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE id = " + id;
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}

	// lấy toàn bộ phòng
	public List<Rooms> GetDataRooms() {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE is_delete = 0";
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}

	// thêm phòng
	public int addRoom(Rooms room) {
		String sql = "INSERT INTO rooms (id_typeroom, name, img, price, sizes, guests, services, description, status, is_delete) "
				+ "VALUES ('" + room.getId_typeroom() + "', '" + room.getName() + "', '" + room.getImg() + "', '"
				+ room.getPrice() + "', '" + room.getSizes() + "', '" + room.getGuests() + "', '" + room.getServices()
				+ "', '" + room.getDescription() + "', '0', '0')";
		int insert = _jdbcTemplate.update(sql);
		return insert;
	}

	// xoá phòng
	public int deleteRoom(int id) {
		String sql = "UPDATE rooms SET is_delete = 1 WHERE id = " + id;
		int delete = _jdbcTemplate.update(sql);
		return delete;
	}

	// lấy phòng
	public Rooms getRoom(int id) {
		String sql = "SELECT * FROM rooms WHERE id = " + id;
		List<Rooms> result = _jdbcTemplate.query(sql, new MapperRooms());
		if (result.isEmpty() == false) {
			return result.get(0);
		}
		return null;
	}

	// sửa phòng
	public int updateRoom(Rooms room) {
		String sql = "UPDATE rooms SET name = '" + room.getName() + "', img = '" + room.getImg() + "', price = '"
				+ room.getPrice() + "', sizes = '" + room.getSizes() + "', guests = '" + room.getGuests()
				+ "', services = '" + room.getServices() + "', description = '" + room.getDescription()
				+ "' WHERE id = " + room.getId();
		int update = _jdbcTemplate.update(sql);
		return update;
	}
}
