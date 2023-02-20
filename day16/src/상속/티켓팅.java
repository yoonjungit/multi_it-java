package 상속;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 티켓팅 extends JFrame{
	JLabel count, image, time;
	
	public static void main(String[] args) {
		티켓팅 ticket = new 티켓팅();
		//객체 생성 시 클래스 이름과 동일한 메서드를 자동 호출
		//-> 생성자 / 메서드를 자동호출
	}
	
	public 티켓팅() {
		//1. 프레임 설정
		setTitle("티켓팅 타이머");
		setSize(900, 800);
		getContentPane().setBackground(Color.black);
		
		//2.폰트 설정
		Font font = new Font("궁서", 1, 30);
		
		//3. count : 카운트, time : 현재시각, image : 이미지 JLabel 선언 
		count = new JLabel();		//남은 초 카운트
		time = new JLabel();		//현재 시각
		ImageIcon icon = new ImageIcon("01.png");
		image = new JLabel(icon);	//이미지 JLabel
		
		//4. count, time 배경색, 폰트 설정
		count.setForeground(Color.white);
		time.setForeground(Color.white);
		count.setFont(font);
		time.setFont(font);
		
		//5. count, time, image 라벨 추가 및 위치, 가운데 정렬 설정
		add(count,BorderLayout.NORTH);
		add(time,BorderLayout.SOUTH);
		add(image,BorderLayout.CENTER);
		count.setHorizontalAlignment(JLabel.CENTER);
		time.setHorizontalAlignment(JLabel.CENTER);
	
		//6. 각 스레드 객체 생성 및 실행
		타이머스레드2 time2 = new 타이머스레드2();
		이미지스레드2 image2 = new 이미지스레드2();
		카운트스레드2 count2 = new 카운트스레드2();
		
		count2.start();
		image2.start();
		time2.start();
		
		//7. 프로그램 닫으면 실행 종료 및 프레임 보이기 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	//전역변수(Jlabel count, time, image)를 공유하기 위해 내부 클래스 선언
	//day15 Game369 참고
	public class 카운트스레드2 extends Thread{
		
		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				count.setText("티켓팅 "+ (500-i) + "초 전");		//500초 카운트
				try {
					Thread.sleep(1000);		//1초 =1000
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김");
				}
			}
		}
	}
	
	public class 타이머스레드2 extends Thread{
		
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				Date date = new Date();
				time.setText("현재 시각 >>" + date );
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김.");
				}
			}
		}
	}
	
	
	public class 이미지스레드2 extends Thread {

		@Override
		public void run() {
			String[] images = { "01.png", "02.png", "03.png", "04.png", "05.png"};
			for (int i = 0; i < 500; i++) {
				i = i%5;		//이미지가 반복될 수 있도록 나머지 값을 i에 대입
				ImageIcon icon = new ImageIcon(images[i]);
				image.setIcon(icon);
				try {
					Thread.sleep(5000); // 5초 일시정지
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김.");
				}
			}
		}
	}

}
