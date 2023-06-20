package sqlQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class InsertPerson {
	
	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amol","root","root");
			
			PreparedStatement pstmt = con.prepareStatement("insert into persons values(?, ?, ?, ?, ?)");
			
			List<PersonVO> personList = new ArrayList<>();
			
			PersonVO obj = new PersonVO();
			obj.setPersonid(3);
			obj.setFristName("Shailesh");
			
			personList.add(obj);
			
			for (PersonVO personVO : personList) {
				
				pstmt.setInt(1, personVO.getPersonid());
				pstmt.setString(2, personVO.getFristName());
				pstmt.setString(3, personVO.getFristName());
				pstmt.setString(4, personVO.getFristName());
				pstmt.setString(5, personVO.getFristName());
				pstmt.executeUpdate();
				
			}
			
			//stmt.executeUpdate("insert into persons values(1, 'Bichukale', 'Umesh', 'Pune', 'Pune')");
			
			System.out.println("Person Details Inserted");
			
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
