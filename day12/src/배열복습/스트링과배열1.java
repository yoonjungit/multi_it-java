package 배열복습;

public class 스트링과배열1 {

	public static void main(String[] args) {
		String s = "나는 프로그래머프야";
		String s2 = "진짜!!";
		
		//String 합치기
		System.out.println(s+s2);
		System.out.println(s.concat(s2));
		
		//String 문자 추출
		System.out.println(s.charAt(0));
		char c = s.charAt(0);
		
		System.out.println(s.endsWith("야"));
		boolean result = s.endsWith("야");
		
		//String 문자열 추출
		String result2 = s.substring(3); //인덱스 3이후 문자열 전체
		String result3 = s.substring(3, 8);
		System.out.println(result2);
		System.out.println(result3);
		
		boolean result4 = s.contains(s2);
		int index = s.lastIndexOf("프"); //마지막 "프"위치 추출
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		s.replace("나", "너");	//비파괴함수
		System.out.println(s);
	}

}
