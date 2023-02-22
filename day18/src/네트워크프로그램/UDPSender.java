package 네트워크프로그램;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		/*
		1. UDP용 소켓 필요
	 	2. UDP용 패킷이 있어야 함 (데이터, 데이터의 크기, ip, port)
	 	3. 소켓을 이용해서 패킷을 보냄
		*/
		//1.
		DatagramSocket socket = new DatagramSocket();
		
		//2.
		String s = "I am a Java Programmer";
		byte[] data = s.getBytes();		//바이트 단위로 쪼개서 배열에 넣기
		InetAddress ip = InetAddress.getByName("localhost");
		//InetAddress ip = InetAddress.getByName("127.0.0.1"); 127.0.0.1 = localhost
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 8888);
		
		//3.
		socket.send(packet);
		
		//4. 소켓 종료
		socket.close();
	}

}
