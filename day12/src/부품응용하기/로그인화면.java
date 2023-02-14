package 부품응용하기;

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

import 부품응용하기.일기장쓰기;

public class 로그인화면 {

	public static void main(String[] args) {
		//font, flowlayout
		//jframe, jlabel(image), imageicon, idlabel,
		//pwlabel, textfield, id입력값, pw입력값
		//로그인, 리셋 버튼
		
		//1. 프레임
		JFrame f = new JFrame("내 일기장 로그인");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.setSize(450, 700);
		f.getContentPane().setBackground(Color.white);
		
		//2. 폰트
		Font font = new Font("궁서", 1, 30);
		
		//3. 아이디, 비밀번호 라벨, 입력칸
		JLabel top = new JLabel();
		JLabel id = new JLabel("    아  이  디    ");
		JLabel pw = new JLabel("비 밀 번 호");
		id.setFont(font);
		pw.setFont(font);
		JTextField idText = new JTextField(10);
		JTextField pwText = new JTextField(10);
		idText.setFont(font);
		pwText.setFont(font);
		
		//4. 이미지 아이콘 생성
		ImageIcon icon1 = new ImageIcon("diary.png");
		ImageIcon icon2 = new ImageIcon("login.png");
		ImageIcon icon3 = new ImageIcon("reset.png");
		
		//5. 로그인, 리셋 버튼
		JButton login = new JButton();
		JButton reset = new JButton();
		login.setBackground(Color.white);
		reset.setBackground(Color.white);
		
		//6. 이미지 아이콘 삽입
		top.setIcon(icon1);
		login.setIcon(icon2);
		reset.setIcon(icon3);
		
		//7. 버튼 액션기능 추가
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id2 = idText.getText();
				String pw2 = pwText.getText();
				
				if (id2.equals("root") && pw2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공!");
					//일기장쓰기 부품의 open()기능 쓰자!
					일기장쓰기 diary = new 일기장쓰기();
					diary.open();
				}else {
					JOptionPane.showMessageDialog(f, "로그인 실패!");
				}
			}
		});
		
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				idText.setText("");
				pwText.setText("");
			}
		});
		
		// 객체 추가
		f.add(top);
		f.add(id);
		f.add(idText);
		f.add(pw);
		f.add(pwText);
		f.add(login);
		f.add(reset);
		
		
		f.setVisible(true);
	}

}



