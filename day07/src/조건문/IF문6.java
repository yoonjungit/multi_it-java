package ���ǹ�;

import java.util.Date;

public class IF��6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date now = new Date();
		int year = now.getYear();
		int day = now.getDay();
		int month = now.getMonth()+1;
		
		//Year
		if (year>=100) {
			System.out.println("�з��Ͼ� ����ñ���");
		} else {
			System.out.println("�з��Ͼ� ���밡 �ƴϽñ���");
		}
		
		//����
		if (day==6 || day==0 ) {
			System.out.println("��~~~~~~~~��");
		} else {
			System.out.println("��~~���� ��������");
		}
		
		//Month
		switch (month) {
		case 2:
			System.out.println("28�ϱ���");

			for (int i = 1; i < 29; i++) {
				System.out.println(i);
			}
			break;
		case 4: case 6: case 9: case 11:
				System.out.println("30�ϱ���");				
		default:
				System.out.println("31�ϱ���");
			break;
		}
	}
}
