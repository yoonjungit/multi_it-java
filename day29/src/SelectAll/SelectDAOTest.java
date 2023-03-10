package SelectAll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class SelectDAOTest {

	public ArrayList<SelectDTOTest> search() {
		ResultSet rs = null;		//오라클에서 정수가 아닌 표로 반환되기 때문
		SelectDTOTest result = null;	//결과 반환을 위한 MemberVO객체 생성
		ArrayList<SelectDTOTest> list = new ArrayList<>();		//여러 DTO객체 저장하기 위한 배열
		
		try {
			// 1. 오라클 드라이버
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 자바-오라클 DB 연결
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			
			//3. SQL문 생성
			String sql = "SELECT * FROM HR.MEMBER";	
			PreparedStatement ps = con.prepareStatement(sql);
			
			//4. SQL문 오라클로 전송
			rs = ps.executeQuery();		//executeUpdate가 아닌 executeQuery(반환 결과가 정수가 아닌 데이터(표)이기 때문)
			
			while (rs.next()) {
				String id2 = rs.getString(1);	//반환되는 열 데이터 값 순서대로 받기
				String pw2 = rs.getString(2);
				String name2 = rs.getString(3);
				String tel2 = rs.getString(4);
				
				result = new SelectDTOTest();
				
				result.setId(id2);
				result.setPw(pw2);
				result.setName(name2);
				result.setTel(tel2);
				
				list.add(result);		//배열에 DTO객체 저장
			}
			
		} catch (Exception e) {	//모든 예외 처리
			e.printStackTrace();
		}
		
		return list;		//배열 반환
		
	}
}
