package 상속응용;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Game369img extends Thread{
	//생성자 선언하기 위해 전역변수 설정
	int ans;
	JLabel clap = new JLabel();
	
	public Game369img(int ans, JLabel clap) {
		this.ans = ans;
		this.clap = clap;
	}

	@Override
	public void run() {
		//박수 이미지 clap 라벨에 넣기
		ImageIcon icon = new ImageIcon("clap.png");
		clap.setIcon(icon);
		
		for (int i = 1; i <= ans; i++) {
			
			//3, 6, 9가 각각 몇개 들어가있는지 카운트 하기 위해 i를 String으로 변환
			String fin = Integer.toString(i);
			//3, 6, 9를 빈문자로 대체한 후 각각 원래 문자와 길이 차이 계산
			int a = fin.length()-fin.replace("3", "").length();		
			int b = fin.length()-fin.replace("6", "").length();
			int c = fin.length()-fin.replace("9", "").length();
			//sum = 길이차이의 총합(3, 6, 9 숫자 개수)
			int sum = a+b+c;
			
			//3, 6, 9가 하나라도 있으면 이미지 보이기. 없으면 숨기기
			if (sum>0) {
				clap.setVisible(true);
			} else {
				clap.setVisible(false);
			}
			
			//1초씩 스레드 일시정지
			try {
				Thread.sleep(1000);
			} catch (Exception e1) {
				System.out.println("CPU 오류 발생");
			}
		
		}
	}
}
