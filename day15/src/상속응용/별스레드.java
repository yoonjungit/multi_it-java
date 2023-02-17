package 상속응용;

public class 별스레드 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 50000; i++) {
			System.out.println(i + ": ★");
	
		}
	}
}

