package �迭����;

import java.util.Scanner;

public class ��Ʈ�����迭3 {

	public static void main(String[] args) {
		String s = "   010-245-1234   ";
		String s2= s.trim(); //��������
		System.out.println(s2.length());//12
		
		//-�� �������� ���ڿ��� 3���� �и�
		String[] s3 = s2.split("-"); //{"010", "245", "1234"}
		System.out.println(s3[0]); //3
		System.out.println(s3[1]); //4
		System.out.println(s3[2]);
		
		//�迭�� ù��° ���ڿ��� ����
		if (s3[0].equals("011")) {
			System.out.println("SK");
		}else if (s3[0].equals("019")) {
			System.out.println("LG");
		}else {
			System.out.println("APPLE");
		}
		
		//�迭�� �ι�° ���ڿ��� ���� ����
		if(s3[1].length() >= 4) {
			System.out.println("�ֽ���");
		}else {
			System.out.println("�õ���");
		}
		
		int total = s3[0].length() + s3[1].length() + s3[2].length();
		
		System.out.println(total);
		if (total >= 10) {
			System.out.println("��ȿ�� ��ȭ��ȣ");
		} else {
			System.out.println("��ȿ���� ��ȭ��ȣ");
		}
		
		int total2 = 0;
		for (int i = 0; i < s3.length; i++) {
			total2 = total2 + s3[i].length();
		}
		System.out.println(total2);
	}

}
