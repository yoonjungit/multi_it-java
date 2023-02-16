package »ý¼ºÀÚ;

public class bbs {
	int no;
	String title;
	String content;
	String writer;
	
	public bbs(int no, String title, String content, String writer) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "bbs [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
}