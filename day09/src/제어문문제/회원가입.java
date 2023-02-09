package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 회원가입 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(260, 500);
		FlowLayout f_lay = new FlowLayout();
		f.setLayout(f_lay);
		
		JLabel input1 = new JLabel();
		input1.setText("ID 입력");
		JTextField inputID = new JTextField(20);
		JLabel input2 = new JLabel();
		input2.setText("PW 입력");
		JTextField inputPW = new JTextField(20);
		JLabel input3 = new JLabel();
		input3.setText("이름 입력");
		JTextField inputN = new JTextField(20);
		JLabel input4 = new JLabel();
		input4.setText("전화번호 입력");
		JTextField inputT = new JTextField(20);

		JButton login = new JButton();
		login.setText("회원가입 처리");
		login.setBackground(Color.white);
		Font font = new Font("휴먼매직체",1,20);
		Font font2 = new Font("휴먼매직체",1,30);
		
		input1.setFont(font);
		input2.setFont(font);
		input3.setFont(font);
		input4.setFont(font);
		login.setFont(font2);
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = inputID.getText();
				String pw = inputPW.getText();
				String name = inputN.getText();
				String tel = inputT.getText();
				JOptionPane.showMessageDialog(f, "아이디 : " + id + "\n비밀번호 : " + pw + "\n이름 : " + name + "\n전화번호 : "+tel);
				
			}
		});
		
		
		
		f.add(input1);
		f.add(inputID);
		f.add(input2);
		f.add(inputPW);
		f.add(input3);
		f.add(inputN);
		f.add(input4);
		f.add(inputT);
		f.add(login);
		
		f.setVisible(true);
		
	}

}
