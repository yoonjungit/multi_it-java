package �迭����;

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

public class ���忹�Žý���2 {

	public static void main(String[] args) {
		//1. �����Ӽ���
		JFrame f = new JFrame("���忹�Žý���"); 
		f.setSize(1300, 800);
		f.getContentPane().setBackground(Color.black);
		FlowLayout layOut = new FlowLayout();
		f.setLayout(layOut);
		
		//2. ��Ʈ
		Font font = new Font("�ü�",Font.BOLD,20);
		
		//3. ��ũ�� ��ġ ǥ��
		JLabel screen = new JLabel("SCREEN");
		screen.setFont(font);
		screen.setForeground(Color.white);
		screen.setPreferredSize(new Dimension(1250, 30));
		screen.setHorizontalAlignment(JLabel.CENTER);
		f.add(screen);
		
		//4. �¼� ��ư
		JButton[] btn = new JButton[150];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i+1 +"");	
			btn[i].setPreferredSize(new Dimension(80, 30));
			btn[i].setFont(font);
			btn[i].setBackground(Color.cyan);
			f.add(btn[i]);
		}
		
		//5. ������ �¼� �����ֱ� ��
		JLabel choose = new JLabel("������ �¼� >>");
		choose.setPreferredSize(new Dimension(250, 30));
		choose.setFont(font);
		choose.setForeground(Color.yellow);
		f.add(choose);
		
		//5. ������ �¼� ���� ���� �迭 �� ��
		int[] reserved = new int[150];
		JLabel reserve = new JLabel();
		reserve.setFont(font);
		reserve.setForeground(Color.white);
		reserve.setPreferredSize(new Dimension(250, 30));
		f.add(reserve);
	
		//6. ��ư �׼� ����
		for (int i = 0; i < btn.length; i++) {
			btn[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					//�¼� ��ȣ �������� (String)
					String text = e.getActionCommand();	
					choose.setText("������ �¼� >> " + text);
					//�¼� ��ȣ ����ȯ (String -> Int)
					int num = Integer.parseInt(text);
					
					//���� �������� ���� �¼� -> ���� �Ϸ� �� ������ ǥ��
					//�̹� ������ �¼� -> ������� �� cyan�� ����
					if (reserved[num-1]==0) {
						reserve.setText("���ÿϷ�");
						reserved[num-1] = 1;
						btn[num-1].setBackground(Color.red);
					} else {
						reserve.setText("�������");
						btn[num-1].setBackground(Color.cyan);
						reserved[num-1] = 0;
					}
				}
			});
		}
		
		//7. �����ϱ�
		JButton total = new JButton("�����ϱ�");
		total.setBackground(Color.white);
		total.setFont(font);
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int sum = 0;
				for (int i = 0; i < reserved.length; i++) {
					sum+= reserved[i];
				}
				JOptionPane.showMessageDialog(f, "���� "+sum+"�� ���� >> "+"\n"+(sum*10000)+"�� ����");
				
			}
		});
		
		f.add(total);
		
		f.setVisible(true);
		
	}

}