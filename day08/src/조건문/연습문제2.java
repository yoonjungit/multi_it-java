package ���ǹ�;

import java.util.Scanner;

public class ��������2 {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("���� �̸���? ");
//		String name = sc.next();
//		
//		System.out.print("���� ���̴�? ");
//		int age = sc.nextInt();
//
//		System.out.print("���� Ű��? ");
//		int height = sc.nextInt();
//		
//		System.out.print("���� �����Դ�? ");
//		int weight = sc.nextInt();
//		
//		System.out.print("������ �Ծ�����? ");
//		boolean dinner = sc.nextBoolean();
//		
//		System.out.println("������ ��ǥ��>> ");
//		sc.nextLine();
//		String goal = sc.nextLine();
//		
//		System.out.println("===================");
//		
//		
//		System.out.println("�� �̸��� "+name+"�Դϴ�.");
//		System.out.println("���� ���̴� "+(age+1)+"��");
//		System.out.println("����� Ű�� "+ (height+10));
//		if (dinner==true) {
//			System.out.println("�谡 �θ��ðڱ���");
//		}else {
//			System.out.println("�谡 �����ðڱ���");
//		}
//		System.out.println("������ ��ǥ��" +goal);
//		System.out.println("������ ��ǥ��" +weight);
//		sc.close();
//	}
//}


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("�̸� �Է�>> ");
	String name = sc.next(); //�Ѵܾ� ȫ�浿
	System.out.print("���� �Է�>> ");
	int age = sc.nextInt();
	System.out.print("Ű �Է�>> ");
	double height = sc.nextDouble(); //"88.8" --> 88.8
	System.out.print("������ �Ծ�����(true/false)>> ");
	boolean food = sc.nextBoolean(); //"true" --> true
	System.out.print("������ ��ǥ�� ");
	sc.nextLine();
	String life = sc.nextLine();
	
	System.out.println("=======================");
	System.out.println("�� �̸��� " + name);
	System.out.println("���� ���̴� " + (age + 1));
	System.out.println("���� Ű�� " + (height + 10));
	if (food) {
		System.out.println("�谡 �θ��ðڱ���");
	} else {
		System.out.println("�谡 �����ðڱ���");
	}
	System.out.println("������ ��ǥ�� " + life);
	sc.close();
}
}
