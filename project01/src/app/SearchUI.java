package app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class SearchUI extends JFrame{
	JButton searchB, rankingB, mypageB;
	JLabel lineUnder, lineTop;
	JPanel mainPanel;
	JScrollPane scroll;
	
	public static ArrayList<SearchDTO> resList = new ArrayList<SearchDTO>();
	public static ArrayList<JPanel> resListPanel = new ArrayList<JPanel>();
	
	public static ImageIcon fullStarIcon, starIcon;
	public static ArrayList<String> bookmarkList = new ArrayList<>();
	
	public static void main(String[] args) {
		//1. �⺻ �޼ҵ� : ������ ����Ʈ ��ü �޾ƿ���
		SearchUI ui = new SearchUI();
		//2. ȸ�� �ϸ�ũ ������ ����Ʈ �ޱ�
		GetBookmark bm = new GetBookmark();	
		//3. �ϸ�ũ ������ �����
		SetStarIcon star = new SetStarIcon();
		//4. ��ü ������ �ǳ� �����
		MakePanel makePanelAll = new MakePanel();
		//5. ���α׷� ����
		ui.frameView();
		//6. ���� ������ ����Ʈ �ޱ�
	}
	
	//1. �⺻ �޼ҵ� : ������ ����Ʈ ��ü �޾ƿ���
	public SearchUI() {
		SearchDAO getResList = new SearchDAO();
		resList = getResList.search();
	}
	
	//2. ȸ�� �ϸ�ũ ������ ����Ʈ �ޱ�
	public static class GetBookmark{
		public GetBookmark() {
			SearchDAO dao = new SearchDAO();
			bookmarkList = dao.searchBookmark();
		}
	}
	
	//3. �ϸ�ũ ������ �����
	public static class SetStarIcon{
		public SetStarIcon() {
			ImageIcon star1 = new ImageIcon("full_star.jpg");
			Image star2 = star1.getImage();
			Image star3 = star2.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
			fullStarIcon = new ImageIcon(star3);
			
			ImageIcon star4 = new ImageIcon("star.png");
			Image star5 = star4.getImage();
			Image star6 = star5.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
			starIcon = new ImageIcon(star6);
		}
	}
	
	//4. ������ �ǳ� �����
	public static class MakePanel {
		public MakePanel() {
			for (int i = 0; i < resList.size(); i++) {
				//1. ������ �ǳ�
				JPanel resPanel = new JPanel();
				resPanel.setPreferredSize(new Dimension(310, 130));
				resPanel.setLayout(null);
				resPanel.setBackground(Color.white);
				resPanel.setBorder(new TitledBorder(new LineBorder(Color.decode("#E74C3C"))));
				
				//2. ������ �̹��� ��ư
				JButton imagebutton = new JButton("");
				//2-1. ��ư �̹��� ������ ���� �� ����
				ImageIcon img = new ImageIcon(resList.get(i).getImg());
				Image getImg = img.getImage();
				Image setImgSize = getImg.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
				ImageIcon imgIcon = new ImageIcon(setImgSize);
				imagebutton.setIcon(imgIcon);	//�̹��� ����
				//2-2. �̹��� ��ư - �׵θ� ���ֱ� / ���� ���ֱ� / ũ��, ��ġ ����
				imagebutton.setBorderPainted(false);
				imagebutton.setFocusPainted(false);
				imagebutton.setBounds(5, 5, 120, 120);
				//2-3. �̹��� ��ư Ŭ�� ���
				String resName = resList.get(i).getName();
				imagebutton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println(resName +"�� �̵�");
					}
				});
				
				//3. ������ ���� �� - ���� / ��ġ, ũ��
				JLabel descriplabel = new JLabel("<html>" + resList.get(i).getCategory()
						+"<br>" + resList.get(i).getName() 
						+"<br>" + resList.get(i).getAddress() + "</html>");
				descriplabel.setBounds(130, 5, 180, 90);
				
				//4. ���� �ǳ� - ���̾ƿ� ���ֱ� / ���� : ��� / ��ġ, ũ�� ����
				JPanel rating = new JPanel();
				rating.setLayout(null);
				rating.setBackground(Color.white);
				rating.setBounds(130, 100, 170, 20);
				
				//4-1. �� ������ ��, ���� �޾ƿ���
				JLabel naver = new JLabel(Float.toString(resList.get(i).getnStars()));	//���̹�����
				JLabel kakao = new JLabel(Float.toString(resList.get(i).getkStars()));	//īī����
				JLabel google = new JLabel(Float.toString(resList.get(i).getgStars()));	//���۸�
				
				//4-2. �� ������ �󺧿� �̹��� �ֱ�
				ImageIcon iconN = new ImageIcon("nMap.png");		//���̹�����
				Image nMap = iconN.getImage();
				Image setsize1 = nMap.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
				ImageIcon naverIcon1 = new ImageIcon(setsize1);
				naver.setIcon(naverIcon1);
				
				ImageIcon iconK = new ImageIcon("kMap.png");		//īī����
				Image kMap = iconK.getImage();
				Image setsize2 = kMap.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
				ImageIcon kakaoIcon2 = new ImageIcon(setsize2);
				kakao.setIcon(kakaoIcon2);

				ImageIcon iconG = new ImageIcon("gMap.png");		//���۸�
				Image gMap = iconG.getImage();
				Image setsize3 = gMap.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
				ImageIcon googleIcon3 = new ImageIcon(setsize3);
				google.setIcon(googleIcon3);
				
				//4-3. �� ���� �� ���� �ǳڿ� �ֱ� / ��ġ, ũ�� ����
				naver.setBounds(5, 0, 53, 20);
				kakao.setBounds(60, 0, 53, 20);
				google.setBounds(115, 0, 53, 20);
				
				rating.add(naver);
				rating.add(kakao);
				rating.add(google);
				
				//5. �ϸ�ũ
				JButton bookmark = new JButton();
				// ���� ȸ�� �ϸ�ũ ����Ʈ�� �ش� �������� ������ -> ���� ��, �׿� �� ��
				if (bookmarkList.contains(resList.get(i).getName())) {
					bookmark.setIcon(fullStarIcon);
				} else {
					bookmark.setIcon(starIcon);
				}
				//5-1. �ϸ�ũ - ��ġ, ũ�� ���� / ���� : ��� / �׵θ� ���ֱ�
				bookmark.setBounds(270, 10, 20, 20);
				bookmark.setBackground(Color.white);
				bookmark.setBorderPainted(false);
				//5-2. �ϸ�ũ Ŭ�� ���
				bookmark.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						SearchDAO dao = new SearchDAO();
						//������ �̸�, ȸ�� ID(���� �α��� ���� ���̹Ƿ� ������ ID)�� Select ���� �� 
						//�ش� �����Ͱ� �ϸ�ũDB����Ʈ��
						//������ �ϸ�ũ ����(���� ��->��)
						//������ �ϸ�ũ ����(��->���� ��)
						int bmUpdate = dao.bookmarkUpdate(resName);
						if (bookmark.getIcon().equals(fullStarIcon)) {
							bookmark.setIcon(starIcon);
						} else {
							bookmark.setIcon(fullStarIcon);
						}
					}
				});
				
				//6. ������ �ǳڿ� �̹��� ��ư, ���� ��, ���� �ǳ� �ֱ�
				resPanel.add(imagebutton);
				resPanel.add(descriplabel);
				resPanel.add(rating);
				resPanel.add(bookmark);
				
				resListPanel.add(resPanel);
			}
		}
	}
	
	public void frameView() {

		//1. ������ - Ÿ��Ʋ / ������ / ���̾ƿ� / ���� : ���
		setTitle("�������");
		setSize(360, 640);
		setLayout(null);
		getContentPane().setBackground(Color.white);

		//2-1. Ÿ��Ʋ ��
		JLabel title = new JLabel("���� �˻�");
		Font titleFont = new Font("����", 1, 30);
		title.setFont(titleFont);
		title.setBounds(10,10,360,40);
		title.setForeground(Color.decode("#E74C3C"));
		
		//2-2. �ΰ� ��(�̹���)
		JLabel logo = new JLabel();
		ImageIcon logo1 = new ImageIcon("icon_color.png");
		logo.setIcon(logo1);
		logo.setBounds(300, 10, 50, 50);

		//3. �������� ��ư - ���� / ��ġ, ũ�� / ���,�۾�ü �� / �׵θ� ���ֱ�
		JButton seoul = new JButton("����");
		JButton anyang = new JButton("�Ⱦ�");
		JButton chuncheon = new JButton("��õ");
		JButton busan = new JButton("�λ�");
		
		seoul.setBounds(5, 60, 70, 20);
		anyang.setBounds(90, 60, 70, 20);
		chuncheon.setBounds(180, 60, 70, 20);
		busan.setBounds(270, 60, 70, 20);
		
		seoul.setBackground(Color.decode("#E74C3C"));
		anyang.setBackground(Color.decode("#E74C3C"));
		chuncheon.setBackground(Color.decode("#E74C3C"));
		busan.setBackground(Color.decode("#E74C3C"));
		
		seoul.setForeground(Color.white);
		anyang.setForeground(Color.white);
		chuncheon.setForeground(Color.white);
		busan.setForeground(Color.white);
		
		seoul.setBorder(null);
		anyang.setBorder(null);
		chuncheon.setBorder(null);
		busan.setBorder(null);
		
		//4. ���� ���� ��ư ���
		seoul.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GetLocationList seoulList = new GetLocationList();
				JPanel seoulPanel = seoulList.getResListL(seoul.getText());
				scroll.setViewportView(null);
				scroll.setViewportView(seoulPanel);
			}
		});
		anyang.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GetLocationList anyangList = new GetLocationList();
				JPanel anyangPanel = anyangList.getResListL(anyang.getText());
				scroll.setViewportView(null);
				scroll.setViewportView(anyangPanel);

			}
		});

		chuncheon.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GetLocationList chuncheonList = new GetLocationList();
				JPanel chuncheonPanel =chuncheonList.getResListL(chuncheon.getText());
				scroll.setViewportView(null);
				scroll.setViewportView(chuncheonPanel);
			}
		});

		busan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GetLocationList busanList = new GetLocationList();
				JPanel busanPanel = busanList.getResListL(busan.getText());
				scroll.setViewportView(null);
				scroll.setViewportView(busanPanel);
			}
		});
		
		//5. ���� JPanel - ���̾ƿ� ���ֱ� / ���� : ��� / ������ ����
		mainPanel = new JPanel();
		mainPanel.setLayout(null);
		mainPanel.setBackground(Color.white);
		int height = 133 * resList.size();
		mainPanel.setPreferredSize(new Dimension(310, height));

	
