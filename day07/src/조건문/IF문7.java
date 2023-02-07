package 조건문;

import javax.swing.JOptionPane;

public class IF문7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1번 
		String password = JOptionPane.showInputDialog("암호를 대시오");
		if (password.equals("pass")) {
			System.out.println("들어오세요.");
		} else {
			System.out.println("나가세요.");
		}
		
		//2번
		String dinner = JOptionPane.showInputDialog("당신이 먹고 싶은 저녁 메뉴는? (자장면, 라면, 회 중 선택)");
		if (dinner.equals("자장면")) {
			System.out.println("중국집으로 가요");
		} else if(dinner.equals("라면")){
			System.out.println("분식집으로 가요");
		} else if(dinner.equals("회")){
			System.out.println("횟집으로 가요");
		}else {
			System.out.println("그냥 안먹어요");
		}
		
		
		//3번
		String num1 = JOptionPane.showInputDialog("정수를 입력하시오(1)");
		String num2 = JOptionPane.showInputDialog("정수를 입력하시오(2)");
		
		int num11 = Integer.parseInt(num1);
		int num22 = Integer.parseInt(num2);
		
		if (num11>num22) {
			System.out.println(num11);
		}else {
			System.out.println(num22);
		}
		
		
		//4번
		String no = "A100EX";
		char c = no.charAt(0);
		switch (c) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
			break;

		default:
			System.out.println("해당부서없음");
			break;
		}
	}
}
