package ����ȯ;

import java.util.ArrayList;

public class Ȯ�ι��� {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000);	//Object <-��ĳ����- Integer <-����ڽ�- int
		me.add(189.1);
		me.add(false);
		me.add("��");
		
		//ArrayList�� toString()�� ������
		//list��� �������̱� ������ list�� ����Ʈ�ϸ� �ּҰ� ����Ʈ
		//toString()�� �������� ������ �ּҰ� ����Ű�� ������ String���� ������ֵ��� ����
		//list�� ���� �ּҴ�� String���� ���� ������ ���
		
		//1.
		System.out.println("��ü ��� ����Ʈ : " + me);
		//2.
		int money = (Integer)me.get(0); //int <-�����ڽ�- Integer <-�ٿ�ĳ����- Object
		System.out.println(2000+money);
		//3.
		double height = (Double)me.get(1);
		//double height = (double)me.get(1);	//()�ȿ� double�� ����, Integer�� int ����
		System.out.println(height+10);
		//4.
		boolean morning = (Boolean)me.get(2);
		if (morning==false) {	//morning�� ���� morning==true?�� �ٵ� ���⼭�� false ������� ==false��
			System.out.println("��ħ�� �Ծ ��ҷ���");
		}else {
			System.out.println("���� ��ħ�� �ȸԾ ����Ŀ�");
		}
		//5.
		String gender = (String)me.get(3);
		if (gender.equals("��")) {
			System.out.println("�ֹι�ȣ�� 1,3�̿���");
		}else {
			System.out.println("�ֹι�ȣ�� 2,4����");
		}
		//6.
		System.out.println("2-3���� ����ȯ�� �ٿ�ĳ����");
		System.out.println("��������ȯ, Object -> Integer(����Ŭ����) -> (�����ڽ�)int");
		System.out.println("��������ȯ, Object -> Double(����Ŭ����) -> (�����ڽ�)double");
	}

}
