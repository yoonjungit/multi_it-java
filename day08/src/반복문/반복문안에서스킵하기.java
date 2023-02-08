package 반복문;

public class 반복문안에서스킵하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1번-10번까지 데이터 중에서 짝수만 프린트!
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				continue;		//홀수 건너뛰기
			}
			if (i == 8) {
//				break;		//for문 종료
				System.exit(0);
			}
			System.out.println(i);
		}
		System.out.println("ddd");
	}

}
