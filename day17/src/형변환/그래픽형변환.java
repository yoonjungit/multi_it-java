package ����ȯ;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class �׷�������ȯ {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 500);

		f.setLayout(new FlowLayout());
		
		f.add(new JButton("���� ��ư"));	//Component <- JButton (�ڵ�����ȯ) 
		f.add(new JLabel("��"));		//Component <- JButton (�ڵ�����ȯ) 
		f.add(new JTextField(10));		//Component <- JButton (�ڵ�����ȯ) 

		f.setVisible(true);
	}

}
