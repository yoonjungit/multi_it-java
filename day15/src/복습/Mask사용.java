package ����;

public class Mask��� {

	public static void main(String[] args) {
		//1.�Է�(��ü ����)
		//1-1.
//		Mask mask1 = new Mask();	//��ü����
//		mask1.color = "�Ͼ��";
//		mask1.price = 1000;
//		mask1.count = 3;
//		//������� ���� �Ź� �ش� => ��ü ���� �� ��� ���� ���� �ڵ����� �־��ִ� ó���� �ϰ� �ʹ�.
		
		//1-2. ������(�޼ҵ�) => constructor
		Mask mask1 = new Mask("�Ͼ��", 1000, 3);
		
		//2. ���
		//2-1.
		System.out.println(mask1.color);
		System.out.println(mask1.price);
		System.out.println(mask1.count);
		
		//2-2. toString()
		System.out.println(mask1);	//Mask [color=�Ͼ��, price=1000, count=3]
	}
}
