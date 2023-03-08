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
import javax.swing.JTextField;

import javadb.memberDAO2;

public class nMemberUI1 extends JFrame{
	/*	프로그램 구조
	 * 	UI, DTO : viewdb/nMemberUI1.java
	 * 			javadb/memberDTO2.java
	 * 	DAO : javadb/memberDAO2.java
	 */
	JTextField id, pw, name, tel;
	JButton join, update, delete, search;
	
	public static void main(String[] args) {
		nMemberUI1 n = new nMemberUI1();
	}

	public nMemberUI1() {
		//1. 프레임 레이아웃, 크기 설정
		setLayout(new FlowLayout());
		setSize(380, 600);
		getContentPane().setBackground(Color.decode("#E6E6FA"));
		
		//2. 라벨 추가 (기능 선택, 아이디, 비밀번호, 이름, 전화번호)
		JLabel view = new JLabel("원하는 기능을 선택하세요");
		
		JLabel id1 = new JLabel("아이디");
		JLabel pw1 = new JLabel("비밀번호");
		JLabel name1 = new JLabel("이름");
		JLabel tel1 = new JLabel("전화번호");
		
		//3. 입력 필드(아이디, 비밀번호, 이름, 전화번호)
		id = new JTextField(10);
		pw = new JTextField(10);
		name = new JTextField(10);
		tel = new JTextField(10);
		
		//4-1. 버튼 : 초기화면에서 보이는 기능 네가지 (버튼 선택 후 필요한 입력 필드 나옴)
		JButton join1 = new JButton("회원 가입");
		JButton update1 = new JButton("비밀번호 재설정");
		JButton search1 = new JButton("회원 검색");
		JButton delete1 = new JButton("회원 탈퇴ㅠㅠ");
		
		//4-2. 버튼 : 각각의 기능으로 넘어갔을 때 db로 데이터를 넘기기 위한 버튼
		join = new JButton("회원 가입");
		update = new JButton("비밀번호 재설정");
		search = new JButton("회원 검색");
		delete = new JButton("회원 탈퇴ㅠㅠ");
		
		//4-3. 버튼 : 홈으로 돌아가기
		JButton home = new JButton("돌아가기");
		
		//5-1. 버튼 기능 : 메뉴 선 버튼(4-1버튼)
		join1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setText("회원가입");
				
				// 요소 보이기 (라벨, 텍스트필드)
				id1.setVisible(true);id.setVisible(true);
				pw1.setVisible(true);pw.setVisible(true);
				name1.setVisible(true);name.setVisible(true);
				tel1.setVisible(true);tel.setVisible(true);

				//요소 보이기(버튼)
				join.setVisible(true);
				home.setVisible(true);

				//요소 숨기기(메뉴 버튼)
				join1.setVisible(false);update1.setVisible(false);
				search1.setVisible(false);delete1.setVisible(false);
			}
		});
		
		update1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setText("비밀번호 수정");

				// 요소 보이기 (라벨, 텍스트필드)
				id1.setVisible(true);id.setVisible(true);
				pw1.setVisible(true);pw.setVisible(true);

				//요소 보이기(버튼)
				update.setVisible(true);
				home.setVisible(true);

				//요소 숨기기(메뉴 버튼)
				join1.setVisible(false);update1.setVisible(false);
				search1.setVisible(false);delete1.setVisible(false);
			}
		});
		
		search1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setText("회원검색");

				// 요소 보이기 (라벨, 텍스트필드)
				id1.setVisible(true);id.setVisible(true);
				pw1.setVisible(true);pw.setVisible(true);
				name1.setVisible(true);name.setVisible(true);
				tel1.setVisible(true);tel.setVisible(true);
				
				search.setVisible(true);
				home.setVisible(true);
				
				join1.setVisible(false);update1.setVisible(false);
				search1.setVisible(false);delete1.setVisible(false);
			}
		});
		
		delete1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setText("탈퇴");

				// 요소 보이기 (라벨, 텍스트필드)
				id1.setVisible(true);id.setVisible(true);

				delete.setVisible(true);
				home.setVisible(true);
				
				join1.setVisible(false);update1.setVisible(false);
				search1.setVisible(false);delete1.setVisible(false);
			}
		});
		
		//5-2. 버튼 기능 : DAO 연결, 데이터 처리(4-2버튼)
		join.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//텍스트필드 입력값 가져오기
				String id2 = id.getText();
				String pw2 = pw.getText();
				String name2 = name.getText();
				String tel2 = tel.getText();
				
				//만약 한 필드라도 빈 곳이 있으면 알림창 띄우기
				if (id2.equals("") || pw2.equals("") || name2.equals("") || tel2.equals("")) {
					JOptionPane.showMessageDialog(null, "필드를 채워주세요");
				}
				// 데이터가 다 채워졌으면 DAO에 데이터  전송
				else {
					memberDAO2 mem = new memberDAO2();
					int result = mem.insert(id2, pw2, name2, tel2);
					
					//DAO에서 데이터 처리 결과 처리된 데이터의 수가 1이면 성공, 그외이면(0) 실패
					if (result == 1) {
						System.out.println("회원가입 성공");
					} else {
						System.out.println("회원가입 실패");
					}
				}
			}
		});
		update.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id2 = id.getText();
				String pw2 = pw.getText();
				
				if (id2.equals("") || pw2.equals("")) {
					JOptionPane.showMessageDialog(null, "필드를 채워주세요");
				} else {
					memberDAO2 mem = new memberDAO2();
					int result = mem.update(pw2, id2);
					if (result == 1) {
						System.out.println("비밀번호 변경 성공");
					} else {
						System.out.println("비밀번호 변경 실패");
					}
				}
			}
		});
		search.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//아직 Select 구문 처리 구현 X
