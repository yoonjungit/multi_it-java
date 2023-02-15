package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 나의넷플릭스 {
	
	static int index = 2; //현재 index[2]부터 시작
	
	public static void main(String[] args) {
		//[1] 배열
		String[] title = {"일타스캔들", "빨간풍선", "여신강림", "피지컬100","사랑의 이해"};
		String[] img = {"일타스캔들.jpg","빨간풍선.jpg", "여신강림.jpg","피지컬100.jpg","사랑의이해.jpg"};
		int[] rank = {1, 2, 3, 4, 5};
		
		//[2] JOptionPane
		//1. 프레임
		JFrame f = new JFrame();
		f.setSize(700, 800);
		f.getContentPane().setBackground(Color.black);
		
		//2. 폰트
		Font font = new Font("궁서", 1, 25);
		Font fontT = new Font("궁서", 1, 40);
		
		//3. 라벨
		//(1) top
		JLabel top = new JLabel(title[2]);
		top.setFont(fontT);
		top.setForeground(Color.red);
		top.setHorizontalAlignment(0);
		
		//배치부품(객체)를 바꾸지 않으면 경계레이아웃을 사용하도록 셋팅
		f.add(top, BorderLayout.NORTH);
		
		//(2) center
		JLabel center = new JLabel("");
		center.setHorizontalAlignment(0);
		center.setFont(font);
		center.setForeground(Color.red);
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.add(center, BorderLayout.CENTER);
		
		//(3) under
		//String.valueOf() : int, double, ... => String으로 변환 (참조형)
		//Integer.parse() : double, String, ... => int로 변환 (기본형)
		JLabel under = new JLabel(String.valueOf(rank[2]));
		under.setHorizontalAlignment(0);
		under.setFont(font);
		under.setForeground(Color.red);
		f.add(under, BorderLayout.SOUTH);
		
		//(4) left
		JButton left = new JButton("<<");
		left.setHorizontalAlignment(0);
		left.setFont(font);
		left.setForeground(Color.red);
		left.setBackground(Color.black);
		left.setBorder(null);
		f.add(left, BorderLayout.WEST);

		//액션처리 방법 : 액션기능 add -> 클릭액션이 있을 떄 처리할 부품 생성 
		//				-> 어떻게 처리할지 내용 코딩
		left.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//현재 인덱스보다 하나 적은 값들로 나머지 라벨 (top, center, under) 셋팅
				if (index==0) {
					index = 4;
				
				} else {
					index--;
				}
				top.setText(title[index]);
				under.setText(rank[index] + "");
				ImageIcon icon = new ImageIcon(img[index]);
				center.setIcon(icon);

			}
		});

		//(5) right
		JButton right = new JButton(">>");
		right.setHorizontalAlignment(0);
		right.setFont(font);
		right.setForeground(Color.red);
		right.setBackground(Color.black);
		right.setBorder(null);
		f.add(right, BorderLayout.EAST);
		
		right.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index==4) {
					index = 0;
				}else {
					index++;
				}
				top.setText(title[index]);
				under.setText(rank[index] + "");
				ImageIcon icon = new ImageIcon(img[index]);
				center.setIcon(icon);
				
			}
		});
		
		//프로그램이 끝나면 자동 exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		f.setVisible(true);
	}
}
