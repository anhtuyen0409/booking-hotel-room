package SpringProject.Entity;

public class Comment {
	private int id;
	private int id_room;
	private String name;
	private String avatar;
	private String content;
	private int is_delete;

	public Comment() {
		super();
	}

	public Comment(int id, int id_room, String name, String avatar, String content, int is_delete) {
		super();
		this.id = id;
		this.id_room = id_room;
		this.name = name;
		this.avatar = avatar;
		this.content = content;
		this.is_delete = is_delete;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_room() {
		return id_room;
	}

	public void setId_room(int id_room) {
		this.id_room = id_room;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(int is_delete) {
		this.is_delete = is_delete;
	}

}
