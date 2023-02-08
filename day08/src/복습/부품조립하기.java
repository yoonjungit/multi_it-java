package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 자주 써서 ram에 언제든 사용할 수 있도록 준비되어 있음
		//	부품명.기능()
		//2. 쓸 때 마다 제공되는 틀을 이용해서 찍어내어 여러개 만들어 ram에 저장해두고 사용
		//	벽돌(Jframe)
		JFrame f = new JFrame();
		f.setSize(300,500);
		
		JLabel l = new JLabel();
		l.setText("숫자를 입력하세요");
		
		JTextField text = new JTextField(15);
		JButton b = new JButton();
		FlowLayout flow = new FlowLayout();
		Font font = new Font("궁서", 1, 20);
		Font font2 = new Font("궁서", 1, 30);
		
		f.setLayout(flow);
		f.add(l);
		l.setFont(font2);
		l.setForeground(Color.blue);
		
		text.setBackground(Color.cyan);
		text.setBackground(Color.blue);
		text.setFont(font2);
		f.add(text);
		
		b.setText("숫자 맞추기 게임");
		b.setBackground(Color.yellow);
		b.setFont(font);
		f.add(b);
		
		f.getContentPane().setBackground(Color.green);
		
		
		//맨 아래에!
		f.setVisible(true);
	}

}
