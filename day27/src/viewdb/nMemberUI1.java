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
	/*	���α׷� ����
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
		//1. ������ ���̾ƿ�, ũ�� ����
		setLayout(new FlowLayout());
		setSize(380, 600);
		getContentPane().setBackground(Color.decode("#E6E6FA"));
		
		//2. �� �߰� (��� ����, ���̵�, ��й�ȣ, �̸�, ��ȭ��ȣ)
		JLabel view = new JLabel("���ϴ� ����� �����ϼ���");
		
		JLabel id1 = new JLabel("���̵�");
		JLabel pw1 = new JLabel("��й�ȣ");
		JLabel name1 = new JLabel("�̸�");
		JLabel tel1 = new JLabel("��ȭ��ȣ");
		
		//3. �Է� �ʵ�(���̵�, ��й�ȣ, �̸�, ��ȭ��ȣ)
		id = new JTextField(10);
		pw = new JTextField(10);
		name = new JTextField(10);
		tel = new JTextField(10);
		
		//4-1. ��ư : �ʱ�ȭ�鿡�� ���̴� ��� �װ��� (��ư ���� �� �ʿ��� �Է� �ʵ� ����)
		JButton join1 = new JButton("ȸ�� ����");
		JButton update1 = new JButton("��й�ȣ �缳��");
		JButton search1 = new JButton("ȸ�� �˻�");
		JButton delete1 = new JButton("ȸ�� Ż��Ф�");
		
		//4-2. ��ư : ������ ������� �Ѿ�� �� db�� �����͸� �ѱ�� ���� ��ư
		join = new JButton("ȸ�� ����");
		update = new JButton("��й�ȣ �缳��");
		search = new JButton("ȸ�� �˻�");
		delete = new JButton("ȸ�� Ż��Ф�");
		
		//4-3. ��ư : Ȩ���� ���ư���
		JButton home = new JButton("���ư���");
		
		//5-1. ��ư ��� : �޴� �� ��ư(4-1��ư)
		join1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setText("ȸ������");
				
				// ��� ���̱� (��, �ؽ�Ʈ�ʵ�)
				id1.setVisible(true);id.setVisible(true);
				pw1.setVisible(true);pw.setVisible(true);
				name1.setVisible(true);name.setVisible(true);
				tel1.setVisible(true);tel.setVisible(true);

				//��� ���̱�(��ư)
				join.setVisible(true);
				home.setVisible(true);

				//��� �����(�޴� ��ư)
				join1.setVisible(false);update1.setVisible(false);
				search1.setVisible(false);delete1.setVisible(false);
			}
		});
		
		update1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setText("��й�ȣ ����");

				// ��� ���̱� (��, �ؽ�Ʈ�ʵ�)
				id1.setVisible(true);id.setVisible(true);
				pw1.setVisible(true);pw.setVisible(true);

				//��� ���̱�(��ư)
				update.setVisible(true);
				home.setVisible(true);

				//��� �����(�޴� ��ư)
				join1.setVisible(false);update1.setVisible(false);
				search1.setVisible(false);delete1.setVisible(false);
			}
		});
		
		search1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setText("ȸ���˻�");

				// ��� ���̱� (��, �ؽ�Ʈ�ʵ�)
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
				view.setText("Ż��");

				// ��� ���̱� (��, �ؽ�Ʈ�ʵ�)
				id1.setVisible(true);id.setVisible(true);

				delete.setVisible(true);
				home.setVisible(true);
				
				join1.setVisible(false);update1.setVisible(false);
				search1.setVisible(false);delete1.setVisible(false);
			}
		});
		
		//5-2. ��ư ��� : DAO ����, ������ ó��(4-2��ư)
		join.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//�ؽ�Ʈ�ʵ� �Է°� ��������
				String id2 = id.getText();
				String pw2 = pw.getText();
				String name2 = name.getText();
				String tel2 = tel.getText();
				
				//���� �� �ʵ�� �� ���� ������ �˸�â ����
				if (id2.equals("") || pw2.equals("") || name2.equals("") || tel2.equals("")) {
					JOptionPane.showMessageDialog(null, "�ʵ带 ä���ּ���");
				}
				// �����Ͱ� �� ä�������� DAO�� ������  ����
				else {
					memberDAO2 mem = new memberDAO2();
					int result = mem.insert(id2, pw2, name2, tel2);
					
					//DAO���� ������ ó�� ��� ó���� �������� ���� 1�̸� ����, �׿��̸�(0) ����
					if (result == 1) {
						System.out.println("ȸ������ ����");
					} else {
						System.out.println("ȸ������ ����");
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
					JOptionPane.showMessageDialog(null, "�ʵ带 ä���ּ���");
				} else {
					memberDAO2 mem = new memberDAO2();
					int result = mem.update(pw2, id2);
					if (result == 1) {
						System.out.println("��й�ȣ ���� ����");
					} else {
						System.out.println("��й�ȣ ���� ����");
					}
				}
			}
		});
		search.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//���� Select ���� ó�� ���� X
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
					JOptionPane.showMessageDialog(null, "�ʵ带 ä���ּ���");
				} else {
					memberDAO2 mem = new memberDAO2();
					int result = mem.delete(id2);
					if (result == 1) {
						System.out.println("Ż�� �Ϸ�..��");
					} else {
						System.out.println("Ż�� ����");
					}
				}
			}
		});
		
		//5-3. ��ư ���(4-3��ư)
		home.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setText("���ϴ� ����� �����ϼ���");
				
				//�ؽ�Ʈ�ʵ� ����
				id.setText("");pw.setText("");name.setText("");tel.setText("");
				
				//�ʿ����� ���� ��� ����� (��, �ؽ�Ʈ�ʵ�, ������ ó��, Ȩ��ư)
				id1.setVisible(false);id.setVisible(false);
				pw1.setVisible(false);pw.setVisible(false);
				name1.setVisible(false);name.setVisible(false);
				tel1.setVisible(false);tel.setVisible(false);
				
				join.setVisible(false);update.setVisible(false);
				search.setVisible(false);delete.setVisible(false);
				
				home.setVisible(false);
				
				//�ʿ��� ��� ���̱�(�޴� ��ư)
				join1.setVisible(true);update1.setVisible(true);
				search1.setVisible(true);delete1.setVisible(true);	
			}
		});
		
		//6. ��� ��Ʈ ����
		Font font = new Font("������", 1, 20);
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
		
		//7. ��� ���� ����
		join.setBackground(Color.cyan);
		join1.setBackground(Color.cyan);
		update.setBackground(Color.yellow);
		update1.setBackground(Color.yellow);
		search.setBackground(Color.decode("#7B68EE"));
		search1.setBackground(Color.decode("#7B68EE"));
		delete.setBackground(Color.decode("#FFB6C1"));
		delete1.setBackground(Color.decode("#FFB6C1"));
		home.setBackground(Color.decode("#DB7093"));
		
		//8. ��� ��ġ, ũ�� ����
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
		
		//9. ��� �����ӿ� �߰�
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
		
		//10. �ʱ�ȭ�� ��� ���̱� ����
		id1.setVisible(false);id.setVisible(false);
		pw1.setVisible(false);pw.setVisible(false);
		name1.setVisible(false);name.setVisible(false);
		tel1.setVisible(false);tel.setVisible(false);
		
		join.setVisible(false);update.setVisible(false);
		search.setVisible(false);delete.setVisible(false);
		
		home.setVisible(false);
		
		//11. ������ ������ ���α׷� ���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//12. ������ ���̱�
		setVisible(true);
	}
	
}
