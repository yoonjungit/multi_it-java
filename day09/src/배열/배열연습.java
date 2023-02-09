package 배열;

public class 배열연습 {

	public static void main(String[] args) {
		//1
		int[] week = {1,2,3,4,5,6,7};
		
		//2
		System.out.println(week[0]);
		System.out.println(week[1]);
		
		//3
		System.out.println(week.length);
		
		//4
		week[2]=10;
		week[5]=12;
		
		//5
		System.out.println(week[2]);
		System.out.println(week[4]);
		
		//6
		int[] tour = new int[4];
		
		//7
		tour[0]=20;
		tour[2]=30;
		System.out.println(tour[0]);
		System.out.println(tour[2]);
		
		//8
		System.out.println(tour.length);
	}

}
