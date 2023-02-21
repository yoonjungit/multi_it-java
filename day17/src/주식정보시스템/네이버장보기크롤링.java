package 주식정보시스템;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버장보기크롤링 {

	public static void main(String[] args) {
		Connection shopNaver = Jsoup.connect("https://shopping.naver.com/market/home?dtm_source=naver_brandsearch&dtm_medium=display_pc&dtm_campaign=mart_tutorial&pcode=naver_brandsearch_tutorial_pc");
		
		Document doc = null;
		
		try {
			doc = shopNaver.get();
			Elements menus = doc.select("._1Nw0UlJoxN");
			System.out.println(menus.size());
			for (int i = 0; i < menus.size(); i++) {
				String menu = menus.get(i).text();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}


