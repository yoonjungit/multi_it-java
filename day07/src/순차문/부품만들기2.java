package 순차문;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기2 {

	public static void main(String[] args) {
//		JFrame frame = new JFrame();
//		frame.setSize(300, 300);
//		JButton button1 = new JButton();
//		button1.setText("버튼1이당");
//		frame.add(button1);
//		frame.setVisible(true);
		
		//frame -> flow layout -> button / label / textfield -> style:폰트
		
		JFrame f = new JFrame();
		f.setSize(500, 150);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton();
		b1.setText("나는 버튼1");
		JButton b2 = new JButton();
		b2.setText("나는 버튼2");
		
		JLabel text1 = new JLabel();
		JLabel text2 = new JLabel();
		text1.setText("아이디");
		text2.setText("패스워드");
		
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		Font font = new Font("궁서", 1, 20);
		
		text1.setFont(font);
		b1.setFont(font);
		input1.setFont(font);
		text2.setFont(font);
		b2.setFont(font);
		input2.setFont(font);
		
		ImageIcon icon = new ImageIcon("1.jpg");
		
		b1.setIcon(icon);
		f.add(text1);
		f.add(input1);
		f.add(b1);
	
		f.add(text2);
		f.add(input2);
		f.add(b2);
		
		f.setVisible(true);
		
//		JFrame A = new JFrame();
//		A.setSize(300, 600);
//		
//		FlowLayout flay = new FlowLayout();
//		A.setLayout(flay);
//		
//		JButton bb1 = new JButton();
//		JButton bb2 = new JButton();
//		bb1.setText("냐냐냐냐");
//		bb2.setText("뉴뉴뉴");
//		
//		JLabel la = new JLabel();
//		JLabel la2 = new JLabel();
//		la.setText("끼룩");
//		la2.setText("끼5룩");
//		
//		JTextField in1 = new JTextField(10);
//		JTextField in2 = new JTextField(10);
//		
//		Font ffff = new Font("궁서체", 1, 40);
//		la.setFont(ffff);
//		
//		A.add(bb1);
//		A.add(bb2);
//		A.add(la);
//		A.add(la2);
//		A.add(in1);
//		A.add(in2);
//		
//		A.setVisible(true);
		
		
		
		
//
//		JFrame f = new JFrame();
//		f.setSize(500, 150);
//		
//		//물흐르듯이 순서대로 배치해주는 부품을 램에 복사해서 가져다 놓아야 함.
//		//FlowLayout
//		FlowLayout flow = new FlowLayout();
//		
//		//f에 물흐르듯이 배치해주는 부품을 쓰겠다라고 조립(설정)
//		f.setLayout(flow);
//		
//		JButton b1 = new JButton();
//		b1.setText("나는 버튼1");
//		
//		JButton b2 = new JButton();
//		b2.setText("나는 버튼2");
//		
//		JLabel text1 = new JLabel(); //글씨
//		text1.setText("아이디");
//		
//		JLabel text2 = new JLabel(); //글씨
//		text2.setText("패스워드");
//		
//		//글자 넣는 곳..
//		JTextField input1 = new JTextField(10);
//		JTextField input2 = new JTextField(10);
//		
//		//import가 안된 경우 Font위에 마우스를 올리면(또는 F2)
//		//import Font~~를 클릭!!
//		//단축키로는 컨트롤 + 쉬프트 + o
//		Font font = new Font("궁서", 1, 20);
//		
//		text1.setFont(font);
//		input1.setFont(font);
//		b1.setFont(font);
//		text2.setFont(font);
//		input2.setFont(font);
//		b2.setFont(font);
//		
//		b1.setBackground(Color.red); //배경색
//		b1.setForeground(Color.white); //버튼의 위색, 글자색
//		b2.setBackground(Color.red); //배경색
//		b2.setForeground(Color.white); //버튼의 위색, 글자색
//		input1.setBackground(Color.red); //배경색
//		input1.setForeground(Color.white); //버튼의 위색, 글자색
//		input2.setBackground(Color.red); //배경색
//		input2.setForeground(Color.white); //버튼의 위색, 글자색
//		
//		//no.png 파일명을 쓰면 java02프로젝트 바로 아래 있는 것으로 인식!
//		ImageIcon icon = new ImageIcon("no.png");
//		ImageIcon icon2 = new ImageIcon("ok.png");
//		
//		b1.setIcon(icon);
//		b2.setIcon(icon2);
//		
//		f.add(text1);
//		f.add(input1);
//		f.add(b1);
//		f.add(text2);
//		f.add(input2);
//		f.add(b2);
//		
//		//보여주는 것은 맨 끝으로!!
//		f.setVisible(true);
	}

}
