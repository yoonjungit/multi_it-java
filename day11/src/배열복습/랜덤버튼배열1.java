package 배열복습;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열1 {

	public static void main(String[] args) {
		//배열에는 기본형만 들어가는 것이 아니고, 참조형도 가능
		//1.프레임
		JFrame f = new JFrame();
		f.setSize(1200, 800);
		
		//2.버튼
		Random r = new Random(42);
		JButton[] buttons = new JButton[400];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼 "+ i);
		}
		//2-1. 버튼 위치 지정
		f.setLayout(null);   // --> 위치 자동으로 지정해주는 부품 안씀
			for (int i = 0; i < buttons.length; i++) {
				//첫번째 버튼을 위치(500, 500)에, 크기는 100x50
				//위치만 지정
				buttons[i].setBounds(r.nextInt(1000), r.nextInt(700), 100, 50);
				//		buttons[1].setBounds(600, 600, 100, 50);
				//f.에 올려주자
				f.add(buttons[i]);
			}
		//		f.add(buttons[1]);
		f.setVisible(true);
	}

}
