package ������;

//��ǰ�� �ִ� ��ġ�� �˷��ִ� ����
import javax.swing.JOptionPane;

public class ������1 {
	public static void main(String[] args) {
		//�⺻ ������ == �Է� -> ó�� -> ���
		//�Է� -> ��ǰ���, ��ġ���� ������ �ٷ� ����� �� �ִ� ��!!
		String data1 = JOptionPane.showInputDialog("What's your hobby?");
		String data2 = JOptionPane.showInputDialog("When do you do your hobby?");
		
		String result = data1 + data2;
		System.out.println(result);
		
		//ó�� -> ���ڿ���
		//��� -> ����� ȭ�鿡 ���̰� ����
		
		
	}
}
