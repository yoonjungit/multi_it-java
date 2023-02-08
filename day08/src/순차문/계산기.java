
package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 계산기 {
	public static void main(String[] args) {
	JFrame calc = new JFrame();
	calc.setSize(270, 510);
	FlowLayout flay = new FlowLayout();
	calc.setLayout(flay);
	
	JLabel image = new JLabel();
	ImageIcon icon = new ImageIcon("calc.jpg");
	image.setIcon(icon);

	JLabel num1 = new JLabel();
	num1.setText("숫자1");
	JLabel num2 = new JLabel();
	num2.setText("숫자2");
	
	JTextField input1 = new JTextField(20);
	JTextField input2 = new JTextField(20);
	
	JButton button1 = new JButton();
	button1.setText("+");
	JButton button2 = new JButton();
	button2.setText("-");
	JButton button3 = new JButton();
	button3.setText("/");
	JButton button4 = new JButton();
	button4.setText("*");
	
	Font font = new Font("바탕", 1, 20);
	num1.setFont(font);
	num2.setFont(font);
	
	input1.setBackground(Color.blue);
	input1.setForeground(Color.white);
	input2.setBackground(Color.blue);
	input2.setForeground(Color.white);
	
	button1.setBackground(Color.yellow);
	button2.setBackground(Color.yellow);
	button3.setBackground(Color.yellow);
	button4.setBackground(Color.yellow);
	
	calc.add(image);
	calc.add(num1);
	calc.add(input1);
	calc.add(num2);
	calc.add(input2);
	calc.add(button1);
	calc.add(button2);
	calc.add(button3);
	calc.add(button4);
	
	
	button1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String s1 = input1.getText();
			String s2 = input2.getText();
			
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);
			JOptionPane.showMessageDialog(calc, n1+n2);
			
		}
	});
	button2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String s1 = input1.getText();
			String s2 = input2.getText();
			
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);
			JOptionPane.showMessageDialog(calc, n1-n2);
			
		}
	});
	button3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String s1 = input1.getText();
			String s2 = input2.getText();
			
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);
			JOptionPane.showMessageDialog(calc, String.format("%.3f", (double)n1/n2));
			
		}
	});
	button4.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String s1 = input1.getText();
			String s2 = input2.getText();
			
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);
			JOptionPane.showMessageDialog(calc, n1*n2);
			
		}
	});
	
	
	calc.setVisible(true);
	}
}
