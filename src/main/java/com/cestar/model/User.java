package com.cestar.model;

public class User {
	private String userName;
	private String password;
	private String email;
	private String contact;
	private String city;
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}
	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", email=" + email + ", contact=" + contact
				+ ", city=" + city + "]";
	}
	
	/**
	 * @param userName
	 * @param password
	 * @param email
	 * @param contact
	 * @param city
	 */
	public User(String userName, String password, String email, String contact, String city) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.contact = contact;
		this.city = city;
	}
	
	
}
