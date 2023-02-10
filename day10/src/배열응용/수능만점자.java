package 배열응용;

import java.util.Random;

public class 수능만점자 {

	public static void main(String[] args) {
		int[] sat = new int[10000];
		Random r = new Random(42);
		int count_450 = 0 ;
		int count_0 = 0;
		int sum = 0 ;
		
		System.out.print("만점자 : ");
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
		
		System.out.println("만점자 수 : " +count_450);
		System.out.println("0점자 수 : " +count_0);
		System.out.println("평균 : " + avg);
		
		
		int count = 0;
		for (int i = 0; i < sat.length; i++) {
			if ((avg-50)<=sat[i] && sat[i]<=(avg+50)) {
				count++;
			}
		}
		System.out.println("평균보다 +-인 학생 수 : "+count);
	}

}
