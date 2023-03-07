package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class memberDAO2 {
	public void insert(String id, String pw, String name, String tel) {

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
			ps.setString(1, id);	//ù��° ����ǥ(�̶� 0�� �ƴԿ� ����) �ڸ��� id ����
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, tel);
			//���� String�� �ƴ� int��� .setInt(��ġ, ����)
			System.out.println("3. SQL�� ��ǰ �����");
			
			//4. SQL�� ����Ŭ�� ������
			ps.executeUpdate();
			System.out.println("4. SQL�� ����Ŭ�� ������ ����");
			
			System.out.println("ȸ������ �Ϸ�");
			
		} catch (Exception e) {	//��� ���� ó��
			e.printStackTrace();
		}
	}
	
	public void delete(String id) {
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
			ps.setString(1, id);	
			System.out.println("3. SQL�� ��ǰ �����");
			
			//4. SQL�� ����Ŭ�� ������
			ps.executeUpdate();
			System.out.println("4. SQL�� ����Ŭ�� ������ ����");
			
			System.out.println("ȸ�� Ż�� �Ϸ�");
			
		} catch (Exception e) {	//��� ���� ó��
			e.printStackTrace();
		}
	}
	public void update(String value, String value2) {
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
			ps.setString(1, value);
			ps.setString(2, value2);
			//���� String�� �ƴ� int��� .setInt(��ġ, ����)
			System.out.println("3. SQL�� ��ǰ �����");
			
			//4. SQL�� ����Ŭ�� ������
			ps.executeUpdate();
			System.out.println("4. SQL�� ����Ŭ�� ������ ����");
			
			System.out.println("��й�ȣ ���� �Ϸ�");
			
		} catch (Exception e) {	//��� ���� ó��
			e.printStackTrace();
		}
	}
	
	
	
}
 