package �迭����;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ������ư�迭1 {

	public static void main(String[] args) {
		//�迭���� �⺻���� ���� ���� �ƴϰ�, �������� ����
		//1.������
		JFrame f = new JFrame();
		f.setSize(1200, 800);
		
		//2.��ư
		Random r = new Random(42);
		JButton[] buttons = new JButton[400];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("��ư "+ i);
		}
		//2-1. ��ư ��ġ ����
		f.setLayout(null);   // --> ��ġ �ڵ����� �������ִ� ��ǰ �Ⱦ�
			for (int i = 0; i < buttons.length; i++) {
				//ù��° ��ư�� ��ġ(500, 500)��, ũ��� 100x50
				//��ġ�� ����
				buttons[i].setBounds(r.nextInt(1000), r.nextInt(700), 100, 50);
				//		buttons[1].setBounds(600, 600, 100, 50);
				//f.�� �÷�����
				f.add(buttons[i]);
			}
		//		f.add(buttons[1]);
		f.setVisible(true);
	}

}
