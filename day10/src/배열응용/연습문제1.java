package 배열응용;

import java.util.Scanner;

public class 연습문제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1.
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(arr[0]+arr[2]);
		
		//2.
		String[] arr2 = new String[3];
		for (int j = 0; j < arr2.length; j++) {
			arr2[j] = sc.next();
		}
		System.out.print(arr2[0]);
		System.out.print(" 보다는 ");
		System.out.print(arr2[1]);
		
		sc.close();
	}
	

}
