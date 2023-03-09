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
		//1. ������ ����
		setSize(350, 350);
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.decode("#E6E6FA"));
		
		//2. �� ����
		JLabel title = new JLabel("�α��� ȭ��");
		JLabel id1 = new JLabel("ID �Է�");
		JLabel pw1 = new JLabel("PW �Է�");
		
		//3. �Է�ĭ ����
		JTextField id = new JTextField(10);
		JPasswordField pw = new JPasswordField(10);		//�н����� �ʵ�
		
		//4. �α��� ��ư
		JButton login = new JButton("�α���");
		login.setBackground(Color.decode("#FFB6C1"));
		
		//5. �α��� ��ư ���(Ŭ����)
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//�Է��� id, pw �ޱ�
				String id2 = id.getText();
				String pw2 = String.valueOf(pw.getPassword());
				
				//VO ��ü ���� �� DAO�� SELECT����
				MemberVO bag = new MemberVO();		//DAO������ ���� VO��ü
				bag.setId(id2);
				
				memberDAO4 dao = new memberDAO4();	//DAO������ ���� DAO ��ü
				MemberVO result = dao.search(bag);	//����� �ޱ� ���� VO ��ü
				
				//��� VO���� ���̵�� ��й�ȣ �����͸� ����(������ �����ʹ� �ʿ� x)
				String id3 = result.getId();
				String pw3 = result.getPw();
				
				//���̵�� ��й�ȣ �Ѵ� �Է��� ���� ���ٸ� �α��� ����, �ٸ��� ����
				if (id3.equals(id2) && pw3.equals(pw2)) {
					JOptionPane.showMessageDialog(null, "�α��� ����");
				} else {
					JOptionPane.showMessageDialog(null, "�α��� ����");
				}
			}
		});
		
		//6. ��Ʈ ����
		Font font = new Font("���� ���", 1, 20);
		title.setFont(font);
		id1.setFont(font);
		id.setFont(font);
		pw1.setFont(font);
		pw.setFont(font);
		
		//7. ��� ũ�� ����
		title.setPreferredSize(new Dimension(250, 60));
		id1.setPreferredSize(new Dimension(130, 30));
		id.setPreferredSize(new Dimension(150, 30));
		pw1.setPreferredSize(new Dimension(130, 30));
		pw.setPreferredSize(new Dimension(150, 30));
		login.setPreferredSize(new Dimension(150, 30));
		
		//8. �� ��� ����
		title.setHorizontalAlignment(JLabel.CENTER);
		id1.setHorizontalAlignment(JLabel.CENTER);
		pw1.setHorizontalAlignment(JLabel.CENTER);

		//9. ��� �����ӿ� �߰�
		add(title);
		add(id1); add(id); add(pw1); add(pw);
		add(login);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//������ ���� �� ���α׷� ���� ����
		setVisible(true);
	}
}
