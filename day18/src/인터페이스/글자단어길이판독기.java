package �������̽�;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ���ڴܾ�����ǵ��� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 500);
		
		f.setLayout(new FlowLayout());
		
		Font font = new Font("�ü�", 1, 20);
		
		JLabel words = new JLabel("������ �Է��ϼ���");
		JTextArea textArea = new JTextArea(7, 10);
		JButton b1 = new JButton("���ڼ� ī��Ʈ");
		JButton b2 = new JButton("���� �ٲٱ�");
		JButton b3 = new JButton("���ڻ� �ٲٱ�");
		
		words.setFont(font);
		textArea.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = textArea.getText();
				JOptionPane.showMessageDialog(f, "���ڼ��� " + text.length());
			}
		});
		
		b2.addActionListener(new ActionListener() {
			Color[] color = {Color.orange, Color.magenta, Color.cyan, Color.green, Color.yellow, Color.pink} ;
			Random r = new Random();
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = r.nextInt(6);
				textArea.setBackground(color[i]);
			}
		});
		
		b3.addActionListener(new ActionListener() {
			Color[] color = {Color.black, Color.gray, Color.white, Color.green, Color.yellow, Color.pink} ;
			Random r = new Random();
			@Override
			public void actionPerformed(ActionEvent e) {
				int i = r.nextInt(6);
				textArea.setForeground(color[i]);
			}
		});
		f.add(words);
		f.add(textArea);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.setVisible(true);
	}

}
