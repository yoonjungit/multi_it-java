package ����;

public class ���� {
	//public : ���� + �ٸ� ��Ű��(�ƹ������� ���� ����)
	public String name;
	//protected : ���� ��Ű��������, �ٸ� ��Ű���� ����Ҷ���
	protected int salary;
	//default : ���� ��Ű�� �ȿ�����
	String address;
	//private : ���� Ŭ����������
	private int rrn;
	
	public static void main(String[] args) {
		���� worker = new ����();
		worker.name = "ȫ�浿";
		worker.salary = 100;
		worker.address = "����";
		worker.rrn = 9999;
	}
	
}



//
//public int getRrn() {
//	return rrn;
//}