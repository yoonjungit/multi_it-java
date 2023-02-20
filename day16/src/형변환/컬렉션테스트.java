package 형변환;

import java.util.ArrayList;

public class 컬렉션테스트 {

	public static void main(String[] args) {
		//많은 양의 데이터를 다루는 부품류를 콜렉션
		//==> 종류가 많다.
		//==> 많은 양의 데이터들도 특징이 있고, 그 특징에 따라 
		// 	     콜렉션의 종류가 많음
		//==> 배열 + 사이즈 조절 + 타입 아무거나 넣을 수 있는 ArrayList
		ArrayList list = new ArrayList() ; 
		list.add("홍길동");
		list.add(100);
		list.add(11.2);
		list.add(true);
		//toString() 재정의 되어있기 때문에 가리키는 값들이 프린트
		System.out.println(list);		//[홍길동, 100, 11.2, true]
		System.out.println(list.get(0));//홍길동
		System.out.println(list.get(1));//100
		System.out.println(list.get(2));//11.2
		System.out.println(list.get(3));//true
		
		list.add(0, "김길동");
		System.out.println(list);		//[김길동, 홍길동, 100, 11.2, true]
		
		list.remove(0);					//remove : 파괴함수
		System.out.println(list);		//[홍길동, 100, 11.2, true]
		
		list.set(0,  "정길동");			//set : 파괴함수
		System.out.println(list);		//[정길동, 100, 11.2, true]
		
		int index = list.indexOf(true);	//list에 true 위치
		System.out.println(index);
		
		boolean result = list.contains(list);	//포함여부 확인
		System.out.println(result);
	}

}
