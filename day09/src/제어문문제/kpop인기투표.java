package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class kpop인기투표 {

	public static void main(String[] args) {
		//1. 프레임 설정
		JFrame toll = new JFrame();
		toll.setSize(450, 1200);
		//2. 프레임 레이아웃
		FlowLayout flow = new FlowLayout();
		toll.setLayout(flow);
		
		//3. 인기투표 제목
		JLabel kpop = new JLabel();
		kpop.setText("KPOP 인기투표");
		
		//4. 각 가수별 표 카운트를 위한 변수 설정 (아이유, 방탄소년단, 뉴진스)
		
		
		//5. 각 가수별 투표 버튼(앨범 표지)
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
		
		
		//7. 가수 라벨
		JLabel iuL = new JLabel();
		JLabel iuLT = new JLabel();
		JLabel btsL = new JLabel();
		JLabel btsLT = new JLabel();
		JLabel njL = new JLabel();
		JLabel njLT = new JLabel();
		
		iuL.setText("1. 아이유-블루밍");
		btsL.setText("2. BTS - 다이너마이트");
		njL.setText("3. 뉴진스 - 어텐션");
		

		iuLT.setText("0 표");
		btsLT.setText("0 표");
		njLT.setText("0 표");
			
		//6.투표 시 이벤트
		iuA.addActionListener(new ActionListener() {
			int iu = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				iu++;
				iuLT.setText(iu +"표");
			}
		});
		btsA.addActionListener(new ActionListener() {
			int bts = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				bts++;
				btsLT.setText(bts +"표");
			}
		});
		njA.addActionListener(new ActionListener() {
			int nj = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				nj++;
				njLT.setText(nj +"표");
			}
		});
		
		

		
		//8. 폰트
		Font font = new Font("궁서",1,50);
		Font font2 = new Font("굴림",1, 20);
		
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
