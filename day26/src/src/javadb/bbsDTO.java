package javadb;

import java.util.Scanner;

public class bbsDTO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		bbsDAO dao = new bbsDAO();
		
		
		//������ �Է� �ޱ�
		System.out.println("���ϴ� �۾� ����  : (1) �۾���, (2) �� ����, (3) �� ���� ����, (4) �� ���� ����");
		int choice = sc.nextInt();
		
		if (choice == 1) {
			//INSERT INTO HR.BBS VALUES(no, title, content, writer)
			System.out.println("�� �ۼ��ϱ� : ����, ����, �ۼ��� �Է�");
//			int no = sc.nextInt();
			String title = sc.next();
			String content = sc.next();
			String writer = sc.next();
			dao.insert(title, content, writer);
			
		}else if (choice == 2) {
			//DELETE FROM HR.BBS WHERE id = value
			System.out.println("������ �� ��ȣ �Է�");
			int id = sc.nextInt();
			dao.delete(id);
			
		}else if (choice == 3) {
			//UPDATE HR.MEMBER SET title/content = ? WHERE id = ?"
			System.out.println("�ٲ� �� ���� �Է� : ");
			String title = sc.next();
			System.out.println("�� id �Է� : ");
			int id = sc.nextInt();
			dao.updateT(title, id);
				
			
		}else if (choice == 4) {
			//UPDATE HR.MEMBER SET title/content = ? WHERE id = ?"
			System.out.println("�ٲ� ���� �Է� : ");
			String content = sc.next();
			System.out.println("�� id �Է� : ");
			int id = sc.nextInt();
			dao.updateC(content, id);
			
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���ڸ� �Է����ּ���");
		}		
		sc.close();
	}
}
