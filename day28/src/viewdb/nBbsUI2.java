package viewdb;

import java.util.Scanner;

import javadb.bbsDAO2;

public class nBbsUI2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȸ�Ϸ��� �� ��ȣ �Է�");
		int no = sc.nextInt();
		
		BbsVO vo = new BbsVO();
		bbsDAO2 dao = new bbsDAO2();
		
		vo = dao.search(no);
		System.out.println(vo);
		
		sc.close();
	}
	

}
