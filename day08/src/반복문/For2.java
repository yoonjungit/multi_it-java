package �ݺ���;

import javax.swing.JOptionPane;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(; ;) {
			System.out.println("�� ���� ����.");
			String data = JOptionPane.showInputDialog("�����ұ��?y�� �Է�");
			if (data.equals("y")) {
				System.out.println("�ȳ���������!");
				break;
			}
		}
		System.out.println("");
	}

}
