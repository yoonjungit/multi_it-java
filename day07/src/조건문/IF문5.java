package ���ǹ�;

public class IF��5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "2055111"; //�ֹι�ȣ ���ڸ�
		
		// String�� �⺻�� �����Ͱ� �ƴϿ��� ��ɾ�(�Լ�)�� ����ؾ� ��.
		if (ssn.equals( "2055111")) {
			System.out.println("������ �������� �¾�̱���!");
		} else {
			System.out.println("������ �������� �¾�� �����̱���");
		}
		char gender = ssn.charAt(0);
		switch (gender) {
		case '1': case '3':
			System.out.println("����");
			break;
		case '2': case '4':
			System.out.println("����");
			break;
		default:
			System.out.println("?");
			break;
		}
	}
}
