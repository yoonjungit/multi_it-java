package 조건문;

public class IF문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1 ;
		
		//조건은 비교하는 것으로 쓰고, 결과는 무조건 true/false
		//비교연산자 (==, !=, >, >=) 로 비교할 수 있는 것은 기본형 데이터만 가능!
		
		if (x == 0) { 
			System.out.println("내가 실행되겠지요?");
		}else { //false 일 때 처리하고 싶은 내용을 쓰면 됨
			System.out.println("나는 조건이 맞지 않을 때 실행되는거야");
		}
		
		if (x == 1) {
			System.out.println("내가 실행될까요?");	
		}
		
	}

}
