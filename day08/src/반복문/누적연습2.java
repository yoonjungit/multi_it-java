package �ݺ���;

import javax.swing.JOptionPane;

public class ��������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. ���ڴ���
		int num = 0;
		for (int i = 5; i <= 300; i++) {
			if (i%5!=0) {
				continue;
			}
			num+=i;
		}
		System.out.println(num);
		
		//2. ���ڴ���
		String foods = "";
		for (int i = 0; i < 4; i++) {
			String food = JOptionPane.showInputDialog("�԰���� ����");
			foods = foods + food + "�� ";
		}
		System.out.println(foods);
	}

}
