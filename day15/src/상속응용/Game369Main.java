package �������;

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

public class Game369Main {
	static int ans;
	
	public static void main(String[] args) {
		
		//1. ������
		JFrame f = new JFrame("3 6 9 Game");
		f.setSize(500, 500);
		f.setLayout(new FlowLayout());

		// 2. ��Ʈ ����
		Font fontAsk = new Font("�ü�", 1, 20);
		Font fontMain = new Font("�ü�", 1, 50);

		// 3. ���̾ƿ�
		// 3-1. ���� ���� �ð� �Է�
		JLabel ask = new JLabel("3 6 9 ������ �󸶵��� �÷��� �Ͻðڽ��ϱ�?");
		ask.setPreferredSize(new Dimension(500, 50));
		ask.setHorizontalAlignment(JLabel.CENTER);
		ask.setFont(fontAsk);

		JTextField answer = new JTextField(10);
		answer.setFont(fontAsk);

		JButton start = new JButton("����");
		start.setFont(fontAsk);

		// 3-2. ���� ����
		JLabel number = new JLabel("GAME");
		JLabel clap = new JLabel();

		number.setPreferredSize(new Dimension(500, 50));
		number.setHorizontalAlignment(JLabel.CENTER);
		number.setForeground(Color.red);
		number.setFont(fontMain);
		
		//4. ���۹�ư �׼�
		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ans = Integer.parseInt(answer.getText());
					Game369 game = new Game369(ans, number);
					game.start();
					Game369img img = new Game369img(ans, clap);
					img.start();
					//��ü ������ ���� �Լ��� �ƴ� ActionListener���� �ϹǷ�, ans, number, clap���� ������ �����ϱ� ���ؼ� ������ �̿�
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(f, "������ �Է����ּ���");
				}
			}
		});
		
		//5. ��� �����ӿ� �߰�
		f.add(ask);
		f.add(answer);
		f.add(start);
		f.add(number);
		f.add(clap);
		
		//6. 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//â ������ ���α׷� ����
		f.setVisible(true);		//������ �����ֱ�
	}
}
