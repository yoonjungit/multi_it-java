package 메서드연습;

public class 내가게3 {

	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int count1 = 5; //오전에 온 손님 수
		int count2 = 4; //오후에 온 손님 수
		System.out.println(Math.abs(-123));
		System.out.println("오늘 온 손님의 총 합은 " + cal3.add(count1, count2) + "명 입니다.");
		System.out.println("손님 수 차이는 " + cal3.minus(count1, count2) + "명 입니다.");
		System.out.println("오전 결제금액은 " + cal3.mul(count1, price) + "원 입니다.");
		System.out.println("오후 결제금액은 " + cal3.mul(count2, price) + "원 입니다.");
		System.out.println("오늘 하루 총 결제 금액은 " + cal3.mul(cal3.add(count1, count2), price) + "원 입니다.");
		System.out.println("1인당 결제 금액은 " + cal3.div(cal3.mul(count1+count2, price), count1+count2) + "원 입니다.");
	}

}
