package SpringProject.Entity;

import java.sql.Date;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class Users {
	private int id;
	private String name;
	private String avatar;
	private Date birthday;
	private String phone;
	private String email;
	private String password;
	private String confirm_password;
	private String type_account;
	private int is_delete;
	private CommonsMultipartFile[] files;

	public Users() {
		super();
	}

	public Users(int id, String name, String avatar, Date birthday, String phone, String email, String password,
			String confirm_password, String type_account, int is_delete, CommonsMultipartFile[] files) {
		super();
		this.id = id;
		this.name = name;
		this.avatar = avatar;
		this.birthday = birthday;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.confirm_password = confirm_password;
		this.type_account = type_account;
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

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirm_password() {
		return confirm_password;
	}

	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}

	public String getType_account() {
		return type_account;
	}

	public void setType_account(String type_account) {
		this.type_account = type_account;
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
