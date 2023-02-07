package 순차문;

import javax.swing.JOptionPane;

public class 비만도계산기 {
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("당신의 키는?");
		String weight = JOptionPane.showInputDialog("당신의 몸무게는?");
		
		double height1 = Double.parseDouble(height);
		double weight1 = Double.parseDouble(weight);
		double result = weight1/((height1/100)*(height1/100));
		
		System.out.println(result);
		JOptionPane.showMessageDialog(null, result);
	}
}