//		6. �� ������ �ǳ� (��ġ, ũ�� ����)
		for (int i = 0; i < resList.size(); i++) {
			JPanel panel1 = resListPanel.get(i);
			mainPanel.add(panel1);
			panel1.setBounds(5, 5+(i*132), 310, 130);
		}
		
		
		//7. JScrollPane
		scroll = new JScrollPane();
		scroll.setBounds(0, 100, 335, 420); // Height -> ���� �гκ��� �۰�
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED); // ���� ��ũ�� �ʿ��ϸ� �����
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER); // ���� ��ũ���� ���� X
		scroll.getVerticalScrollBar().setUnitIncrement(16);		//��ũ�� �ӵ�
		scroll.setViewportView(mainPanel); // ��ũ�����ο� �����г� �ֱ�
		scroll.setBorder(null);
		
		//8. ���ϴ� ���� ����
		lineUnder = new JLabel("��������������������������������������������������");
		lineTop = new JLabel("��������������������������������������������������");
		lineUnder.setForeground(Color.decode("#E74C3C"));
		lineTop.setForeground(Color.decode("#E74C3C"));
		lineUnder.setBounds(10,530,360,10);
		lineTop.setBounds(10,50,360,10);
		
		//9. �ϴ� �޴� �̵� ��ư
		searchB = new JButton();		//���� �˻�
		rankingB = new JButton();	//������ŷ
		mypageB = new JButton();		//����������
		
		//9-1. �ϴ� �޴� �̵� ��ư ����
		//(1)�޴�1 - ���� �˻� �̹���
		ImageIcon image1 = new ImageIcon("search.png");
		Image img1 = image1.getImage();
		Image setsize = img1.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
		ImageIcon searchIcon = new ImageIcon(setsize);
		searchB.setIcon(searchIcon);
		
		//(2)�޴�2 - ������ŷ �̹���
		ImageIcon image2 = new ImageIcon("rank.png");
		Image img2 = image2.getImage();
		Image setsize2 = img2.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
		ImageIcon rankIcon = new ImageIcon(setsize2);
		rankingB.setIcon(rankIcon);
		
		//(3)�޴�3 - ���������� �̹���
		ImageIcon image3 = new ImageIcon("mypage.png");
		Image img3 = image3.getImage();
		Image setsize3 = img3.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
		ImageIcon mypageIcon = new ImageIcon(setsize3);
		mypageB.setIcon(mypageIcon);
		
		//�޴�(1),(2),(3) ������ ũ��, ���� ����
		searchB.setBounds(10,550,40,40);
		searchB.setBackground(Color.white);
		searchB.setBorderPainted(false);
		searchB.setFocusPainted(false);
		
		rankingB.setBounds(150,550,40,40);
		rankingB.setBackground(Color.white);
		rankingB.setBorderPainted(false);
		rankingB.setFocusPainted(false);
		
		mypageB.setBounds(290,550,40,40);
		mypageB.setBackground(Color.white);
		mypageB.setBorderPainted(false);
		mypageB.setFocusPainted(false);
		
		//10. ��� �߰�
		//��� ���̾ƿ�
		add(title);
		add(lineTop);
		add(logo);
		
		//���� ���� ��ư
		add(seoul);add(anyang);add(chuncheon);add(busan);
		//���� ���� ����Ʈ
		add(scroll);
		
		//�ϴ� ���̾ƿ�
		add(lineUnder);
		add(searchB);
		add(rankingB);
		add(mypageB);
		
		//11. ������ ���� �� ���α׷� ���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		//������ ���̱�
	}
	
	//6. ���� Select Ŭ���� - ������ ���� ����Ʈ �޾ƿ���
	public class GetLocationList {
		
		public JPanel getResListL(String location) {
			SearchDAO dao = new SearchDAO();
			ArrayList<String> resListL = dao.searchL(location);
			int height = 133 * resListL.size();
			
			JPanel locationPanel = new JPanel();
			locationPanel.setLayout(null);
			locationPanel.setBackground(Color.white);
			locationPanel.setPreferredSize(new Dimension(310, height));
			
			int x = 0;
			
			for (int i = 0; i < resList.size(); i++) {
				if(resListL.contains(resList.get(i).getName())) {
					JPanel panel0 = resListPanel.get(i);
					locationPanel.add(panel0);
					panel0.setBounds(5, 5+(x*132), 310, 130);
					x++;
				}
			}
			return locationPanel;
		}
	}

}
