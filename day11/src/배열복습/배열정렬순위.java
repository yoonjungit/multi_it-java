package �迭����;

import java.util.Arrays;
import java.util.Random;

public class �迭���ļ��� {

	public static void main(String[] args) {
		//Random, ����, Arrays
		//1. Random, �迭 �����
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
		Arrays.sort(jumsu);		// �ı��� �Լ�(������ �ٲ�) �ı����Լ��� ���ı��� �Լ����� ����
		// Integer.ParseInt()  --> ���ı����Լ�(���� �ȹٲ�)
		for (int i : jumsu) {
			System.out.println(i);
		}
		System.out.println("�ּڰ� : "+jumsu[0]);
		System.out.println("�ִ� : "+jumsu[jumsu.length-1]);
		
		int sum30 = 0 ;
		for (int i = 7000; i < jumsu.length; i++) {
			sum30 += jumsu[i] ;
		}
		System.out.println("���� 30 : "+ sum30/3000.0);
		
		int sum3 = 0 ;
		for (int i = 0; i < 3000; i++) {
			sum3 += jumsu[i] ;
		}
		System.out.println("���� 30 : "+ sum3/3000.0);
	}

}
