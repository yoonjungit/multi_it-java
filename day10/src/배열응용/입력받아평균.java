package �迭����;

import javax.swing.JOptionPane;

public class �Է¹޾���� {

	public static void main(String[] args) {
		int[] jumsu = new int[5];
		
		int sum = 0;
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("���� �Է� : ");
			jumsu[i] = Integer.parseInt(data);
			sum += jumsu[i];
		}
		int average = sum/(jumsu.length);
		for (int i : jumsu) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		System.out.println(average);
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i]>=300) {
				System.out.println("300�̻� : " + i);
			}
		}
	}

}
