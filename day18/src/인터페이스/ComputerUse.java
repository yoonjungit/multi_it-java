package �������̽�;

public class ComputerUse {
	public static void main(String[] args) {
		//�͸�Ŭ���� : �������̽��� ��ü ���� �Ұ��ϹǷ�, �͸�Ŭ����(�̸��� ���� Ŭ����)���� �� �޼ҵ� ���� �� ��� 
		//addActionListener ��ü�� �͸�Ŭ���� - Override������?
		
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
		//��ĳ���� ���� (����ȯ) �������̽�==�θ�Ŭ����
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
