package �迭����;

import java.util.Random;

public class �迭�� {

	public static void main(String[] args) {
		// �迭, Random
		int[] ����� = new int[990];
		int[] ����� = new int[990];
		
//		System.out.println(�����.length);
//		System.out.println(�����.length);
//		System.out.println(�����);
//		System.out.println(�����);
		
		Random r = new Random(42);
		for (int i = 0; i < �����.length; i++) {
			�����[i] = r.nextInt(4)+1 ; 
			�����[i] = r.nextInt(4)+1 ; 
					
		}
		
		System.out.println("��ȣ:\t���\t\t����");
		
		for (int i = 0; i < �����.length; i++) {
			System.out.println(i+":\t " + �����[i] + "\t<->\t " + �����[i]);
		}
		int score = 0;
		for (int i = 0; i < �����.length; i++) {
			if (�����[i]==�����[i]) {
				score++;
			}
		}
		System.out.println("�� ������ "+score);
	}

}
