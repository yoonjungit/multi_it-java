package 부품만들기;

public class 강아지 {
	public String name;
	public String family;
	public int age;
	
	public void meal() {
		System.out.println(name+"! 맘마 먹자");
	}
	public void stroll() {
		System.out.println(name+"! 산책갈까?");
	}
	public void hospital() {
		System.out.println("애기 몇살이에요? 종은요?");
		System.out.println(age+"살 입니다. "+family+"이고요");
	}
	}
