package 상속응용;

public class 카운트스레드 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("카운트 >> "+ i);
			//cpu에게 스레드 쉬는시간 텀을 알려줍시다
			//thread 잠깐 재우기
			//cpu는 외부자원입니다.
			//자바가 외부자원을 연결할 떄는 리스크가 큰 상황이므로
			//만약 문제가 생기면 어떻게 할지를 반드시 try-catch를 이용해 예외처리
			try {
				Thread.sleep(1000);		//1초 =1000
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김");
			}
		}
	}
}
