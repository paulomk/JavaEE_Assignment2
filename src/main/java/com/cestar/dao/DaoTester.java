package com.cestar.dao;

import com.cestar.model.User;

public class DaoTester {

	public static void main(String[] args) {
		UserDao dao = new UserDao();
		dao.startConnection();
		
		dao.getUserFromName("incredible");
		
		//
		User newUser = new User ("TestUser", "1", "1", "1", "1");
		System.out.println("set user: " + dao.setUser(newUser));
		
		
		System.out.println("Validation result: " + dao.validatePassword("TestUser", "1"));
		System.out.println("Validation result: " + dao.validatePassword("incredible", "helloworld"));
		System.out.println("Validation result: " + dao.validatePassword("incredible", "nonono"));
	}

}
