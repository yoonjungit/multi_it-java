package 상속;

public class CoffeeTruck extends Truck{
	int cups;
	boolean ready;
	
	@Override
	public void drive() {
		System.out.println(name + "에 현재 컵은" + cups + "개" + ",직원은 " + ppl);
		System.out.println("오늘도 장사 준비 완료?" + ready);
	}

	@Override
	public String toString() {
		return "CoffeeTruck [cups=" + cups + ", 장사준비완료=" + ready + ", ppl=" + ppl + ", name=" + name + ", kind=" + kind
				+ "]";
	}
	
	
}
