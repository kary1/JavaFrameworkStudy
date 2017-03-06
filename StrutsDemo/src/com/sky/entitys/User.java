package com.sky.entitys;

public class User {

	private String name;
	private String pwd;
	private String email;
	
	public User() {
		super();
	}
	public User(String name, String pwd, String email) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", pwd=" + pwd + ", email=" + email + "]";
	}
	
}
