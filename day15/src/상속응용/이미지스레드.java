package �������;

public class �̹��������� extends Thread{
	@Override
	public void run() {
		String[] images = {"1.png", "2.png", "3.png", "4.png", "5.png"};
		for (int i = 0; i < images.length; i++) {
			System.out.println("�̹��� >> " + images[i]);
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				System.out.println("cpu ���� ���� ����");
			}
		}
	}
}
