package 네트워크프로그램;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		/*
		1. 받는 소켓 있어야 함 (port)
		2. 패킷으로 보냈기 때문에 빈 패킷을 만들어두면, 빈 패킷 안에는 빈 byte[]가 있어야 함
		3. 소켓이 받아서 빈 패킷에 넣음
		4. byte[]에 있는 String으로 바꾸어줌
		*/
		//1.
		DatagramSocket socket = new DatagramSocket(8888);
		
		//2.
		byte[] data = new byte[256];
		DatagramPacket packets = new DatagramPacket(data, data.length);
		
		//3.
		socket.receive(packets);
		
		//4.
		System.out.println("받은 데이터는 " + new String(data));
		
		//5.
		socket.close();
	}

}

