package �������;
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
public class �α��� {
	public static void main(String[] args) {
		// ���� ������� �ʴ� ��ǰ�� ������.
		//Ʋ!!�� �־ �� Ʋ�� ������ �� �ʿ��� ��ǰ�� ����� CPU�� ����!
		//new: Ʋ�� ������ ���� ���
		//new JFrame()�� JFrame�̶�� Ʋ�� �̿��ؼ� ��ǰ�� ����!
		//���� ��ǰ�� ��δ� ram�� ����Ǿ�� �Ǿ�� �Ѵ�.
		//f���� ���� ��ǰ�� �־��ּ���.
		//f���� JFrame�� ����Ǿ�� ��.
		JFrame f = new JFrame();
		f.setSize(350, 500);
		
		//���帣���� ������� ��ġ���ִ� ��ǰ�� ���� �����ؼ� ������ ���ƾ� ��.
		//FlowLayout
		FlowLayout flow = new FlowLayout();
		
		//f�� ���帣���� ��ġ���ִ� ��ǰ�� ���ڴٶ�� ����(����)
		f.setLayout(flow);
		
		JButton b1 = new JButton();
		
		JLabel text1 = new JLabel(); //�۾�
		text1.setText("���̵�");
		
		JLabel text2 = new JLabel(); //�۾�
		text2.setText("�н�����");
		
		JLabel text3 = new JLabel(); //�۾�
//		text3.setText("�α��� ���");
		
		//���� �ִ� ��..
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		//import�� �ȵ� ��� Font���� ���콺�� �ø���(�Ǵ� F2)
		//import Font~~�� Ŭ��!!
		//����Ű�δ� ��Ʈ�� + ����Ʈ + o
		Font font = new Font("�ü�", 1, 20);
		
		text1.setFont(font);
		input1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		
		input1.setBackground(Color.white); //����
		input2.setBackground(Color.white); //����
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = input1.getText();
				String pw = input2.getText();
				if (id.equals("root")&&pw.equals("1234")) {
					JOptionPane.showMessageDialog(f, "�α��� ����");
					ImageIcon icon = new ImageIcon("ok.png");
					text3.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "�α��� ����");
					ImageIcon icon2 = new ImageIcon("no.png");
					text3.setIcon(icon2);
					input1.setText("");
					input2.setText("");
				}
				
				
			}
		});
		
		
		ImageIcon icon = new ImageIcon("�α���.jpg");
		
		b1.setIcon(icon);
		
		f.add(text1);
		f.add(input1);

		f.add(text2);
		f.add(input2);
		f.add(b1);
		f.add(text3);
		
		//�����ִ� ���� �� ������!!
		f.setVisible(true);
	}
}