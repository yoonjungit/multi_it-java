package �迭����;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ���忹�Žý��� {

	public static void main(String[] args) {
		//1. �����Ӽ���
		JFrame f = new JFrame();
		f.setTitle("���忹�Žý���");
		// -> JFrame f = new JFrame("���忹�Žý���"); 
		f.setSize(1200, 800);
		f.getContentPane().setBackground(Color.black);
		FlowLayout layOut = new FlowLayout();
		f.setLayout(layOut);
		
		//2. ��Ʈ
		Font font = new Font("�ü�",Font.BOLD,20);
		
		//3. ��ư ����
		JButton[] btn = new JButton[150];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i+1 +"");		//�̶� int�� ��ȣ �ȿ� ���� �� �����Ƿ� i�� String "" �߰�
			btn[i].setFont(font);
			btn[i].setBackground(Color.cyan);
			f.add(btn[i]);
		}
		
		//4. ���õ� �¼� �� �߰�
		JLabel choose = new JLabel("������ �¼� >>");
		choose.setFont(font);
		choose.setForeground(Color.yellow);
		f.add(choose);
		
		//5. �¼� ���� �Ϸ� ���� �迭 �� ��
		int[] reserved = new int[150];
		JLabel reserve = new JLabel();
		reserve.setFont(font);
		reserve.setForeground(Color.white);
		f.add(reserve);
	
		//6. ��ư �׼� ����
		for (int i = 0; i < btn.length; i++) {
			btn[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String text = e.getActionCommand();		// Ŭ���� ��ư�� ����(text)�� ������ ��
					choose.setText("������ �¼� >> " + text);
					int num = Integer.parseInt(text);
					
					//������ �¼� ���� ����
					btn[num-1].setBackground(Color.red);
					
					//�̹� ���õ� �¼� Ŭ�� �Ұ�
					//btn[num-1].setEnabled(false);
					
					//reserved�迭���� ���డ�ɿ��� Ȯ��
					if (reserved[num-1]==0) {
						reserve.setText("���� �����մϴ�.");
						reserved[num-1] = 1;
					} else {
						reserve.setText("�̹� ���õ� �¼��Դϴ�.");
					}
				}
			});
		}
		
		//7. ���� ��Ȳ ����
		JButton total = new JButton("���� ��Ȳ");
		total.setBackground(Color.white);
		total.setFont(font);
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int sum = 0;
				for (int i = 0; i < reserved.length; i++) {
					sum+= reserved[i];
				}
				JOptionPane.showMessageDialog(f, "���� "+sum+"�� ���� �Ϸ� >> "+(sum*10000)+"�� ����");
				
			}
		});
		
		f.add(total);
		
		f.setVisible(true);
		
	}

}
