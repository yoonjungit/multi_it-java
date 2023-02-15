package 메서드연습;

public class 계산기2 {
	//입력값의 타입, 개수, 순서가 다르면 메소드 이름을 동일하게 쓰는 것 가능 (다른 메소드로 인식)
	//-> 하나의 이름으로 다양한 형태 구현 가능 (다형성, 오버로딩)
	public int add(int x, int y) {
		return x + y;
	}
	public double add(double x, int y) {
		return x + y;
	}
	public double add2(int x, double y) {
		return x + y;
	}
	public int add3(int x, int y) {
		return x + y;
	}
	public String add4(int x, String y) {
		return x + y;
	}

}
