package 상속기본;

public class FlyCar extends Car {
	boolean fly;
	public void flying() {
		System.out.println(color + "색 차는 하늘을 날수 있는가?" + fly);
	}
}
