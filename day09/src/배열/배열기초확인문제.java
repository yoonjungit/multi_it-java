package �迭;

public class �迭����Ȯ�ι��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		int[] arr = new int[5];
		
		//2.
		System.out.println(arr.length);
		
		//3.
		arr[0]=100;
		System.out.println(arr[0]);
		
		//4.
		arr[4]=500;
		System.out.println(arr[4]);
		
		//5.
		arr[2]=200;
		System.out.println(arr[2]);
		
		//6.
		for (int i = 0;  i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println(" ");
		
		//7.
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] : "+arr[i]);
			
		}

	}

}
