package javadb;

import java.util.Scanner;

public class memberDTO2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		memberDAO2 dao = new memberDAO2();
		
		
		//데이터 입력 받기
		System.out.println("원하는 작업 선택  : (1)회원 가입, (2) 회원 탈퇴, (3) 비밀번호 변경");
		int choice = sc.nextInt();
		
		if (choice == 1) {
			//INSERT INTO HR.MEMBER VALUES(id, pw, name, tel
			System.out.println("아이디, 비밀번호, 이름, 전화번호 순으로 입력");
			String id = sc.next();
			String pw = sc.next();
			String name = sc.next();
			String tel = sc.next();
			dao.insert(id, pw, name, tel);
			
		}else if (choice == 2) {
			//DELETE FROM HR.MEMBER WHERE column=value
			System.out.println("탈퇴할 아이디 입력 : ");
			String id = sc.next();
			dao.delete(id);
			
		}else if (choice == 3) {
			//UPDATE HR.MEMBER SET name = ? WHERE id = ?"
			System.out.println("바꿀  비밀번호 : ");
			String value = sc.next();
			System.out.println("id 입력 : ");
			String value2 = sc.next();
			dao.update(value, value2);
			
		}else {
			System.out.println("잘못 입력하셨습니다. 숫자만 입력해주세요");
		}
		
		sc.close();
	}

}
