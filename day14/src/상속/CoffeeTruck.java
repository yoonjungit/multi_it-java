package ���;

public class CoffeeTruck extends Truck{
	int cups;
	boolean ready;
	
	@Override
	public void drive() {
		System.out.println(name + "�� ���� ����" + cups + "��" + ",������ " + ppl);
		System.out.println("���õ� ��� �غ� �Ϸ�?" + ready);
	}

	@Override
	public String toString() {
		return "CoffeeTruck [cups=" + cups + ", ����غ�Ϸ�=" + ready + ", ppl=" + ppl + ", name=" + name + ", kind=" + kind
				+ "]";
	}
	
	
}
