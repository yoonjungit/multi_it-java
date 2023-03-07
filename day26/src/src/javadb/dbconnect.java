package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class dbconnect {

	public static void main(String[] args) {

		try {
			// 1. ����Ŭ 11g�� ������ ��ǰ ����(����̹� �ε�)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. ����Ŭ�� �ڹ� ������ ��ǰ ���� ����");
			
			// 2. ����Ŭ 11g�� �����غ��� (java-oracle DB ����)
			// jdbc:������ DB=oracle:��������:ip:��Ʈ��ȣ:xe���� 
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. ����Ŭ ���� ����");
			
			//3. SQL�� �����
			//�ڹٴ� ��ǰ�������̱� ������ String�� ���� ���ڿ��� Ư���� ��ǰ���� �ν����� ����
			String sql = "INSERT INTO HR.MEMBER VALUES('win2', 'win2', 'win2', 'win2')";	
			//Ư���� ��ǰ���� �ν��ϱ� ���ؼ��� �� ��ǰ���� ������־�� �� -> SQL��ǰ���� ������ ��(PreparedStatement)
			//con��ǰ���� SQL��Ʈ���� �ִ� �� SQL ��ǰ���� �����
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL�� ��ǰ �����");
			
			//4. SQL�� ����Ŭ�� ������
			ps.executeUpdate();
			System.out.println("4. SQL�� ����Ŭ�� ������ ����");
			
		} catch (Exception e) {	//��� ���� ó��
			e.printStackTrace();
		}
	}
}
 