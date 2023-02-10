package 복습;

public class 배열만들기 {

	public static void main(String[] args) {
		String[] hobby = {"run", "book", "swim", "walk"};
		
		String[] jobs = new String[5];
		
		System.out.println(hobby);
		System.out.println(jobs);
		
		for (String x : hobby) {
			System.out.println(x);
		}
	}

}
