package ���ǹ�;

import java.util.Scanner;

public class �ܼ��Է�1 {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);	//��ǻ�� Ű����� �Է¹���
		// �ڹ����α׷��� �ְܼ��� ��θ� �����.
		// ������� == ����(Stream)
		// Stream�� �ݾ����� ������ ��� ��������(�ݵ�� �ݾƾ���)
		System.out.print("���� �Է�: ����1), �ָ�2)");
		int data = sc.nextInt();
		if (data==1) {
			System.out.println("������ �޸���.");
		}else {
			System.out.println("ǫ ����");
		}
		System.out.println("�ָ��� ���ұ�?");
		String data2 = sc.next();
		System.out.println("���� �ָ��� " + data2 + "�� �Ұž�");
		sc.close();
	}

}
