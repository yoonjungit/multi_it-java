package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class memberDAO2 {
	public void insert(String id, String pw, String name, String tel) {

		try {
			// 1. 오라클 11g와 연결할 부품 설정(드라이버 로딩)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공");
			
			// 2. 오라클 11g에 연결해보자 (java-oracle DB 연결)
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공");
			
			//3. SQL문 만들기
			//입력 값을 받아야 하기 때문에 변수값 대신 ?를 넣고, setString으로 변수 지정
			String sql = "INSERT INTO HR.MEMBER VALUES(?, ?, ?, ?)";	
			PreparedStatement ps = con.prepareStatement(sql);
			//?를 위치에 따라 각각 id, pw, name, tel로 차례대로 입력
			ps.setString(1, id);	//첫번째 물음표(이때 0이 아님에 주의) 자리에 id 대입
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, tel);
			//만약 String이 아닌 int라면 .setInt(위치, 변수)
			System.out.println("3. SQL문 부품 만들기");
			
			//4. SQL문 오라클로 보내기
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			
			System.out.println("회원가입 완료");
			
		} catch (Exception e) {	//모든 예외 처리
			e.printStackTrace();
		}
	}
	
	public void delete(String id) {
		try {
			// 1. 오라클 11g와 연결할 부품 설정(드라이버 로딩)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공");
			
			// 2. 오라클 11g에 연결해보자 (java-oracle DB 연결)
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공");
			
			//3. SQL문 만들기
			//입력 값을 받아야 하기 때문에 변수값 대신 ?를 넣고, setString으로 변수 지정
			String sql = "DELETE FROM HR.MEMBER WHERE id = ?";	
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);	
			System.out.println("3. SQL문 부품 만들기");
			
			//4. SQL문 오라클로 보내기
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			
			System.out.println("회원 탈퇴 완료");
			
		} catch (Exception e) {	//모든 예외 처리
			e.printStackTrace();
		}
	}
	public void update(String value, String value2) {
		try {
			// 1. 오라클 11g와 연결할 부품 설정(드라이버 로딩)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공");
			
			// 2. 오라클 11g에 연결해보자 (java-oracle DB 연결)
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공");
			
			//3. SQL문 만들기
			//입력 값을 받아야 하기 때문에 변수값 대신 ?를 넣고, setString으로 변수 지정
			String sql = "UPDATE HR.MEMBER SET pw = ? WHERE id = ?";	
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, value);
			ps.setString(2, value2);
			//만약 String이 아닌 int라면 .setInt(위치, 변수)
			System.out.println("3. SQL문 부품 만들기");
			
			//4. SQL문 오라클로 보내기
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			
			System.out.println("비밀번호 수정 완료");
			
		} catch (Exception e) {	//모든 예외 처리
			e.printStackTrace();
		}
	}
	
	
	
}
 