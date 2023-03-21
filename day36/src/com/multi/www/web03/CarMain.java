package com.multi.www.web03;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car("white", 240000, 320);
		System.out.println(car);
		Car vehicle;
		
		for (int i = 0; i < 100; i++) {
			vehicle = new Car("red"+i, 10000, 280);		//각기 다른 객체 생성
			System.out.println(vehicle);		//따라서 주소값이 다 다름
		}
	}

}
