package com.multi.www.web03;

public class Coffee2 {		//싱글톤
	//1. 변수값 지정 x(생성자 ㅇ)
	int price;
	String name;
	public static Coffee2 oatLatte;
	
	private Coffee2(int price, String name) {	//생성자
		this.price = price;
		this.name = name;
	}

	public static Coffee2 getInstance() {	//싱글톤 객체 생성/반환
		if (oatLatte == null) {
				oatLatte = new Coffee2(4000, "오트라떼");
		}
		return oatLatte;
	}
	
	//2. 변수값 지정(생성자 x)
//	int price = 4000;
//	String name = "오트라떼";
//	public static Coffee2 oatLatte;
	
//	public static Coffee2 getInstance() {	//싱글톤 객체 생성/반환
//		if (oatLatte == null) {		//변수 값을 지정했을때에는
//			oatLatte = new Coffee2();
//		}
//		return oatLatte;
//	}
	
}
