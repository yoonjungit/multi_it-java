package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import viewdb.MemberVO;

public class memberDAO4 {
	/*	���α׷� ����
	 * 	UI : viewdb/nMemberUI2.java
	 * 	VO : viewdb/MemberVO.java
	 *	DAO :javadb/memberDAO3.java
	 */ 
	public int insert(MemberVO bag) {
		int result = 0;
		
		try {
			// 1. ����Ŭ 11g�� ������ ��ǰ ����(����̹� �ε�)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. ����Ŭ�� �ڹ� ������ ��ǰ ���� ����");
			
			// 2. ����Ŭ 11g�� �����غ��� (java-oracle DB ����)
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. ����Ŭ ���� ����");
			
			//3. SQL�� �����
			//�Է� ���� �޾ƾ� �ϱ� ������ ������ ��� ?�� �ְ�, setString���� ���� ����
			String sql = "INSERT INTO HR.MEMBER VALUES(?, ?, ?, ?)";	
			PreparedStatement ps = con.prepareStatement(sql);
			//?�� ��ġ�� ���� ���� id, pw, name, tel�� ���ʴ�� �Է�
			ps.setString(1, bag.getId());	//ù��° ����ǥ(�̶� 0�� �ƴԿ� ����) �ڸ��� id ����
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());
			//���� String�� �ƴ� int��� .setInt(��ġ, ����)
			System.out.println("3. SQL�� ��ǰ �����");
			
			//4. SQL�� ����Ŭ�� ������
			result = ps.executeUpdate();
			System.out.println("4. SQL�� ����Ŭ�� ������ ����");
			
		} catch (Exception e) {	//��� ���� ó��
			e.printStackTrace();
		}
		return result;
	}
	
	public int delete(MemberVO bag) {
		int result = 0;
		
		try {
			// 1. ����Ŭ 11g�� ������ ��ǰ ����(����̹� �ε�)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. ����Ŭ�� �ڹ� ������ ��ǰ ���� ����");
			
			// 2. ����Ŭ 11g�� �����غ��� (java-oracle DB ����)
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. ����Ŭ ���� ����");
			
			//3. SQL�� �����
			//�Է� ���� �޾ƾ� �ϱ� ������ ������ ��� ?�� �ְ�, setString���� ���� ����
			String sql = "DELETE FROM HR.MEMBER WHERE id = ?";	
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());	
			System.out.println("3. SQL�� ��ǰ �����");
			
			//4. SQL�� ����Ŭ�� ������
			result = ps.executeUpdate();
			System.out.println("4. SQL�� ����Ŭ�� ������ ����");
			
		} catch (Exception e) {	//��� ���� ó��
			e.printStackTrace();
		}
		return result;
	}
	public int update(MemberVO bag) {
		int result = 0;
		
		try {
			// 1. ����Ŭ 11g�� ������ ��ǰ ����(����̹� �ε�)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. ����Ŭ�� �ڹ� ������ ��ǰ ���� ����");
			
			// 2. ����Ŭ 11g�� �����غ��� (java-oracle DB ����)
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. ����Ŭ ���� ����");
			
			//3. SQL�� �����
			//�Է� ���� �޾ƾ� �ϱ� ������ ������ ��� ?�� �ְ�, setString���� ���� ����
			String sql = "UPDATE HR.MEMBER SET pw = ? WHERE id = ?";	
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getPw());
			ps.setString(2, bag.getId());
			//���� String�� �ƴ� int��� .setInt(��ġ, ����)
			System.out.println("3. SQL�� ��ǰ �����");
			
			//4. SQL�� ����Ŭ�� ������
			result = ps.executeUpdate();
			System.out.println("4. SQL�� ����Ŭ�� ������ ����");
			
		} catch (Exception e) {	//��� ���� ó��
			e.printStackTrace();
		}
		return result ;
	}
	
		public MemberVO search(MemberVO bag) {
			ResultSet rs = null;		//����Ŭ���� ������ �ƴ� ǥ�� ��ȯ�Ǳ� ����
			MemberVO result = new MemberVO();		//��� ��ȯ�� ���� MemberVO��ü ����(��� ���� ������ �� ���̹Ƿ� ���⼭�� ��ü�� ��ȯ)
			
			try {
				// 1. ����Ŭ 11g�� ������ ��ǰ ����(����̹� �ε�)
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("1. ����Ŭ�� �ڹ� ������ ��ǰ ���� ����");
				
				// 2. ����Ŭ 11g�� �����غ��� (java-oracle DB ����)
				String url ="jdbc:oracle:thin:@localhost:1521:xe";
				String user = "system";
				String password = "oracle";
				Connection con = DriverManager.getConnection(url, user, password);
				System.out.println("2. ����Ŭ ���� ����");
				
				//3. SQL�� �����
				//�Է� ���� �޾ƾ� �ϱ� ������ ������ ��� ?�� �ְ�, setString���� ���� ����
				String sql = "SELECT * FROM HR.MEMBER WHERE id = ?";	
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, bag.getId());	
				System.out.println("3. SQL�� ��ǰ �����");
				
				//4. SQL�� ����Ŭ�� ������
				rs = ps.executeQuery();		//executeUpdate�� �ƴ� executeQuery(��ȯ ����� ������ �ƴ� ������(ǥ)�̱� ����)
				System.out.println("4. SQL�� ����Ŭ�� ������ ����");
				
				if (rs.next()) {	//rs.next()���� ��ȯ�Ȱ� ������(�̶� ��ȸ�Ǵ� ������0�̾ ���� ��ȯ�ϱ� ������ ������ ����� ����Ǹ� ��ȯ �� ����)
					System.out.println("��ȸ�� ��� ����");
					String id2 = rs.getString(1);	//��ȯ�Ǵ� �� ������ �� ������� �ޱ�
					String pw2 = rs.getString(2);
					String name2 = rs.getString(3);
					String tel2 = rs.getString(4);
					
					result.setId(id2);		//result MemberVO��ü�� �� set�ϱ�
					result.setPw(pw2);
					result.setName(name2);
					result.setTel(tel2);
				}
			} catch (Exception e) {	//��� ���� ó��
				e.printStackTrace();
			}
			return result;		//result ��ȯ
		}
		


	
	
	
}
 