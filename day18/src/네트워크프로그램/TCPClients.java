package ��Ʈ��ũ���α׷�;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClients {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 100; i++) {
			/*
			������ Ŭ���̾�Ʈ ���ʿ� ��ȭ�� ������ �ϴ� ������ �־�� ��
			Ŭ���̾�Ʈ���� ������ ������ָ�, ������������ ���ο�û�� ����
			*/
			Socket socket = new Socket("localhost", 9100);
			System.out.println("Ŭ���̾�Ʈ ���� ��û ����.");
		}
	}

}
