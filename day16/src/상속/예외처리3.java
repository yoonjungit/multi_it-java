package 상속;

public class 예외처리3 {

	public static void main(String[] args) {
		int[] num = new int[3];
		
		try {
			num[3] = 2;
		} catch (Exception e) {
			System.out.println("비상! 오류 발생");
			e.printStackTrace();
		}
		System.out.println(num.length);
	}
}
