package �迭����;

import java.util.Scanner;

public class �Է¹迭Ȯ�ι��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] last = new String[3];
		System.out.println("�۳⿡ ����;��� ���� �Է�(�켱������ ���� �Է�) >>");
		for (int i = 0; i < last.length; i++) {
			last[i]=sc.next();
		}
		
		String[] this23 = new String[3];
		System.out.println("���� ������� ���� �Է�(�켱������ ���� �Է�) >>");
		for (int i = 0; i < this23.length; i++) {
			this23[i]=sc.next();
		}
		
		int count = 0;
		for (int i = 0; i < this23.length; i++) {
			if (this23[i].equals(last[i])) {
				count+=1;
			}
		}
		System.out.println("�۳�� ���� �Ȱ��� �켱������ ���� ���� ���� �� "+ count+ "��");
		sc.close();
		}
	}


