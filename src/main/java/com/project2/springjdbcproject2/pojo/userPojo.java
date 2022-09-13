package com.project2.springjdbcproject2.pojo;

public class userPojo {
	private int userID;
	private int typeID;
	private String userName;
	private String userPassword;
	private int statusID;
	private int profileID;
	public userPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public userPojo(int userID, int typeID, String userName, String userPassword, int statusID, int profileID) {
		super();
		this.userID = userID;
		this.typeID = typeID;
		this.userName = userName;
		this.userPassword = userPassword;
		this.statusID = statusID;
		this.profileID = profileID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getTypeID() {
		return typeID;
	}
	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getStatusID() {
		return statusID;
	}
	public void setStatusID(int statusID) {
		this.statusID = statusID;
	}
	public int getProfileID() {
		return profileID;
	}
	public void setProfileID(int profileID) {
		this.profileID = profileID;
	}
	@Override
	public String toString() {
		return "userPojo [userID=" + userID + ", typeID=" + typeID + ", userName=" + userName + ", userPassword="
				+ userPassword + ", statusID=" + statusID + ", profileID=" + profileID + "]";
	}
	
	
	
}
