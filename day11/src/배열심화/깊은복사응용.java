package �迭��ȭ;

public class ������������ {
	public static void main(String[] args) {
		String[] ����� = {"����", "����", "����", "��ǻ��", "ȸȭ"};
		int[] �б�1���� = { 44, 66, 22, 99, 100 };
		int[] �б�2���� = �б�1����.clone();
		System.out.println(�б�1���� == �б�2����);
		
		�б�2����[0] = 22;
		�б�2����[2] = 88;
		
		System.out.println("1�б� ���� : ");
		for (int i : �б�1����) {
			System.out.print(i+ " ");
		}
		System.out.println("\n2�б� ���� : ");
		for (int i : �б�2����) {
			System.out.print(
					i+ " ");
		}
		int count = 0;
		int up = 0;
		for (int i = 0; i < �б�2����.length; i++) {
			if (�б�1����[i]==�б�2����[i]) {
				count++;
			}else if (�б�1����[i]<�б�2����[i]) {
				up++;
				System.out.print("\n������ ���� ���� >> " + �����[i]);
			}
			
		}
		System.out.println("\n1�б�� 2�б� ������ ������ ���� �� : "+ count);
		System.out.println("2�б⿡ ���� ���� �� : " + up);
		
	}
}
