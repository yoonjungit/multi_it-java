package 조건문;

import java.util.Date;

public class IF문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date now = new Date();
		int year = now.getYear();
		int day = now.getDay();
		int month = now.getMonth()+1;
		
		//Year
		if (year>=100) {
			System.out.println("밀레니엄 세대시군요");
		} else {
			System.out.println("밀레니엄 세대가 아니시군요");
		}
		
		//요일
		if (day==6 || day==0 ) {
			System.out.println("쉬~~~~~~~~자");
		} else {
			System.out.println("열~~심히 공부하자");
		}
		
		//Month
		switch (month) {
		case 2:
			System.out.println("28일까지");

			for (int i = 1; i < 29; i++) {
				System.out.println(i);
			}
			break;
		case 4: case 6: case 9: case 11:
				System.out.println("30일까지");				
		default:
				System.out.println("31일까지");
			break;
		}
	}
}
