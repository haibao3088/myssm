package com.xxx.model;

public class User {

	private int id;
	private String username;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(int id, String userName, String password) {
		super();
		this.id = id;
		this.username = userName;
		this.password = password;
	}
	public User() {
		super();
	}
	
	
}
