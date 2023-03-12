package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

//import SelectDTOTest;

public class SearchDAO {
	public static Connection con;
	//�⺻ �޼ҵ� : ����Ŭ DB����
	public SearchDAO() {
		con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println("Oracle DB ���� ����");
		}
	}
	
	//1. ��ü ������ ����Ʈ �޾ƿ���(DTO��ü�� �迭�� ���� �� ��ȯ)
	public ArrayList<SearchDTO> search(){
		ResultSet rs = null;
		SearchDTO restaurant = new SearchDTO();
		ArrayList<SearchDTO> resList = new ArrayList<>();
		
		try {
			String sql = "SELECT * FROM HR.PJ_RESTAURANT";	
			PreparedStatement ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
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
				
				resList.add(restaurant);
			}
		}
		
		catch (Exception e) {
			System.out.println("��ü ������ ����Ʈ �ޱ� ����");
		}
	
		return resList;
	}
	
	//2. ������ ������ ����Ʈ �޾ƿ��� (������ �̸��� String ��ü�� �迭�� ���� �� ��ȯ)
	public ArrayList<String> searchL(String location){
		ResultSet rs = null;
		ArrayList<String> resList = new ArrayList<>();
		
		try {
			String sql = "SELECT * FROM HR.PJ_RESTAURANT WHERE ADDRESS LIKE '%'||?||'%'";	
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, location);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				String name = rs.getString(1);
				resList.add(name);
			}
		}
		catch (Exception e) {
			System.out.println("������ ������ ����Ʈ �ޱ� ����");
		}
	
		return resList;
	}
	
	//3. �ϸ�ũ�� ����Ʈ �޾ƿ��� (������ �̸��� String ��ü�� �迭�� ���� �� ��ȯ)
	public ArrayList<String> searchBookmark(){
		ResultSet rs = null;
		ArrayList<String> resListL = new ArrayList<>();
		
		try {
			String sql = "SELECT RES_NAME FROM HR.PJ_BOOKMARKS WHERE ID = 'yoonj'";	
			PreparedStatement ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				String name = rs.getString(1);
				resListL.add(name);
			}
		}
		catch (Exception e) {
			System.out.println("�ϸ�ũ ����Ʈ �ޱ� ����");
		}
	
		return resListL;
	}
	
	//4. �ϸ�ũ ����/���� (ó���� ���(=1) ��ȯ)
	public int bookmarkUpdate(String res_name){
		ResultSet rs = null;
		int execute = 0;
		
		try {
			String sql = "SELECT * FROM HR.PJ_BOOKMARKS WHERE ID = 'yoonj' AND RES_NAME = ?";	
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, res_name);
			rs = ps.executeQuery();
			
			if (rs.next()) {
				String deleteSql = "DELETE FROM HR.PJ_BOOKMARKS WHERE ID = 'yoonj' AND RES_NAME = ?";
				PreparedStatement ps1 = con.prepareStatement(deleteSql);
				ps1.setString(1, res_name);
				execute = ps1.executeUpdate();
			} else {
				String updateSql = "INSERT INTO HR.PJ_BOOKMARKS VALUES('yoonj', ?)";
				PreparedStatement ps2 = con.prepareStatement(updateSql);
				ps2.setString(1, res_name);
				execute = ps2.executeUpdate();
			}
			
		}
		catch (Exception e) {
			System.out.println("�ϸ�ũ ����");
		}
	
		return execute;
	}
}
