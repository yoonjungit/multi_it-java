package �ݺ���;

import javax.swing.JOptionPane;

public class �������� {

	public static void main(String[] args) {
		//iu=iu+1
		//sum=sum+i
		int sum = 0;		//������ �ʱ�ȭ
		for (int i = 1; i <= 1000; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		String sum2 = "";
		for (int i = 0; i < 3; i++) {
			String data = JOptionPane.showInputDialog("���� ���� ��");
			sum2 = sum2 + data + " " ;
		}
		System.out.println(sum2);
	}

}
