package Ω∫≈¬∆Ω;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class counter {
	static int count;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("±√º≠", 1, 150);
		
		JLabel number = new JLabel("0");
		number.setFont(font);
		number.setForeground(Color.red);
		number.setText(count+"");
		
		JButton b1 = new JButton("1 ¥ı«œ±‚");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(count+"");
			}
		});
		
		JButton b2 = new JButton("0¿∏∑Œ √ ±‚»≠");
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count=0;
				number.setText(count+"");
			}
		});
		
		
		JButton b3 = new JButton("1 ª©±‚");
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				number.setText(count+"");
			}
		});
		
		b1.setBackground(Color.green);
		b1.setForeground(Color.black);
		b2.setBackground(Color.blue);
		b2.setForeground(Color.white);
		b3.setBackground(Color.green);
		b3.setForeground(Color.black);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(number);
		
		f.setVisible(true);
	}
}
