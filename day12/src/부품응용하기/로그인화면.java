package ��ǰ�����ϱ�;

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

import ��ǰ�����ϱ�.�ϱ��徲��;

public class �α���ȭ�� {

	public static void main(String[] args) {
		//font, flowlayout
		//jframe, jlabel(image), imageicon, idlabel,
		//pwlabel, textfield, id�Է°�, pw�Է°�
		//�α���, ���� ��ư
		
		//1. ������
		JFrame f = new JFrame("�� �ϱ��� �α���");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.setSize(450, 700);
		f.getContentPane().setBackground(Color.white);
		
		//2. ��Ʈ
		Font font = new Font("�ü�", 1, 30);
		
		//3. ���̵�, ��й�ȣ ��, �Է�ĭ
		JLabel top = new JLabel();
		JLabel id = new JLabel("    ��  ��  ��    ");
		JLabel pw = new JLabel("�� �� �� ȣ");
		id.setFont(font);
		pw.setFont(font);
		JTextField idText = new JTextField(10);
		JTextField pwText = new JTextField(10);
		idText.setFont(font);
		pwText.setFont(font);
		
		//4. �̹��� ������ ����
		ImageIcon icon1 = new ImageIcon("diary.png");
		ImageIcon icon2 = new ImageIcon("login.png");
		ImageIcon icon3 = new ImageIcon("reset.png");
		
		//5. �α���, ���� ��ư
		JButton login = new JButton();
		JButton reset = new JButton();
		login.setBackground(Color.white);
		reset.setBackground(Color.white);
		
		//6. �̹��� ������ ����
		top.setIcon(icon1);
		login.setIcon(icon2);
		reset.setIcon(icon3);
		
		//7. ��ư �׼Ǳ�� �߰�
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id2 = idText.getText();
				String pw2 = pwText.getText();
				
				if (id2.equals("root") && pw2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "�α��� ����!");
					//�ϱ��徲�� ��ǰ�� open()��� ����!
					�ϱ��徲�� diary = new �ϱ��徲��();
					diary.open();
				}else {
					JOptionPane.showMessageDialog(f, "�α��� ����!");
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
		
		// ��ü �߰�
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



