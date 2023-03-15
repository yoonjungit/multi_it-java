package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	public static Connection con;
	
	public MemberDAO() {
		//Connection 설정
		con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	//(1)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";	//(2)DB위치(multi), 타임존 입력
			String user = "root";
			String password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("MySQL 연결 완료");
		} catch (Exception e) {
			System.out.println("MySQL 연결중 오류 발생");
		}
	}
	public int insert(MemberVO bag) {
		int result = 0;
		try {
			String sql = "INSERT INTO MEMBER VALUES (?, ?, ?, ?)";	//(3)DB위치는 Connection 설정 시 입력했으므로 생략
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());

			result = ps.executeUpdate(); //1
			if(result == 1) {
				System.out.println("회원가입 성공!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			}
		System.out.println(result);
		return result;
	}
	
	public int delete(String deleteID) {
		int result = 0;
		
		try {
			String sql = "delete from member where id = ?";	
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, deleteID);	
			
			result = ps.executeUpdate();
			
		} catch (Exception e) {	//모든 예외 처리
			e.printStackTrace();
		}
		return result;
	}
	public int update(MemberVO bag) {
		int result = 0;
		
		try {
			String sql = "update member set tel = ? where id = ?";	
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getTel());
			ps.setString(2, bag.getId());
			
			result = ps.executeUpdate();
			
		} catch (Exception e) {	//모든 예외 처리
			e.printStackTrace();
		}
		return result ;
	}

}
 