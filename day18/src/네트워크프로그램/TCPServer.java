package 네트워크프로그램;

import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
												//네트워크 통신 에러시 Exception
	public static void main(String[] args) throws Exception {
		/*
		1. 승인용 소켓을 만들어주자.
		2. 서버는 계속 살아있게 하기 위해 무한루프 돌리기
		3. 승인요청이 들어오면 승인을 해주고,통실할 수 있는 소켓을 만들어주자
		*/
		ServerSocket server = new ServerSocket(9100);	//9100 : port -> 일반적으로 네글자를 넣어줌. 9100은 아무의미 없음
		System.out.println("승인용 서버 소켓이 시작됨.");
		System.out.println("클라이언트 연결을 기다리는 중");
		int count = 0;
		while (true) {
			//ppt 44-45페이지 해보기
			Socket socket = server.accept();
			count++;
			System.out.println(count + ">> 번째 승인완료! Socket 생성됨");
		}
	}

}
