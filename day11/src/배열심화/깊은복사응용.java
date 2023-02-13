package 배열심화;

public class 깊은복사응용 {
	public static void main(String[] args) {
		String[] 과목명 = {"국어", "영어", "수학", "컴퓨터", "회화"};
		int[] 학기1성적 = { 44, 66, 22, 99, 100 };
		int[] 학기2성적 = 학기1성적.clone();
		System.out.println(학기1성적 == 학기2성적);
		
		학기2성적[0] = 22;
		학기2성적[2] = 88;
		
		System.out.println("1학기 성적 : ");
		for (int i : 학기1성적) {
			System.out.print(i+ " ");
		}
		System.out.println("\n2학기 성적 : ");
		for (int i : 학기2성적) {
			System.out.print(
					i+ " ");
		}
		int count = 0;
		int up = 0;
		for (int i = 0; i < 학기2성적.length; i++) {
			if (학기1성적[i]==학기2성적[i]) {
				count++;
			}else if (학기1성적[i]<학기2성적[i]) {
				up++;
				System.out.print("\n성적이 오른 과목 >> " + 과목명[i]);
			}
			
		}
		System.out.println("\n1학기와 2학기 성적이 동일한 과목 수 : "+ count);
		System.out.println("2학기에 오른 과목 수 : " + up);
		
	}
}
