package ������;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ��ǰ�����2 {

	public static void main(String[] args) {
//		JFrame frame = new JFrame();
//		frame.setSize(300, 300);
//		JButton button1 = new JButton();
//		button1.setText("��ư1�̴�");
//		frame.add(button1);
//		frame.setVisible(true);
		
		//frame -> flow layout -> button / label / textfield -> style:��Ʈ
		
		JFrame f = new JFrame();
		f.setSize(500, 150);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton();
		b1.setText("���� ��ư1");
		JButton b2 = new JButton();
		b2.setText("���� ��ư2");
		
		JLabel text1 = new JLabel();
		JLabel text2 = new JLabel();
		text1.setText("���̵�");
		text2.setText("�н�����");
		
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		Font font = new Font("�ü�", 1, 20);
		
		text1.setFont(font);
		b1.setFont(font);
		input1.setFont(font);
		text2.setFont(font);
		b2.setFont(font);
		input2.setFont(font);
		
		ImageIcon icon = new ImageIcon("1.jpg");
		
		b1.setIcon(icon);
		f.add(text1);
		f.add(input1);
		f.add(b1);
	
		f.add(text2);
		f.add(input2);
		f.add(b2);
		
		f.setVisible(true);
		
//		JFrame A = new JFrame();
//		A.setSize(300, 600);
//		
//		FlowLayout flay = new FlowLayout();
//		A.setLayout(flay);
//		
//		JButton bb1 = new JButton();
//		JButton bb2 = new JButton();
//		bb1.setText("�ĳĳĳ�");
//		bb2.setText("������");
//		
//		JLabel la = new JLabel();
//		JLabel la2 = new JLabel();
//		la.setText("����");
//		la2.setText("��5��");
//		
//		JTextField in1 = new JTextField(10);
//		JTextField in2 = new JTextField(10);
//		
//		Font ffff = new Font("�ü�ü", 1, 40);
//		la.setFont(ffff);
//		
//		A.add(bb1);
//		A.add(bb2);
//		A.add(la);
//		A.add(la2);
//		A.add(in1);
//		A.add(in2);
//		
//		A.setVisible(true);
		
		
		
		
//
//		JFrame f = new JFrame();
//		f.setSize(500, 150);
//		
//		//���帣���� ������� ��ġ���ִ� ��ǰ�� ���� �����ؼ� ������ ���ƾ� ��.
//		//FlowLayout
//		FlowLayout flow = new FlowLayout();
//		
//		//f�� ���帣���� ��ġ���ִ� ��ǰ�� ���ڴٶ�� ����(����)
//		f.setLayout(flow);
//		
//		JButton b1 = new JButton();
//		b1.setText("���� ��ư1");
//		
//		JButton b2 = new JButton();
//		b2.setText("���� ��ư2");
//		
//		JLabel text1 = new JLabel(); //�۾�
//		text1.setText("���̵�");
//		
//		JLabel text2 = new JLabel(); //�۾�
//		text2.setText("�н�����");
//		
//		//���� �ִ� ��..
//		JTextField input1 = new JTextField(10);
//		JTextField input2 = new JTextField(10);
//		
//		//import�� �ȵ� ��� Font���� ���콺�� �ø���(�Ǵ� F2)
//		//import Font~~�� Ŭ��!!
//		//����Ű�δ� ��Ʈ�� + ����Ʈ + o
//		Font font = new Font("�ü�", 1, 20);
//		
//		text1.setFont(font);
//		input1.setFont(font);
//		b1.setFont(font);
//		text2.setFont(font);
//		input2.setFont(font);
//		b2.setFont(font);
//		
//		b1.setBackground(Color.red); //����
//		b1.setForeground(Color.white); //��ư�� ����, ���ڻ�
//		b2.setBackground(Color.red); //����
//		b2.setForeground(Color.white); //��ư�� ����, ���ڻ�
//		input1.setBackground(Color.red); //����
//		input1.setForeground(Color.white); //��ư�� ����, ���ڻ�
//		input2.setBackground(Color.red); //����
//		input2.setForeground(Color.white); //��ư�� ����, ���ڻ�
//		
//		//no.png ���ϸ��� ���� java02������Ʈ �ٷ� �Ʒ� �ִ� ������ �ν�!
//		ImageIcon icon = new ImageIcon("no.png");
//		ImageIcon icon2 = new ImageIcon("ok.png");
//		
//		b1.setIcon(icon);
//		b2.setIcon(icon2);
//		
//		f.add(text1);
//		f.add(input1);
//		f.add(b1);
//		f.add(text2);
//		f.add(input2);
//		f.add(b2);
//		
//		//�����ִ� ���� �� ������!!
//		f.setVisible(true);
	}

}
