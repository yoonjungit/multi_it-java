package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class For3 {

	public static void main(String[] args) {
		//1. 프레임 설정
		JFrame frame = new JFrame();
		frame.setSize(300, 500);
		frame.getContentPane().setBackground(Color.blue);
		
		//2. 버튼 4개
		JButton b1 =new JButton();
		JButton b2 =new JButton();
		JButton b3 =new JButton();
		JButton b4 =new JButton();
		b1.setText("별10개");
		b2.setText("커피*5개");
		b3.setText("커피우유3개");
		b4.setText("짱3개");
		
		//3. 폰트
		Font font = new Font("궁서",1,25);
		
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		//4. 레이아웃 설정
		FlowLayout f = new FlowLayout();
		frame.setLayout(f);
		
		//5. 프레임에 버튼 추가
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		
		
		// 버튼액션
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용을 여기에 써주세요!
				System.out.println("b1을 클릭했음");
				//1. 버튼1
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용을 여기에 써주세요!
				System.out.println("b2을 클릭했음");
				//2. 버튼2
				for (int i = 0; i < 5; i++) {
					System.out.print("커피*");
				}
				System.out.println("");
				
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용을 여기에 써주세요!
				System.out.println("b3을 클릭했음");
				//3. 버튼3
				for (int j = 0; j < 3; j++) {
					System.out.println("커피*우유");
				}
				
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용을 여기에 써주세요!
				System.out.println("b4을 클릭했음");
				//4. 버튼4
				for (int j = 0; j < 3; j++) {
					System.out.println(j+1 + ": 짱!");
				}
				
			}
		});
		

		frame.setVisible(true);
	}

}
