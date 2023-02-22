package SpringProject.Entity;

public class Posts {
	private int id;
	private String title;
	private String content;
	private String img_1;
	private String img_2;
	private String img_3;
	private String img_4;
	private int status;

	public Posts() {
		super();
	}

	public Posts(int id, String title, String content, String img_1, String img_2, String img_3, String img_4,
			int status) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.img_1 = img_1;
		this.img_2 = img_2;
		this.img_3 = img_3;
		this.img_4 = img_4;
		this.status = status;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
