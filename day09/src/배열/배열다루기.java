package �迭;

public class �迭�ٷ�� {

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

		System.out.println("\n1. ���� : ");
		char[] gender = {'��', '��', '��', '��', '��'};
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i]+" ");
		}
		System.out.println("\n2. �̸� : ");
		String[] name = {"����","����","���","����","����"};
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+" ");
		}
		System.out.println("\n3. �÷� : ");
		double[] eye = {0.5, 0.6, 1.0, 1.0, 0.7};
		for (int i = 0; i < eye.length; i++) {
			System.out.print(eye[i]+" ");
		}
		System.out.println("\n4. ���� : ");
		boolean[] lunch = {true, true, false, true, true};
		for (int i = 0; i < lunch.length; i++) {
			System.out.print(lunch[i]+" ");
		}
	}

}
