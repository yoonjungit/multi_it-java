package ���;

public class ����ó��1 {

	public static void main(String[] args) {
		System.out.println("1. ���� ����Ʈ �ɰž�");
		try {
			//������ �߻��� �� ���� �ڵ� >>
			System.out.println("2. ���� �߻� �ڵ� >"+ 10/0);
		} catch (Exception e) {
			//�����߻� �� ���α׷��� ������ �ʰ� ��� ó���� �� �ڵ�
			System.out.println("���� �߻�");
			e.printStackTrace();
		}
		System.out.println("3. ���� ����?");
	}

}
