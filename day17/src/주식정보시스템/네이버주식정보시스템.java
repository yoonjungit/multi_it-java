package �ֽ������ý���;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.jsoup.nodes.Document;

public class ���̹��ֽ������ý��� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 420);
		f.getContentPane().setBackground(Color.green);
		f.setLayout(new FlowLayout());
		Font font = new Font("�ü�",Font.BOLD, 40);
		JButton b1 = new JButton("�Ｚ����");
		JButton b2 = new JButton("ī ī ��");
		JButton b3 = new JButton("�� �� ��");
		JButton b4 = new JButton("ũ�Ѹ�����");
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		b1.setBackground(Color.pink);
		b2.setBackground(Color.orange);
		b3.setBackground(Color.yellow);
		b4.setBackground(Color.red);
		b4.setForeground(Color.white);
		
		//�׼Ǳ��
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				���̹�����ũ�Ѹ�2 inCode = new ���̹�����ũ�Ѹ�2();		//Ŭ���� ����
				inCode.naver("005930");							//Ŭ���� �� �޼ҵ�
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				���̹�����ũ�Ѹ�2 inCode = new ���̹�����ũ�Ѹ�2();
				inCode.naver("035720");
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				���̹�����ũ�Ѹ�2 inCode = new ���̹�����ũ�Ѹ�2();
				inCode.naver("035420");
			}
		});
		
		JLabel label = new JLabel("CODE");
		label.setFont(font);
		
		JTextField text = new JTextField(7);
		text.setFont(font);

		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				���̹�����ũ�Ѹ�2 inCode = new ���̹�����ũ�Ѹ�2();
				String inputText = text.getText();
				inCode.naver(inputText);
			}
		});
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(label);
		f.add(text);
		f.add(b4);
		
		f.setVisible(true);
	}
}
