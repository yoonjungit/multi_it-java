package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버메인크롤링 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("http://www.naver.com");
		System.out.println("1.네트워크 연결 성공");
		
		Document doc = null;		//로컬 변수 초기화(수동)
		try {
			doc = con.get();		//html 코드를 다 가지고 와서 doc변수에 넣어줌
			Elements list = doc.select(".nav");
			//<a class="nav"> => nav클래스의 a태그를 다 가져와 ArrayList를 상속받은 Elements에 자동으로 넣어줌
			//[Element, Element, Element(tag)]
			
			System.out.println(list.size());	//요소 개수
			
			for (int i = 0; i < list.size(); i++) {
				Element tag1 = list.get(i); //태그 추출
				System.out.println(tag1); //<a href="https://mail.naver.com/" class="nav" data-clk="svc.mail"><i class="ico_mail"></i>메일</a>
				String text1 = tag1.text(); //태그 사이의 텍스트 추출
				System.out.println(text1); //메일
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}		
		//System.out.println(doc);
		
	}

}
