package ����ȯ;

import java.util.ArrayList;

public class ��Ű��ȸ {

	public static void main(String[] args) {
		ArrayList ski = new ArrayList();
		ArrayList ski2 = new ArrayList();
		ski.add("�ڽ�Ű");
		ski.add("�۽�Ű");
		ski.add("�轺Ű");
		ski.add("����Ű");
		System.out.println(ski);

		ski.remove(1);
		System.out.println(ski);
		for (int i = 0; i < ski.size(); i++) {
			System.out.println((i+1) + " ;" + ski.get(i));
		}
		System.out.println(ski.contains("�迬��"));
		System.out.println(ski);

		ski2.add("�̽�Ű");
		ski2.add("�ڽ�Ű");
		ski2.add("�罺Ű");
		ski2.addAll(ski);		//�ı����Լ�

		
		System.out.println(ski2);
		System.out.println(ski2.isEmpty());
		System.out.println(ski2);
	
	}
}
