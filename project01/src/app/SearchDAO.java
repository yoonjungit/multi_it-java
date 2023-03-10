package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

//import SelectDTOTest;

public class SearchDAO {
	
	public ArrayList<SearchDTO> searchL(String location){
		ResultSet rs = null;
		SearchDTO restaurant = null;
		ArrayList<SearchDTO> restList = new ArrayList<>();
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("DB 드라이버 로딩중");
		
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "oracle";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("DB 연결 완료");
		
		String sql = "SELECT * FROM HR.PJ_RESTAURANT WHERE ADDRESS LIKE '%'||?||'%'";	
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, location);
		rs = ps.executeQuery();
		
		System.out.println("SQL문 전송");
		
		while (rs.next()) {
			String name = rs.getString(1);
			String address = rs.getString(2);
			String category = rs.getString(3);
			float nStars = rs.getFloat(4);
			float kStars = rs.getFloat(5);
			float gStars = rs.getFloat(6);
			String menu = rs.getString(7);
			String img = rs.getString(8);
			int views = rs.getInt(9);
			
			restaurant = new SearchDTO();
			
			restaurant.setName(name);
			restaurant.setAddress(address);
			restaurant.setCategory(category);
			restaurant.setnStars(nStars);
			restaurant.setkStars(kStars);
			restaurant.setgStars(gStars);
			restaurant.setMenu(menu);
			restaurant.setImg(img);
			restaurant.setViews(views);
			
			restList.add(restaurant);
		}
	}
		
		catch (Exception e) {
			System.out.println("잉 오류 ㅜ");
		}
	
		return restList;
	}
	
	
	public ArrayList<SearchDTO> search(){
		ResultSet rs = null;
		SearchDTO restaurant = null;
		ArrayList<SearchDTO> restList = new ArrayList<>();
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("DB 드라이버 로딩중");
		
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "oracle";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("DB 연결 완료");
		
		String sql = "SELECT * FROM HR.PJ_RESTAURANT";	
		PreparedStatement ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		
		System.out.println("SQL문 전송");
		
		while (rs.next()) {
			String name = rs.getString(1);
			String address = rs.getString(2);
			String category = rs.getString(3);
			float nStars = rs.getFloat(4);
			float kStars = rs.getFloat(5);
			float gStars = rs.getFloat(6);
			String menu = rs.getString(7);
			String img = rs.getString(8);
			int views = rs.getInt(9);
			
			restaurant = new SearchDTO();
			
			restaurant.setName(name);
			restaurant.setAddress(address);
			restaurant.setCategory(category);
			restaurant.setnStars(nStars);
			restaurant.setkStars(kStars);
			restaurant.setgStars(gStars);
			restaurant.setMenu(menu);
			restaurant.setImg(img);
			restaurant.setViews(views);
			
			restList.add(restaurant);
		}
	}
		
		catch (Exception e) {
			System.out.println("오류");
		}
	
		return restList;
	}
}
