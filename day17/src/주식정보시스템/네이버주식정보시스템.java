package 주식정보시스템;

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

public class 네이버주식정보시스템 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 420);
		f.getContentPane().setBackground(Color.green);
		f.setLayout(new FlowLayout());
		Font font = new Font("궁서",Font.BOLD, 40);
		JButton b1 = new JButton("삼성전자");
		JButton b2 = new JButton("카 카 오");
		JButton b3 = new JButton("네 이 버");
		JButton b4 = new JButton("크롤링시작");
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		b1.setBackground(Color.pink);
		b2.setBackground(Color.orange);
		b3.setBackground(Color.yellow);
		b4.setBackground(Color.red);
		b4.setForeground(Color.white);
		
		//액션기능
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링2 inCode = new 네이버증권크롤링2();		//클래스 선언
				inCode.naver("005930");							//클래스 내 메소드
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링2 inCode = new 네이버증권크롤링2();
				inCode.naver("035720");
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링2 inCode = new 네이버증권크롤링2();
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
				네이버증권크롤링2 inCode = new 네이버증권크롤링2();
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
