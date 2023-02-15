package �޼��忬��;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class �߱����ֹ� {
	static int index = 0;		// ���� �޴� ��ġ �ε��� ��
	static int totalP = 0;		// �� �ֹ� �ݾ�
	public static void main(String[] args) {
		String[] menu = {"����", "¥���", "«��", "������"};		// ���ΰ� ���� �޴� �迭
		String[] image = {"0.jpg", "1.jpg", "2.jpg", "3.jpg"};		// �̹��� �迭
		String[] price = {"����ʽÿ�", "6000", "7000", "15000"};		// ���� �迭
		int[] stock = {0, 5, 5, 5};		//�ֹ� ���� ����
		int[] count1 = new int[4];		//�� �޴��� �ֹ� ����
		
		//1. ������ ����
		JFrame f = new JFrame("�ϰ����");
		f.setSize(550, 800);
		f.getContentPane().setBackground(Color.red);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		//2. ��Ʈ ��Ÿ�� ����
		Font font = new Font("�ü�", 1, 20);
		Font font2 = new Font("�ü�", 1, 30);		//�޴� ����, �޴� �߰�,���� ��ư ���� ��Ʈ
		
		//3. ��� �޴���
		//3-1. �޴� ��ư (�迭 �ε��� ����)
		JButton home = new JButton(menu[0]);		// ����
		home.setBackground(Color.black);
		home.setForeground(Color.white);
		home.setFont(font);
		
		JButton jjajang = new JButton(menu[1]);		// ¥���
		jjajang.setBackground(Color.black);
		jjajang.setForeground(Color.white);
		jjajang.setFont(font);
		
		JButton jjam = new JButton(menu[2]);		// «��
		jjam.setBackground(Color.black);
		jjam.setForeground(Color.white);
		jjam.setFont(font);
		
		JButton tang = new JButton(menu[3]);		// ������
		tang.setBackground(Color.black);
		tang.setForeground(Color.white);
		tang.setFont(font);
		
		//3-2. �� ���� ��
		JLabel total = new JLabel("�� " + totalP + "��");
		total.setFont(font);
		total.setForeground(Color.white);
		
		//3-3. �����ӿ� �ν��Ͻ� �߰�
		f.add(home);
		f.add(jjajang);
		f.add(jjam);
		f.add(tang);
		f.add(total);
		
		//4. ��� �̹��� ��
		JLabel food = new JLabel();
		ImageIcon foodimage = new ImageIcon(image[0]);
		food.setIcon(foodimage);
		f.add(food);
		
		//5. ���� �޴�(
		//5-1. �޴� ���� (���ο����� �λ縻 ������)
		JLabel price1 = new JLabel(price[0]);
		price1.setFont(font2);
		f.add(price1);
		
		//5-2. �޴� �߰�, ����
		JButton plus = new JButton("+");
		plus.setFont(font2);
		JButton minus = new JButton("-");
		minus.setFont(font2);
		plus.setVisible(false); 		//���ο����� �޴� �߰�, ������ ���ϹǷ� ��ư �Ⱥ��̰� ����
		minus.setVisible(false);
		f.add(plus);
		f.add(minus);
		
		//5-3. �ǽð� �ֹ� ���� �����ֱ�
		JLabel show = new JLabel("¥�� :" + count1[1] + " / «�� : " + count1[2] + " / ������ : " + count1[3]);
		show.setHorizontalAlignment(0);
		show.setPreferredSize(new Dimension(400, 50));
		show.setBackground(Color.white);
		show.setFont(font);
		f.add(show);
		
		//5-4. �ֹ� ��ư
		JButton order = new JButton("�ֹ��ϱ�");
		order.setPreferredSize(new Dimension(400, 50));
		order.setBackground(Color.white);
		order.setFont(font);
		f.add(order);
		
		//6. �� ��ư�� �׼�
		//6-1. ���� Ŭ���� 
		//		->  +,- ��ư �Ⱥ��̰�
		//			image �󺧿� ����ʽÿ� �̹���
		//			price �󺧿� ���� ��� �λ縻(����ʽÿ�)
		home.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				index = 0;
				plus.setVisible(false);
				minus.setVisible(false);
				ImageIcon foodimage = new ImageIcon(image[index]);
				food.setIcon(foodimage);
				price1.setText(price[index]);
			}
		});
		
		//6-2. ¥��� Ŭ����
		//		->  +,- ��ư ���̰�
		//			image �󺧿� ¥��� �̹���
		//			price �󺧿� ¥��� ����
		jjajang.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				index = 1;
				plus.setVisible(true);
				minus.setVisible(true);
				ImageIcon foodimage = new ImageIcon(image[index]);
				food.setIcon(foodimage);
				price1.setText(price[index]);
			}
		});
		
		//6-3. «�� Ŭ����
		jjam.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				index = 2;
				plus.setVisible(true);
				minus.setVisible(true);
				ImageIcon foodimage = new ImageIcon(image[index]);
				food.setIcon(foodimage);
				price1.setText(price[index]);
			}
		});
		
		//6-4. ������ Ŭ����
		tang.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				index = 3;
				plus.setVisible(true);
				minus.setVisible(true);
				ImageIcon foodimage = new ImageIcon(image[index]);
				food.setIcon(foodimage);
				price1.setText(price[index]);
			}
		});
		
		//6-5. + ��ư Ŭ����
		//		->  ���� �޴� �ε����� �ֹ����� +1
		//			�ǽð� �ֹ��ݾ�, �ֹ����� ����
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (count1[index]+1>stock[index]) {
					JOptionPane.showMessageDialog(f, "�ֹ� ���� ������ �ʰ��߽��ϴ�.");
				}else {
					count1[index]++;
					totalP += Integer.parseInt(price[index]);
					total.setText("�� " + totalP + "��");
					show.setText("¥�� :" + count1[1] + " / «�� : " + count1[2] + " / ������ : " + count1[3]);
				}
			}
		});

		//6-6. - ��ư Ŭ����
		//		->  ���� �ֹ����� 0�� ���¿��� Ŭ���� ����ó�� ("�߸��� �����Դϴ�")
		//			�׿� �ֹ����� -1
		//			�ǽð� �ֹ��ݾ�, �ֹ����� ����
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(count1[index]==0) {
					JOptionPane.showMessageDialog(f, "�߸��� �����Դϴ�.");
				}else {
					count1[index]--;
					totalP -= Integer.parseInt(price[index]) ;
					total.setText("�� " + totalP + "��");
					show.setText("¥�� :" + count1[1] + " / «�� : " + count1[2] + " / ������ : " + count1[3]);
				}
			}
		});
		
		//6-7. �ֹ��ϱ� ��ư Ŭ����
		//		->  �ּ� �ֹ� �ݾ�(10,000��) �̸��� ��� �˸�â ���� "�ּ� �ֹ� �ݾ��� 10000�� �Դϴ�."
		//			�׿� �� �ֹ��ݾ� �˸�â ����
		order.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (totalP<10000) {
					JOptionPane.showMessageDialog(f, "�ּ� �ֹ� �ݾ��� 10000�� �Դϴ�.");
				}else {
					JOptionPane.showMessageDialog(f, "�� " + totalP + "�� �Դϴ�.");
				}
				
			}
		});
		
		//7. â ������ ���α׷� ���� ����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//8. ������ visible ����
		f.setVisible(true);
	
	
	}

}
