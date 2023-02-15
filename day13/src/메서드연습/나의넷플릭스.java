package �޼��忬��;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ���ǳ��ø��� {
	
	static int index = 2; //���� index[2]���� ����
	
	public static void main(String[] args) {
		//[1] �迭
		String[] title = {"��Ÿ��ĵ��", "����ǳ��", "���Ű���", "������100","����� ����"};
		String[] img = {"��Ÿ��ĵ��.jpg","����ǳ��.jpg", "���Ű���.jpg","������100.jpg","���������.jpg"};
		int[] rank = {1, 2, 3, 4, 5};
		
		//[2] JOptionPane
		//1. ������
		JFrame f = new JFrame();
		f.setSize(700, 800);
		f.getContentPane().setBackground(Color.black);
		
		//2. ��Ʈ
		Font font = new Font("�ü�", 1, 25);
		Font fontT = new Font("�ü�", 1, 40);
		
		//3. ��
		//(1) top
		JLabel top = new JLabel(title[2]);
		top.setFont(fontT);
		top.setForeground(Color.red);
		top.setHorizontalAlignment(0);
		
		//��ġ��ǰ(��ü)�� �ٲ��� ������ ��跹�̾ƿ��� ����ϵ��� ����
		f.add(top, BorderLayout.NORTH);
		
		//(2) center
		JLabel center = new JLabel("");
		center.setHorizontalAlignment(0);
		center.setFont(font);
		center.setForeground(Color.red);
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.add(center, BorderLayout.CENTER);
		
		//(3) under
		//String.valueOf() : int, double, ... => String���� ��ȯ (������)
		//Integer.parse() : double, String, ... => int�� ��ȯ (�⺻��)
		JLabel under = new JLabel(String.valueOf(rank[2]));
		under.setHorizontalAlignment(0);
		under.setFont(font);
		under.setForeground(Color.red);
		f.add(under, BorderLayout.SOUTH);
		
		//(4) left
		JButton left = new JButton("<<");
		left.setHorizontalAlignment(0);
		left.setFont(font);
		left.setForeground(Color.red);
		left.setBackground(Color.black);
		left.setBorder(null);
		f.add(left, BorderLayout.WEST);

		//�׼�ó�� ��� : �׼Ǳ�� add -> Ŭ���׼��� ���� �� ó���� ��ǰ ���� 
		//				-> ��� ó������ ���� �ڵ�
		left.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//���� �ε������� �ϳ� ���� ����� ������ �� (top, center, under) ����
				if (index==0) {
					index = 4;
				
				} else {
					index--;
				}
				top.setText(title[index]);
				under.setText(rank[index] + "");
				ImageIcon icon = new ImageIcon(img[index]);
				center.setIcon(icon);

			}
		});

		//(5) right
		JButton right = new JButton(">>");
		right.setHorizontalAlignment(0);
		right.setFont(font);
		right.setForeground(Color.red);
		right.setBackground(Color.black);
		right.setBorder(null);
		f.add(right, BorderLayout.EAST);
		
		right.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index==4) {
					index = 0;
				}else {
					index++;
				}
				top.setText(title[index]);
				under.setText(rank[index] + "");
				ImageIcon icon = new ImageIcon(img[index]);
				center.setIcon(icon);
				
			}
		});
		
		//���α׷��� ������ �ڵ� exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		f.setVisible(true);
	}
}
