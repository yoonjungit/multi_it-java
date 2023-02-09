package 제어문문제;

import java.util.Random;

public class 로또번호생성시 {
	public static void main(String[] args) {
		Random r = new Random(10);
		for (int i = 0; i < 6; i++) {
			System.out.println("A 로또 번호 : " + r.nextInt(10)); // 0~9
		}
		
		//2~10
		Random a = new Random();
		for (int i = 0; i < 3; i++) {
			System.out.println("B 로또 번호 : " + (a.nextInt(8)+2)); // 0~9
		}
		
		//3~30
		Random n = new Random();
		for (int i = 0; i < 3; i++) {
			System.out.println("C 로또 번호 : " + (n.nextInt(27)+3)); // 0~9
		}
		
		
	}
}
