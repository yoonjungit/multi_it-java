package �ݺ���;

import javax.swing.JOptionPane;

public class ��������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p1 = 0;
		int p2 = 0;
		int p3 = 0;
		for (int i = 0; i < 10; i++) {
			String toll = JOptionPane.showInputDialog("�����ϴ� ������ �� \n 1)������, 2)������, 3)BTS");
			if (toll.equals("1")) {
				p1++;
			} else if(toll.equals("2")){
				p2++;
			} else if(toll.equals("3")) {
				p3++;
			}
		}
		
		System.out.println("������ " +p1+"��");
		System.out.println("������ " +p2+"��");
		System.out.println("BTS " +p3+"��");
		
		
	}

}
