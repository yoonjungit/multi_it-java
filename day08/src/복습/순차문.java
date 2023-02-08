package 복습;

import javax.swing.JOptionPane;

public class 순차문 {
	public static void main(String[] args) {
		// 두개의 숫자를 입력 받아서 처리해서 출력
		// input으로 받는 값은 스트링으로 처리
		// 램에 저장공간을 만드는 것 => 선언!
		// 선언할 때 램에 저장공간인 변수가 만들어짐
		// 데이터타입 변수명
		// 입력!
		String n1 = JOptionPane.showInputDialog("숫자1 입력");
		String n2 = JOptionPane.showInputDialog("숫자2 입력");
		// 처리
		// 정수로 바꾸어주는 처리
		int n11 = Integer.parseInt(n1);
		int n22 = Integer.parseInt(n2);
		
		System.out.println((double)n11/n22);
	}
}
