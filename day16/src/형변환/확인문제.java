package ����ȯ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Ȯ�ι��� {

	public static void main(String[] args) {
		//1.
		HashSet travel = new HashSet();
		travel.add("������");
		travel.add("�̱�");
		travel.add("ĳ����");
		travel.add("�߽���");
		travel.add("����");
		travel.add("������");
		//1-1. ��ü ��� (�ߺ��Ǵ� ������ �������� ���ŵ� �� ���)
		System.out.println(travel);		//[������, ĳ����, �̱�, ����, �߽���]
		
		//2.
		HashMap room = new HashMap();
		room.put("�ȹ�", "TV");
		room.put("�Ž�", "����");
		room.put("�ξ�", "�����");
		room.put("����", "�Ź�");
		//2-1. ��ü ���
		System.out.println(room);		//{�Ž�=����, ����=�Ź�, �ȹ�=TV, �ξ�=�����}
		//2-2. ����(key)�� value?
		System.out.println(room.get("����"));		//�Ź�
		//2-3. �Ž�(key)�� value�� å������ ���� �� ��ü ���
		room.replace("�Ž�", "å��");
		System.out.println(room);		//{�Ž�=å��, ����=�Ź�, �ȹ�=TV, �ξ�=�����}
		
		//3.
		ArrayList todo = new ArrayList();
		todo.add("����");
		todo.add("������");
		todo.add("ȭ��� û��");
		todo.add("û�ұ�");
		todo.add("âƲ �۱�");
		//3-1. ��ü ���
		System.out.println(todo);		//[����, ������, ȭ��� û��, û�ұ�, âƲ �۱�]
		//3-2. ù��°�� ������ ���ϸ� ���
		System.out.println("ù��° ���� : "+todo.get(0)+" \n���������� ���� : "+todo.get(todo.size()-1));
		//ù��° ���� : ���� 
		//���������� ���� : âƲ �۱�
		//3-3. �ι�° ���Ҹ� û�ҷ� ���� �� ��ü ���
		todo.set(1, "û��");
		System.out.println(todo);		//[����, û��, ȭ��� û��, û�ұ�, âƲ �۱�]
	}

}
