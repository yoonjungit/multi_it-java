package ����ȯ;

import java.util.LinkedList;

public class �������� {

	public static void main(String[] args) {
		LinkedList test = new LinkedList();
		test.add("����");
		test.add("����");
		test.add("����");
		test.add("��ǻ��");
		
		System.out.println("��ü ���躼 ���� : " + test);
		test.remove();
		System.out.println("1���� ���� �� �� ���� ���� : " + test);
		test.remove();
		System.out.println("2���� ���� �� �� ���� ���� : " + test);
		test.remove();
		System.out.println("3���� ���� �� �� ���� ���� : " + test);
		
	}

}
