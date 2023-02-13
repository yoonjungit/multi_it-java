package 배열복습;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		//1. 프레임 만들기
		//2. 프레임 설정 -> 실행 후 확인
		//3. 버튼을 넣을 배열을 먼저 만들기
		//4. 버튼을 500개 만들어서 배열에 넣어주세요.
		//5. 배열에 있는 버튼을 꺼내서 위치 지정 후 f에 붙여주세요
		//심화-1)) 버튼 색을 몇 가지 지정해서 임의로 설정, 힌트 color배열
		//심화-2)) f에 배경색을 넣어보세요
		
		//1-2.
		JFrame f = new JFrame();
		f.setSize(1200, 800);
		
		//3.
		JButton[] buttons = new JButton[500];
		f.setLayout(null); 
		
		//4.
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼"+i);
		}
		
		//5.
		Random r = new Random();
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].setBounds(r.nextInt(1100), r.nextInt(750), 100, 50);
		}
		
		//심화1
		Color[] color = {Color.blue, Color.CYAN, Color.green, Color.yellow, Color.white, Color.pink, Color.orange};
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].setBackground(color[r.nextInt(6)]);
			f.add(buttons[i]);
		}
		
		//심화2
		f.getContentPane().setBackground(Color.ORANGE);
		
		f.setVisible(true);
	}

}
