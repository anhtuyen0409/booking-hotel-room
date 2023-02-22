package SpringProject.Entity;

public class TypeRoom {
	private int id;
	private String name;
	private String img;
	private String description;
	private int status;

	public TypeRoom() {
		super();
	}

	public TypeRoom(int id, String name, String img, String description, int status) {
		super();
		this.id = id;
		this.name = name;
		this.img = img;
		this.description = description;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

}
