package ����ȯ;

import java.util.HashMap;

public class ���� {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("���", "apple");
		map.put("�޷�", "melon");
		map.put("��", "water");
		System.out.println(map);
		System.out.println(map.get("���"));	//get(Ű)
		map.remove("��");
		System.out.println(map);
		map.replace("�޷�", "melons");
		System.out.println(map);
	}

}
