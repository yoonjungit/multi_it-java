package �ݺ���;

import javax.swing.JOptionPane;

public class ��������1 {

	public static void main(String[] args) {
		int full = 0;
		int noFull = 0;
		for (int i = 0; i < 10; i++) {
			String reply = JOptionPane.showInputDialog("��θ�����? (y/n ���� ���)");
			if (reply.equals("y")) {
				full++;
			} else if(reply.equals("n")) {
				noFull++;
			}
		}
		System.out.println("��θ� ��� "+full+"��");
		System.out.println("��Ⱥθ� ��� "+noFull+"��");
		
		
	}

}
