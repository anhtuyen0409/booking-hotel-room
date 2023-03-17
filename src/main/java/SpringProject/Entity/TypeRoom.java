package SpringProject.Entity;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class TypeRoom {
	private int id;
	private String name;
	private String img;
	private String description;
	private int is_delete;
	private CommonsMultipartFile[] files;

	public TypeRoom() {
		super();
	}

	public TypeRoom(int id, String name, String img, String description, int is_delete, CommonsMultipartFile[] files) {
		super();
		this.id = id;
		this.name = name;
		this.img = img;
		this.description = description;
		this.is_delete = is_delete;
		this.files = files;
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

	public int getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(int is_delete) {
		this.is_delete = is_delete;
	}

	public CommonsMultipartFile[] getFiles() {
		return files;
	}

	public void setFiles(CommonsMultipartFile[] files) {
		this.files = files;
	}
	

}
