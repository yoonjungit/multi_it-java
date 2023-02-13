package 배열심화;

public class 배열깊은복사 {

	public static void main(String[] args) {
		int[] num3 = {100, 200, 300};
		int[] num4 = num3;
		int[] num5 = num3.clone();
		
		int num1 = 100;
		int num2 = num1;
		System.out.println(num1);
		System.out.println(num2);
		num1 = 222;
		System.out.println(num2);
		
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		num3[0] = 999;
		
		for (int i : num3) {
			System.out.print(i+ " ");
		}
		System.out.println("\nnum4>>");
		for (int i : num4) {
			System.out.print(i+" ");
		}
		System.out.println("\nnum5>>");
		for (int i : num5) {
			System.out.print(i+ " ");
		}
	}

}
