package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) {
		int[] jumsu2 = new int[1000];
		Random r = new Random(42);
	
		int count = 0;
		int sum = 0;
		
		for (int i = 0; i < jumsu2.length; i++) {
			jumsu2[i] = r.nextInt(19)+2;
			
			if (jumsu2[i]>=15) {
				count++;
				sum += jumsu2[i];
			}
		}
		
		for (int i : jumsu2) {
			System.out.println(i);
		}
		System.out.println("15 이상인 원소 개수 : " +count);
		System.out.println("15 이상인 원소 총합 : " +sum);
	}

}
