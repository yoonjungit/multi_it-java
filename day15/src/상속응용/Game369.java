package �������;

import javax.swing.JLabel;

public class Game369 extends Thread{		//������ Ŭ���� ���
	//������ �����ϱ� ���� �������� ����
	int ans;		//�Է°�(�÷����� ����)
	JLabel number = new JLabel();		//���� ī��Ʈ ��
	
	public Game369(int ans, JLabel number2) {
		this.ans = ans;
		this.number = number2;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= ans; i++) {
			
			//3, 6, 9�� ���� � ���ִ��� ī��Ʈ �ϱ� ���� i�� String���� ��ȯ
			String fin = Integer.toString(i);
			//3, 6, 9�� ���ڷ� ��ü�� �� ���� ���� ���ڿ� ���� ���� ���
			int a = fin.length()-fin.replace("3", "").length();		
			int b = fin.length()-fin.replace("6", "").length();
			int c = fin.length()-fin.replace("9", "").length();
			//sum = ���������� ����(3, 6, 9 ���� ����)
			int sum = a+b+c;
			
			//3, 6, 9�� �ϳ��� ���� ��� ���� ���� ���
			if (sum==0) {
				number.setText(i+"");
			//3, 6, 9�� �ϳ��� ������ ������ ���� ���� ���
			} else {
				number.setText("�ڼ�"+sum+"��("+i+")");
			}
			
			//1�ʾ� ������ �Ͻ�����
			try {
				Thread.sleep(1000);
			} catch (Exception e1) {
				System.out.println("CPU ���� �߻�");
			}
		
		}

	}
}

