package �������;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Game369img extends Thread{
	//������ �����ϱ� ���� �������� ����
	int ans;
	JLabel clap = new JLabel();
	
	public Game369img(int ans, JLabel clap) {
		this.ans = ans;
		this.clap = clap;
	}

	@Override
	public void run() {
		//�ڼ� �̹��� clap �󺧿� �ֱ�
		ImageIcon icon = new ImageIcon("clap.png");
		clap.setIcon(icon);
		
		for (int i = 1; i <= ans; i++) {
			
			//3, 6, 9�� ���� � ���ִ��� ī��Ʈ �ϱ� ���� i�� String���� ��ȯ
			String fin = Integer.toString(i);
			//3, 6, 9�� ���ڷ� ��ü�� �� ���� ���� ���ڿ� ���� ���� ���
			int a = fin.length()-fin.replace("3", "").length();		
			int b = fin.length()-fin.replace("6", "").length();
			int c = fin.length()-fin.replace("9", "").length();
			//sum = ���������� ����(3, 6, 9 ���� ����)
			int sum = a+b+c;
			
			//3, 6, 9�� �ϳ��� ������ �̹��� ���̱�. ������ �����
			if (sum>0) {
				clap.setVisible(true);
			} else {
				clap.setVisible(false);
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
