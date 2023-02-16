package 스태틱;

public class 변수 {
	int a;
	public int b;
	static int c;

	public static void statictest() {
//		System.out.println(a);
//		System.out.println(b);
		System.out.println(c);
	}
	public void test() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args) {
		변수 newone = new 변수();
		newone.test();
//		a = 100;
//		b = 200;
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
	}
}
