package 조건문;

import javax.swing.JOptionPane;

public class IF문8 {

	public static void main(String[] args) {
		
		//1. 두 수와 사칙연산자를 입력받아 두 수를 사칙연산자에 따라 처리후 출력
		String num1 = JOptionPane.showInputDialog("정수를 입력해주시오(1)");
		String num2 = JOptionPane.showInputDialog("정수를 입력해주시오(2)");
		String operator = JOptionPane.showInputDialog("연산자를 입력해주시오");
		
		int num11 = Integer.parseInt(num1);
		int num22 = Integer.parseInt(num2);
		
		switch (operator) {
		case "+":
			System.out.println(num11+num22);
			break;
		case "-":
			System.out.println(num11-num22);
			break;
		case "/":
			System.out.println(num11/num22);
			break;
		case "*":
			System.out.println(num11*num22);
			break;

		default:
			System.out.println("wrong input");
			break;
		}
		
		
		//2. 두 수를 입력받아 정수로 변환하여 정수변수에  저장, 나누기 연산 수행후 소숫점 2째자리까지 출력!
		String n1 = JOptionPane.showInputDialog("정수를 입력해주시오(1)");
		String n2 = JOptionPane.showInputDialog("정수를 입력해주시오(2)");
		
		int n11 = Integer.parseInt(n1);
		int n22 = Integer.parseInt(n2);
		
		double result = (double)n11/n22;
		String result2 = String.format("%.2f", result);
		System.out.println(result2);
	}
}
