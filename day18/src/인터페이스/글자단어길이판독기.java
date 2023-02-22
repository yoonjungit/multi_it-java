package 인터페이스;

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

public class 글자단어길이판독기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 500);
		
		f.setLayout(new FlowLayout());
		
		Font font = new Font("궁서", 1, 20);
		
		JLabel words = new JLabel("문장을 입력하세요");
		JTextArea textArea = new JTextArea(7, 10);
		JButton b1 = new JButton("글자수 카운트");
		JButton b2 = new JButton("배경색 바꾸기");
		JButton b3 = new JButton("글자색 바꾸기");
		
		words.setFont(font);
		textArea.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = textArea.getText();
				JOptionPane.showMessageDialog(f, "글자수는 " + text.length());
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
