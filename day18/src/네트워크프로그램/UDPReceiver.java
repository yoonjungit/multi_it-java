package ��Ʈ��ũ���α׷�;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		/*
		1. �޴� ���� �־�� �� (port)
		2. ��Ŷ���� ���±� ������ �� ��Ŷ�� �����θ�, �� ��Ŷ �ȿ��� �� byte[]�� �־�� ��
		3. ������ �޾Ƽ� �� ��Ŷ�� ����
		4. byte[]�� �ִ� String���� �ٲپ���
		*/
		//1.
		DatagramSocket socket = new DatagramSocket(8888);
		
		//2.
		byte[] data = new byte[256];
		DatagramPacket packets = new DatagramPacket(data, data.length);
		
		//3.
		socket.receive(packets);
		
		//4.
		System.out.println("���� �����ʹ� " + new String(data));
		
		//5.
		socket.close();
	}

}

