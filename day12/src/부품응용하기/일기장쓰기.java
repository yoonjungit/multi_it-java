package ��ǰ�����ϱ�;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class �ϱ��徲�� {
	//������� - �Ƚᵵ ��.
	//��� �޼��� 

	public void open() {
		// jframeȭ���� ���̰� ����.!!����� �����ϵ�����.
		// System.out.println("ȭ���� open�ɰſ���..");
		JFrame f = new JFrame();
		f.setTitle("�� �ϱ��� �ۼ�ȭ��");
		f.setSize(500, 800);
		f.getContentPane().setBackground(Color.yellow);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("�ü�", 1, 30);
		
		JLabel day = new JLabel("������ ��¥: ");
		JLabel title = new JLabel("������ ����: ");
		JLabel content = new JLabel("������ ����: ");
		day.setFont(font);
		title.setFont(font);
		content.setFont(font);
		
		JTextField dayText = new JTextField(10);
		JTextField titleText = new JTextField(10);
		dayText.setHorizontalAlignment(JTextField.CENTER);
		titleText.setHorizontalAlignment(JTextField.CENTER);
		dayText.setFont(font);
		titleText.setFont(font);
		
		JTextArea contentText = new JTextArea(10, 10);
		contentText.setFont(font);
		
		JButton btn = new JButton("���Ͽ� �ϱ� ����");
		btn.setFont(font);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String day2 = dayText.getText();
				String title2 = titleText.getText();
				String content2 = contentText.getText();
				System.out.println(day2 + " " + title2 + " " + content2);
				
				//�����͸� ���Ϸ� ������ְ� �ڹ� ���α׷��� file���� ������θ� ����
				
				//�ܺο� �ִ� ����, ��Ʈ��ũ�� cpu ���� �ڹٿ��� ������ ����
				//���� ������ ��Ȳ�̶�� �ν���.
				//���� ������ ��Ȳ������ ������ �߻��ϸ� ��� ó������ ����� ��.
				
				try {
					FileWriter file = new FileWriter(day2 + ".txt");
					file.write(day2 + "\n");
					file.write(title2 + "\n");
					file.write(content2 + "\n");
					file.close();
				} catch (IOException e1) {
					System.out.println("���Ϸ� �����ϴ� �� ���� �߻�");
				}
			}
		});
		
		
		f.add(day);f.add(dayText);
		f.add(title);f.add(titleText);
		f.add(content);f.add(contentText);
		f.add(btn);
		
		f.setVisible(true);
		
		
	}
}
