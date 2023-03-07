package javadb;

import java.util.Scanner;

public class bbsDTO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		bbsDAO dao = new bbsDAO();
		
		
		//데이터 입력 받기
		System.out.println("원하는 작업 선택  : (1) 글쓰기, (2) 글 삭제, (3) 글 제목 수정, (4) 글 내용 수정");
		int choice = sc.nextInt();
		
		if (choice == 1) {
			//INSERT INTO HR.BBS VALUES(no, title, content, writer)
			System.out.println("글 작성하기 : 제목, 내용, 작성자 입력");
//			int no = sc.nextInt();
			String title = sc.next();
			String content = sc.next();
			String writer = sc.next();
			dao.insert(title, content, writer);
			
		}else if (choice == 2) {
			//DELETE FROM HR.BBS WHERE id = value
			System.out.println("삭제할 글 번호 입력");
			int id = sc.nextInt();
			dao.delete(id);
			
		}else if (choice == 3) {
			//UPDATE HR.MEMBER SET title/content = ? WHERE id = ?"
			System.out.println("바꿀 글 제목 입력 : ");
			String title = sc.next();
			System.out.println("글 id 입력 : ");
			int id = sc.nextInt();
			dao.updateT(title, id);
				
			
		}else if (choice == 4) {
			//UPDATE HR.MEMBER SET title/content = ? WHERE id = ?"
			System.out.println("바꿀 내용 입력 : ");
			String content = sc.next();
			System.out.println("글 id 입력 : ");
			int id = sc.nextInt();
			dao.updateC(content, id);
			
		}else {
			System.out.println("잘못 입력하셨습니다. 숫자만 입력해주세요");
		}		
		sc.close();
	}
}
