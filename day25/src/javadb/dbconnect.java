package javadb;

import java.sql.DriverManager;

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
			DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공");
			
			
		} catch (Exception e) {	//모든 예외 처리
			e.printStackTrace();
		}

	}

}
 