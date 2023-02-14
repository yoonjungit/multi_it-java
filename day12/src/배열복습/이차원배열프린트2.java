package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		String[][] s = {
				{"런던", "바스", "브라이튼"},
				{"파리", "샤모니", "니스"},
				{"베를린", "뮌헨", "프랑크푸르트"}
		};
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.println(s[i][j]);
			}
		}
	}

}
