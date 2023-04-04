package SpringProject.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Repository;

import SpringProject.Entity.Booking;
import SpringProject.Entity.MapperRooms;
import SpringProject.Entity.Rooms;

@Repository
public class RoomsDAO extends BaseDAO {
	// lấy danh sách phòng normal
	public List<Rooms> GetDataNormalRoom() {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE id_typeroom = 1 AND is_delete = 0 AND status = 0";
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}

	// phân trang phòng normal
	public List<Rooms> GetDataNormalRoomPaginate(int start, int totalPage) {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE id_typeroom = 1 AND status = 0 AND is_delete = 0 LIMIT " + start + ", "
				+ totalPage;
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}

	// lấy danh sách phòng vip
	public List<Rooms> GetDataVipRoom() {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE id_typeroom = 2 AND is_delete = 0 AND status = 0";
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}

	// phân trang phòng vip
	public List<Rooms> GetDataVipRoomPaginate(int start, int totalPage) {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE id_typeroom = 2 AND status = 0 AND is_delete = 0 LIMIT " + start + ", "
				+ totalPage;
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}

	// lấy danh sách phòng homestay
	public List<Rooms> GetDataHomestayRoom() {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE id_typeroom = 3 AND is_delete = 0 AND status = 0";
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}

	// phân trang homestay
	public List<Rooms> GetDataHomestayRoomPaginate(int start, int totalPage) {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE id_typeroom = 3 AND status = 0 AND is_delete = 0 LIMIT " + start + ", "
				+ totalPage;
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

	// phân trang toàn bộ phòng
	public List<Rooms> GetDataRoomsPaginate(int start, int totalPage) {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE is_delete = 0  AND status = 0 LIMIT " + start + ", " + totalPage;
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

	// tìm kiếm phòng trống
	public List<Rooms> FindRooms(int id_typeRoom) {
		List<Rooms> list = new ArrayList<Rooms>();
		String sql = "SELECT * FROM rooms WHERE is_delete = 0 AND status = 0 AND id_typeroom = " + id_typeRoom;
		list = _jdbcTemplate.query(sql, new MapperRooms());
		return list;
	}

	// đặt phòng
	public int addBooking(Booking booking) {
		String sql = "INSERT INTO booking (id_user, email, id_room, name_user, name_room, checkin, checkout, total, is_delete, status) "
				+ "VALUES ('" + booking.getId_user() + "', '" + booking.getEmail() + "', '" + booking.getId_room()
				+ "', '" + booking.getName_user() + "', '" + booking.getName_room() + "', '" + booking.getCheckin()
				+ "', '" + booking.getCheckout() + "', '" + booking.getTotal() + "', '0', N'chưa thanh toán')";
		int insert = _jdbcTemplate.update(sql);
		try {
			sendText(booking.getEmail().toString());
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		/*
		 * if(insert > 0) { String sql2 = "UPDATE rooms SET status = '1' WHERE id = " +
		 * booking.getId_room(); _jdbcTemplate.execute(sql2); }
		 */
		return insert;
	}

	// đếm số người dùng
	public int countRoom() {
		String sql = "SELECT COUNT(*) FROM rooms WHERE is_delete = 0";
		int result = _jdbcTemplate.queryForObject(sql, Integer.class);
		return result;
	}

	public static void sendText(String email) throws AddressException, MessagingException {
		Properties mailServerProperties;
		Session getMailSession;
		MimeMessage mailMessage;

		// Step1: setup Mail Server
		mailServerProperties = System.getProperties();
		mailServerProperties.put("mail.smtp.port", "587");
		mailServerProperties.put("mail.smtp.auth", "true");
		mailServerProperties.put("mail.smtp.starttls.enable", "true");

		// Step2: get Mail Session
		getMailSession = Session.getDefaultInstance(mailServerProperties, null);
		mailMessage = new MimeMessage(getMailSession);

		mailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(email)); // Thay abc bằng địa
																						// chỉ người nhận

		// Bạn có thể chọn CC, BCC
//	    generateMailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress("cc@gmail.com")); //Địa chỉ cc gmail

		mailMessage.setSubject("Demo send gmail from Java");
		mailMessage.setText("Demo send text by gmail from Java");

		// Step3: Send mail
		Transport transport = getMailSession.getTransport("smtp");

		// Thay your_gmail thành gmail của bạn, thay your_password thành mật khẩu gmail
		// của bạn
		transport.connect("smtp.gmail.com", "nguyenanhtuyen10a5@gmail.com", "01677942718");
		transport.sendMessage(mailMessage, mailMessage.getAllRecipients());
		transport.close();
	}

}
