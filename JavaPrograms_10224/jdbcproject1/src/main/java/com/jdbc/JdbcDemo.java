package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/jdbcproject1db";	//Location of the database
		String userName = "root";
		String password = "root";
		String query = "SELECT * FROM Employee";
		
		Class.forName("com.mysql.cj.jdbc.Driver");	//This will be done automatically in new version of Java
		Connection con = DriverManager.getConnection(url, userName, password);	
		//DriverManager will make the connection with relational database
		
		Statement st = con.createStatement();
		//After connecting, the statement is created using 'createStatement'
		
		ResultSet rs = st.executeQuery(query);
		//ResultSet will store the result that is executed by the query using statement object
		
		while(rs.next()) {
			System.out.println("ID is " + rs.getInt(1));
			System.out.println("Name is " + rs.getString(2));
			System.out.println("Salary is " + rs.getInt(3) + "\n");
		}
		con.close();
	}
}
