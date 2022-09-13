package com.project2.springjdbcproject2.pojo;

public class ProfilePojo extends PojoBase {

	private int profileID;
	private int userID;
	private String iconImg;
	private String firstName;
	private String lastName;
	private String description;
	public ProfilePojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProfilePojo(int profileID, int userID, String iconImg, String firstName, String lastName,
			String description) {
		super();
		this.profileID = profileID;
		this.userID = userID;
		this.iconImg = iconImg;
		this.firstName = firstName;
		this.lastName = lastName;
		this.description = description;
	}
	public int getProfileID() {
		return profileID;
	}
	public void setProfileID(int profileID) {
		this.profileID = profileID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getIconImg() {
		return iconImg;
	}
	public void setIconImg(String iconImg) {
		this.iconImg = iconImg;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "profilePojo [profileID=" + profileID + ", userID=" + userID + ", iconImg=" + iconImg + ", firstName="
				+ firstName + ", lastName=" + lastName + ", description=" + description + "]";
	}
	
	
	
}
