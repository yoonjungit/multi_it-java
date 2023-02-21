package �ֽ������ý���;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�����ũ�Ѹ� {

	public static void main(String[] args) {
		//�Ｚ����
//		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		//īī��
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=035720");
		//���̹�
//		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=035420");
		
		Document doc = null;
		try {
			doc = con.get();
		//�ڵ� ��������
			Elements codeList = doc.select(".code");
			System.out.println(codeList.size());
			
			Element tag1 = codeList.get(0);
			System.out.println(tag1);
			
			String code1 = tag1.text();
			System.out.println(code1);
			
		//�ŷ��� �±� ��������
			Elements tradeQ = doc.select(".sptxt.sp_txt9");
			System.out.println(tradeQ.size());
			
			Element tag2 = tradeQ.get(0);
			System.out.println(tag2);
			
			String code2 = tag2.text();
			System.out.println(code2);
			
		//�ŷ���� �±� ��������
			Elements tradeP = doc.select(".sptxt.sp_txt10");
			System.out.println(tradeP.size());
			
			Element tag3 = tradeP.get(0);
			System.out.println(tag3);
			
			String code3 = tag3.text();
			System.out.println(code3);
			
			//Elements : ArrayList�� ��������� ���
			//Element : Element���� ��� �Ѱ�
			//.class
			//#id
			
			
		//���簡, ��, ���� ��������
			Elements blindList = doc.select("span.blind");
			System.out.println(blindList.size());
			Element tag4 = blindList.get(12);		//���簡
			Element tag5 = blindList.get(16);		//��
			Element tag6 = blindList.get(20);		//����
			
			String today = tag4.ownText();
			String highP = tag5.ownText();
			String lowP = tag6.ownText();
			
			System.out.println("���簡 : " +today);
			System.out.println("�� : " +highP);
			System.out.println("���� : " +lowP);
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
