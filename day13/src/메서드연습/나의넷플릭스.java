package ?????;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ?????? {
	
	static int index = 2; //index ?? ??(??? 2, ???)
	
	public static void main(String[] args) {
		//[1] ??? ???? ?? ??, ???, ??
		String[] title = {"?????", "????", "????", "???100","?????"};
		String[] img = {"?????.jpg","????.jpg", "????.jpg","???100.jpg","?????.jpg"};
		int[] rank = {1, 2, 3, 4, 5};
		
		//[2] JOptionPane
		//1. ??? ??
		JFrame f = new JFrame();
		f.setSize(700, 800);
		f.getContentPane().setBackground(Color.black);
		
		//2. ??
		Font font = new Font("??", 1, 25);
		Font fontT = new Font("??", 1, 40);
		
		//3. ?? ??? - ??, ??? ?, ??? ??, ?? ?? 
		//(1) top
		JLabel top = new JLabel(title[2]);
		top.setFont(fontT);
		top.setForeground(Color.red);
		top.setHorizontalAlignment(0);
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
		//String.valueOf() : int, double, ... => String?? ??
		//Integer.parse() : double, String, ... => int? ??
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

		//?? ?? ?? ? : ?? ?? ex)3->2 ? ??
		left.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//?? 1???? ?? ? -> 5??? ??
				if (index==0) {
					index = 4;
				//? ? ?? ?? ??? ??
				} else {
					index--;
				}
				//???, ??, ??? ? ? ??
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
		
		//??? ?? ?? ? : ?? ?? ex)3->4 ? ??
		right.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//5???? ??? ?? ?? ? 1??? ??
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
		
		//??? ??? ???? ?? ??
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		f.setVisible(true);
	}
}
