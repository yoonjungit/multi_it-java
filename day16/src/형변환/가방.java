package ����ȯ;

import java.util.HashSet;

public class ���� {

	public static void main(String[] args) {
		HashSet bag = new HashSet();
		bag.add("�޴���");
		bag.add("����");
		bag.add("����");
		System.out.println(bag);
		bag.add("����");		//�ߺ�����
		System.out.println(bag);
	}

}
