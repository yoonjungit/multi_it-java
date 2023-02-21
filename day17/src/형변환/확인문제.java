package 형변환;

import java.util.ArrayList;

public class 확인문제 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000);	//Object <-업캐스팅- Integer <-오토박싱- int
		me.add(189.1);
		me.add(false);
		me.add("남");
		
		//ArrayList는 toString()가 재정의
		//list라는 참조형이기 때문에 list를 프린트하면 주소가 프린트
		//toString()이 재정의한 내용은 주소가 가리키는 값들을 String으로 만들어주도록 정의
		//list를 찍어보면 주소대신 String으로 만든 내용이 출력
		
		//1.
		System.out.println("전체 목록 프린트 : " + me);
		//2.
		int money = (Integer)me.get(0); //int <-오토언박싱- Integer <-다운캐스팅- Object
		System.out.println(2000+money);
		//3.
		double height = (Double)me.get(1);
		//double height = (double)me.get(1);	//()안에 double도 가능, Integer도 int 가능
		System.out.println(height+10);
		//4.
		boolean morning = (Boolean)me.get(2);
		if (morning==false) {	//morning만 쓰면 morning==true?임 근데 여기서는 false 물어보려고 ==false함
			System.out.println("아침을 먹어서 배불러요");
		}else {
			System.out.println("아직 아침을 안먹어서 배고파요");
		}
		//5.
		String gender = (String)me.get(3);
		if (gender.equals("남")) {
			System.out.println("주민번호는 1,3이예요");
		}else {
			System.out.println("주민번호는 2,4예요");
		}
		//6.
		System.out.println("2-3에서 형변환은 다운캐스팅");
		System.out.println("강제형변환, Object -> Integer(래퍼클래스) -> (오토언박싱)int");
		System.out.println("강제형변환, Object -> Double(래퍼클래스) -> (오토언박싱)double");
	}

}
