package ����ƽ;

public class �� {
	String �̸�;
	String ����;
	static int �ƺ����� = 10000;
	static int count;
	
	public ��(String �̸�, String ����) {
		count++;
		�ƺ�����-=1000;
		this.�̸� = �̸�;
		this.���� = ����;
	}
	
	@Override
	public String toString() {
		return "�� [�̸�=" + �̸� + ", ����=" + ���� + "]";
	}
	
	
}
