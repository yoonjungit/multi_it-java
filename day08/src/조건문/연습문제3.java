package 조건문;

import java.util.Scanner;

public class 연습문제3 {

	public static void main(String[] args) {
		//1.
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		
		if (id.equals("root")&&pw.equals("1234")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		//2.
		System.out.print("사과 구매 갯수 : ");
		int aCount = sc.nextInt();
		System.out.print("사과 한 개당 가격 : ");
		int aPrice = sc.nextInt();
		
		System.out.print("딸기 구매 갯수 : ");
		int sCount = sc.nextInt();
		System.out.print("딸기 한 개당 가격 : ");
		int sPrice = sc.nextInt();
		
		System.out.println("사과 구매 가격은 " + aCount*aPrice + "입니다.");
		System.out.println("딸기 구매 가격은 " + sCount*sPrice + "입니다.");
		System.out.println("전체 구매 가격은 "+ (aCount*aPrice + sCount*sPrice) + "입니다.");
	
		//3.
		System.out.print("시작값>> ");
		int start = sc.nextInt();
		System.out.print("종료값>> ");
		int finish = sc.nextInt();
		
		int result = (finish+start)*((finish-start)/2+1);
		
		System.out.println("시작값~종료값을 모두 더한 값은 "+result);
	
		//4. 
		System.out.print("시작값>> ");
		int s = sc.nextInt();
		System.out.print("종료값>> ");
		int f = sc.nextInt();
		System.out.print("점프값>> ");
		int j = sc.nextInt();
		int sum = 0;
		for (int i = s; i <= f; i=i+j) {
			sum+=i;
			if (sum>100) {
				break;
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
