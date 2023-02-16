package 생성자;

public class 게시판글쓰기 {

	public static void main(String[] args) {
		bbs bbs1 = new bbs(1, "자바", "오늘은 생성자하는 날", "홍길동");
		System.out.println(bbs1);
		bbs bbs2 = new bbs(2, "JSP", "오늘은 웹프로그램 하는 날", "홍길동");
		System.out.println(bbs2);
		bbs bbs3 = new bbs(3, "SPRING", "오늘은 실무 웹프로그램 하는 날", "홍길동");
		System.out.println(bbs3);
	}

}
