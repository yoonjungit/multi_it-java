package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버웹툰크롤링 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://comic.naver.com/index");
		
		Document doc = null;		//로컬 변수 초기화(수동)
		try {
			doc = con.get();		//html 코드를 다 가지고 와서 doc변수에 넣어줌
			Elements list = doc.select(".menu a");
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i);
				System.out.println(tag);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
	}

}
