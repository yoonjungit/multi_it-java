package 상속응용;

import javax.swing.JLabel;

public class Game369 extends Thread{		//쓰레드 클래스 상속
	//생성자 선언하기 위해 전역변수 설정
	int ans;		//입력값(플레이할 숫자)
	JLabel number = new JLabel();		//숫자 카운트 라벨
	
	public Game369(int ans, JLabel number2) {
		this.ans = ans;
		this.number = number2;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= ans; i++) {
			
			//3, 6, 9가 각각 몇개 들어가있는지 카운트 하기 위해 i를 String으로 변환
			String fin = Integer.toString(i);
			//3, 6, 9를 빈문자로 대체한 후 각각 원래 문자와 길이 차이 계산
			int a = fin.length()-fin.replace("3", "").length();		
			int b = fin.length()-fin.replace("6", "").length();
			int c = fin.length()-fin.replace("9", "").length();
			//sum = 길이차이의 총합(3, 6, 9 숫자 개수)
			int sum = a+b+c;
			
			//3, 6, 9가 하나도 없는 경우 원래 숫자 출력
			if (sum==0) {
				number.setText(i+"");
			//3, 6, 9가 하나라도 있으면 개수와 원래 숫자 출력
			} else {
				number.setText("박수"+sum+"번("+i+")");
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

