package ���ǹ�;

public class IF��3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ ������ �� ��
		int myNum = 99;
		
		if (myNum>=80) {
			System.out.println("�ֿ��");
		}else if (myNum>=70) {
			System.out.println("���");
		}else if (myNum>=60) {
			System.out.println("����");
		}else {
			System.out.println("�̴�");
		}
		
		
		//������ 80�� �̻��̸� �ֿ��
		//������ 70�� �̻��̸� ���
		//������ 60�� �̻��̸� ����
		//�� �Ʒ��� �̴�
		
		int myTour = 10; //���� ���� Ƚ��
		
		switch (myTour) {
		case 10:
			System.out.println("VVIP");
			break;
		case 6:
			System.out.println("VIP");
			break;
		default:
			System.out.println("Normal");
			break;
		}
		
		
		//���� Ƚ���� 10�̸� "VVIP" ����Ʈ
		//���� Ƚ���� 6�̸� "VIP" ����Ʈ
		//�� �Ʒ��� "Normal"����Ʈ
	}

}
