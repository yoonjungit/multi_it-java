package 상속;

public class 예외처리1 {

	public static void main(String[] args) {
		System.out.println("1. 나는 프린트 될거야");
		try {
			//에러가 발생할 것 같은 코드 >>
			System.out.println("2. 문제 발생 코드 >"+ 10/0);
		} catch (Exception e) {
			//문제발생 시 프로그램을 멈추지 않고 어떻게 처리할 지 코딩
			System.out.println("에러 발생");
			e.printStackTrace();
		}
		System.out.println("3. 나는 과연?");
	}

}
