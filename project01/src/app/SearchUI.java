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
	JButton search, ranking, mypage;
	JLabel lineUnder, lineTop;
	JPanel mainPanel, seoulPanel, anyangPanel, chuncheonPanel, busanPanel;
	JScrollPane scroll;
	public ArrayList<SearchDTO> valueList = new ArrayList<SearchDTO>();
	public int listTotal, height;
	
	public static void main(String[] args) {
		SearchUI ui = new SearchUI();
		ui.showList();
	}
	
	//�⺻ �޼ҵ� - ��ü ����Ʈ �޾ƿ���
	public SearchUI() {
		SearchDAO getList = new SearchDAO();
		
		valueList = getList.search();
		listTotal = valueList.size();
	}
	
	//���� Select Ŭ���� - ������ ���� ����Ʈ �޾ƿ���
	public class searchBy {
		
		public JPanel searchByL(String location) {
			SearchDAO getS = new SearchDAO();
			ArrayList<SearchDTO> valueListS = getS.searchL(location);
			int heightS = 133 * valueListS.size();
			
			JPanel locationPanel = new JPanel();
			locationPanel.setLayout(null);
			locationPanel.setBackground(Color.white);
			locationPanel.setPreferredSize(new Dimension(310, heightS));
			
			for (int i = 0; i < valueListS.size(); i++) {
				//1. ������� �ǳ�
				JPanel panelRS = new JPanel();
				panelRS.setPreferredSize(new Dimension(310, 130));
				panelRS.setLayout(null);
				panelRS.setBackground(Color.white);
				panelRS.setBorder(new TitledBorder(new LineBorder(Color.decode("#E74C3C"))));
				
				//2. ������� �̹��� ��ư
				JButton imagebutton = new JButton("");
				ImageIcon img11 = new ImageIcon(valueListS.get(i).getImg());
				imagebutton.setIcon(img11);
				imagebutton.setBorderPainted(false);
				imagebutton.setFocusPainted(false);
				imagebutton.setBounds(5, 5, 120, 120);

				//3. ������� ���� ��
				JLabel descriplabel = new JLabel("<html>" + valueListS.get(i).getCategory()
						+"<br>" +valueListS.get(i).getName() 
						+"<br>" + valueListS.get(i).getAddress() + "</html>");
				descriplabel.setBounds(130, 5, 180, 90);
				
				//4. ���� �ǳ�
				JPanel rating = new JPanel();
				rating.setLayout(null);
				rating.setBackground(Color.white);
				rating.setBounds(130, 100, 170, 20);
				
				//4-1. �� ������ ��, ���� �޾ƿ���
				JLabel naver = new JLabel(Float.toString(valueListS.get(i).getnStars()));
				JLabel kakao = new JLabel(Float.toString(valueListS.get(i).getkStars()));
				JLabel google = new JLabel(Float.toString(valueListS.get(i).getgStars()));
				
				//4-2. �� ������ �󺧿� ������ �ֱ�
				ImageIcon iconN = new ImageIcon("nMap.png");
				Image nMap = iconN.getImage();
				Image setsize1 = nMap.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
				ImageIcon naverIcon1 = new ImageIcon(setsize1);
				naver.setIcon(naverIcon1);
				
				ImageIcon iconK = new ImageIcon("kMap.png");
				Image kMap = iconK.getImage();
				Image setsize2 = kMap.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
				ImageIcon kakaoIcon2 = new ImageIcon(setsize2);
				kakao.setIcon(kakaoIcon2);

				ImageIcon iconG = new ImageIcon("gMap.png");
				Image gMap = iconG.getImage();
				Image setsize3 = gMap.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
				ImageIcon googleIcon3 = new ImageIcon(setsize3);
				google.setIcon(googleIcon3);
				
				//4-3. �� ���� �� ���� �ǳڿ� �ֱ�
				naver.setBounds(5, 0, 53, 20);
				kakao.setBounds(60, 0, 53, 20);
				google.setBounds(115, 0, 53, 20);
				
				rating.add(naver);
				rating.add(kakao);
				rating.add(google);
				
				//5. ������� �ǳڿ� �̹��� ��ư, ���� ��, ���� �ǳ� �ֱ�
				panelRS.add(imagebutton);
				panelRS.add(descriplabel);
				panelRS.add(rating);
				
				//6. ���� �ǳڿ� ������� �ǳ� �ֱ� 
				locationPanel.add(panelRS);
				
				//7. ������� �ǳ� ��ġ ����
				panelRS.setBounds(5, 5+(i*132), 310, 130);
			}
			return locationPanel;
		}
	}

	public void showList() {

		//1. ������ ����
		setTitle("�������");
		setSize(360, 640);
		setLayout(null);
		getContentPane().setBackground(Color.white);
		Font titleFont = new Font("����", 1, 30);
		
		//2. Ÿ��Ʋ ��, �ΰ� ��
		JLabel title = new JLabel("���� �˻�");
		title.setFont(titleFont);
		title.setBounds(10,10,360,40);
		title.setForeground(Color.decode("#E74C3C"));
		
		JLabel logo = new JLabel();
		ImageIcon logo1 = new ImageIcon("icon_color.png");
		logo.setIcon(logo1);
		logo.setBounds(300, 10, 50, 50);

		//3. �������� ��ư
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
//				searchBy seoulList = new searchBy();
//				JPanel seoulPanel = seoulList.searchByL(seoul.getText());
				scroll.setViewportView(null);
				scroll.setViewportView(seoulPanel);
			}
		});
		anyang.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				searchBy anyangList = new searchBy();
