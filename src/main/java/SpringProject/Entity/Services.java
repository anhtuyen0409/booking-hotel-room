package SpringProject.Entity;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class Services {
	private int id;
	private String name;
	private String img;
	private int is_delete;
	private CommonsMultipartFile[] files;

	public Services() {
		super();
	}

	public Services(int id, String name, String img, int is_delete, CommonsMultipartFile[] files) {
		super();
		this.id = id;
		this.name = name;
		this.img = img;
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
