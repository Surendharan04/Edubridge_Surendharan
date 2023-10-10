package jdbc.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class GetRecordBasedonEmail {
	public static void main(String[] args) {
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/EmployeeInfo";
		String uname = "root";
		String pass = "root";
		
		Connection connect;	// Initialization will enable the variable to be used within the Main method
		Statement st;	//Will allocate a memory for the variable
		ResultSet rs;
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName(driver);
			//Make the connection
			connect = DriverManager.getConnection(url, uname, pass);
			
			//Create a statement
			st = connect.createStatement();
			System.out.print("Enter Mailid: ");
			String mail = sc.next();
			String s = "SELECT * FROM Employee where eemail = '" + mail + "'";
			
			//Get the result set
			rs = st.executeQuery(s);
			if(rs.next()) {
				System.out.println("User exists with mailid " + mail);
			}
			else {
				System.out.println("User does not exists with mailid " + mail);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
