package 복습;

public class Mask사용 {

	public static void main(String[] args) {
		//1.입력(객체 생성)
		//1-1.
//		Mask mask1 = new Mask();	//객체생성
//		mask1.color = "하얀색";
//		mask1.price = 1000;
//		mask1.count = 3;
//		//멤버변수 값을 매번 준다 => 객체 생성 시 멤버 변수 값을 자동으로 넣어주는 처리를 하고 싶다.
		
		//1-2. 생성자(메소드) => constructor
		Mask mask1 = new Mask("하얀색", 1000, 3);
		
		//2. 출력
		//2-1.
		System.out.println(mask1.color);
		System.out.println(mask1.price);
		System.out.println(mask1.count);
		
		//2-2. toString()
		System.out.println(mask1);	//Mask [color=하얀색, price=1000, count=3]
	}
}
