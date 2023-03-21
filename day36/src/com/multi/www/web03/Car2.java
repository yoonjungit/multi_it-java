package com.multi.www.web03;

public class Car2 {
	String color;
	int price;
	int speed;
	//public : 만든 변수를 아무데서나 쓸 수 있도록 
	//static : 변수 하나만 만들 때
	public static Car2 car2;
	
	private Car2(String color, int price, int speed) {		//private : Car 클래스 외부에서 객체 생성 불가
		this.color = color;
		this.price = price;
		this.speed = speed;
	}
	
	public static Car2 getInstance() {
		if (car2==null) {
			car2 = new Car2("빨강", 100, 100);
		}
		return car2;
	}
	public void run() {
		System.out.println("달리자~~~~~!");
	}
	
	
}