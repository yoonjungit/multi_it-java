package �迭����;

import java.util.Random;

public class ���ɸ����� {

	public static void main(String[] args) {
		int[] sat = new int[10000];
		Random r = new Random(42);
		int count_450 = 0 ;
		int count_0 = 0;
		int sum = 0 ;
		
		System.out.print("������ : ");
		for (int i = 0; i < sat.length; i++) {
			sat[i] = r.nextInt(451);
			sum+=sat[i];
			if (sat[i]==450) {
				count_450++;
				System.out.print(i+" ");
			}
			if (sat[i]==0) {
				count_0++ ;
			}
		}
		
		System.out.println(" ");
		
		double avg = (double)sum/sat.length;
		
		System.out.println("������ �� : " +count_450);
		System.out.println("0���� �� : " +count_0);
		System.out.println("��� : " + avg);
		
		
		int count = 0;
		for (int i = 0; i < sat.length; i++) {
			if ((avg-50)<=sat[i] && sat[i]<=(avg+50)) {
				count++;
			}
		}
		System.out.println("��պ��� +-�� �л� �� : "+count);
	}

}
