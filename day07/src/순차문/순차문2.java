package ������;

//��ǰ�� �ִ� ��ġ�� �˷��ִ� ����
import javax.swing.JOptionPane;

public class ������2 {
	public static void main(String[] args) {
		//�⺻ ������ == �Է� -> ó�� -> ���
		//�Է� -> ��ǰ���, ��ġ���� ������ �ٷ� ����� �� �ִ� ��!!
		String data1 = JOptionPane.showInputDialog("���� �Է��Ͻÿ�-1");
		String data2 = JOptionPane.showInputDialog("���� �Է��Ͻÿ�-2");
		
		//ó�� -> ���� ���ϱ� ����
		//		String -> int �� ��ȯ
		int data11 = Integer.parseInt(data1); //�̶� �ٲٰ��� �ϴ� ���¸� �빮�ڷ� Integer, Double, Float ��
		int data22 = Integer.parseInt(data2);
		int data33 = Integer.parseInt(data1);
		int data44 = Integer.parseInt(data2);
		
		int result = data11 + data22;
		double result2 = data33 + data44;
		System.out.println(result + result2);
		
		//��� -> ����� ȭ�鿡 ���̰� ����
		
		
	}
}
