package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbcproject1db";
		String uname = "root";
		String pass = "root";
		String driver = "com.mysql.cj.jdbc.Driver";
		String query = "SELECT * FROM StudentGrades";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		if (con != null) {
			System.out.println("Connection established with database.. \n");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				System.out.println("Student ID is " + rs.getInt(1));
				System.out.println("Student Name is " + rs.getString(2));
				System.out.println("Student GPA is " + rs.getFloat(3) + "\n");
			}
		}
		else {
			System.out.println("Connection not established!");
		}
		
	}
}
