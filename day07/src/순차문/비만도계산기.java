package ������;

import javax.swing.JOptionPane;

public class �񸸵����� {
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("����� Ű��?");
		String weight = JOptionPane.showInputDialog("����� �����Դ�?");
		
		double height1 = Double.parseDouble(height);
		double weight1 = Double.parseDouble(weight);
		double result = weight1/((height1/100)*(height1/100));
		
		System.out.println(result);
		JOptionPane.showMessageDialog(null, result);
	}
}
