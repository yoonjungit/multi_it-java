package ����;

import java.util.ArrayList;

import javax.swing.JButton;

public class �ƹ��ų� {

	public static void main(String[] args) {
		//�ε���, ����, �������� -> ArrayList
		ArrayList list = new ArrayList();
		list.add("ȫ�浿");		//Object <- String
		list.add(100);		//Object <- Integer(����Ŭ����) <- ����ڽ� int(�⺻��)
		list.add(11.22);	//Object <- Double(����Ŭ����) <- ����ڽ� double(�⺻��)
		list.add(new JButton());	// Object <- JButton
		
		String name = (String)list.get(0);
		//String <- Object, ��������ȯ
		int age = (Integer)list.get(1);
		//int <- Integer <- Object, �����ڽ�, ��������ȯ
		
	}

}
