package ����;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ��ǰ�����ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ���� �Ἥ ram�� ������ ����� �� �ֵ��� �غ�Ǿ� ����
		//	��ǰ��.���()
		//2. �� �� ���� �����Ǵ� Ʋ�� �̿��ؼ� ���� ������ ����� ram�� �����صΰ� ���
		//	����(Jframe)
		JFrame f = new JFrame();
		f.setSize(300,500);
		
		JLabel l = new JLabel();
		l.setText("���ڸ� �Է��ϼ���");
		
		JTextField text = new JTextField(15);
		JButton b = new JButton();
		FlowLayout flow = new FlowLayout();
		Font font = new Font("�ü�", 1, 20);
		Font font2 = new Font("�ü�", 1, 30);
		
		f.setLayout(flow);
		f.add(l);
		l.setFont(font2);
		l.setForeground(Color.blue);
		
		text.setBackground(Color.cyan);
		text.setBackground(Color.blue);
		text.setFont(font2);
		f.add(text);
		
		b.setText("���� ���߱� ����");
		b.setBackground(Color.yellow);
		b.setFont(font);
		f.add(b);
		
		f.getContentPane().setBackground(Color.green);
		
		
		//�� �Ʒ���!
		f.setVisible(true);
	}

}