//				JPanel anyangPanel = anyangList.searchByL(anyang.getText());
				scroll.setViewportView(null);
				scroll.setViewportView(anyangPanel);

			}
		});

		chuncheon.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				searchBy chuncheonList = new searchBy();
//				JPanel chuncheonPanel =chuncheonList.searchByL(chuncheon.getText());
				scroll.setViewportView(null);
				scroll.setViewportView(chuncheonPanel);
			}
		});

		busan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				searchBy busanList = new searchBy();
//				JPanel busanPanel = busanList.searchByL(busan.getText());
				scroll.setViewportView(null);
				scroll.setViewportView(busanPanel);
			}
		});
		
		searchBy seoulList = new searchBy();
		seoulPanel = seoulList.searchByL(seoul.getText());
		
		searchBy anyangList = new searchBy();
		anyangPanel = anyangList.searchByL(anyang.getText());
		
		searchBy chuncheonList = new searchBy();
		chuncheonPanel =chuncheonList.searchByL(chuncheon.getText());
		
		searchBy busanList = new searchBy();
		busanPanel = busanList.searchByL(busan.getText());
		
		//5. ���� JPanel
		mainPanel = new JPanel();
		mainPanel.setLayout(null);
		mainPanel.setBackground(Color.white);
		height = 133 * listTotal;
		mainPanel.setPreferredSize(new Dimension(310, height));
		
		//������ �� �̹��� ũ�� ����(������)	
