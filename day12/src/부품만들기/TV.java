package ��ǰ�����;

public class TV {
	//�������, ������ Ŭ���� �ٷ� �Ʒ��� �Ǿ��� ������
	//Ŭ���� ��ü ��������  �� ������ ����� �� ����.
	//�������� (global ����, �۷ι� ����)
	//��������� �ڵ��ʱ�ȭ, �������� �ڵ��ʱ�ȭ
	public int ch;
	public int vol;
	public boolean onOff;
	
	public void ä�����ٲٴ�() {
		int change = 1;	//��������, local ����, ���ú���, �ڵ��ʱ�ȭX
		System.out.println(ch + "���� "+ change +"�� �ٲٴ�." );
	}
	
	public void ��Ʃ�꺸��() {	//�޼��� ����� �� = ����� �����ϴ�. ��� ǥ��
		System.out.println(vol + "�� Ű���� �������� ����.");
	}
}