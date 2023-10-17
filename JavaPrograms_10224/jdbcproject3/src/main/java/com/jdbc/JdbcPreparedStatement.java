package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcPreparedStatement {
	private static Connection con;
	private static Statement st;
	private static ResultSet rs;
	private static PreparedStatement pst;
	private static String url = "jdbc:mysql://localhost:3306/jdbcproject1db";
	private static String uname = "root";
	private static String pass = "root";
	private static String driver = "com.mysql.cj.jdbc.Driver";
	
	
	public static void main(String[] args) throws Exception {
		//readRecord();
		//insertUsingPst();
		//deleteRecord();
		updateRecord();
	}
	
	public static void readRecord() throws SQLException, ClassNotFoundException {
		
		String query = "SELECT * FROM Employee";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, uname, pass);
		st = con.createStatement();
		rs = st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("ID is " + rs.getInt(1));
			System.out.println("Name is " + rs.getString(2));
			System.out.println("Salary is " + rs.getInt(3) + "\n");
		}
	}
	
	public static void insertUsingPst() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID: ");
		int eid = sc.nextInt();
		
		System.out.println("Enter the Name: ");
		String ename = sc.next();
		
		System.out.println("Enter the Salary: ");
		int esalary = sc.nextInt();
		
		String query = "INSERT INTO Employee VALUES (?,?,?)";
		//The '?' values is entered using the 'set' function with the index of ? and value
		
		Class.forName(driver);
		con = DriverManager.getConnection(url,uname,pass);
		
		pst = con.prepareStatement(query);
		pst.setInt(1, eid);
		pst.setString(2, ename);
		pst.setInt(3, esalary);
		int rows = pst.executeUpdate();	
		//Prepared statement will return the number of rows that got affected
		
		System.out.println("Number of records inserted: " + rows);
		con.close();
		sc.close();
	}
	
	
	public static void deleteRecord() throws ClassNotFoundException, SQLException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID: ");
		int eid = sc.nextInt();
		
		String query = "DELETE FROM Employee WHERE eid = ?";
		
		Class.forName(driver);
		con = DriverManager.getConnection(url,uname,pass);
		
		pst = con.prepareStatement(query);
		pst.setInt(1, eid);	
		//We can just ask for the employee id for deletion
		
		int rows = pst.executeUpdate();
		
		System.out.println("Number of rows deleted: " + rows);
		con.close();
		sc.close();
	}
	
	
	public static void updateRecord() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID: ");
		int eid = sc.nextInt();
		
		System.out.println("Enter the Salary to be changed: ");
		int esalary = sc.nextInt();
		
		String query = "UPDATE Employee SET esalary = ? WHERE eid = ?";
		
		Class.forName(driver);
		con = DriverManager.getConnection(url,uname,pass);
		
		pst = con.prepareStatement(query);
		pst.setInt(1,esalary);
		pst.setInt(2,eid);
		
		int rows = pst.executeUpdate();
		
		System.out.println("Number of rows updated: " + rows);
		
		sc.close();
	}
}
