package 배열복습;

import java.util.Arrays;
import java.util.Random;

public class 배열정렬순위 {

	public static void main(String[] args) {
		//Random, 정렬, Arrays
		//1. Random, 배열 만들기
		Random r = new Random(42);
		int[] jumsu = new int[10000];
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000)+1;
		}
		for (int x : jumsu) {
			System.out.println(x);
		}
		System.out.println("-------------------------");
		
		//2. sort, Arrays
		Arrays.sort(jumsu);		// 파괴형 함수(원본이 바뀜) 파괴형함수가 비파괴형 함수보다 더多
		// Integer.ParseInt()  --> 비파괴형함수(원본 안바뀜)
		for (int i : jumsu) {
			System.out.println(i);
		}
		System.out.println("최솟값 : "+jumsu[0]);
		System.out.println("최댓값 : "+jumsu[jumsu.length-1]);
		
		int sum30 = 0 ;
		for (int i = 7000; i < jumsu.length; i++) {
			sum30 += jumsu[i] ;
		}
		System.out.println("상위 30 : "+ sum30/3000.0);
		
		int sum3 = 0 ;
		for (int i = 0; i < 3000; i++) {
			sum3 += jumsu[i] ;
		}
		System.out.println("하위 30 : "+ sum3/3000.0);
	}

}
