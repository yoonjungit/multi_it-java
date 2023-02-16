package 스태틱;

public class 나의일지 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 8, "삼성역");
		Day day2 = new Day("주변산책", 1, "코엑스");
		Day day3 = new Day("시험정리", 2, "삼성역");
		System.out.println(Day.sum);
		System.out.println(day2);
		System.out.println(day3);
	}

}
