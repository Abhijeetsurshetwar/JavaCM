package jdbcTest;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class collableStatementTest {
	
	
	 void insertStudent() {
			
			Connection con = null;
			
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b6", "root", "root");
				
				CallableStatement cstmt = con.prepareCall("{call INSERTStu(?,?,?,?) }");
				
					
				cstmt.setInt(1,5);
				cstmt.setString(2, "Sushma");
				cstmt.setString(3, "20");
				cstmt.setString(4, "7852452656");
					
				cstmt.execute();
					
				System.out.println("Student Inserted Successfully");
				
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
			
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
	public static void main(String[] args) {
		
		collableStatementTest obj = new collableStatementTest();
		obj.insertStudent();
		
	}

}
