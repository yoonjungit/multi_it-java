package ���ǹ�;

import java.util.Scanner;

public class ��������3 {

	public static void main(String[] args) {
		//1.
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		
		if (id.equals("root")&&pw.equals("1234")) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����");
		}
		
		//2.
		System.out.print("��� ���� ���� : ");
		int aCount = sc.nextInt();
		System.out.print("��� �� ���� ���� : ");
		int aPrice = sc.nextInt();
		
		System.out.print("���� ���� ���� : ");
		int sCount = sc.nextInt();
		System.out.print("���� �� ���� ���� : ");
		int sPrice = sc.nextInt();
		
		System.out.println("��� ���� ������ " + aCount*aPrice + "�Դϴ�.");
		System.out.println("���� ���� ������ " + sCount*sPrice + "�Դϴ�.");
		System.out.println("��ü ���� ������ "+ (aCount*aPrice + sCount*sPrice) + "�Դϴ�.");
	
		//3.
		System.out.print("���۰�>> ");
		int start = sc.nextInt();
		System.out.print("���ᰪ>> ");
		int finish = sc.nextInt();
		
		int result = (finish+start)*((finish-start)/2+1);
		
		System.out.println("���۰�~���ᰪ�� ��� ���� ���� "+result);
	
		//4. 
		System.out.print("���۰�>> ");
		int s = sc.nextInt();
		System.out.print("���ᰪ>> ");
		int f = sc.nextInt();
		System.out.print("������>> ");
		int j = sc.nextInt();
		int sum = 0;
		for (int i = s; i <= f; i=i+j) {
			sum+=i;
			if (sum>100) {
				break;
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
