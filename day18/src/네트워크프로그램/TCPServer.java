package ��Ʈ��ũ���α׷�;

import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
												//��Ʈ��ũ ��� ������ Exception
	public static void main(String[] args) throws Exception {
		/*
		1. ���ο� ������ ���������.
		2. ������ ��� ����ְ� �ϱ� ���� ���ѷ��� ������
		3. ���ο�û�� ������ ������ ���ְ�,����� �� �ִ� ������ ���������
		*/
		ServerSocket server = new ServerSocket(9100);	//9100 : port -> �Ϲ������� �ױ��ڸ� �־���. 9100�� �ƹ��ǹ� ����
		System.out.println("���ο� ���� ������ ���۵�.");
		System.out.println("Ŭ���̾�Ʈ ������ ��ٸ��� ��");
		int count = 0;
		while (true) {
			//ppt 44-45������ �غ���
			Socket socket = server.accept();
			count++;
			System.out.println(count + ">> ��° ���οϷ�! Socket ������");
		}
	}

}
