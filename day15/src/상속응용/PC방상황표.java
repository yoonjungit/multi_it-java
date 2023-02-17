package 상속응용;

public class PC방상황표 {

	public static void main(String[] args) {
		카운트스레드 count = new 카운트스레드();
		타이머스레드 timer = new 타이머스레드();
		이미지스레드 image = new 이미지스레드();
		
		count.start();
		timer.start();
		image.start();
	}

}
