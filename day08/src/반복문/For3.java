package �ݺ���;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class For3 {

	public static void main(String[] args) {
		//1. ������ ����
		JFrame frame = new JFrame();
		frame.setSize(300, 500);
		frame.getContentPane().setBackground(Color.blue);
		
		//2. ��ư 4��
		JButton b1 =new JButton();
		JButton b2 =new JButton();
		JButton b3 =new JButton();
		JButton b4 =new JButton();
		b1.setText("��10��");
		b2.setText("Ŀ��*5��");
		b3.setText("Ŀ�ǿ���3��");
		b4.setText("¯3��");
		
		//3. ��Ʈ
		Font font = new Font("�ü�",1,25);
		
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		//4. ���̾ƿ� ����
		FlowLayout f = new FlowLayout();
		frame.setLayout(f);
		
		//5. �����ӿ� ��ư �߰�
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		
		
		// ��ư�׼�
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Ŭ������ �� ó�� ������ ���⿡ ���ּ���!
				System.out.println("b1�� Ŭ������");
				//1. ��ư1
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Ŭ������ �� ó�� ������ ���⿡ ���ּ���!
				System.out.println("b2�� Ŭ������");
				//2. ��ư2
				for (int i = 0; i < 5; i++) {
					System.out.print("Ŀ��*");
				}
				System.out.println("");
				
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Ŭ������ �� ó�� ������ ���⿡ ���ּ���!
				System.out.println("b3�� Ŭ������");
				//3. ��ư3
				for (int j = 0; j < 3; j++) {
					System.out.println("Ŀ��*����");
				}
				
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Ŭ������ �� ó�� ������ ���⿡ ���ּ���!
				System.out.println("b4�� Ŭ������");
				//4. ��ư4
				for (int j = 0; j < 3; j++) {
					System.out.println(j+1 + ": ¯!");
				}
				
			}
		});
		

		frame.setVisible(true);
	}

}
