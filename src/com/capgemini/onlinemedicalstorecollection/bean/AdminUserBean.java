package com.capgemini.onlinemedicalstorecollection.bean;

public class AdminUserBean {

	private int id;
	private String name;
	private String password;
	private String email;
	private String type;
	
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "AdminUserBean [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", type="
				+ type + "]";
	}
	
	
	
}
