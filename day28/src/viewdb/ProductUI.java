package viewdb;

import java.util.Scanner;

public class ProductUI {
	public static void main(String[] args) {
		//��ĳ�ʷ� ��ǰ��(String)�Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȸ�Ϸ��� ��ǰ�� �Է�");
		String name = sc.next();
		
		//�Է¹��� ��ǰ�� DAO ������ ��� VO�� �ޱ�
		ProductDAO dao = new ProductDAO();
		ProductVO vo = new ProductVO();
		vo = dao.search(name);
		
		//��� ����Ʈ
		System.out.println(vo);
		
		sc.close();
	}
}
