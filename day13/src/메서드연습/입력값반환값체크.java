package �޼��忬��;

import java.util.Random;

import javax.swing.JOptionPane;

public class �Է°���ȯ��üũ {

	public static void main(String[] args) {
		Random r = new Random();
		int data1 = r.nextInt(5);// 0~4, 3
		String data2 = JOptionPane.showInputDialog("�̸� �Է�"); // String���� return
		JOptionPane.showMessageDialog(null, data2); // void

	}

}
