package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 일기장쓰기 {
	//멤버변수 - 안써도 됨.
	//멤버 메서드 

	public void open() {
		// jframe화면이 보이게 하자.!!기능을 정의하도록함.
		// System.out.println("화면이 open될거예요..");
		JFrame f = new JFrame();
		f.setTitle("내 일기장 작성화면");
		f.setSize(500, 800);
		f.getContentPane().setBackground(Color.yellow);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("궁서", 1, 30);
		
		JLabel day = new JLabel("오늘의 날짜: ");
		JLabel title = new JLabel("오늘의 제목: ");
		JLabel content = new JLabel("오늘의 내용: ");
		day.setFont(font);
		title.setFont(font);
		content.setFont(font);
		
		JTextField dayText = new JTextField(10);
		JTextField titleText = new JTextField(10);
		dayText.setHorizontalAlignment(JTextField.CENTER);
		titleText.setHorizontalAlignment(JTextField.CENTER);
		dayText.setFont(font);
		titleText.setFont(font);
		
		JTextArea contentText = new JTextArea(10, 10);
		contentText.setFont(font);
		
		JButton btn = new JButton("파일에 일기 저장");
		btn.setFont(font);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String day2 = dayText.getText();
				String title2 = titleText.getText();
				String content2 = contentText.getText();
				System.out.println(day2 + " " + title2 + " " + content2);
				
				//데이터를 파일로 만들어주고 자바 프로그램과 file간의 연결통로를 만듦
				
				//외부에 있는 파일, 네트워크나 cpu 등을 자바에서 연결할 때는
				//아주 위험한 상황이라고 인식함.
				//따라서 위험한 상황에서는 문제가 발생하며 어떻게 처리할지 써줘야 함.
				
				try {
					FileWriter file = new FileWriter(day2 + ".txt");
					file.write(day2 + "\n");
					file.write(title2 + "\n");
					file.write(content2 + "\n");
					file.close();
				} catch (IOException e1) {
					System.out.println("파일로 저장하는 중 문제 발생");
				}
			}
		});
		
		
		f.add(day);f.add(dayText);
		f.add(title);f.add(titleText);
		f.add(content);f.add(contentText);
		f.add(btn);
		
		f.setVisible(true);
		
		
	}
}
