package 메서드연습;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 중국집주문 {
	static int index = 0;		// 현재 메뉴 위치 인덱스 값
	static int totalP = 0;		// 총 주문 금액
	public static void main(String[] args) {
		String[] menu = {"메인", "짜장면", "짬뽕", "탕수육"};		// 메인과 음식 메뉴 배열
		String[] image = {"0.jpg", "1.jpg", "2.jpg", "3.jpg"};		// 이미지 배열
		String[] price = {"어서오십시오", "6000", "7000", "15000"};		// 가격 배열
		int[] stock = {0, 5, 5, 5};		//주문 가능 개수
		int[] count1 = new int[4];		//각 메뉴별 주문 개수
		
		//1. 프레임 생성
		JFrame f = new JFrame("북경반점");
		f.setSize(550, 800);
		f.getContentPane().setBackground(Color.red);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		//2. 폰트 스타일 지정
		Font font = new Font("궁서", 1, 20);
		Font font2 = new Font("궁서", 1, 30);		//메뉴 가격, 메뉴 추가,삭제 버튼 적용 폰트
		
		//3. 상단 메뉴바
		//3-1. 메뉴 버튼 (배열 인덱스 순서)
		JButton home = new JButton(menu[0]);		// 메인
		home.setBackground(Color.black);
		home.setForeground(Color.white);
		home.setFont(font);
		
		JButton jjajang = new JButton(menu[1]);		// 짜장면
		jjajang.setBackground(Color.black);
		jjajang.setForeground(Color.white);
		jjajang.setFont(font);
		
		JButton jjam = new JButton(menu[2]);		// 짬뽕
		jjam.setBackground(Color.black);
		jjam.setForeground(Color.white);
		jjam.setFont(font);
		
		JButton tang = new JButton(menu[3]);		// 탕수육
		tang.setBackground(Color.black);
		tang.setForeground(Color.white);
		tang.setFont(font);
		
		//3-2. 총 가격 라벨
		JLabel total = new JLabel("총 " + totalP + "원");
		total.setFont(font);
		total.setForeground(Color.white);
		
		//3-3. 프레임에 인스턴스 추가
		f.add(home);
		f.add(jjajang);
		f.add(jjam);
		f.add(tang);
		f.add(total);
		
		//4. 가운데 이미지 라벨
		JLabel food = new JLabel();
		ImageIcon foodimage = new ImageIcon(image[0]);
		food.setIcon(foodimage);
		f.add(food);
		
		//5. 하위 메뉴(
		//5-1. 메뉴 가격 (메인에서는 인사말 보여줌)
		JLabel price1 = new JLabel(price[0]);
		price1.setFont(font2);
		f.add(price1);
		
		//5-2. 메뉴 추가, 삭제
		JButton plus = new JButton("+");
		plus.setFont(font2);
		JButton minus = new JButton("-");
		minus.setFont(font2);
		plus.setVisible(false); 		//메인에서는 메뉴 추가, 삭제를 안하므로 버튼 안보이게 설정
		minus.setVisible(false);
		f.add(plus);
		f.add(minus);
		
		//5-3. 실시간 주문 개수 보여주기
		JLabel show = new JLabel("짜장 :" + count1[1] + " / 짬뽕 : " + count1[2] + " / 탕수육 : " + count1[3]);
		show.setHorizontalAlignment(0);
		show.setPreferredSize(new Dimension(400, 50));
		show.setBackground(Color.white);
		show.setFont(font);
		f.add(show);
		
		//5-4. 주문 버튼
		JButton order = new JButton("주문하기");
		order.setPreferredSize(new Dimension(400, 50));
		order.setBackground(Color.white);
		order.setFont(font);
		f.add(order);
		
		//6. 각 버튼별 액션
		//6-1. 메인 클릭시 
		//		->  +,- 버튼 안보이게
		//			image 라벨에 어서오십시오 이미지
		//			price 라벨에 가격 대신 인사말(어서오십시오)
		home.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				index = 0;
				plus.setVisible(false);
				minus.setVisible(false);
				ImageIcon foodimage = new ImageIcon(image[index]);
				food.setIcon(foodimage);
				price1.setText(price[index]);
			}
		});
		
		//6-2. 짜장면 클릭시
		//		->  +,- 버튼 보이게
		//			image 라벨에 짜장면 이미지
		//			price 라벨에 짜장면 가격
		jjajang.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				index = 1;
				plus.setVisible(true);
				minus.setVisible(true);
				ImageIcon foodimage = new ImageIcon(image[index]);
				food.setIcon(foodimage);
				price1.setText(price[index]);
			}
		});
		
		//6-3. 짬뽕 클릭시
		jjam.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				index = 2;
				plus.setVisible(true);
				minus.setVisible(true);
				ImageIcon foodimage = new ImageIcon(image[index]);
				food.setIcon(foodimage);
				price1.setText(price[index]);
			}
		});
		
		//6-4. 탕수육 클릭시
		tang.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				index = 3;
				plus.setVisible(true);
				minus.setVisible(true);
				ImageIcon foodimage = new ImageIcon(image[index]);
				food.setIcon(foodimage);
				price1.setText(price[index]);
			}
		});
		
		//6-5. + 버튼 클릭시
		//		->  현재 메뉴 인덱스로 주문개수 +1
		//			실시간 주문금액, 주문개수 변경
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (count1[index]+1>stock[index]) {
					JOptionPane.showMessageDialog(f, "주문 가능 수량을 초과했습니다.");
				}else {
					count1[index]++;
					totalP += Integer.parseInt(price[index]);
					total.setText("총 " + totalP + "원");
					show.setText("짜장 :" + count1[1] + " / 짬뽕 : " + count1[2] + " / 탕수육 : " + count1[3]);
				}
			}
		});

		//6-6. - 버튼 클릭시
		//		->  만약 주문개수 0인 상태에서 클릭시 예외처리 ("잘못된 접근입니다")
		//			그외 주문개수 -1
		//			실시간 주문금액, 주문개수 변경
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(count1[index]==0) {
					JOptionPane.showMessageDialog(f, "잘못된 접근입니다.");
				}else {
					count1[index]--;
					totalP -= Integer.parseInt(price[index]) ;
					total.setText("총 " + totalP + "원");
					show.setText("짜장 :" + count1[1] + " / 짬뽕 : " + count1[2] + " / 탕수육 : " + count1[3]);
				}
			}
		});
		
		//6-7. 주문하기 버튼 클릭시
		//		->  최소 주문 금액(10,000원) 미만인 경우 알림창 띄우기 "최소 주문 금액은 10000원 입니다."
		//			그외 총 주문금액 알림창 띄우기
		order.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (totalP<10000) {
					JOptionPane.showMessageDialog(f, "최소 주문 금액은 10000원 입니다.");
				}else {
					JOptionPane.showMessageDialog(f, "총 " + totalP + "원 입니다.");
				}
				
			}
		});
		
		//7. 창 닫으면 프로그램 실행 종료
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//8. 프레임 visible 설정
		f.setVisible(true);
	
	
	}

}
