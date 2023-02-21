package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링 {

	public static void main(String[] args) {
		//삼성증권
//		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		//카카오
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=035720");
		//네이버
//		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=035420");
		
		Document doc = null;
		try {
			doc = con.get();
		//코드 가져오기
			Elements codeList = doc.select(".code");
			System.out.println(codeList.size());
			
			Element tag1 = codeList.get(0);
			System.out.println(tag1);
			
			String code1 = tag1.text();
			System.out.println(code1);
			
		//거래량 태그 가져오기
			Elements tradeQ = doc.select(".sptxt.sp_txt9");
			System.out.println(tradeQ.size());
			
			Element tag2 = tradeQ.get(0);
			System.out.println(tag2);
			
			String code2 = tag2.text();
			System.out.println(code2);
			
		//거래대금 태그 가져오기
			Elements tradeP = doc.select(".sptxt.sp_txt10");
			System.out.println(tradeP.size());
			
			Element tag3 = tradeP.get(0);
			System.out.println(tag3);
			
			String code3 = tag3.text();
			System.out.println(code3);
			
			//Elements : ArrayList와 기능적으로 비슷
			//Element : Element에서 요소 한개
			//.class
			//#id
			
			
		//현재가, 고가, 저가 가져오기
			Elements blindList = doc.select("span.blind");
			System.out.println(blindList.size());
			Element tag4 = blindList.get(12);		//현재가
			Element tag5 = blindList.get(16);		//고가
			Element tag6 = blindList.get(20);		//저가
			
			String today = tag4.ownText();
			String highP = tag5.ownText();
			String lowP = tag6.ownText();
			
			System.out.println("현재가 : " +today);
			System.out.println("고가 : " +highP);
			System.out.println("저가 : " +lowP);
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
