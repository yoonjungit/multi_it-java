package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 정답맞추기게임 {
	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(100);

		Scanner sc = new Scanner(System.in);
		int data = 0;
		int count = 0 ;
		
		while (true) {
			System.out.println("숫자를 맞춰보시오");
			data = sc.nextInt();
			count+=1;
			if (data == target) {
				System.out.println("정답입니다.("+count+"번 시도)");
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.print("오답입니다.");
				if (data > target) {
					System.out.println("너무 커요.");
				} else {
					System.out.println("너무 작아요.");
				}
				
				System.out.println("다시 시도해주세요.");
			} 
		}
		sc.close();
	}
}
