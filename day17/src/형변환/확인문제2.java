package 형변환;

import java.util.ArrayList;

public class 확인문제2 {
	public static void main(String[] args) {
		/*
		1.형변환(캐스팅)이란?
		말그대로 형태를 바꿔주는 것 : Object-> Integer -> int -> Integer -> Object
		2. 업캐스팅이란? 다른 말은?
		박싱. 작은 -> 큰 범위의 변수타입으로 형변환 int -> Integer -> Object
		3. 다운캐스팅이란? 다른 말은?
		언박싱. 큰-> 작은 범위의 변수타입으로 형변환 Object-> Integer -> int
		4. Car <- Truck 에서 부모/자식 클래스 구분
		 Car : 부모, Truck : 자식
		5.	byte b = 100;
				int i = b; 내부에서 일어난 처리 내용
		byte->int로 형변환 (다운캐스팅, 언박싱)
		6.	int i2 = 10;
				byte b2 = (byte)i2; 내부에서 일어난 처리 내용
		int->byte로 형변환 (업캐스팅, 박싱)
		7. 오토박싱
		자동 형변환. 작은-> 큰 범위의 변수 타입으로 형변환 int->Integer
		8. 오토언박싱
		자동 형변환. 큰-> 작은 범위의 변수 타입으로 형변환 Integer-> int
		9. 아래 코드 주석 적기		*/
		ArrayList list = new ArrayList();	//새로운 ArrayList 선언  
		list.add(100); //리스트에 정수 100 넣기. 자동형변환(업캐스팅, 박싱)
		int age = (Integer)list.get(0); //리스트에 정수 100 꺼내기. 자동형변환(다운캐스팅, 언박싱)
		
		// Overloading(다형성) / Overriding(재정의) 두 용어의 차이 알기
		
	}
}
