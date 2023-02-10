package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		int[] jumsu = new int[5];
		
		int sum = 0;
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("숫자 입력 : ");
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
				System.out.println("300이상 : " + i);
			}
		}
	}

}
