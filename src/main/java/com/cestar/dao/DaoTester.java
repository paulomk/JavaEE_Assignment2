package com.cestar.dao;

public class DaoTester {

	public static void main(String[] args) {
		UserDao user = new UserDao();
		user.startConnection();
		
		user.getUser("incredible");

	}

}
