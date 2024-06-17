package com.cestar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cestar.model.User;

public class UserDao {
	public Connection startConnection() {
		Connection con = null;
		String user = "root";
		String pwd = "password";
		String url = "jdbc:mysql://localhost:3306/JAVAEE_ASSIGNMENT";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("Successful connection to Database!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public User getUser(String userName) {
		User user_from_db = null;
		Connection con = startConnection();
		
		String sql = "SELECT * FROM `USERS` WHERE USER_NAME = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userName);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				//create an Employee object using the Top row in rs
				user_from_db = new User(
					rs.getString("USER_NAME"),
					rs.getString("PASSWORD"),
					rs.getString("EMAIL"),
					rs.getString("CONTACT"),
					rs.getString("CITY")
				);
			}
			System.out.println(user_from_db);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user_from_db;
	}
	
}
