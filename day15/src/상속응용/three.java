package 상속응용;

public class three extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("& " + i);
		}
	}
	public static void main(String[] args) {
		one a = new one();
		two b = new two();
		three c = new three();
		
		a.start();
		b.start();
		c.start();
	}
}
