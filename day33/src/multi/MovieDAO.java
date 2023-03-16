package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MovieDAO {
public static Connection con;
	
	public MovieDAO() {
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
	
	public int insert(MovieVO vo) {
		int result = 0;
		try {
			String sql = "INSERT INTO MOVIE VALUES (?, ?, ?, ?, ?)";	//(3)DB위치는 Connection 설정 시 입력했으므로 생략
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getTitle());
			ps.setString(3, vo.getContent());
			ps.setString(4, vo.getLocation());
			ps.setString(5, vo.getDirector());

			result = ps.executeUpdate(); //1
			if(result == 1) {
				System.out.println("영화 등록 완료");
			}
		} catch (Exception e) {
			e.printStackTrace();
			}
		System.out.println(result);
		return result;
	}
}
