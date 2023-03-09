package viewdb;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javadb.memberDAO4;

public class LoginUI extends JFrame{

	public static void main(String[] args) {
		LoginUI l = new LoginUI();
	}
	
	public LoginUI() {
		//1. 프레임 설정
		setSize(350, 350);
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.decode("#E6E6FA"));
		
		//2. 라벨 생성
		JLabel title = new JLabel("로그인 화면");
		JLabel id1 = new JLabel("ID 입력");
		JLabel pw1 = new JLabel("PW 입력");
		
		//3. 입력칸 생성
		JTextField id = new JTextField(10);
		JPasswordField pw = new JPasswordField(10);		//패스워드 필드
		
		//4. 로그인 버튼
		JButton login = new JButton("로그인");
		login.setBackground(Color.decode("#FFB6C1"));
		
		//5. 로그인 버튼 기능(클릭시)
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//입력한 id, pw 받기
				String id2 = id.getText();
				String pw2 = String.valueOf(pw.getPassword());
				
				//VO 객체 생성 후 DAO에 SELECT실행
				MemberVO bag = new MemberVO();		//DAO보내기 위한 VO객체
				bag.setId(id2);
				
				memberDAO4 dao = new memberDAO4();	//DAO실행을 위한 DAO 객체
				MemberVO result = dao.search(bag);	//결과를 받기 위한 VO 객체
				
				//결과 VO에서 아이디와 비밀번호 데이터만 추출(나머지 데이터는 필요 x)
				String id3 = result.getId();
				String pw3 = result.getPw();
				
				//아이디와 비밀번호 둘다 입력한 값과 같다면 로그인 성공, 다르면 실패
				if (id3.equals(id2) && pw3.equals(pw2)) {
					JOptionPane.showMessageDialog(null, "로그인 성공");
				} else {
					JOptionPane.showMessageDialog(null, "로그인 실패");
				}
			}
		});
		
		//6. 폰트 설정
		Font font = new Font("한컴 고딕", 1, 20);
		title.setFont(font);
		id1.setFont(font);
		id.setFont(font);
		pw1.setFont(font);
		pw.setFont(font);
		
		//7. 요소 크기 지정
		title.setPreferredSize(new Dimension(250, 60));
		id1.setPreferredSize(new Dimension(130, 30));
		id.setPreferredSize(new Dimension(150, 30));
		pw1.setPreferredSize(new Dimension(130, 30));
		pw.setPreferredSize(new Dimension(150, 30));
		login.setPreferredSize(new Dimension(150, 30));
		
		//8. 라벨 가운데 정렬
		title.setHorizontalAlignment(JLabel.CENTER);
		id1.setHorizontalAlignment(JLabel.CENTER);
		pw1.setHorizontalAlignment(JLabel.CENTER);

		//9. 요소 프레임에 추가
		add(title);
		add(id1); add(id); add(pw1); add(pw);
		add(login);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//프레임 닫을 시 프로그램 실행 종료
		setVisible(true);
	}
}
