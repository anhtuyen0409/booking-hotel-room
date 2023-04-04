package SpringProject.Entity;

public class Booking {
	private int id;
	private int id_user;
	private String email;
	private int id_room;
	private String name_user;
	private String name_room;
	private String checkin;
	private String checkout;
	private int total;
	private int is_delete;
	private String status;

	public Booking() {
		super();
	}

	public Booking(int id, int id_user, String email, int id_room, String name_user, String name_room, String checkin,
			String checkout, int total, int is_delete, String status) {
		super();
		this.id = id;
		this.id_user = id_user;
		this.email = email;
		this.id_room = id_room;
		this.name_user = name_user;
		this.name_room = name_room;
		this.checkin = checkin;
		this.checkout = checkout;
		this.total = total;
		this.is_delete = is_delete;
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public int getId_room() {
		return id_room;
	}

	public void setId_room(int id_room) {
		this.id_room = id_room;
	}

	public String getName_user() {
		return name_user;
	}

	public void setName_user(String name_user) {
		this.name_user = name_user;
	}

	public String getName_room() {
		return name_room;
	}

	public void setName_room(String name_room) {
		this.name_room = name_room;
	}

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(int is_delete) {
		this.is_delete = is_delete;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
