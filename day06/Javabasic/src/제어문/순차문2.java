package ���;

import javax.swing.JOptionPane;

public class ������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���α׷��� � ������� ¥���ұ�?
		// 1. �Է� : �����͸� �������
		// 2. ó�� : Ư���� �۾� ����
		// 3. ��� : ó���� ������ �����ּ���
		// �ڹٴ� ���� ����ϴ� ��ǰ�� �빮�ڷ� �ٷ� �� �� �־��!
		// �ܺο��� ��ȭâ ���� ������ �Է¹��� ���� ������ ��ǻ�ʹ� ���ڿ�(String)�� �ν�
		String exercise = JOptionPane.showInputDialog("����� �����ϴ� ���?"); 
		String day = JOptionPane.showInputDialog("����� ��ϱ� �����ϴ� ������?"); 
		String result = day + "�� ���� " + exercise + "�� �մϴ�";
		System.out.println(result);
		
	}

}
