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

public class kpop�α���ǥ {

	public static void main(String[] args) {
		//1. ������ ����
		JFrame toll = new JFrame();
		toll.setSize(450, 1200);
		//2. ������ ���̾ƿ�
		FlowLayout flow = new FlowLayout();
		toll.setLayout(flow);
		
		//3. �α���ǥ ����
		JLabel kpop = new JLabel();
		kpop.setText("KPOP �α���ǥ");
		
		//4. �� ������ ǥ ī��Ʈ�� ���� ���� ���� (������, ��ź�ҳ��, ������)
		
		
		//5. �� ������ ��ǥ ��ư(�ٹ� ǥ��)
		JButton iuA = new JButton();
		ImageIcon iuAlbum = new ImageIcon("iu.jpg");
		iuA.setIcon(iuAlbum);
		iuA.setBackground(Color.white);
		JButton btsA = new JButton();
		ImageIcon btsAlbum = new ImageIcon("bts.jpg");
		btsA.setIcon(btsAlbum);
		btsA.setBackground(Color.white);
		JButton njA = new JButton();
		ImageIcon njAlbum = new ImageIcon("nj.jpg");
		njA.setIcon(njAlbum);
		njA.setBackground(Color.white);
		
		
		//7. ���� ��
		JLabel iuL = new JLabel();
		JLabel iuLT = new JLabel();
		JLabel btsL = new JLabel();
		JLabel btsLT = new JLabel();
		JLabel njL = new JLabel();
		JLabel njLT = new JLabel();
		
		iuL.setText("1. ������-����");
		btsL.setText("2. BTS - ���̳ʸ���Ʈ");
		njL.setText("3. ������ - ���ټ�");
		

		iuLT.setText("0 ǥ");
		btsLT.setText("0 ǥ");
		njLT.setText("0 ǥ");
			
		//6.��ǥ �� �̺�Ʈ
		iuA.addActionListener(new ActionListener() {
			int iu = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				iu++;
				iuLT.setText(iu +"ǥ");
			}
		});
		btsA.addActionListener(new ActionListener() {
			int bts = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				bts++;
				btsLT.setText(bts +"ǥ");
			}
		});
		njA.addActionListener(new ActionListener() {
			int nj = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				nj++;
				njLT.setText(nj +"ǥ");
			}
		});
		
		

		
		//8. ��Ʈ
		Font font = new Font("�ü�",1,50);
		Font font2 = new Font("����",1, 20);
		
		kpop.setFont(font);
		iuL.setFont(font2);
		iuLT.setFont(font2);
		btsL.setFont(font2);
		btsLT.setFont(font2);
		njL.setFont(font2);
		njLT.setFont(font2);
		
		//9. add
		toll.add(kpop);
		toll.add(iuA);
		toll.add(iuL);
		toll.add(iuLT);
		toll.add(btsA);
		toll.add(btsL);
		toll.add(btsLT);
		toll.add(njA);
		toll.add(njL);
		toll.add(njLT);
		toll.setVisible(true);
	}

}
