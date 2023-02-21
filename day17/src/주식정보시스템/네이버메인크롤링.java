package �ֽ������ý���;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�����ũ�Ѹ� {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("http://www.naver.com");
		System.out.println("1.��Ʈ��ũ ���� ����");
		
		Document doc = null;		//���� ���� �ʱ�ȭ(����)
		try {
			doc = con.get();		//html �ڵ带 �� ������ �ͼ� doc������ �־���
			Elements list = doc.select(".nav");
			//<a class="nav"> => navŬ������ a�±׸� �� ������ ArrayList�� ��ӹ��� Elements�� �ڵ����� �־���
			//[Element, Element, Element(tag)]
			
			System.out.println(list.size());	//��� ����
			
			for (int i = 0; i < list.size(); i++) {
				Element tag1 = list.get(i); //�±� ����
				System.out.println(tag1); //<a href="https://mail.naver.com/" class="nav" data-clk="svc.mail"><i class="ico_mail"></i>����</a>
				String text1 = tag1.text(); //�±� ������ �ؽ�Ʈ ����
				System.out.println(text1); //����
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}		
		//System.out.println(doc);
		
	}

}
