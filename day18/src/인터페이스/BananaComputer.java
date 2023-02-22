package 인터페이스;

public class BananaComputer implements Computer{

	@Override
	public void turnOn() {
		System.out.println("Banana Computer를 켜다");
	}

	@Override
	public void turnOff() {
		System.out.println("Banana Computer를 끄다");
		
	}

	@Override
	public void print() {
		System.out.println("Banana Computer로 프린트 하다");
		
	}

}
