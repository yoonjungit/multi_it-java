package 변수;

public class 변수선언 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바는 변수를 만들 때 어떤 타입의 데이터를 넣을지 미리 결정함
		// 선언 : 타입 변수명 = ~~ ==>변수가 생성됨
		int num =100 ; //정수 변수
		double num2 = 22.2; //실수 변수 (정수를 넣을 수 있음)
		char c = '한'; //글자 1글자
		boolean b = true; // false도 가능
		num = 200;
		System.out.println("정수값은"+num);
		System.out.println(num2);
		System.out.println(c);
		System.out.println(b);
	}

}
