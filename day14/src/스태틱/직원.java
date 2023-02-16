package 스태틱;

public class 직원 {
	String name;
	int age;
	String gender;
	static int count;
	static int sum;
	
	public static void getAvg() {
		//static 메소드에서 전역변수를 접근할 때는 같은 성격을 가진 static 변수만 접근이 가능
		System.out.println(sum/count);
	}
	
	public 직원(String name, int age, String gender) {
		count++;
		sum += age;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}
                          