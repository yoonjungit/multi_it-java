package javadb;

import java.util.Scanner;

public class memberDTO2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		memberDAO2 dao = new memberDAO2();
		
		
		//������ �Է� �ޱ�
		System.out.println("���ϴ� �۾� ����  : (1)ȸ�� ����, (2) ȸ�� Ż��, (3) ��й�ȣ ����");
		int choice = sc.nextInt();
		
		if (choice == 1) {
			//INSERT INTO HR.MEMBER VALUES(id, pw, name, tel
			System.out.println("���̵�, ��й�ȣ, �̸�, ��ȭ��ȣ ������ �Է�");
			String id = sc.next();
			String pw = sc.next();
			String name = sc.next();
			String tel = sc.next();
			dao.insert(id, pw, name, tel);
			
		}else if (choice == 2) {
			//DELETE FROM HR.MEMBER WHERE column=value
			System.out.println("Ż���� ���̵� �Է� : ");
			String id = sc.next();
			dao.delete(id);
			
		}else if (choice == 3) {
			//UPDATE HR.MEMBER SET name = ? WHERE id = ?"
			System.out.println("�ٲ�  ��й�ȣ : ");
			String value = sc.next();
			System.out.println("id �Է� : ");
			String value2 = sc.next();
			dao.update(value, value2);
			
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���ڸ� �Է����ּ���");
		}
		
		sc.close();
	}

}
