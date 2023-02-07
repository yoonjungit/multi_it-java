package Á¶°Ç¹®;

import java.util.Date;

public class IF¹®4 {
	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date.getMinutes());
		System.out.println(date.getHours());
		System.out.println(date.getSeconds());
		System.out.println(1900+date.getYear()); //1900³â Áö±¸ ¸ê¸Á...
		
		System.out.println(date.getDay());
		System.out.println(date.getMonth());
		int hour = date.getHours();
		
		if (hour < 11) {
			System.out.println("±Â¸ð´×");
		}else if (hour < 14) {
			System.out.println("±Â¿¡ÇÁÅÍ´«");
		}else if (hour < 20) {
			System.out.println("±ÂÀÌºê´×");
		}else {
			System.out.println("±Â³ªÀÕ");
		}
		
		int month = date.getMonth();
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("º½");
			break;
		case 6: case 7: case 8:
			System.out.println("¿©¸§");
			break;
		case 9: case 10: case 11:
			System.out.println("°¡À»");
			break;
		default:
			System.out.println("°Ü¿ï");
			break;
		}
		
	}
}