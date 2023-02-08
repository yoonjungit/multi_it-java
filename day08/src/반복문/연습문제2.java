package 반복문;

import javax.swing.JOptionPane;

public class 연습문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p1 = 0;
		int p2 = 0;
		int p3 = 0;
		for (int i = 0; i < 10; i++) {
			String toll = JOptionPane.showInputDialog("좋아하는 연예인 픽 \n 1)아이유, 2)뉴진스, 3)BTS");
			if (toll.equals("1")) {
				p1++;
			} else if(toll.equals("2")){
				p2++;
			} else if(toll.equals("3")) {
				p3++;
			}
		}
		
		System.out.println("아이유 " +p1+"명");
		System.out.println("뉴진스 " +p2+"명");
		System.out.println("BTS " +p3+"명");
		
		
	}

}
