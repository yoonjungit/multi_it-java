package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import viewdb.MemberVO;

public class memberDAO4 {
	/*	프로그램 관계
	 * 	UI : viewdb/nMemberUI2.java
	 * 	VO : viewdb/MemberVO.java
	 *	DAO :javadb/memberDAO3.java
	 */ 
	public int insert(MemberVO bag) {
		int result = 0;
		
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
			ps.setString(1, bag.getId());	//첫번째 물음표(이때 0이 아님에 주의) 자리에 id 대입
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());
			//만약 String이 아닌 int라면 .setInt(위치, 변수)
			System.out.println("3. SQL문 부품 만들기");
			
			//4. SQL문 오라클로 보내기
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			
		} catch (Exception e) {	//모든 예외 처리
			e.printStackTrace();
		}
		return result;
	}
	
	public int delete(MemberVO bag) {
		int result = 0;
		
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
			ps.setString(1, bag.getId());	
			System.out.println("3. SQL문 부품 만들기");
			
			//4. SQL문 오라클로 보내기
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			
		} catch (Exception e) {	//모든 예외 처리
			e.printStackTrace();
		}
		return result;
	}
	public int update(MemberVO bag) {
		int result = 0;
		
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
			ps.setString(1, bag.getPw());
			ps.setString(2, bag.getId());
			//만약 String이 아닌 int라면 .setInt(위치, 변수)
			System.out.println("3. SQL문 부품 만들기");
			
			//4. SQL문 오라클로 보내기
			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			
		} catch (Exception e) {	//모든 예외 처리
			e.printStackTrace();
		}
		return result ;
	}
	
		public MemberVO search(MemberVO bag) {
			ResultSet rs = null;		//오라클에서 정수가 아닌 표로 반환되기 때문
			MemberVO result = new MemberVO();		//결과 반환을 위한 MemberVO객체 생성(결과 값은 무조건 한 행이므로 여기서는 객체로 반환)
			
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
				String sql = "SELECT * FROM HR.MEMBER WHERE id = ?";	
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, bag.getId());	
				System.out.println("3. SQL문 부품 만들기");
				
				//4. SQL문 오라클로 보내기
				rs = ps.executeQuery();		//executeUpdate가 아닌 executeQuery(반환 결과가 정수가 아닌 데이터(표)이기 때문)
				System.out.println("4. SQL문 오라클로 보내기 성공");
				
				if (rs.next()) {	//rs.next()만약 반환된게 있으면(이때 조회되는 데이터0이어도 행을 반환하기 때문에 서버만 제대로 연결되면 반환 값 있음)
					System.out.println("조회된 결과 있음");
					String id2 = rs.getString(1);	//반환되는 열 데이터 값 순서대로 받기
					String pw2 = rs.getString(2);
					String name2 = rs.getString(3);
					String tel2 = rs.getString(4);
					
					result.setId(id2);		//result MemberVO객체에 값 set하기
					result.setPw(pw2);
					result.setName(name2);
					result.setTel(tel2);
				}
			} catch (Exception e) {	//모든 예외 처리
				e.printStackTrace();
			}
			return result;		//result 반환
		}
		


	
	
	
}
 