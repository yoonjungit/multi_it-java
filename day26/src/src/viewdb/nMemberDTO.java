package viewdb;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class nMemberDTO extends JFrame{
	JTextField id, pw, name, tel;
	JButton join, delete;
	
	public nMemberDTO() {
		setLayout(new FlowLayout());
		setSize(380, 500);
		Font font = new Font("새굴림", 1, 20);
		
		JLabel joinV = new JLabel("");
		JLabel id1 = new JLabel("아이디");
		JLabel pw1 = new JLabel("비밀번호");
		JLabel name1 = new JLabel("이름");
		JLabel tel1 = new JLabel("전화번호");
		
		ImageIcon hi = new ImageIcon("member.jpg");
		joinV.setIcon(hi);
		
		id = new JTextField(10);
		pw = new JTextField(10);
		name = new JTextField(10);
		tel = new JTextField(10);
		
		join = new JButton("회원 가입 하기");
		delete = new JButton("탈퇴하기ㅠㅠ");
		
		joinV.setFont(font);
		id1.setFont(font);
		pw1.setFont(font);
		name1.setFont(font);
		tel1.setFont(font);
		id.setFont(font);
		pw.setFont(font);
		name.setFont(font);
		tel.setFont(font);
		join.setFont(font);
		delete.setFont(font);
		
		join.setBackground(Color.cyan);
		delete.setBackground(Color.pink);
		
		joinV.setHorizontalAlignment(JLabel.CENTER);
		
		joinV.setPreferredSize(new Dimension(300, 200));
		id1.setPreferredSize(new Dimension(150, 30));
		id.setPreferredSize(new Dimension(150, 30));
		pw1.setPreferredSize(new Dimension(150, 30));
		pw.setPreferredSize(new Dimension(150, 30));
		name1.setPreferredSize(new Dimension(150, 30));
		name.setPreferredSize(new Dimension(150, 30));
		tel1.setPreferredSize(new Dimension(150, 30));
		tel.setPreferredSize(new Dimension(150, 30));
		
		join.setPreferredSize(new Dimension(250, 30));
		delete.setPreferredSize(new Dimension(250, 30));
		
		add(joinV);
		add(id1);
		add(id);
		add(pw1);
		add(pw);
		add(name1);
		add(name);
		add(tel1);
		add(tel);
		add(join);
		add(delete);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		nMemberDTO n = new nMemberDTO();
	}

}
