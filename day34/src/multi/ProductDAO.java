package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductDAO {
	public static Connection con;
	
	public ProductDAO() {
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
	
	public int insert(ProductVO vo) {
		int result = 0;
		try {
			String sql = "INSERT INTO PRODUCT VALUES (?, ?, ?, ?, ?, ?)";	//(3)DB위치는 Connection 설정 시 입력했으므로 생략
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getContent());
			ps.setInt(4, vo.getPrice());
			ps.setString(5, vo.getCompany());
			ps.setString(6, vo.getImg());
			
			result = ps.executeUpdate(); //1
			if(result == 1) {
				System.out.println("상품등록 성공!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			}
		return result;
	}
	
	public int delete(String deleteID) {
		int result = 0;
		
		try {
			String sql = "delete from product where id = ?";	
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, deleteID);	
			
			result = ps.executeUpdate();
			
		} catch (Exception e) {	//모든 예외 처리
			e.printStackTrace();
		}
		return result;
	}
	public int update(ProductVO vo) {
		int result = 0;
		
		try {
			String sql = "update product set content = ? where id = ?";	
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getContent());
			ps.setString(2, vo.getId());
			
			result = ps.executeUpdate();
			
		} catch (Exception e) {	//모든 예외 처리
			e.printStackTrace();
		}
		return result ;
	}
	
	public ArrayList<ProductVO> select(String name) {
		ResultSet rs = null;
		ArrayList<ProductVO> selectResult = new ArrayList<>();
		
		try {
			String sql = "SELECT * FROM PRODUCT WHERE NAME LIKE ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "%" + name + "%");
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String id2 = rs.getString(1);
				String name2 = rs.getString(2);
				String content2 = rs.getString(3);
				int price = rs.getInt(4);
				String company2 = rs.getString(5);
				String img2 = rs.getString(6);
				
				ProductVO vo = new ProductVO();
				
				vo.setId(id2);
				vo.setName(name2);
				vo.setContent(content2);
				vo.setPrice(price);
				vo.setCompany(company2);
				vo.setImg(img2);
				
				selectResult.add(vo);
			}
			System.out.println(selectResult.size());
		} catch (Exception e) {
			System.out.println("오류 발생");
		}
		return selectResult;
	}
	
	public ArrayList<ProductVO> selectAll() {
		ArrayList<ProductVO> selectAllList = new ArrayList<>();
		ResultSet rs = null;
		
		try {
			String sql = "SELECT * FROM PRODUCT";
			PreparedStatement ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String id2 = rs.getString(1);
				String name2 = rs.getString(2);
				String content2 = rs.getString(3);
				int price = rs.getInt(4);
				String company2 = rs.getString(5);
				String img2 = rs.getString(6);
				
				ProductVO vo = new ProductVO();
				vo.setId(id2);
				vo.setName(name2);
				vo.setContent(content2);
				vo.setPrice(price);
				vo.setCompany(company2);
				vo.setImg(img2);
				
				selectAllList.add(vo);
			}
		} catch (Exception e) {
			System.out.println("오류 발생");
		}
		return selectAllList;
	}
}
