package 복습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 나의그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(200,200);
		JButton b = new JButton("나를 눌러");
		
		//new 다음에는 클래스가 와야 하는데 ActionListener(익명클래스)로 클래스->객체 구현
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//인터페이스에 반드시 actionPerformed()를 쓰라고 규칙이 정해짐
				System.out.println("버튼 클릭 됨");
			}
		});

		f.add(b, BorderLayout.NORTH);
		
		f.setVisible(true);
	}

}
