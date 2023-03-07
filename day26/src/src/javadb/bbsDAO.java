package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class bbsDAO {
	public void insert(String title, String content, String writer) {

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
			String sql = "INSERT INTO HR.BBS VALUES(HR.BBS_NO_seq.nextval, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			//?�� ��ġ�� ���� ���� id, pw, name, tel�� ���ʴ�� �Է�
//			ps.setInt(1, no);	//ù��° ����ǥ(�̶� 0�� �ƴԿ� ����) �ڸ��� id ����
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, writer);
			//���� String�� �ƴ� int��� .setInt(��ġ, ����)
			System.out.println("3. SQL�� ��ǰ �����");
			
			//4. SQL�� ����Ŭ�� ������
			ps.executeUpdate();
			System.out.println("4. SQL�� ����Ŭ�� ������ ����");
			
			System.out.println("�۾��� �Ϸ�");
			
		} catch (Exception e) {	//��� ���� ó��
			e.printStackTrace();
		}
	}
	
	public void delete(int no) {
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
			String sql = "DELETE FROM HR.BBS WHERE no = ?";	
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);	
			System.out.println("3. SQL�� ��ǰ �����");
			
			//4. SQL�� ����Ŭ�� ������
			ps.executeUpdate();
			System.out.println("4. SQL�� ����Ŭ�� ������ ����");
			
			System.out.println("�� ���� �Ϸ�");
			
		} catch (Exception e) {	//��� ���� ó��
			e.printStackTrace();
		}
	}
	public void updateC(String content, int no) {
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
			String sql = "UPDATE HR.BBS SET CONTENT = ? WHERE NO = ?";	
	
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, content);
			ps.setInt(2, no);
			//���� String�� �ƴ� int��� .setInt(��ġ, ����)
			System.out.println("3. SQL�� ��ǰ �����");
			
			//4. SQL�� ����Ŭ�� ������
			ps.executeUpdate();
			System.out.println("4. SQL�� ����Ŭ�� ������ ����");
			
			System.out.println("�� ���� �Ϸ�");
			
		} catch (Exception e) {	//��� ���� ó��
			e.printStackTrace();
		}
	}
	public void updateT(String title, int no) {
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
			String sql = "UPDATE HR.BBS SET TITLE = ? WHERE NO = ?";
			
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setInt(2, no);
			//���� String�� �ƴ� int��� .setInt(��ġ, ����)
			System.out.println("3. SQL�� ��ǰ �����");
			
			//4. SQL�� ����Ŭ�� ������
			ps.executeUpdate();
			System.out.println("4. SQL�� ����Ŭ�� ������ ����");
			
			System.out.println("�� ���� �Ϸ�");
			
		} catch (Exception e) {	//��� ���� ó��
			e.printStackTrace();
		}
	}
}
