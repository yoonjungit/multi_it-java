package 상속;

public class 사람{	//사람 뒤에 extends Object 생략
	String name;
	int age;
	
	public void eat() {
		System.out.println("먹다.");
	}
	public void sleep() {
		System.out.println("자다.");
	}
	@Override
	public String toString() {
		return "사람 [name=" + name + ", age=" + age + "]";
	}
	
}
