package 조건문;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.print("a 입력>> ");
//		String a = sc.next();
//		System.out.print("b 입력>> ");
//		sc.nextLine();
//		String b = sc.next();
//		System.out.print(a);
//		System.out.print(b);
//		sc.close();
		
		Scanner scan = new Scanner(System.in);
		
    	String str2 = scan.next();
	System.out.println("str2 -> " + str2);
	// 출력결과 공백문자가 포함된 문자열을 입력값으로 
	// 주었음에도 불구하고 모두 저장하여 출력되는 것을 확인할 수 있다.
	scan.close();
	}

}
