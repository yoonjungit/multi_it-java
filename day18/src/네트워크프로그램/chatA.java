package 네트워크프로그램;

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

public class chatA extends JFrame{
	DatagramSocket socket;
	JTextArea list;
	JTextField input;
	
	public static void main(String[] args) {
		chatA 메신저A = new chatA();
		메신저A.process();
	}
	
	public chatA() {
		//1. 소켓 생성
		try {
			socket = new DatagramSocket(7777);	//A:7777, B:5555
		} catch (SocketException e1) {
			e1.printStackTrace();
		}
		
		//2.전역변수
		list = new JTextArea();
		input = new JTextField();
		
		//3. JFrame 생성
		setTitle("메신저 A");
		setSize(300, 500);
		getContentPane().setBackground(Color.white);
		list.setBackground(Color.PINK);
		input.setBackground(Color.YELLOW);
		Font font = new Font("궁서", 1, 30);
		list.setFont(font);
		input.setFont(font);
		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);
		setSize(300, 500);
		
		//4. 메시지 보내기 기능(데이터 송신)
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = input.getText();

				try {
					DatagramSocket socket = new DatagramSocket();

					byte[] data = s.getBytes();
					InetAddress ip = InetAddress.getByName("localhost");
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 5555);

					list.append("A(나)>>" + s +"\n");
					input.setText("");
					socket.send(packet);
				} catch (Exception e2) {
				}
				
			}
		});

		setVisible(true);
	}
	
	//5. 데이터 수신 (무한루프)
	public void process() {
		while (true) {
			try {
				System.out.println("A 접속완료");
				
				byte[] data = new byte[256];
				DatagramPacket packets = new DatagramPacket(data, data.length);
				socket.receive(packets);
				list.append("B(너)>>" + new String(data) + "\n");				
			} catch (SocketException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
