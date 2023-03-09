package viewdb;

import java.util.Scanner;

import javadb.bbsDAO2;

public class nBbsUI2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("조회하려는 글 번호 입력");
		int no = sc.nextInt();
		
		BbsVO vo = new BbsVO();
		bbsDAO2 dao = new bbsDAO2();
		
		vo = dao.search(no);
		System.out.println(vo);
		
		sc.close();
	}
	

}
