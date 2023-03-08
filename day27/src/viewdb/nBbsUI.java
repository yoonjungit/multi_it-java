package viewdb;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class nBbsUI extends JFrame{
	JTextField id, pw, name, tel;
	JButton join, delete, search;
	
	public nBbsUI() {
		setLayout(new FlowLayout());
		setSize(380, 500);
		Font font = new Font("새굴림", 1, 20);
		
		JLabel joinV = new JLabel("나의 게시판");
		JLabel id1 = new JLabel("게시판 id");
		JLabel pw1 = new JLabel("게시판 제목");
		JLabel name1 = new JLabel("게시판 내용");
		JLabel tel1 = new JLabel("게시판 작성자");
		
		id = new JTextField(10);
		pw = new JTextField(10);
		name = new JTextField(10);
		tel = new JTextField(10);
		
		join = new JButton("게시물 작성 완료");
		delete = new JButton("게시물 삭제 완료");
		search = new JButton("게시물 검색 완료");
		
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
		search.setFont(font);
		
		joinV.setHorizontalAlignment(JLabel.CENTER);
		
		joinV.setPreferredSize(new Dimension(300, 30));
		id1.setPreferredSize(new Dimension(150, 30));
		id.setPreferredSize(new Dimension(150, 30));
		pw1.setPreferredSize(new Dimension(150, 30));
		pw.setPreferredSize(new Dimension(150, 30));
		name1.setPreferredSize(new Dimension(150, 30));
		name.setPreferredSize(new Dimension(150, 30));
		tel1.setPreferredSize(new Dimension(150, 30));
		tel.setPreferredSize(new Dimension(150, 30));
		
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
		add(search);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		nBbsUI n = new nBbsUI();
	}

}
