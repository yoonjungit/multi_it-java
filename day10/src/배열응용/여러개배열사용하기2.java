package 배열응용;

public class 여러개배열사용하기2 {

	public static void main(String[] args) {
		String[] names = {"홍길동","이순신","뉴진스","방탄","블랙핑크"};
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
			
			System.out.println("2학기에 성적이 오른 학생은 총 "+count_2+"명");
			System.out.println("1학기와 2학기 성적이 동일한 학생은 총 "+count_s+"명");
			
		//3.
		for (int i = 0; i < term2.length; i++) {
			if (term2[i]==100) {
				System.out.println("2학기 만점자 : "+ i + "번 " + names[i]);
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
			System.out.println("1학기가 더 평균이 높음");
		} else if (avg1<avg2) {
			System.out.println("2학기가 더 평균이 높음");
		}else {
			System.out.println("두 학기의 평균은 같음");
		}
		
		//5.
		for (int j = 0; j < names.length; j++) {
			if (names[j].equals("뉴진스")) {
				System.out.println("뉴진스 성적 : "+term1[j]+ "/" + term2[j]);
			}
		}
		
	}

}
