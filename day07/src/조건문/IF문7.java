package ���ǹ�;

import javax.swing.JOptionPane;

public class IF��7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1�� 
		String password = JOptionPane.showInputDialog("��ȣ�� ��ÿ�");
		if (password.equals("pass")) {
			System.out.println("��������.");
		} else {
			System.out.println("��������.");
		}
		
		//2��
		String dinner = JOptionPane.showInputDialog("����� �԰� ���� ���� �޴���? (�����, ���, ȸ �� ����)");
		if (dinner.equals("�����")) {
			System.out.println("�߱������� ����");
		} else if(dinner.equals("���")){
			System.out.println("�н������� ����");
		} else if(dinner.equals("ȸ")){
			System.out.println("Ƚ������ ����");
		}else {
			System.out.println("�׳� �ȸԾ��");
		}
		
		
		//3��
		String num1 = JOptionPane.showInputDialog("������ �Է��Ͻÿ�(1)");
		String num2 = JOptionPane.showInputDialog("������ �Է��Ͻÿ�(2)");
		
		int num11 = Integer.parseInt(num1);
		int num22 = Integer.parseInt(num2);
		
		if (num11>num22) {
			System.out.println(num11);
		}else {
			System.out.println(num22);
		}
		
		
		//4��
		String no = "A100EX";
		char c = no.charAt(0);
		switch (c) {
		case 'A':
			System.out.println("��ȹ��");
			break;
		case 'B':
			System.out.println("�ѹ���");
			break;
		case 'C':
			System.out.println("���ߺ�");
			break;

		default:
			System.out.println("�ش�μ�����");
			break;
		}
	}
}
