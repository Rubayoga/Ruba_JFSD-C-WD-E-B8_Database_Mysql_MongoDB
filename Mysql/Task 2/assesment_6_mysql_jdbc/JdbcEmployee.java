package assesment_6_mysql_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcEmployee {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/task1q1";
		String user = "root";
		String password = "Ruba@19v";
		String query = "insert into employee(empcode,empname,empage,esalary) values(?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection Established Successfully");
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1,105);
			pstmt.setString(2,"Shameer");
			pstmt.setInt(3,25);
			pstmt.setInt(4,90000);
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
