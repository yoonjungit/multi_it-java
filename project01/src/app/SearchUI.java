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
	
	//기본 메소드 - 전체 리스트 받아오기
	public SearchUI() {
		SearchDAO getList = new SearchDAO();
		
		valueList = getList.search();
		listTotal = valueList.size();
	}
	
	//지역 Select 클래스 - 선택한 지역 리스트 받아오기
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
				//1. 레스토랑 판넬
				JPanel panelRS = new JPanel();
				panelRS.setPreferredSize(new Dimension(310, 130));
				panelRS.setLayout(null);
				panelRS.setBackground(Color.white);
				panelRS.setBorder(new TitledBorder(new LineBorder(Color.decode("#E74C3C"))));
				
				//2. 레스토랑 이미지 버튼
				JButton imagebutton = new JButton("");
				ImageIcon img11 = new ImageIcon(valueListS.get(i).getImg());
				imagebutton.setIcon(img11);
				imagebutton.setBorderPainted(false);
				imagebutton.setFocusPainted(false);
				imagebutton.setBounds(5, 5, 120, 120);

				//3. 레스토랑 설명 라벨
				JLabel descriplabel = new JLabel("<html>" + valueListS.get(i).getCategory()
						+"<br>" +valueListS.get(i).getName() 
						+"<br>" + valueListS.get(i).getAddress() + "</html>");
				descriplabel.setBounds(130, 5, 180, 90);
				
				//4. 별점 판넬
				JPanel rating = new JPanel();
				rating.setLayout(null);
				rating.setBackground(Color.white);
				rating.setBounds(130, 100, 170, 20);
				
				//4-1. 각 지도별 라벨, 별점 받아오기
				JLabel naver = new JLabel(Float.toString(valueListS.get(i).getnStars()));
				JLabel kakao = new JLabel(Float.toString(valueListS.get(i).getkStars()));
				JLabel google = new JLabel(Float.toString(valueListS.get(i).getgStars()));
				
				//4-2. 각 지도별 라벨에 아이콘 넣기
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
				
				//4-3. 각 지도 라벨 별점 판넬에 넣기
				naver.setBounds(5, 0, 53, 20);
				kakao.setBounds(60, 0, 53, 20);
				google.setBounds(115, 0, 53, 20);
				
				rating.add(naver);
				rating.add(kakao);
				rating.add(google);
				
				//5. 레스토랑 판넬에 이미지 버튼, 설명 라벨, 별점 판넬 넣기
				panelRS.add(imagebutton);
				panelRS.add(descriplabel);
				panelRS.add(rating);
				
				//6. 메인 판넬에 레스토랑 판넬 넣기 
				locationPanel.add(panelRS);
				
				//7. 레스토랑 판넬 위치 설정
				panelRS.setBounds(5, 5+(i*132), 310, 130);
			}
			return locationPanel;
		}
	}

	public void showList() {

		//1. 프레임 설정
		setTitle("찐찐맛집");
		setSize(360, 640);
		setLayout(null);
		getContentPane().setBackground(Color.white);
		Font titleFont = new Font("돋움", 1, 30);
		
		//2. 타이틀 라벨, 로고 라벨
		JLabel title = new JLabel("맛집 검색");
		title.setFont(titleFont);
		title.setBounds(10,10,360,40);
		title.setForeground(Color.decode("#E74C3C"));
		
		JLabel logo = new JLabel();
		ImageIcon logo1 = new ImageIcon("icon_color.png");
		logo.setIcon(logo1);
		logo.setBounds(300, 10, 50, 50);

		//3. 지역선택 버튼
		JButton seoul = new JButton("서울");
		JButton anyang = new JButton("안양");
		JButton chuncheon = new JButton("춘천");
		JButton busan = new JButton("부산");
		
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
		
		//4. 지역 선택 버튼 기능
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
		
		//5. 메인 JPanel
		mainPanel = new JPanel();
		mainPanel.setLayout(null);
		mainPanel.setBackground(Color.white);
		height = 133 * listTotal;
		mainPanel.setPreferredSize(new Dimension(310, height));
		
		//음식점 별 이미지 크기 조정(에러남)	
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
	
		
//		6. 각 음식점 판넬
		for (int i = 0; i < valueList.size(); i++) {
			//1. 음식점 판넬
			JPanel panelR = new JPanel();
			panelR.setPreferredSize(new Dimension(310, 130));
			panelR.setLayout(null);
			panelR.setBackground(Color.white);
			panelR.setBorder(new TitledBorder(new LineBorder(Color.decode("#E74C3C"))));
			
			//2. 음식점 이미지 버튼
			JButton imagebutton = new JButton("");
			ImageIcon img11 = new ImageIcon(valueList.get(i).getImg());
			imagebutton.setIcon(img11);
			imagebutton.setBorderPainted(false);
			imagebutton.setFocusPainted(false);
			imagebutton.setBackground(Color.pink);
			imagebutton.setBounds(5, 5, 120, 120);

			//3. 음식점 설명 라벨
			JLabel descriplabel = new JLabel("<html>" + valueList.get(i).getCategory()
					+"<br>" +valueList.get(i).getName() 
					+"<br>" + valueList.get(i).getAddress() + "</html>");
			descriplabel.setBounds(130, 5, 180, 90);
			
			//4. 별점 판넬
			JPanel rating = new JPanel();
			rating.setLayout(null);
			rating.setBackground(Color.white);
			rating.setBounds(130, 100, 170, 20);
			
			//4-1. 각 지도별 라벨, 별점 받아오기
			JLabel naver = new JLabel(Float.toString(valueList.get(i).getnStars()));	//네이버지도
			JLabel kakao = new JLabel(Float.toString(valueList.get(i).getkStars()));	//카카오맵
			JLabel google = new JLabel(Float.toString(valueList.get(i).getgStars()));	//구글맵
			
			//4-2. 각 지도별 라벨에 아이콘 넣기
			ImageIcon iconN = new ImageIcon("nMap.png");		//네이버지도
			Image nMap = iconN.getImage();
			Image setsize1 = nMap.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
			ImageIcon naverIcon1 = new ImageIcon(setsize1);
			naver.setIcon(naverIcon1);
			
			ImageIcon iconK = new ImageIcon("kMap.png");		//카카오맵
			Image kMap = iconK.getImage();
			Image setsize2 = kMap.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
			ImageIcon kakaoIcon2 = new ImageIcon(setsize2);
			kakao.setIcon(kakaoIcon2);

			ImageIcon iconG = new ImageIcon("gMap.png");		//구글맵
			Image gMap = iconG.getImage();
			Image setsize3 = gMap.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
			ImageIcon googleIcon3 = new ImageIcon(setsize3);
			google.setIcon(googleIcon3);
			
			//4-3. 각 지도 라벨 별점 판넬에 넣기
			naver.setBounds(5, 0, 53, 20);
			kakao.setBounds(60, 0, 53, 20);
			google.setBounds(115, 0, 53, 20);
			
			rating.add(naver);
			rating.add(kakao);
			rating.add(google);
			
			//5. 음식점 판넬에 이미지 버튼, 설명 라벨, 별점 판넬 넣기
			panelR.add(imagebutton);
			panelR.add(descriplabel);
			panelR.add(rating);
			
			//6. 메인 판넬에 음식점 판넬 넣기 
			mainPanel.add(panelR);
			
			//7. 음식점 판넬 위치 설정
			panelR.setBounds(5, 5+(i*132), 310, 130);
		}
		
		//7. JScrollPane
		scroll = new JScrollPane();
		scroll.setBounds(0, 100, 335, 420); // Height -> 메인 패널보다 작게
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED); // 세로 스크롤 필요하면 생기게
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER); // 가로 스크롤은 절대 X
		scroll.getVerticalScrollBar().setUnitIncrement(16);		//스크롤 속도
		scroll.setViewportView(mainPanel); // 스크롤페인에 메인패널 넣기
		scroll.setBorder(null);
		
		//8. 상하단 구분 라인
		lineUnder = new JLabel("─────────────────────────");
		lineTop = new JLabel("─────────────────────────");
		lineUnder.setForeground(Color.decode("#E74C3C"));
		lineTop.setForeground(Color.decode("#E74C3C"));
		lineUnder.setBounds(10,530,360,10);
		lineTop.setBounds(10,50,360,10);
		
		//9. 하단 메뉴 이동 버튼
		search = new JButton();		//맛집 검색
		ranking = new JButton();	//맛집랭킹
		mypage = new JButton();		//마이페이지
		
		//9-1. 하단 메뉴 이동 버튼 설정
		//(1)메뉴1 - 맛집 검색 이미지
		ImageIcon image1 = new ImageIcon("search.png");
		Image img1 = image1.getImage();
		Image setsize = img1.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
		ImageIcon searchIcon = new ImageIcon(setsize);
		search.setIcon(searchIcon);
		
		//(2)메뉴2 - 맛집랭킹 이미지
		ImageIcon image2 = new ImageIcon("rank.png");
		Image img2 = image2.getImage();
		Image setsize2 = img2.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
		ImageIcon rankIcon = new ImageIcon(setsize2);
		ranking.setIcon(rankIcon);
		
		//(3)메뉴3 - 마이페이지 이미지
		ImageIcon image3 = new ImageIcon("mypage.png");
		Image img3 = image3.getImage();
		Image setsize3 = img3.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
		ImageIcon mypageIcon = new ImageIcon(setsize3);
		mypage.setIcon(mypageIcon);
		
		//메뉴(1),(2),(3) 아이콘 크기, 색상 지정
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
		
		//10. 요소 추가
		//상단 레이아웃
		add(title);
		add(lineTop);
		add(logo);
		
		//지역 선택 버튼
		add(seoul);add(anyang);add(chuncheon);add(busan);
		//메인 음식 리스트
		add(scroll);
		
		//하단 레이아웃
		add(lineUnder);
		add(search);
		add(ranking);
		add(mypage);
		
		//11. 프레임 닫을 시 프로그램 실행 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		//프레임 보이기
	}
}
