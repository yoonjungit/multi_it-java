package �������;

import java.util.Date;

public class Ÿ�̸ӽ����� extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Date date = new Date();
			System.out.println("Ÿ�̸� >> "+ date);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			System.out.println("cpu ���� ���� ����.");
			}
		}
	}
}
