package com.multi.www.web03;

public class CoffeeMain2 {

	public static void main(String[] args) {
		Coffee2 c1 = Coffee2.getInstance();
		Coffee2 c2 = Coffee2.getInstance();
//		Coffee2 c3 = new Coffee2();		//Coffee2클래스 외부에서 객체 생성 불가하므로 에러 발생
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
