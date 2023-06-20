package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BatchUpdate {
	
	public static void main(String[] args) {
		
		Connection con = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b6", "root", "root");
			
			PreparedStatement pstmt = con.prepareStatement("insert into student values(?, ?, ?, ?)");
			
			  List<StudentVO> personList = new ArrayList<>();
			  
			  StudentVO obj = new StudentVO(); 
			  obj.setRno(21);
			  obj.setName("Shailesh");
			  
			  StudentVO obj1 = new StudentVO(); 
			  obj1.setRno(20);
			  obj1.setName("Swapnil");
			  
			  personList.add(obj);
			  personList.add(obj1);
			  
			  for (StudentVO personVO : personList) {
			  
			  pstmt.setInt(1, personVO.getRno()); 
			  pstmt.setString(2,personVO.getName()); 
			  pstmt.setString(3, personVO.getAge());
			  pstmt.setString(4, personVO.getMobNo());
			  //pstmt.executeUpdate();
			  pstmt.addBatch();
			  
			  }
			 
			  pstmt.executeBatch();
			  
			System.out.println("Student Details Inserted");
			
			
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
