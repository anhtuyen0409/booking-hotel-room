package SpringProject.Entity;

public class Services {
	private int id;
	private String name;
	private String img;
	private int status;

	public Services() {
		super();
	}

	public Services(int id, String name, String img, int status) {
		super();
		this.id = id;
		this.name = name;
		this.img = img;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
