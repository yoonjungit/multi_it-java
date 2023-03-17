package multi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MusicDAO {
public static Connection con;
	
	public MusicDAO() {
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
	
	public int insert(MusicVO song) {
		int result = 0;
		try {
			String sql = "INSERT INTO MUSIC VALUES (?, ?, ?, ?)";	//(3)DB위치는 Connection 설정 시 입력했으므로 생략
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, song.getTitle());
			ps.setString(2, song.getArtist());
			ps.setInt(3, song.getHit());
			ps.setString(4, song.getImg());

			result = ps.executeUpdate(); //1
			if(result == 1) {
				System.out.println("음악 등록 완료");
			}
		} catch (Exception e) {
			e.printStackTrace();
			}
		System.out.println(result);
		return result;
	}
	
	public int delete(int songId) {
		int result = 0;
		
		try {
			String sql = "delete from MUSIC where song_id = ?";	
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, songId);	
			
			result = ps.executeUpdate();
			
		} catch (Exception e) {	//모든 예외 처리
			e.printStackTrace();
		}
		return result;
	}
	
	public void update(int song_id, int hit) {
		int result = 0;
		ResultSet rs = null;
		
		try {
			String sql = "update music set hit = ? where song_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, hit+1);	//조회수 1증가
			ps.setInt(2, song_id);
			result = ps.executeUpdate();
			
		} catch (Exception e) {	//모든 예외 처리
			e.printStackTrace();
		}
	}
	
	
	public ArrayList<MusicVO> getChart() {
		ArrayList<MusicVO> chart = new ArrayList<>();
		ResultSet rs = null;
		
		try {
			String sql = "SELECT title, artist, img, hit, song_id FROM MUSIC order by hit DESC";
			PreparedStatement ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String title2 = rs.getString(1);
				String artist2 = rs.getString(2);
				String img2 = rs.getString(3);
				int hit2 = rs.getInt(4);
				int song_id2 = rs.getInt(5);
				
				MusicVO vo = new MusicVO();
				
				vo.setTitle(title2);
				vo.setArtist(artist2);
				vo.setImg(img2);
				vo.setHit(hit2);
				vo.setSong_id(song_id2);
				
				chart.add(vo);
			}
		} catch (Exception e) {
			System.out.println("오류 발생");
		}
		return chart;
	}
}
