package �ݺ���;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ��ȭ�����¼������ {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 500);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		for (int i = 0; i < 1005; i++) {
			JButton b = new JButton("���� ��ư");
			f.add(b);
		}
		f.setVisible(true);
	}
}