package viewdb;

import java.util.Scanner;

public class ProductUI {
	public static void main(String[] args) {
		//스캐너로 상품명(String)입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("조회하려는 상품명 입력");
		String name = sc.next();
		
		//입력받은 상품명 DAO 보내고 결과 VO로 받기
		ProductDAO dao = new ProductDAO();
		ProductVO vo = new ProductVO();
		vo = dao.search(name);
		
		//결과 프린트
		System.out.println(vo);
		
		sc.close();
	}
}
