package ������;

public class TV {
	//�������, ������ Ŭ���� �ٷ� �Ʒ��� �Ǿ��� ������
	//Ŭ���� ��ü �������� �� ������ ����� �� ����.
	//��������(global����, �۷ι� ����)
	//��������� �ڵ��ʱ�ȭ, ���������� �ڵ��ʱ�ȭ
	public int ch; //0
	public int vol; //0
	public boolean onOff; //false
	
	//�ٸ� ������ �޼��尡 ������ ��ǰ���鶧(��ü����) �ڵ����� ������.
	//�⺻ ������(default constructor)
//	public TV() {
//		//�ڵ����� ��������� �޼���(�Լ�)
//		System.out.println("TV��ü�� �ϳ� ������.");
//	}
	//��ü������ ������ �� �����Ű�� ���� ������ ������ �⺻ �����ڸ� ���� ���̰� 
	//�ٽ� ������ּ���. (���������!)
	//public TV() {
	//	System.out.println("TV��ü�� �ϳ� ������.");
	//}
	//�Ķ���� �ִ� ������
	//public TV(int ch, int vol, boolean onOff) {//�Ű�����(�Ķ����)
		//�����⿵��(������)�� ����� ��������� ���� �־��ִ� ����
	//	this.ch = ch;
	//	this.vol = vol;
	//	this.onOff = onOff;
	//}
	//�Ķ���� �ִ� �����ڰ� ���� ���� �⺻�����ڴ� �ڵ��������� ����.!
	public TV(int ch, int vol, boolean onOff) {
		this.ch = ch;
		this.vol = vol;
		this.onOff = onOff;
	}
	public TV(int ch, int vol) {
		this.ch = ch;
		this.vol = vol;
	}
	
	public void ä�����ٲٴ�() {
		int change = 1; //��������, local����, ���ú���, �ڵ��ʱ�ȭX
		System.out.println(ch + "���� " + change + "�� �ٲٴ�.");
	}

	public void ��Ʃ�꺸��() { //�޼��带 ����� ��==> �޼��� �����Ѵ�.��� ǥ��.
		System.out.println(vol + "�� Ű���� �������� ����.");
	}
	@Override
	public String toString() {
		return "TV [ch=" + ch + ", vol=" + vol + ", onOff=" + onOff + "]";
	}
	
	
}
