package 상속응용;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Game369Main {
	static int ans;
	
	public static void main(String[] args) {
		
		//1. 프레임
		JFrame f = new JFrame("3 6 9 Game");
		f.setSize(500, 500);
		f.setLayout(new FlowLayout());

		// 2. 폰트 설정
		Font fontAsk = new Font("궁서", 1, 20);
		Font fontMain = new Font("궁서", 1, 50);

		// 3. 레이아웃
		// 3-1. 게임 지속 시간 입력
		JLabel ask = new JLabel("3 6 9 게임을 얼마동안 플레이 하시겠습니까?");
		ask.setPreferredSize(new Dimension(500, 50));
		ask.setHorizontalAlignment(JLabel.CENTER);
		ask.setFont(fontAsk);

		JTextField answer = new JTextField(10);
		answer.setFont(fontAsk);

		JButton start = new JButton("시작");
		start.setFont(fontAsk);

		// 3-2. 메인 게임
		JLabel number = new JLabel("GAME");
		JLabel clap = new JLabel();

		number.setPreferredSize(new Dimension(500, 50));
		number.setHorizontalAlignment(JLabel.CENTER);
		number.setForeground(Color.red);
		number.setFont(fontMain);
		
		//4. 시작버튼 액션
		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ans = Integer.parseInt(answer.getText());
					Game369 game = new Game369(ans, number);
					game.start();
					Game369img img = new Game369img(ans, clap);
					img.start();
					//객체 생성을 메인 함수가 아닌 ActionListener에서 하므로, ans, number, clap등의 변수를 연결하기 위해서 생성자 이용
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(f, "정수만 입력해주세요");
				}
			}
		});
		
		//5. 요소 프레임에 추가
		f.add(ask);
		f.add(answer);
		f.add(start);
		f.add(number);
		f.add(clap);
		
		//6. 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//창 닫으면 프로그램 종료
		f.setVisible(true);		//프레임 보여주기
	}
}
