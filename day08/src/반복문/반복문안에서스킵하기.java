package �ݺ���;

public class �ݺ����ȿ�����ŵ�ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1��-10������ ������ �߿��� ¦���� ����Ʈ!
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				continue;		//Ȧ�� �ǳʶٱ�
			}
			if (i == 8) {
//				break;		//for�� ����
				System.exit(0);
			}
			System.out.println(i);
		}
		System.out.println("ddd");
	}

}
