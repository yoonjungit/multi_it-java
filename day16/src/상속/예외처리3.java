package ���;

public class ����ó��3 {

	public static void main(String[] args) {
		int[] num = new int[3];
		
		try {
			num[3] = 2;
		} catch (Exception e) {
			System.out.println("���! ���� �߻�");
			e.printStackTrace();
		}
		System.out.println(num.length);
	}
}
