package 상속;

public class 원더우먼 extends 우먼{
	boolean superpower;
	public void fight() {
		System.out.println(personality + "한 " + name +"(이)가 악당을 물리쳤다.");
	}
	public void sleep() {
		System.out.println("잠을 충분히 자지 못했다.");
	}
	@Override
	public String toString() {
		return "원더우먼 [superpower=" + superpower + ", personality=" + personality + ", name=" + name + ", age=" + age
				+ "]";
	}
	
}
