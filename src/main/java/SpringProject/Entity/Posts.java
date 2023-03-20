package SpringProject.Entity;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class Posts {
	private int id;
	private String title;
	private String content;
	private String img_1;
	private String img_2;
	private String img_3;
	private String img_4;
	private int is_delete;
	private CommonsMultipartFile[] files_1;
	private CommonsMultipartFile[] files_2;
	private CommonsMultipartFile[] files_3;
	private CommonsMultipartFile[] files_4;

	public Posts() {
		super();
	}

	public Posts(int id, String title, String content, String img_1, String img_2, String img_3, String img_4,
			int is_delete, CommonsMultipartFile[] files_1, CommonsMultipartFile[] files_2,
			CommonsMultipartFile[] files_3, CommonsMultipartFile[] files_4) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.img_1 = img_1;
		this.img_2 = img_2;
		this.img_3 = img_3;
		this.img_4 = img_4;
		this.is_delete = is_delete;
		this.files_1 = files_1;
		this.files_2 = files_2;
		this.files_3 = files_3;
		this.files_4 = files_4;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImg_1() {
		return img_1;
	}

	public void setImg_1(String img_1) {
		this.img_1 = img_1;
	}

	public String getImg_2() {
		return img_2;
	}

	public void setImg_2(String img_2) {
		this.img_2 = img_2;
	}

	public String getImg_3() {
		return img_3;
	}

	public void setImg_3(String img_3) {
		this.img_3 = img_3;
	}

	public String getImg_4() {
		return img_4;
	}

	public void setImg_4(String img_4) {
		this.img_4 = img_4;
	}

	public int getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(int is_delete) {
		this.is_delete = is_delete;
	}

	public CommonsMultipartFile[] getFiles_1() {
		return files_1;
	}

	public void setFiles_1(CommonsMultipartFile[] files_1) {
		this.files_1 = files_1;
	}

	public CommonsMultipartFile[] getFiles_2() {
		return files_2;
	}

	public void setFiles_2(CommonsMultipartFile[] files_2) {
		this.files_2 = files_2;
	}

	public CommonsMultipartFile[] getFiles_3() {
		return files_3;
	}

	public void setFiles_3(CommonsMultipartFile[] files_3) {
		this.files_3 = files_3;
	}

	public CommonsMultipartFile[] getFiles_4() {
		return files_4;
	}

	public void setFiles_4(CommonsMultipartFile[] files_4) {
		this.files_4 = files_4;
	}

}
