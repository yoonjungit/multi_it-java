package ����ȯ;

import java.util.ArrayList;

public class �÷����׽�Ʈ {

	public static void main(String[] args) {
		//���� ���� �����͸� �ٷ�� ��ǰ���� �ݷ���
		//==> ������ ����.
		//==> ���� ���� �����͵鵵 Ư¡�� �ְ�, �� Ư¡�� ���� 
		// 	     �ݷ����� ������ ����
		//==> �迭 + ������ ���� + Ÿ�� �ƹ��ų� ���� �� �ִ� ArrayList
		ArrayList list = new ArrayList() ; 
		list.add("ȫ�浿");
		list.add(100);
		list.add(11.2);
		list.add(true);
		//toString() ������ �Ǿ��ֱ� ������ ����Ű�� ������ ����Ʈ
		System.out.println(list);		//[ȫ�浿, 100, 11.2, true]
		System.out.println(list.get(0));//ȫ�浿
		System.out.println(list.get(1));//100
		System.out.println(list.get(2));//11.2
		System.out.println(list.get(3));//true
		
		list.add(0, "��浿");
		System.out.println(list);		//[��浿, ȫ�浿, 100, 11.2, true]
		
		list.remove(0);					//remove : �ı��Լ�
		System.out.println(list);		//[ȫ�浿, 100, 11.2, true]
		
		list.set(0,  "���浿");			//set : �ı��Լ�
		System.out.println(list);		//[���浿, 100, 11.2, true]
		
		int index = list.indexOf(true);	//list�� true ��ġ
		System.out.println(index);
		
		boolean result = list.contains(list);	//���Կ��� Ȯ��
		System.out.println(result);
	}

}
