package �޼��忬��;

public class ������3 {

	public static void main(String[] args) {
		����3 cal3 = new ����3();
		int price = 7000;
		int count1 = 5; //������ �� �մ� ��
		int count2 = 4; //���Ŀ� �� �մ� ��
		System.out.println(Math.abs(-123));
		System.out.println("���� �� �մ��� �� ���� " + cal3.add(count1, count2) + "�� �Դϴ�.");
		System.out.println("�մ� �� ���̴� " + cal3.minus(count1, count2) + "�� �Դϴ�.");
		System.out.println("���� �����ݾ��� " + cal3.mul(count1, price) + "�� �Դϴ�.");
		System.out.println("���� �����ݾ��� " + cal3.mul(count2, price) + "�� �Դϴ�.");
		System.out.println("���� �Ϸ� �� ���� �ݾ��� " + cal3.mul(cal3.add(count1, count2), price) + "�� �Դϴ�.");
		System.out.println("1�δ� ���� �ݾ��� " + cal3.div(cal3.mul(count1+count2, price), count1+count2) + "�� �Դϴ�.");
	}

}
