package com.chaya.pojo;

public class User {
	
	String userName;
	String password;
	String userType;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	public User(String userName, String password, String userType) {
		super();
		this.userName = userName;
		this.password = password;
		this.userType = userType;
	}
	
	public User(String userName2, String password2, String userType2) {
		
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", userType=" + userType + "]";
	}
	
	

}