package ��Ʈ��ũ���α׷�;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		/*
		1. UDP�� ���� �ʿ�
	 	2. UDP�� ��Ŷ�� �־�� �� (������, �������� ũ��, ip, port)
	 	3. ������ �̿��ؼ� ��Ŷ�� ����
		*/
		//1.
		DatagramSocket socket = new DatagramSocket();
		
		//2.
		String s = "I am a Java Programmer";
		byte[] data = s.getBytes();		//����Ʈ ������ �ɰ��� �迭�� �ֱ�
		InetAddress ip = InetAddress.getByName("localhost");
		//InetAddress ip = InetAddress.getByName("127.0.0.1"); 127.0.0.1 = localhost
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 8888);
		
		//3.
		socket.send(packet);
		
		//4. ���� ����
		socket.close();
	}

}
