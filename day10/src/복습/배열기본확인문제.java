package 복습;

public class 배열기본확인문제 {

	public static void main(String[] args) {
		String[] travel = {"엘에이","뉴욕","런던","파리","베를린"};
		for (String x : travel) {
			System.out.println(x);
		}
		
		Character[] c = {'r','g','b','y','w'};
		for (Character y : c) {
			System.out.println(y);
		}
		
		int[] height = {179, 174, 181, 179, 174};
		for (int i : height) {
			System.out.println(i);
		}
	}

}
