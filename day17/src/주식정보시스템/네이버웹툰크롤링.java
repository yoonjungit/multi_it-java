package �ֽ������ý���;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�����ũ�Ѹ� {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://comic.naver.com/index");
		
		Document doc = null;		//���� ���� �ʱ�ȭ(����)
		try {
			doc = con.get();		//html �ڵ带 �� ������ �ͼ� doc������ �־���
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
