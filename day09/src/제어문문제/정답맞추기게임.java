package �������;

import java.util.Random;
import java.util.Scanner;

public class ������߱���� {
	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(100);

		Scanner sc = new Scanner(System.in);
		int data = 0;
		int count = 0 ;
		
		while (true) {
			System.out.println("���ڸ� ���纸�ÿ�");
			data = sc.nextInt();
			count+=1;
			if (data == target) {
				System.out.println("�����Դϴ�.("+count+"�� �õ�)");
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.print("�����Դϴ�.");
				if (data > target) {
					System.out.println("�ʹ� Ŀ��.");
				} else {
					System.out.println("�ʹ� �۾ƿ�.");
				}
				
				System.out.println("�ٽ� �õ����ּ���.");
			} 
		}
		sc.close();
	}
}
