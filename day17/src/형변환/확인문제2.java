package ����ȯ;

import java.util.ArrayList;

public class Ȯ�ι���2 {
	public static void main(String[] args) {
		/*
		1.����ȯ(ĳ����)�̶�?
		���״�� ���¸� �ٲ��ִ� �� : Object-> Integer -> int -> Integer -> Object
		2. ��ĳ�����̶�? �ٸ� ����?
		�ڽ�. ���� -> ū ������ ����Ÿ������ ����ȯ int -> Integer -> Object
		3. �ٿ�ĳ�����̶�? �ٸ� ����?
		��ڽ�. ū-> ���� ������ ����Ÿ������ ����ȯ Object-> Integer -> int
		4. Car <- Truck ���� �θ�/�ڽ� Ŭ���� ����
		 Car : �θ�, Truck : �ڽ�
		5.	byte b = 100;
				int i = b; ���ο��� �Ͼ ó�� ����
		byte->int�� ����ȯ (�ٿ�ĳ����, ��ڽ�)
		6.	int i2 = 10;
				byte b2 = (byte)i2; ���ο��� �Ͼ ó�� ����
		int->byte�� ����ȯ (��ĳ����, �ڽ�)
		7. ����ڽ�
		�ڵ� ����ȯ. ����-> ū ������ ���� Ÿ������ ����ȯ int->Integer
		8. �����ڽ�
		�ڵ� ����ȯ. ū-> ���� ������ ���� Ÿ������ ����ȯ Integer-> int
		9. �Ʒ� �ڵ� �ּ� ����		*/
		ArrayList list = new ArrayList();	//���ο� ArrayList ����  
		list.add(100); //����Ʈ�� ���� 100 �ֱ�. �ڵ�����ȯ(��ĳ����, �ڽ�)
		int age = (Integer)list.get(0); //����Ʈ�� ���� 100 ������. �ڵ�����ȯ(�ٿ�ĳ����, ��ڽ�)
		
		// Overloading(������) / Overriding(������) �� ����� ���� �˱�
		
	}
}
