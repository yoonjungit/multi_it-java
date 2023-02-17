package 상속기본;

public class Car {
	String color;

	public void run() {
		System.out.println(color + "색 차가 도로 위를 달리다");
	}

	@Override
	public String toString() {
		return "Car [color=" + color + "]";
	}
}
