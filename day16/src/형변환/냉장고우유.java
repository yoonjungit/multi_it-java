package ����ȯ;

import java.util.LinkedList;

public class �������� {

	public static void main(String[] args) {
//		Queue �����, ���� ���� ���(element)�� ���� ����
		LinkedList milk = new LinkedList();
		milk.add("���� ���� ����");
		milk.add("���� �̽��� ����");
		milk.add("���� ��� ����");
		
		System.out.println(milk);	//[���� ���� ����, ���� �̽��� ����, ���� ��� ����]
		milk.remove();		//�� �� ��� ����
		System.out.println(milk);	//[���� �̽��� ����, ���� ��� ����]

	}

}
