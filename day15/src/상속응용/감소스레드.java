package �������;

public class ���ҽ����� extends Thread{
	
	@Override
	public void run() {
		for (int i = 50000; i > 0; i--) {
			System.out.println("���� >>" + i);
		}
	}
}
