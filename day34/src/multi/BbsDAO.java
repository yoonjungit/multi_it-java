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

}
