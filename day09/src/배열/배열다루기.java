package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
		int[] x = new int[10];
		x[0] = 10;
		x[1] = 20;
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}

		System.out.println("\n1. 성별 : ");
		char[] gender = {'남', '여', '여', '여', '남'};
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i]+" ");
		}
		System.out.println("\n2. 이름 : ");
		String[] name = {"수니","위니","우니","유니","세니"};
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+" ");
		}
		System.out.println("\n3. 시력 : ");
		double[] eye = {0.5, 0.6, 1.0, 1.0, 0.7};
		for (int i = 0; i < eye.length; i++) {
			System.out.print(eye[i]+" ");
		}
		System.out.println("\n4. 점심 : ");
		boolean[] lunch = {true, true, false, true, true};
		for (int i = 0; i < lunch.length; i++) {
			System.out.print(lunch[i]+" ");
		}
	}

}
