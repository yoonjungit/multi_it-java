package �迭����;

public class �������迭����ϱ�2 {

	public static void main(String[] args) {
		String[] names = {"ȫ�浿","�̼���","������","��ź","����ũ"};
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };
		
		int count_2 = 0;
		int count_s = 0;
		
		//1-2.
		for (int i = 0; i < term2.length; i++) {
			if (term2[i]>term1[i]) {
				count_2++;
			}else if (term1[i]==term2[i]) {
				count_s ++;
			}
		}
			
			System.out.println("2�б⿡ ������ ���� �л��� �� "+count_2+"��");
			System.out.println("1�б�� 2�б� ������ ������ �л��� �� "+count_s+"��");
			
		//3.
		for (int i = 0; i < term2.length; i++) {
			if (term2[i]==100) {
				System.out.println("2�б� ������ : "+ i + "�� " + names[i]);
			}
		}	
		
		//4.
		int sum1 = 0;
		int sum2 = 0;
		
		for (int j = 0; j < term2.length; j++) {
			sum1+=term1[j];
			sum2+=term2[j];
		}
		
		double avg1 = (double)sum1/term1.length;
		double avg2 = (double)sum2/term2.length;
		
		if (avg1>avg2) {
			System.out.println("1�бⰡ �� ����� ����");
		} else if (avg1<avg2) {
			System.out.println("2�бⰡ �� ����� ����");
		}else {
			System.out.println("�� �б��� ����� ����");
		}
		
		//5.
		for (int j = 0; j < names.length; j++) {
			if (names[j].equals("������")) {
				System.out.println("������ ���� : "+term1[j]+ "/" + term2[j]);
			}
		}
		
	}

}
