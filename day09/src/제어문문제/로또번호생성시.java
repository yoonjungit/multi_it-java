package �������;

import java.util.Random;

public class �ζǹ�ȣ������ {
	public static void main(String[] args) {
		Random r = new Random(10);
		for (int i = 0; i < 6; i++) {
			System.out.println("A �ζ� ��ȣ : " + r.nextInt(10)); // 0~9
		}
		
		//2~10
		Random a = new Random();
		for (int i = 0; i < 3; i++) {
			System.out.println("B �ζ� ��ȣ : " + (a.nextInt(8)+2)); // 0~9
		}
		
		//3~30
		Random n = new Random();
		for (int i = 0; i < 3; i++) {
			System.out.println("C �ζ� ��ȣ : " + (n.nextInt(27)+3)); // 0~9
		}
		
		
	}
}
