package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertionDemo {
	static String url = "jdbc:mysql://localhost:3306/jdbcproject1db";	
	static String userName = "root";
	static String password = "root";
	static Connection con;	
	
	
	public static void main(String[] args) throws Exception{
		insertVariableRecord();
	}
	
	
	public static void readRecord() throws SQLException, ClassNotFoundException {
		
		String query = "SELECT * FROM Employee";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, userName, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("ID is " + rs.getInt(1));
			System.out.println("Name is " + rs.getString(2));
			System.out.println("Salary is " + rs.getInt(3) + "\n");
		}
	}
	
	
	public static void insertRecord() throws SQLException, ClassNotFoundException {
		
		String query = "INSERT INTO Employee VALUES (4, 'Aakash', 45000)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, userName, password);	
		Statement st = con.createStatement();		
		int rows = st.executeUpdate(query);
		
		System.out.println("Number of records inserted : " + rows);
	}
	
	
	public static void insertVariableRecord() throws SQLException, ClassNotFoundException {
		
		int id = 6;
		String name = "Deepak";
		int salary = 38000;
		
		String query = "INSERT INTO Employee VALUES ("+id+ ", '" +name+ "'," +salary+")";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, userName, password);	
		Statement st = con.createStatement();		
		int rows = st.executeUpdate(query);
		
		System.out.println("Number of records inserted : " + rows);
	}
}
