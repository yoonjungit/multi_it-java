package com.multi.www.web03;

public class CarMain2 {

	public static void main(String[] args) {
		Car2 car2;
		Car car = new Car("white", 240000, 320);
		System.out.println(car);
		Car vehicle;
		
		for (int i = 0; i < 100; i++) {
			car2 = Car2.getInstance();		//싱글톤 객체 생성
			System.out.println(car2);		//객체 1개 뿐이라 주소 다 같음
		}
	}

}
