package 반복문;

import javax.swing.JOptionPane;

public class 연습문제1 {

	public static void main(String[] args) {
		int full = 0;
		int noFull = 0;
		for (int i = 0; i < 10; i++) {
			String reply = JOptionPane.showInputDialog("배부른가요? (y/n 으로 대답)");
			if (reply.equals("y")) {
				full++;
			} else if(reply.equals("n")) {
				noFull++;
			}
		}
		System.out.println("배부른 사람 "+full+"명");
		System.out.println("배안부른 사람 "+noFull+"명");
		
		
	}

}
