package �������;

import java.util.Scanner;

public class �α���ǥ�ý��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0;		//���� : �Է°�
		int iu = 0;		//���� : ������ ǥ 
		int bts = 0;	//���� : ��ź�ҳ�� ǥ
		int nj = 0;		//���� : ������ ǥ
		System.out.println("�α���ǥ �ý���");
		System.out.println("===========");
			while (true) {
				System.out.print("1) ������, 2) ��ź, 3) ������, 4) ���� >>");
				i = sc.nextInt();	//�Է°� ���� ��ȯ �� ���� i�� ����
				if(i==4){			//���� ���� ��
					System.out.println("�ý����� �����մϴ�.");
					System.out.println("---------------");
					break;
				}else if (i==1) {	//������ ���ý�
					iu+=1;
				} else if(i==2){	//��ź ���ý�
					bts+=1;
				} else if(i==3){	//������ ���ý�
					nj+=1;
				}
			}
		//���� �� ��ǥ ��� ����Ʈ
		System.out.println("������ : "+ iu + "ǥ");
		System.out.println("��ź : "+ bts + "ǥ");
		System.out.println("������ : "+ nj + "ǥ");
		System.out.println("---------------");

		sc.close();		//��ĳ�� �ݱ�
	}

}
