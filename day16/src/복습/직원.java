package 복습;

public class 직원 {
	//public : 같은 + 다른 패키지(아무데서나 접근 가능)
	public String name;
	//protected : 같은 패키지에서만, 다른 패키지는 상속할때만
	protected int salary;
	//default : 같은 패키지 안에서만
	String address;
	//private : 같은 클래스에서만
	private int rrn;
	
	public static void main(String[] args) {
		직원 worker = new 직원();
		worker.name = "홍길동";
		worker.salary = 100;
		worker.address = "서울";
		worker.rrn = 9999;
	}
	
}



//
//public int getRrn() {
//	return rrn;
//}