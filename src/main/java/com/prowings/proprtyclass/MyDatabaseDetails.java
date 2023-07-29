package com.prowings.proprtyclass;

public class MyDatabaseDetails {

	String userName;
	String url;
	String password;

	public MyDatabaseDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyDatabaseDetails(String userName, String url, String password) {
		super();
		this.userName = userName;
		this.url = url;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "MyDatabaseDetails [userName=" + userName + ", url=" + url + ", password=" + password + "]";
	}

}
