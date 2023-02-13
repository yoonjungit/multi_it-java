package 배열복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템 {

	public static void main(String[] args) {
		//1. 프레임설정
		JFrame f = new JFrame();
		f.setTitle("극장예매시스템");
		// -> JFrame f = new JFrame("극장예매시스템"); 
		f.setSize(1200, 800);
		f.getContentPane().setBackground(Color.black);
		FlowLayout layOut = new FlowLayout();
		f.setLayout(layOut);
		
		//2. 폰트
		Font font = new Font("궁서",Font.BOLD,20);
		
		//3. 버튼 설정
		JButton[] btn = new JButton[150];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i+1 +"");		//이때 int를 괄호 안에 넣을 수 없으므로 i에 String "" 추가
			btn[i].setFont(font);
			btn[i].setBackground(Color.cyan);
			f.add(btn[i]);
		}
		
		//4. 선택된 좌석 라벨 추가
		JLabel choose = new JLabel("선택한 좌석 >>");
		choose.setFont(font);
		choose.setForeground(Color.yellow);
		f.add(choose);
		
		//5. 좌석 예약 완료 여부 배열 및 라벨
		int[] reserved = new int[150];
		JLabel reserve = new JLabel();
		reserve.setFont(font);
		reserve.setForeground(Color.white);
		f.add(reserve);
	
		//6. 버튼 액션 설정
		for (int i = 0; i < btn.length; i++) {
			btn[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String text = e.getActionCommand();		// 클릭한 버튼의 글자(text)를 가지고 옴
					choose.setText("선택한 좌석 >> " + text);
					int num = Integer.parseInt(text);
					
					//선택한 좌석 색깔 변경
					btn[num-1].setBackground(Color.red);
					
					//이미 선택된 좌석 클릭 불가
					//btn[num-1].setEnabled(false);
					
					//reserved배열에서 예약가능여부 확인
					if (reserved[num-1]==0) {
						reserve.setText("예약 가능합니다.");
						reserved[num-1] = 1;
					} else {
						reserve.setText("이미 선택된 좌석입니다.");
					}
				}
			});
		}
		
		//7. 예약 현황 보기
		JButton total = new JButton("예약 현황");
		total.setBackground(Color.white);
		total.setFont(font);
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int sum = 0;
				for (int i = 0; i < reserved.length; i++) {
					sum+= reserved[i];
				}
				JOptionPane.showMessageDialog(f, "현재 "+sum+"석 예약 완료 >> "+(sum*10000)+"원 지불");
				
			}
		});
		
		f.add(total);
		
		f.setVisible(true);
		
	}

}
