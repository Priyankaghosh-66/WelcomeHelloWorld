package bean;

import java.io.Serializable;

public class UserBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6990309107227529511L;
	private String userId;
	private String email;
	private Integer age;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getAge() {
		return age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}

}
