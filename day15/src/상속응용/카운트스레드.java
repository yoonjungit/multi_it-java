package �������;

public class ī��Ʈ������ extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("ī��Ʈ >> "+ i);
			//cpu���� ������ ���½ð� ���� �˷��ݽô�
			//thread ��� ����
			//cpu�� �ܺ��ڿ��Դϴ�.
			//�ڹٰ� �ܺ��ڿ��� ������ ���� ����ũ�� ū ��Ȳ�̹Ƿ�
			//���� ������ ����� ��� ������ �ݵ�� try-catch�� �̿��� ����ó��
			try {
				Thread.sleep(1000);		//1�� =1000
			} catch (Exception e) {
				System.out.println("cpu ���� ���� ����");
			}
		}
	}
}
