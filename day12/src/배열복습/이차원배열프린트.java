package 배열복습;

public class 이차원배열프린트 {

	public static void main(String[] args) {
		//배열을 이미 알고 있는 경우
		int[][] n1= {
			  // 0  1  2
				{1, 2, 3},	//0
				{4, 5, 6}	//1
		};
		System.out.println(n1.length);		//2차원배열의 length(행), 2개
		System.out.println(n1[0][0]);
		System.out.println(n1[1][2]);
		
		for (int i = 0; i < n1.length; i++) {	//행
			for (int j = 0; j < n1[i].length; j++) {	//열
				System.out.println(n1[i][j]);
			}
		}
		
		//배열을 모르는 경우 -> 공간을 먼저 만듦
		int[][] n2 = new int[2][3];	//열 개수가 행마다 다른 경우 공란 ex)[2][]
		
		
	}

}
