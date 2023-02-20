package 상속;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestCar1 extends JFrame {
	
	public static void main(String[] args) {
		TestCar1 f = new TestCar1();
	}
	public TestCar1() {
		setTitle("나의 자동차 경주 게임");
		setSize(1000, 500);
		setLayout(null);
		
		MyThread2 car1 = new MyThread2("car01.png", 100, 0);
		MyThread2 car2 = new MyThread2("car02.png", 100, 150);
		MyThread2 car3 = new MyThread2("car03.png", 100, 300);
		
		car1.start();
		car2.start();
		car3.start();
		
		setVisible(true);
	}
	public class MyThread2 extends Thread {
		int x, y;
		JLabel label;
		public MyThread2(String file, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 150, 150);
			add(label);
		}
		@Override
		public void run() {
			// 동시에 실행하고 싶은 내용!!
			// 모든 스레드가 오른쪽으로 움직이고 싶음
			// 화면에서는 x
			Random r = new Random();
			for (int i = 0; i < 200; i++) {
				int move = r.nextInt(50); // 0~49 이동
				x = x + move;
				//System.out.println(x);
				label.setBounds(x, y, 150, 150); // 다시 위치 조정
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}
		}
	}
}