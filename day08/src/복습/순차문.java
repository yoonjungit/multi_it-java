package ����;

import javax.swing.JOptionPane;

public class ������ {
	public static void main(String[] args) {
		// �ΰ��� ���ڸ� �Է� �޾Ƽ� ó���ؼ� ���
		// input���� �޴� ���� ��Ʈ������ ó��
		// ���� ��������� ����� �� => ����!
		// ������ �� ���� ��������� ������ �������
		// ������Ÿ�� ������
		// �Է�!
		String n1 = JOptionPane.showInputDialog("����1 �Է�");
		String n2 = JOptionPane.showInputDialog("����2 �Է�");
		// ó��
		// ������ �ٲپ��ִ� ó��
		int n11 = Integer.parseInt(n1);
		int n22 = Integer.parseInt(n2);
		
		System.out.println((double)n11/n22);
	}
}
