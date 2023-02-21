package �ֽ������ý���;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�����ũ�Ѹ�2 {

	public static void naver(String getCode) {
		//�Ｚ����
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + getCode);
		
		Document doc = null;
		try {
			doc = con.get();
		
		//���簡, ��, ���� ��������
			Elements blindList = doc.select("span.blind");
			Elements h2tag = doc.select("h2");
			
			Element nametag = h2tag.get(1);
			String name = nametag.text();
			System.out.println(name);
			
			Element tag4 = blindList.get(12);		//���簡
			Element tag5 = blindList.get(16);		//��
			Element tag6 = blindList.get(20);		//����
			
			String today = tag4.ownText();
			String highP = tag5.ownText();
			String lowP = tag6.ownText();
			
			System.out.println("���簡 : " +today);
			System.out.println("�� : " +highP);
			System.out.println("���� : " +lowP);
			
			FileWriter file = new FileWriter(getCode +".txt");
			file.write(getCode + " " + name);
			file.write("���簡 : " +today);
			file.write("�� : " +highP);
			file.write("���� : " +lowP);
			System.out.println("���� ���� �Ϸ�");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}








