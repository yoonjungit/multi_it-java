package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class dbconnect {

	public static void main(String[] args) {

		try {
			// 1. 오라클 11g와 연결할 부품 설정(드라이버 로딩)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공");
			
			// 2. 오라클 11g에 연결해보자 (java-oracle DB 연결)
			// jdbc:연결할 DB=oracle:얇은버전:ip:포트번호:xe버전 
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공");
			
			//3. SQL문 만들기
			//자바는 부품조립식이기 때문에 String에 넣은 문자열을 특정한 부품으로 인식하지 못함
			String sql = "INSERT INTO HR.MEMBER VALUES('win2', 'win2', 'win2', 'win2')";	
			//특정한 부품으로 인식하기 위해서는 그 부품으로 만들어주어야 함 -> SQL부품으로 만들어야 함(PreparedStatement)
			//con부품으로 SQL스트링에 있는 것 SQL 부품으로 만들기
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 부품 만들기");
			
			//4. SQL문 오라클로 보내기
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			
		} catch (Exception e) {	//모든 예외 처리
			e.printStackTrace();
		}
	}
}
 