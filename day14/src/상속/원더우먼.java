package ���;

public class ������� extends ���{
	boolean superpower;
	public void fight() {
		System.out.println(personality + "�� " + name +"(��)�� �Ǵ��� �����ƴ�.");
	}
	public void sleep() {
		System.out.println("���� ����� ���� ���ߴ�.");
	}
	@Override
	public String toString() {
		return "������� [superpower=" + superpower + ", personality=" + personality + ", name=" + name + ", age=" + age
				+ "]";
	}
	
}
