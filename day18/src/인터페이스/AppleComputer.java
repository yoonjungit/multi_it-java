package 인터페이스;

public class AppleComputer implements Computer{

	@Override
	public void turnOn() {
		System.out.println("Apple Computer를 켜다");
	}

	@Override
	public void turnOff() {
		System.out.println("Apple Computer를 끄다");
		
	}

	@Override
	public void print() {
		System.out.println("Apple Computer로 프린트하다");
		
	}
	
}
