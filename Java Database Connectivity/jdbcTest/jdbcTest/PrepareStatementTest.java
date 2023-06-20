package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PrepareStatementTest {
	
	
  void insertStudent(List<StudentVO> studentList) {
		
		Connection con = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b6", "root", "root");
			
			PreparedStatement pstmt = con.prepareStatement("insert into student values (?,?,?,?)");
			
			
			for (StudentVO studentVO : studentList) {
				
				pstmt.setInt(1, studentVO.getRno());
				pstmt.setString(2, studentVO.getName());
				pstmt.setString(3, studentVO.getAge());
				pstmt.setString(4, studentVO.getMobNo());
				
				pstmt.executeUpdate();
				
			}
			
			
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
		
		List<StudentVO> studentList = new ArrayList<>();
		
		StudentVO obj = new StudentVO();
		obj.setRno(4);
		obj.setName("Ramesh");
		obj.setAge("23");
		obj.setMobNo("596451256");
		
		studentList.add(obj);
		
		PrepareStatementTest obj1 = new PrepareStatementTest();
		obj1.insertStudent(studentList);
		
	}

}
