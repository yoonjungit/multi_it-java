package �迭����;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ������ư�迭2 {

	public static void main(String[] args) {
		//1. ������ �����
		//2. ������ ���� -> ���� �� Ȯ��
		//3. ��ư�� ���� �迭�� ���� �����
		//4. ��ư�� 500�� ���� �迭�� �־��ּ���.
		//5. �迭�� �ִ� ��ư�� ������ ��ġ ���� �� f�� �ٿ��ּ���
		//��ȭ-1)) ��ư ���� �� ���� �����ؼ� ���Ƿ� ����, ��Ʈ color�迭
		//��ȭ-2)) f�� ������ �־����
		
		//1-2.
		JFrame f = new JFrame();
		f.setSize(1200, 800);
		
		//3.
		JButton[] buttons = new JButton[500];
		f.setLayout(null); 
		
		//4.
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("��ư"+i);
		}
		
		//5.
		Random r = new Random();
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].setBounds(r.nextInt(1100), r.nextInt(750), 100, 50);
		}
		
		//��ȭ1
		Color[] color = {Color.blue, Color.CYAN, Color.green, Color.yellow, Color.white, Color.pink, Color.orange};
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].setBackground(color[r.nextInt(6)]);
			f.add(buttons[i]);
		}
		
		//��ȭ2
		f.getContentPane().setBackground(Color.ORANGE);
		
		f.setVisible(true);
	}

}
