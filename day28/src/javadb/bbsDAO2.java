package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import viewdb.BbsVO;

public class bbsDAO2 {
	public BbsVO search(int no) {
		ResultSet rs = null;
		BbsVO vo = new BbsVO();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT * FROM HR.BBS WHERE NO = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			
			rs = ps.executeQuery();
			
			if (rs.next()) {
				int no2 = rs.getInt(1);
				String title2 = rs.getString(2);
				String content2 = rs.getString(3);
				String writer2 = rs.getString(4);
				
				vo.setNo(no2);
				vo.setTitle(title2);
				vo.setContent(content2);
				vo.setWriter(writer2);
			}
			
		} catch (Exception e) {	//모든 예외 처리
			e.printStackTrace();
		}
		return vo;
	}

}
