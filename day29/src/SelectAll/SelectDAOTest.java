package SelectAll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class SelectDAOTest {

	public ArrayList<SelectDTOTest> search() {
		ResultSet rs = null;		//����Ŭ���� ������ �ƴ� ǥ�� ��ȯ�Ǳ� ����
		SelectDTOTest result = null;	//��� ��ȯ�� ���� MemberVO��ü ����
		ArrayList<SelectDTOTest> list = new ArrayList<>();		//���� DTO��ü �����ϱ� ���� �迭
		
		try {
			// 1. ����Ŭ ����̹�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. �ڹ�-����Ŭ DB ����
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			
			//3. SQL�� ����
			String sql = "SELECT * FROM HR.MEMBER";	
			PreparedStatement ps = con.prepareStatement(sql);
			
			//4. SQL�� ����Ŭ�� ����
			rs = ps.executeQuery();		//executeUpdate�� �ƴ� executeQuery(��ȯ ����� ������ �ƴ� ������(ǥ)�̱� ����)
			
			while (rs.next()) {
				String id2 = rs.getString(1);	//��ȯ�Ǵ� �� ������ �� ������� �ޱ�
				String pw2 = rs.getString(2);
				String name2 = rs.getString(3);
				String tel2 = rs.getString(4);
				
				result = new SelectDTOTest();
				
				result.setId(id2);
				result.setPw(pw2);
				result.setName(name2);
				result.setTel(tel2);
				
				list.add(result);		//�迭�� DTO��ü ����
			}
			
		} catch (Exception e) {	//��� ���� ó��
			e.printStackTrace();
		}
		
		return list;		//�迭 ��ȯ
		
	}
}
