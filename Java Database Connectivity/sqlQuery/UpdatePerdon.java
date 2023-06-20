package sqlQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatePerdon {
	
	public static void main(String[] args) {
		Connection con = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amol","root","root");
			
			Statement stmt = con.createStatement();
			
			//stmt.executeUpdate("update persons set address='Hinjewadi' where PersonID='1'");
			stmt.executeUpdate("delete from persons where PersonID='2'");
			System.out.println("Person Details Deleted");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
