package 배열;

public class 배열개념 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] jumsu = {10, 20, 30, 40};
		System.out.println(jumsu);
		System.out.println(jumsu[0]);
		System.out.println(jumsu[1]);
		System.out.println(jumsu[2]);
		System.out.println(jumsu[3]);
		System.out.println("전체 개수 : "+jumsu.length);
		jumsu[0] = 100;
		System.out.println(jumsu[0]);
		int[] jumsu2 = new int[4];
		jumsu[3] = 23;
		System.out.println(jumsu2[3]);
	}

}
