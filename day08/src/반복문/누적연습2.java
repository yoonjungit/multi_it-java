package 반복문;

import javax.swing.JOptionPane;

public class 누적연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 숫자누적
		int num = 0;
		for (int i = 5; i <= 300; i++) {
			if (i%5!=0) {
				continue;
			}
			num+=i;
		}
		System.out.println(num);
		
		//2. 문자누적
		String foods = "";
		for (int i = 0; i < 4; i++) {
			String food = JOptionPane.showInputDialog("먹고싶은 음식");
			foods = foods + food + "랑 ";
		}
		System.out.println(foods);
	}

}
