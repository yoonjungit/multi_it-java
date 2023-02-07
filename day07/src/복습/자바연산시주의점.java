package 복습;

public class 자바연산시주의점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수형 4가지
		//byte : -128~127, 1바이트
		//short : -3만~3만, 2바이트
		//int : -21억~21억, 4바이트
		//long : 1억 이상, 8바이트
		
		//실수형 변수 2가지
		//float : 소수점 4자리까지 4바이트
		//double : 소수점 4자리 이상 8바이트
		//문자 1가지
		//논리 1가지
		
		byte age = 127;
		short days = 1000;
		int money = 100000;
		long bank = 2300000000L; //처음에 jdk에서 long을 int로 취급하기 때문에, 숫자 뒤에 L(l)을 써줘야 long으로 인식
		double weight = 43.3333333;
		float height = 170.4F;  //F(f) 끝에 써야함
		
		
	}

}
