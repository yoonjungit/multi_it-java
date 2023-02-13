package 배열복습;

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

public class 극장예매시스템2 {

	public static void main(String[] args) {
		//1. 프레임설정
		JFrame f = new JFrame("극장예매시스템"); 
		f.setSize(1300, 800);
		f.getContentPane().setBackground(Color.black);
		FlowLayout layOut = new FlowLayout();
		f.setLayout(layOut);
		
		//2. 폰트
		Font font = new Font("궁서",Font.BOLD,20);
		
		//3. 스크린 위치 표시
		JLabel screen = new JLabel("SCREEN");
		screen.setFont(font);
		screen.setForeground(Color.white);
		screen.setPreferredSize(new Dimension(1250, 30));
		screen.setHorizontalAlignment(JLabel.CENTER);
		f.add(screen);
		
		//4. 좌석 버튼
		JButton[] btn = new JButton[150];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i+1 +"");	
			btn[i].setPreferredSize(new Dimension(80, 30));
			btn[i].setFont(font);
			btn[i].setBackground(Color.cyan);
			f.add(btn[i]);
		}
		
		//5. 선택한 좌석 보여주기 라벨
		JLabel choose = new JLabel("선택한 좌석 >>");
		choose.setPreferredSize(new Dimension(250, 30));
		choose.setFont(font);
		choose.setForeground(Color.yellow);
		f.add(choose);
		
		//5. 선택한 좌석 예약 여부 배열 및 라벨
		int[] reserved = new int[150];
		JLabel reserve = new JLabel();
		reserve.setFont(font);
		reserve.setForeground(Color.white);
		reserve.setPreferredSize(new Dimension(250, 30));
		f.add(reserve);
	
		//6. 버튼 액션 설정
		for (int i = 0; i < btn.length; i++) {
			btn[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					//좌석 번호 가져오기 (String)
					String text = e.getActionCommand();	
					choose.setText("선택한 좌석 >> " + text);
					//좌석 번호 형변환 (String -> Int)
					int num = Integer.parseInt(text);
					
					//아직 선택하지 않은 좌석 -> 선택 완료 및 빨간색 표시
					//이미 선택한 좌석 -> 선택취소 및 cyan색 복귀
					if (reserved[num-1]==0) {
						reserve.setText("선택완료");
						reserved[num-1] = 1;
						btn[num-1].setBackground(Color.red);
					} else {
						reserve.setText("선택취소");
						btn[num-1].setBackground(Color.cyan);
						reserved[num-1] = 0;
					}
				}
			});
		}
		
		//7. 예약하기
		JButton total = new JButton("예약하기");
		total.setBackground(Color.white);
		total.setFont(font);
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int sum = 0;
				for (int i = 0; i < reserved.length; i++) {
					sum+= reserved[i];
				}
				JOptionPane.showMessageDialog(f, "현재 "+sum+"석 선택 >> "+"\n"+(sum*10000)+"원 지불");
				
			}
		});
		
		f.add(total);
		
		f.setVisible(true);
		
	}

}