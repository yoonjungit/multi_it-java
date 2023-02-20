package ���;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ƽ���� extends JFrame{
	JLabel count, image, time;
	
	public static void main(String[] args) {
		Ƽ���� ticket = new Ƽ����();
		//��ü ���� �� Ŭ���� �̸��� ������ �޼��带 �ڵ� ȣ��
		//-> ������ / �޼��带 �ڵ�ȣ��
	}
	
	public Ƽ����() {
		//1. ������ ����
		setTitle("Ƽ���� Ÿ�̸�");
		setSize(900, 800);
		getContentPane().setBackground(Color.black);
		
		//2.��Ʈ ����
		Font font = new Font("�ü�", 1, 30);
		
		//3. count : ī��Ʈ, time : ����ð�, image : �̹��� JLabel ���� 
		count = new JLabel();		//���� �� ī��Ʈ
		time = new JLabel();		//���� �ð�
		ImageIcon icon = new ImageIcon("01.png");
		image = new JLabel(icon);	//�̹��� JLabel
		
		//4. count, time ����, ��Ʈ ����
		count.setForeground(Color.white);
		time.setForeground(Color.white);
		count.setFont(font);
		time.setFont(font);
		
		//5. count, time, image �� �߰� �� ��ġ, ��� ���� ����
		add(count,BorderLayout.NORTH);
		add(time,BorderLayout.SOUTH);
		add(image,BorderLayout.CENTER);
		count.setHorizontalAlignment(JLabel.CENTER);
		time.setHorizontalAlignment(JLabel.CENTER);
	
		//6. �� ������ ��ü ���� �� ����
		Ÿ�̸ӽ�����2 time2 = new Ÿ�̸ӽ�����2();
		�̹���������2 image2 = new �̹���������2();
		ī��Ʈ������2 count2 = new ī��Ʈ������2();
		
		count2.start();
		image2.start();
		time2.start();
		
		//7. ���α׷� ������ ���� ���� �� ������ ���̱� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	//��������(Jlabel count, time, image)�� �����ϱ� ���� ���� Ŭ���� ����
	//day15 Game369 ����
	public class ī��Ʈ������2 extends Thread{
		
		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				count.setText("Ƽ���� "+ (500-i) + "�� ��");		//500�� ī��Ʈ
				try {
					Thread.sleep(1000);		//1�� =1000
				} catch (Exception e) {
					System.out.println("cpu ���� ���� ����");
				}
			}
		}
	}
	
	public class Ÿ�̸ӽ�����2 extends Thread{
		
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				Date date = new Date();
				time.setText("���� �ð� >>" + date );
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				System.out.println("cpu ���� ���� ����.");
				}
			}
		}
	}
	
	
	public class �̹���������2 extends Thread {

		@Override
		public void run() {
			String[] images = { "01.png", "02.png", "03.png", "04.png", "05.png"};
			for (int i = 0; i < 500; i++) {
				i = i%5;		//�̹����� �ݺ��� �� �ֵ��� ������ ���� i�� ����
				ImageIcon icon = new ImageIcon(images[i]);
				image.setIcon(icon);
				try {
					Thread.sleep(5000); // 5�� �Ͻ�����
				} catch (Exception e) {
					System.out.println("cpu ���� ���� ����.");
				}
			}
		}
	}

}
