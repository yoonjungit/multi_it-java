package ��Ʈ��ũ���α׷�;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class chatB extends JFrame{
	DatagramSocket socket;
	JTextArea list;
	JTextField input;
	
	public static void main(String[] args) {
		chatB �޽���B = new chatB();
		�޽���B.process();
	}
	
	public chatB() {
		//1. ���� ����
		try {
			socket = new DatagramSocket(5555);	//A:7777, B:5555
		} catch (SocketException e1) {
			e1.printStackTrace();
		}
		
		//2.��������
		list = new JTextArea();
		input = new JTextField();
		
		//3. JFrame ����
		setTitle("�޽��� B");
		setSize(300, 500);
		getContentPane().setBackground(Color.white);
		list.setBackground(Color.yellow);
		input.setBackground(Color.pink);
		Font font = new Font("�ü�", 1, 30);
		list.setFont(font);
		input.setFont(font);
		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);
		setSize(300, 500);
		
		//4. �޽��� ������ ���
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = input.getText();

				try {
					DatagramSocket socket = new DatagramSocket();

					byte[] data = s.getBytes();
					InetAddress ip = InetAddress.getByName("localhost");
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7777);

					list.append("B(��)>>" + s +"\n");
					input.setText("");
					socket.send(packet);
				} catch (Exception e2) {
				}
				
			}
		});

		setVisible(true);
	}
	
	//5. ������ ���� (���ѷ���)
	public void process() {
		while (true) {
			try {
				System.out.println("B ���ӿϷ�");
				
				byte[] data = new byte[256];
				DatagramPacket packets = new DatagramPacket(data, data.length);
				socket.receive(packets);
				list.append("A(��)>>" + new String(data) + "\n");				
			} catch (SocketException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	

}
