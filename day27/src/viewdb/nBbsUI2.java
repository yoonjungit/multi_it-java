package viewdb;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javadb.bbsDAO2;

public class nBbsUI2 extends JFrame{
	JTextField no, title, content, writer;
	JButton write, delete, search;

	public static void main(String[] args) {
		nBbsUI2 n = new nBbsUI2();
	}

	public nBbsUI2() {
		setLayout(new FlowLayout());
		setSize(380, 500);
		Font font = new Font("새굴림", 1, 20);
		
		JLabel bbs = new JLabel("나의 게시판");
		JLabel no1 = new JLabel("게시판 id");
		JLabel title1 = new JLabel("게시판 제목");
		JLabel content1 = new JLabel("게시판 내용");
		JLabel writer1 = new JLabel("게시판 작성자");
		
		no = new JTextField(10);
		title = new JTextField(10);
		content = new JTextField(10);
		writer = new JTextField(10);
		
		write = new JButton("게시물 작성 완료");
		delete = new JButton("게시물 삭제 완료");
		search = new JButton("게시물 검색 완료");
		
		write.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				bbsDAO2 dao = new bbsDAO2();
				
				String title2 = title.getText();
				String content2 = content.getText();
				String writer2 = writer.getText();
				
				BbsVO article = new BbsVO();
				article.setTitle(title2);
				article.setContent(content2);
				article.setWriter(writer2);
				
				dao.insert(article);
			}
		});
		
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				bbsDAO2 dao = new bbsDAO2();
				
				String title2 = title.getText();
				String content2 = content.getText();
				String writer2 = writer.getText();
				
				BbsVO article = new BbsVO();
				article.setTitle(title2);
				article.setContent(content2);
				article.setWriter(writer2);
				
				dao.insert(article);
			}
		});
		
		
		search.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				bbsDAO2 dao = new bbsDAO2();
				BbsVO article = new BbsVO();
				int no2 = Integer.parseInt(no.getText());
				article.setNo(no2);
				
				BbsVO result = dao.search(article);
				
				System.out.println(result);
				
			}
		});
		
		bbs.setFont(font);
		no1.setFont(font);
		title1.setFont(font);
		content1.setFont(font);
		writer1.setFont(font);
		no.setFont(font);
		title.setFont(font);
		content.setFont(font);
		writer.setFont(font);
		write.setFont(font);
		delete.setFont(font);
		search.setFont(font);
		
		bbs.setHorizontalAlignment(JLabel.CENTER);
		
		bbs.setPreferredSize(new Dimension(300, 30));
		no1.setPreferredSize(new Dimension(150, 30));
		no.setPreferredSize(new Dimension(150, 30));
		title1.setPreferredSize(new Dimension(150, 30));
		title.setPreferredSize(new Dimension(150, 30));
		content1.setPreferredSize(new Dimension(150, 30));
		content.setPreferredSize(new Dimension(150, 30));
		writer1.setPreferredSize(new Dimension(150, 30));
		writer.setPreferredSize(new Dimension(150, 30));
		
		
		add(bbs);
		add(no1);
		add(no);
		add(title1);
		add(title);
		add(content1);
		add(content);
		add(writer1);
		add(writer);
		add(write);
		add(delete);
		add(search);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	

}
