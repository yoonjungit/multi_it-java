package ���ǹ�;

import java.util.Scanner;

public class ��������1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� ����");
		System.out.println("---------");
		System.out.print("�̸� �Է�>>>");
		String name = sc.next();
		System.out.print("���� �Է�>>>");
		String age = sc.next();
		System.out.print("��� �Է�>>>");
		String hobby = sc.next();
		System.out.println("---------");
		System.out.println("���� �̸��� "+name);
		System.out.println("���� ���̴� "+age);
		System.out.println("���� ��̴� "+hobby+"�Դϴ�.!");
		sc.close();
	}

}
