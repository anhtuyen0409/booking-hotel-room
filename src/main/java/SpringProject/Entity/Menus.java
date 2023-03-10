package SpringProject.Entity;

public class Menus {
	private int id;
	private String name;
	private String url;
	private int is_delete;

	public Menus() {
		super();
	}

	public Menus(int id, String name, String url, int is_delete) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
		this.is_delete = is_delete;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(int is_delete) {
		this.is_delete = is_delete;
	}

}
