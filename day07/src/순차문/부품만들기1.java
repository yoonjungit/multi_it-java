package ������;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ��ǰ�����1 {

	public static void main(String[] args) {
		//���� ������� �ʴ� ��ǰ�� ������.
		//Ʋ!
		//new : Ʋ�� ������ �� �� ���
		//new JFrame()�� JFrame�̶�� Ʋ�� �̿��ؼ� ��ǰ�� ����!
		//���� ��ǰ�� ��δ� ram�� ����Ǿ�� ��
		//f���� ���� ��ǰ�� �־��ּ���.
		//f���� JFrame�� ����Ǿ�� ��.
		JFrame f = new JFrame();
		f.setSize(300, 300);
		
		JButton b1 = new JButton();
		b1.setText("���� ��ư1");
		
		f.add(b1);
		
		f.setVisible(true); //������ ! -> �ǳ��ٿ� �Է�
	}

}
