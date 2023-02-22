package 인터페이스;

public class ComputerUse {
	public static void main(String[] args) {
		//익명클래스 : 인터페이스로 객체 생성 불가하므로, 익명클래스(이름이 없는 클래스)생성 후 메소드 지정 후 사용 
		//addActionListener 자체도 익명클래스 - Override있으면?
		
		Computer com = new Computer() {
			
			@Override
			public void turnOn() {
				System.out.println("turnOn");
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				
			}
		};
		com.turnOn();
		
		AppleComputer appleC = new AppleComputer();
		//업캐스팅 가능 (형변환) 인터페이스==부모클래스
		Computer appleC2 = new AppleComputer();
		
		BananaComputer bananaC = new BananaComputer();
		
		appleC.turnOn();
		appleC.turnOff();
		appleC.print();
		appleC2.print();
		
		bananaC.turnOn();
		bananaC.turnOff();
		bananaC.print();
	}
}