//				String id2 = id.getText();
//				String pw2 = pw.getText();
//				String name2 = name.getText();
//				String tel2 = tel.getText();
			
			}
		});
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id2 = id.getText();
				
				if (id2.equals("")) {
					JOptionPane.showMessageDialog(null, "필드를 채워주세요");
				} else {
					memberDAO2 mem = new memberDAO2();
					int result = mem.delete(id2);
					if (result == 1) {
						System.out.println("탈퇴 완료..ㅠ");
					} else {
						System.out.println("탈퇴 실패");
					}
				}
			}
		});
		
		//5-3. 버튼 기능(4-3버튼)
		home.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setText("원하는 기능을 선택하세요");
				
				//텍스트필드 비우기
				id.setText("");pw.setText("");name.setText("");tel.setText("");
				
				//필요하지 않은 요소 숨기기 (라벨, 텍스트필드, 데이터 처리, 홈버튼)
				id1.setVisible(false);id.setVisible(false);
				pw1.setVisible(false);pw.setVisible(false);
				name1.setVisible(false);name.setVisible(false);
				tel1.setVisible(false);tel.setVisible(false);
				
				join.setVisible(false);update.setVisible(false);
				search.setVisible(false);delete.setVisible(false);
				
				home.setVisible(false);
				
				//필요한 요소 보이기(메뉴 버튼)
				join1.setVisible(true);update1.setVisible(true);
				search1.setVisible(true);delete1.setVisible(true);	
			}
		});
		
		//6. 요소 폰트 설정
		Font font = new Font("새굴림", 1, 20);
		view.setFont(font);
		id1.setFont(font);pw1.setFont(font);
		name1.setFont(font);tel1.setFont(font);
		
		id.setFont(font);pw.setFont(font);
		name.setFont(font);tel.setFont(font);
		
		join1.setFont(font);update1.setFont(font);
		search1.setFont(font);delete1.setFont(font);
		
		join.setFont(font);update.setFont(font);
		search.setFont(font);delete.setFont(font);
		
		home.setFont(font);
		
		//7. 요소 배경색 설정
		join.setBackground(Color.cyan);
		join1.setBackground(Color.cyan);
		update.setBackground(Color.yellow);
		update1.setBackground(Color.yellow);
		search.setBackground(Color.decode("#7B68EE"));
		search1.setBackground(Color.decode("#7B68EE"));
		delete.setBackground(Color.decode("#FFB6C1"));
		delete1.setBackground(Color.decode("#FFB6C1"));
		home.setBackground(Color.decode("#DB7093"));
		
		//8. 요소 위치, 크기 설정
		view.setHorizontalAlignment(JLabel.CENTER);
		view.setPreferredSize(new Dimension(300, 200));

		id1.setPreferredSize(new Dimension(150, 30));
		id.setPreferredSize(new Dimension(150, 30));
		pw1.setPreferredSize(new Dimension(150, 30));
		pw.setPreferredSize(new Dimension(150, 30));
		name1.setPreferredSize(new Dimension(150, 30));
		name.setPreferredSize(new Dimension(150, 30));
		tel1.setPreferredSize(new Dimension(150, 30));
		tel.setPreferredSize(new Dimension(150, 30));
		
		join1.setPreferredSize(new Dimension(250, 30));
		update1.setPreferredSize(new Dimension(250, 30));
		search1.setPreferredSize(new Dimension(250, 30));		
		delete1.setPreferredSize(new Dimension(250, 30));
		
		join.setPreferredSize(new Dimension(250, 30));
		update.setPreferredSize(new Dimension(250, 30));
		search.setPreferredSize(new Dimension(250, 30));		
		delete.setPreferredSize(new Dimension(250, 30));

		home.setPreferredSize(new Dimension(250, 30));
		
		//9. 요소 프레임에 추가
		add(view);
		
		add(id1);add(id);
		add(pw1);add(pw);
		add(name1);add(name);
		add(tel1);add(tel);
		
		add(join1);add(update1);
		add(search1);add(delete1);
		
		add(join);add(update);
		add(search);add(delete);

		add(home);
		
		//10. 초기화면 요소 보이기 설정
		id1.setVisible(false);id.setVisible(false);
		pw1.setVisible(false);pw.setVisible(false);
		name1.setVisible(false);name.setVisible(false);
		tel1.setVisible(false);tel.setVisible(false);
		
		join.setVisible(false);update.setVisible(false);
		search.setVisible(false);delete.setVisible(false);
		
		home.setVisible(false);
		
		//11. 프레임 닫으면 프로그램 실행 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//12. 프레임 보이기
		setVisible(true);
	}
	
}
