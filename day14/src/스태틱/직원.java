package ����ƽ;

public class ���� {
	String name;
	int age;
	String gender;
	static int count;
	static int sum;
	
	public static void getAvg() {
		//static �޼ҵ忡�� ���������� ������ ���� ���� ������ ���� static ������ ������ ����
		System.out.println(sum/count);
	}
	
	public ����(String name, int age, String gender) {
		count++;
		sum += age;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "���� [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}
                          