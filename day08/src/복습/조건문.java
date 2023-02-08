package 복습;

public class 조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 77;
		int me = 88;
		//조건은 비교하는 코드가 들어감. 결과가 무조건 논리형(true/false)
		if (target == me) { //true
			System.out.println("정답입니다!");
		} else {
			System.out.println("오답입니다!");
		}
		
		//if-else는 자체 break 기능이 있지만
		//switch는 없어서 break를 꼭 써줘야 한다.
		
		String you = "신나";
		switch (you) {
		case "로또":
			System.out.println("정답이다");
			break;
		default:
			System.out.println("실패");
			break;
		}
	}

}
