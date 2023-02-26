package SpringProject.Entity;

import java.sql.Date;

public class Rooms {
	private int id;
	private int id_typeroom;
	private String name;
	private String img;
	private Double price;
	private int sizes;
	private int guests;
	private String services;
	private String description;
	private int status;
	private int is_delete;
	private Date create_at;
	private Date update_at;

	public Rooms() {
		super();
	}

	public Rooms(int id, int id_typeroom, String name, String img, Double price, int sizes, int guests, String services,
			String description, int status, int is_delete, Date create_at, Date update_at) {
		super();
		this.id = id;
		this.id_typeroom = id_typeroom;
		this.name = name;
		this.img = img;
		this.price = price;
		this.sizes = sizes;
		this.guests = guests;
		this.services = services;
		this.description = description;
		this.status = status;
		this.is_delete = is_delete;
		this.create_at = create_at;
		this.update_at = update_at;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_typeroom() {
		return id_typeroom;
	}

	public void setId_typeroom(int id_typeroom) {
		this.id_typeroom = id_typeroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getSizes() {
		return sizes;
	}

	public void setSizes(int sizes) {
		this.sizes = sizes;
	}

	public int getGuests() {
		return guests;
	}

	public void setGuests(int guests) {
		this.guests = guests;
	}

	public String getServices() {
		return services;
	}

	public void setServices(String services) {
		this.services = services;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(int is_delete) {
		this.is_delete = is_delete;
	}

	public Date getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}

	public Date getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}

}