//		ArrayList<ImageIcon> imageList = new ArrayList<>();
//		String img = null;
//		
//		for (int i = 0; i < valueList.size(); i++) {
//			img = valueList.get(i).getImg();
//			ImageIcon img0 = new ImageIcon(img);
//			Image image0 = img0.getImage();
//			Image setsize0 = image0.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
//			ImageIcon imgIcon0 = new ImageIcon(setsize0);
//			imageList.add(imgIcon0);
//		}
	
		
//		6. �� ������ �ǳ�
		for (int i = 0; i < valueList.size(); i++) {
			//1. ������ �ǳ�
			JPanel panelR = new JPanel();
			panelR.setPreferredSize(new Dimension(310, 130));
			panelR.setLayout(null);
			panelR.setBackground(Color.white);
			panelR.setBorder(new TitledBorder(new LineBorder(Color.decode("#E74C3C"))));
			
			//2. ������ �̹��� ��ư
			JButton imagebutton = new JButton("");
			ImageIcon img11 = new ImageIcon(valueList.get(i).getImg());
			imagebutton.setIcon(img11);
			imagebutton.setBorderPainted(false);
			imagebutton.setFocusPainted(false);
			imagebutton.setBackground(Color.pink);
			imagebutton.setBounds(5, 5, 120, 120);

			//3. ������ ���� ��
			JLabel descriplabel = new JLabel("<html>" + valueList.get(i).getCategory()
					+"<br>" +valueList.get(i).getName() 
					+"<br>" + valueList.get(i).getAddress() + "</html>");
			descriplabel.setBounds(130, 5, 180, 90);
			
			//4. ���� �ǳ�
			JPanel rating = new JPanel();
			rating.setLayout(null);
			rating.setBackground(Color.white);
			rating.setBounds(130, 100, 170, 20);
			
			//4-1. �� ������ ��, ���� �޾ƿ���
			JLabel naver = new JLabel(Float.toString(valueList.get(i).getnStars()));	//���̹�����
			JLabel kakao = new JLabel(Float.toString(valueList.get(i).getkStars()));	//īī����
			JLabel google = new JLabel(Float.toString(valueList.get(i).getgStars()));	//���۸�
			
			//4-2. �� ������ �󺧿� ������ �ֱ�
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
			
			//4-3. �� ���� �� ���� �ǳڿ� �ֱ�
			naver.setBounds(5, 0, 53, 20);
			kakao.setBounds(60, 0, 53, 20);
			google.setBounds(115, 0, 53, 20);
			
			rating.add(naver);
			rating.add(kakao);
			rating.add(google);
			
			//5. ������ �ǳڿ� �̹��� ��ư, ���� ��, ���� �ǳ� �ֱ�
			panelR.add(imagebutton);
			panelR.add(descriplabel);
			panelR.add(rating);
			
			//6. ���� �ǳڿ� ������ �ǳ� �ֱ� 
			mainPanel.add(panelR);
			
			//7. ������ �ǳ� ��ġ ����
			panelR.setBounds(5, 5+(i*132), 310, 130);
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
		search = new JButton();		//���� �˻�
		ranking = new JButton();	//������ŷ
		mypage = new JButton();		//����������
		
		//9-1. �ϴ� �޴� �̵� ��ư ����
		//(1)�޴�1 - ���� �˻� �̹���
		ImageIcon image1 = new ImageIcon("search.png");
		Image img1 = image1.getImage();
		Image setsize = img1.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
		ImageIcon searchIcon = new ImageIcon(setsize);
		search.setIcon(searchIcon);
		
		//(2)�޴�2 - ������ŷ �̹���
		ImageIcon image2 = new ImageIcon("rank.png");
		Image img2 = image2.getImage();
		Image setsize2 = img2.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
		ImageIcon rankIcon = new ImageIcon(setsize2);
		ranking.setIcon(rankIcon);
		
		//(3)�޴�3 - ���������� �̹���
		ImageIcon image3 = new ImageIcon("mypage.png");
		Image img3 = image3.getImage();
		Image setsize3 = img3.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
		ImageIcon mypageIcon = new ImageIcon(setsize3);
		mypage.setIcon(mypageIcon);
		
		//�޴�(1),(2),(3) ������ ũ��, ���� ����
		search.setBounds(10,550,40,40);
		search.setBackground(Color.white);
		search.setBorderPainted(false);
		search.setFocusPainted(false);
		
		ranking.setBounds(150,550,40,40);
		ranking.setBackground(Color.white);
		ranking.setBorderPainted(false);
		ranking.setFocusPainted(false);
		
		mypage.setBounds(290,550,40,40);
		mypage.setBackground(Color.white);
		mypage.setBorderPainted(false);
		mypage.setFocusPainted(false);
		
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
		add(search);
		add(ranking);
		add(mypage);
		
		//11. ������ ���� �� ���α׷� ���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		//������ ���̱�
	}
}
