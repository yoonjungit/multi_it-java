package ���ǹ�;

import java.util.Date;

public class IF��4 {
	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date.getMinutes());
		System.out.println(date.getHours());
		System.out.println(date.getSeconds());
		System.out.println(1900+date.getYear()); //1900�� ���� ���...
		
		System.out.println(date.getDay());
		System.out.println(date.getMonth());
		int hour = date.getHours();
		
		if (hour < 11) {
			System.out.println("�¸��");
		}else if (hour < 14) {
			System.out.println("�¿����ʹ�");
		}else if (hour < 20) {
			System.out.println("���̺��");
		}else {
			System.out.println("�³���");
		}
		
		int month = date.getMonth();
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("��");
			break;
		case 6: case 7: case 8:
			System.out.println("����");
			break;
		case 9: case 10: case 11:
			System.out.println("����");
			break;
		default:
			System.out.println("�ܿ�");
			break;
		}
		
	}
}