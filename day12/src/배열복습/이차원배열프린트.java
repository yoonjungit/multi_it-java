package �迭����;

public class �������迭����Ʈ {

	public static void main(String[] args) {
		//�迭�� �̹� �˰� �ִ� ���
		int[][] n1= {
			  // 0  1  2
				{1, 2, 3},	//0
				{4, 5, 6}	//1
		};
		System.out.println(n1.length);		//2�����迭�� length(��), 2��
		System.out.println(n1[0][0]);
		System.out.println(n1[1][2]);
		
		for (int i = 0; i < n1.length; i++) {	//��
			for (int j = 0; j < n1[i].length; j++) {	//��
				System.out.println(n1[i][j]);
			}
		}
		
		//�迭�� �𸣴� ��� -> ������ ���� ����
		int[][] n2 = new int[2][3];	//�� ������ �ึ�� �ٸ� ��� ���� ex)[2][]
		
		
	}

}
