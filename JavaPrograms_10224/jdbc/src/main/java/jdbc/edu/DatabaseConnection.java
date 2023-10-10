package jdbc.edu;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/EdubridgeEmployees";
	private static String un = "root";
	private static String pass = "root";
	private static Connection conn;
	
	private DatabaseConnection() {}

	public static Connection getConnection() {

		try {
			Class.forName(driver);
			if(conn == null) {
			conn = DriverManager.getConnection(url, un, pass);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;

	}
}