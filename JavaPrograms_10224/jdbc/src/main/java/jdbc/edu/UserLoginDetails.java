package jdbc.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class UserLoginDetails {
	public static void main(String[] args) {
		//1. Load the driver
		//2. Make the connection
		//3. Create a statement object
		// Execute or executeUpdate()
		
		String driver = "com.mysql.cj.jdbc.Driver"; //Path of Driver class
		String url = "jdbc:mysql://localhost:3306/StudentInfo";
		String uname = "root";
		String pass = "root";
		
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, uname, pass);
			
			if (conn != null) {
				System.out.println("Connection established");
				Statement st = conn.createStatement();	//It create a statement
				String sql = "SELECT * FROM student";
				ResultSet rs = st.executeQuery(sql);	//This retrives the record
				
				while(rs.next()) {
					System.out.println(rs.getString("sname") + " | " + rs.getInt("cid"));
				}
			}
			else {
				System.out.println("Not connected");
			}
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
