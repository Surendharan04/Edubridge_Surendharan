package com.atmproject;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

	//Initializing Driver class and setting up the url
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/atm_db";
	private static String uname = "root";
	private static String pass = "root";
	private static Connection conn;
	
	public DatabaseConnection() {}

	public static Connection getConnection() {

		try {
			Class.forName(driver);
			if(conn == null) {
			//Make connection with the SQL database
			conn = DriverManager.getConnection(url, uname, pass);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}
}