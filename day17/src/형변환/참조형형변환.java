package ����ȯ;

import java.util.ArrayList;

import javax.swing.JButton;

public class ����������ȯ {

	public static void main(String[] args) {
		//Ŭ���� ����ȯ == ������ ����ȯ
		//��Ӱ����� ���� ����ȯ ����
		
		ArrayList list = new ArrayList();
		list.add("ȫ�浿");	// Object �� String
		list.add(100);		// Object �� Integer
		list.add(11.22);	// Object �� Double
		list.add(new JButton("���� ��ư"));		// Object �� Jbutton
		
		//���� ����ȯ(�ٿ�ĳ����)
		String name = (String)list.get(0);
		//String�� ������ �޼���(���)�� ������ �ݵ�� String���� ��������ȯ
		System.out.println(name.charAt(0));
		
		int age = (Integer)list.get(1);
		System.out.println(age+1);
		
		double jumsu = (Double)list.get(2);
		System.out.println(jumsu+10);
		
		JButton b = (JButton)list.get(3);
		b.setText("���� ��¥ ��ư");
	}

}
