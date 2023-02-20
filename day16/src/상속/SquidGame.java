package ���;

import java.awt.Color;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SquidGame extends JFrame {
	JLabel tagger;
	static int alive;

	public static void main(String[] args) {
		SquidGame g = new SquidGame();
	}

	public SquidGame() {
		setTitle("Red Light, Green Light");
		setSize(1500, 700);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);

		Play gihoon = new Play("player1.jpg", 0, 150);
		Play saebyeok = new Play("player2.jpg", 0, 250);
		Play sangwoo = new Play("player3.png", 0, 350);

		tagger = new JLabel();
		ImageIcon ic = new ImageIcon("greenlight.jpg");
		tagger.setIcon(ic);
		tagger.setBounds(1000, 50, 120, 70);
		add(tagger);

		gihoon.start();
		saebyeok.start();
		sangwoo.start();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public class Play extends Thread {
		int x, y;
		JLabel label;

		public Play(String file, int x, int y) {
			this.x = x;
			this.y = y;

			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 200, 100);
			add(label);
		}

		@Override
		public void run() {
			Random r = new Random();

			int i = 0;
			while (i<60) {
				if (x>1000) {
					alive++;
					label.setText("Safe");
					label.setBounds(x, y, 300, 100);
					ImageIcon ic = new ImageIcon("redlight.png");
					tagger.setIcon(ic);
					tagger.setBounds(1010, 50, 220, 100);
				} else if (alive>0) {
					label.setText("Uh-oh");
					label.setBounds(x, y, 300, 100);
				}
				else {
					int move = r.nextInt(100); // 0~99 �̵�
					x = x + move;
					// System.out.println(x);
					label.setBounds(x, y, 150, 150); // �ٽ� ��ġ ����
				}
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				i++;
			}
//			while (x<860 && alive==0) {
//				int move = r.nextInt(100);	// move : 0~49 ������ ���� �������� �ޱ�
//				x = x + move; 				// ���� x ���� move ���ϱ�(x ��ǥ �̵�)
//				if (x>=860 || alive ==1) {
//					alive = 1;
//					break;
//				}
//				label.setBounds(x, y, 200, 100);	//�� ��ġ ����
//				try {
//					Thread.sleep(1000);		//1��(1000)���� ª�� �Ͻ����� �ð� ����
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//			if (x>=860) {
//				label.setText("Safe");
//				label.setBounds(0, y, 200, 100);
//				
//				ImageIcon ic = new ImageIcon("redlight.png");
//				tagger.setIcon(ic);
//				tagger.setBounds(50, 0, 220, 100);
//			}else {
//				label.setText("Uh-oh"); // �������� ���� ����� Ż��
//				label.setBounds(0, y, 200, 100);
		}
	}
}
