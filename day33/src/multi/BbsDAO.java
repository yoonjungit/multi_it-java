package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;

public class BbsDAO {
	public static Connection con;
	
	public BbsDAO() {
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

	public int insert(BbsVO vo) {
		int result = 0;
		try {
			//맨 첫번째  NO 컬럼이 있지만 (NO, TITLE, CONTENT, WRITER) auto increment 설정으로 생략, 이후 컬럼 값만 넣어줌
			String sql = "INSERT INTO BBS (TITLE, CONTENT, WRITER) VALUES(?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getContent());
			ps.setString(3, vo.getWriter());
			
			result = ps.executeUpdate();
		} catch (Exception e) {	//모든 예외 처리
			e.printStackTrace();
		}
		return result;
	}
	
	public int delete(int no) {
		int result = 0;
		try {
			String sql = "DELETE FROM BBS WHERE no = ?";	
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);	
			
			result = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public int updateC(BbsVO vo) {
		int result = 0;
		try {
			String sql = "UPDATE BBS SET CONTENT = ? WHERE NO = ?";	
	
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getContent());
			ps.setInt(2, vo.getNo());
			
			result = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public BbsVO select(int no) {
		BbsVO vo = new BbsVO();
		ResultSet rs = null;
		
		try {
			String sql = "SELECT * FROM BBS WHERE NO = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				int no2 = rs.getInt(1);
				String title2 = rs.getString(2);
				String content2 = rs.getString(3);
				String writer2 = rs.getString(4);
				
				vo.setNo(no2);
				vo.setTitle(title2);
				vo.setContent(content2);
				vo.setWriter(writer2);
			}
		} catch (Exception e) {
			System.out.println("오류 발생");
		}
		return vo;
	}
	
	public ArrayList<BbsVO> selectAll() {
		ArrayList<BbsVO> selectAllList = new ArrayList<>();
		ResultSet rs = null;
		
		try {
			String sql = "SELECT * FROM BBS";
			PreparedStatement ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int no2 = rs.getInt(1);
				String title2 = rs.getString(2);
				String content2 = rs.getString(3);
				String writer2 = rs.getString(4);
				
				BbsVO vo = new BbsVO();
				vo.setNo(no2);
				vo.setTitle(title2);
				vo.setContent(content2);
				vo.setWriter(writer2);
				
				selectAllList.add(vo);
			}
		} catch (Exception e) {
			System.out.println("오류 발생");
		}
		return selectAllList;
	}
	public ArrayList<BbsVO> list() {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블

		// 가방들 넣어줄 큰 컨테이너 역할을 부품이 필요!
		// ArrayList<MemberVO> ==> MemberVO만 들어간 arraylist라는 의미
		ArrayList<BbsVO> list = new ArrayList<>();

		BbsVO bag = null;
		try {
			String sql = "select * from bbs";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			// 삭제!!!! ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				// 1. 검색겨로가가 있으면,
				// System.out.println("검색결과 있음. 성공.");
				int no2 = rs.getInt(1); // no
				String title = rs.getString(2); // title
				String content = rs.getString(3); // content
				String writer = rs.getString(4); // writer
				System.out.println(no2 + " " + title + " " + content + " " + writer);
				// 검색결과를 검색화면 UI부분을 주어야 함.
				bag = new BbsVO();
				bag.setNo(no2);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);

				// 4. list에 bag을 추가해주자.
				list.add(bag);
			}
			// System.out.println(result);
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// return id, pw, name, tel은 XXXXX!
		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함.
		// 검색결과가 있을 때는 bag에 데이터가 들어있음.
		// 검색결과가 없을 때는 bag에 무엇이 들어있나? null
		return list;

	}
}
