package 형변환;

public class 기본형형변환 {

	public static void main(String[] args) {
		byte b1 = 10;	//1바이트, -128~127
		int i1 = 120;	//4바이트, -21억~21억
		
		//byte ⊂ int : 실제 들어있는 값과는 관계없이, 변수타입의 포함관계로 형변환이 이루어짐
		i1 = b1;		//큰 <- 작, 자동으로 형변환 (자동형변환)
		b1 = (byte)i1;	//작 <- 큰, 강제로 형변환 (강제형변환)
		
		//double(큰) <- int(작) : 정수⊂실수
		double d1 = i1;	//자동형변환
		 i1 = (int)d1;	//강제형변환
	}

}
