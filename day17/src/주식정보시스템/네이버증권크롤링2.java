package 주식정보시스템;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링2 {

	public static void naver(String getCode) {
		//삼성증권
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + getCode);
		
		Document doc = null;
		try {
			doc = con.get();
		
		//현재가, 고가, 저가 가져오기
			Elements blindList = doc.select("span.blind");
			Elements h2tag = doc.select("h2");
			
			Element nametag = h2tag.get(1);
			String name = nametag.text();
			System.out.println(name);
			
			Element tag4 = blindList.get(12);		//현재가
			Element tag5 = blindList.get(16);		//고가
			Element tag6 = blindList.get(20);		//저가
			
			String today = tag4.ownText();
			String highP = tag5.ownText();
			String lowP = tag6.ownText();
			
			System.out.println("현재가 : " +today);
			System.out.println("고가 : " +highP);
			System.out.println("저가 : " +lowP);
			
			FileWriter file = new FileWriter(getCode +".txt");
			file.write(getCode + " " + name);
			file.write("현재가 : " +today);
			file.write("고가 : " +highP);
			file.write("저가 : " +lowP);
			System.out.println("파일 저장 완료");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}








