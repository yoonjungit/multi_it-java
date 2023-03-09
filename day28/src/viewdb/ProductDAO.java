package viewdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductDAO {
	
	public ProductVO search(String name) {
		ResultSet rs = null;
		ProductVO vo = new ProductVO();
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "oracle";
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql = "SELECT * FROM HR.PRODUCT WHERE NAME = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);	//조회하려는 상품명 sql문에 넣기
		
		rs = ps.executeQuery();
		
		if (rs.next()) {
			String id2 = rs.getString(1);
			String name2 = rs.getString(2);
			String content2 = rs.getString(3);
			int price2 =rs.getInt(4);
			String company2 = rs.getString(5);
			String img2 = rs.getString(6);
			
			vo.setId(id2);
			vo.setName(name2);
			vo.setContent(content2);
			vo.setPrice(price2);
			vo.setCompany(company2);
			vo.setImg(img2);
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
}
