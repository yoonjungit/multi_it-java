package javadb;

import java.sql.DriverManager;

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
			DriverManager.getConnection(url, user, password);
			System.out.println("2. ����Ŭ ���� ����");
			
			
		} catch (Exception e) {	//��� ���� ó��
			e.printStackTrace();
		}

	}

}
 