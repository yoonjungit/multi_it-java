package ������;

public class ���� {

		String name;
		String ssn;
		int money;
		
		//�̸�, �ֹι�ȣ, ���� �Է��ؾ� ������ ���� �� ����
		
		public ����(String name, String ssn, int money) {
			super();		//��������
			this.name = name;
			this.ssn = ssn;
			this.money = money;
		}
		
		//toString() : �ּ� ��� �� �ּҰ� ����Ű�� ��� ���� ������ ����Ʈ 
		@Override
		public String toString() {
			return "���� [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
		}
		
		
		
}
