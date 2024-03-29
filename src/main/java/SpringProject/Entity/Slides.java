package SpringProject.Entity;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class Slides {
	private int id;
	private String img;
	private String caption;
	private String content;
	private int is_delete;
	private CommonsMultipartFile[] files;

	public Slides() {
		super();
	}

	public Slides(int id, String img, String caption, String content, int is_delete, CommonsMultipartFile[] files) {
		super();
		this.id = id;
		this.img = img;
		this.caption = caption;
		this.content = content;
		this.is_delete = is_delete;
		this.files = files;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
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

	public CommonsMultipartFile[] getFiles() {
		return files;
	}

	public void setFiles(CommonsMultipartFile[] files) {
		this.files = files;
	}
	
}
