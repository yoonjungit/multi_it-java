package ����;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ���Ǳ׷��� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(200,200);
		JButton b = new JButton("���� ����");
		
		//new �������� Ŭ������ �;� �ϴµ� ActionListener(�͸�Ŭ����)�� Ŭ����->��ü ����
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//�������̽��� �ݵ�� actionPerformed()�� ����� ��Ģ�� ������
				System.out.println("��ư Ŭ�� ��");
			}
		});

		f.add(b, BorderLayout.NORTH);
		
		f.setVisible(true);
	}

}
