package ���ǹ�;

import javax.swing.JOptionPane;

public class IF��8 {

	public static void main(String[] args) {
		
		//1. �� ���� ��Ģ�����ڸ� �Է¹޾� �� ���� ��Ģ�����ڿ� ���� ó���� ���
		String num1 = JOptionPane.showInputDialog("������ �Է����ֽÿ�(1)");
		String num2 = JOptionPane.showInputDialog("������ �Է����ֽÿ�(2)");
		String operator = JOptionPane.showInputDialog("�����ڸ� �Է����ֽÿ�");
		
		int num11 = Integer.parseInt(num1);
		int num22 = Integer.parseInt(num2);
		
		switch (operator) {
		case "+":
			System.out.println(num11+num22);
			break;
		case "-":
			System.out.println(num11-num22);
			break;
		case "/":
			System.out.println(num11/num22);
			break;
		case "*":
			System.out.println(num11*num22);
			break;

		default:
			System.out.println("wrong input");
			break;
		}
		
		
		//2. �� ���� �Է¹޾� ������ ��ȯ�Ͽ� ����������  ����, ������ ���� ������ �Ҽ��� 2°�ڸ����� ���!
		String n1 = JOptionPane.showInputDialog("������ �Է����ֽÿ�(1)");
		String n2 = JOptionPane.showInputDialog("������ �Է����ֽÿ�(2)");
		
		int n11 = Integer.parseInt(n1);
		int n22 = Integer.parseInt(n2);
		
		double result = (double)n11/n22;
		String result2 = String.format("%.2f", result);
		System.out.println(result2);
	}
}
