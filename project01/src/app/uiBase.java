package app;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class uiBase extends JFrame{
	JButton search, ranking, mypage;
	JLabel lineUnder;
	public static void main(String[] args) {
		uiBase ui = new uiBase();
	}
	
	public uiBase() {
		//1. ������ ����
		setTitle("�������");
		setSize(360, 640);
		setLayout(null);
		getContentPane().setBackground(Color.white);
		
		//2. �ϴ� �޴� �̵� ��ư ���� ����
		lineUnder = new JLabel("��������������������������������������������������");
		lineUnder.setForeground(Color.decode("#E74C3C"));
		lineUnder.setBounds(10,530,360,10);
		
		//3. �ϴ� �޴� �̵� ��ư
		search = new JButton();		//���� �˻�
		ranking = new JButton();	//������ŷ
		mypage = new JButton();		//����������
		
		
		
		//3-1. �ϴ� �޴� �̵� ��ư ����
		//���� �˻� �̹���
		ImageIcon image1 = new ImageIcon("search.png");
		Image img1 = image1.getImage();
		Image setsize = img1.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
		ImageIcon searchIcon = new ImageIcon(setsize);
		search.setIcon(searchIcon);
		
		//������ŷ �̹���
		ImageIcon image2 = new ImageIcon("rank.png");
		Image img2 = image2.getImage();
		Image setsize2 = img2.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
		ImageIcon rankIcon = new ImageIcon(setsize2);
		ranking.setIcon(rankIcon);
		
		//���������� �̹���
		ImageIcon image3 = new ImageIcon("mypage.png");
		Image img3 = image3.getImage();
		Image setsize3 = img3.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
		ImageIcon mypageIcon = new ImageIcon(setsize3);
		mypage.setIcon(mypageIcon);
		
		
		search.setBounds(10,550,40,40);
		ranking.setBounds(150,550,40,40);
		mypage.setBounds(290,550,40,40);
		
		search.setBackground(Color.white);
		search.setBorderPainted(false);
		search.setFocusPainted(false);
		
		ranking.setBackground(Color.white);
		ranking.setBorderPainted(false);
		ranking.setFocusPainted(false);
		
		mypage.setBackground(Color.white);
		mypage.setBorderPainted(false);
		mypage.setFocusPainted(false);
		
		
		//��� �߰�
		add(lineUnder);
		add(search);
		add(ranking);
		add(mypage);
		
		//������ ���� �� ���α׷� ���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		//������ ���̱�
	}
	
}