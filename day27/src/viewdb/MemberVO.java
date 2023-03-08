package viewdb;

public class MemberVO {
	/*	프로그램 관계
	 * 	UI : viewdb/nMemberUI2.java
	 * 	VO : viewdb/MemberVO.java
	 *	DAO :javadb/memberDAO3.java
	 */ 
	
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	//하나의 변수당 set/get 하나씩 만들어줌
	//자동완성 : Source -> Generate Getters/Setters
	
	//가방에 하나씩 값을 넣어주어야 함.
	public void setId(String id) {
		this.id = id;
	}
	//가방에 하나씩 값을 꺼내주어야 함.
	public String getId() {
		return id;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setName(String name) {
		this.name = name;
	} 
	
	public String getName() {
		return name;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getTel() {
		return tel;
	}
	
	@Override
	public String toString() {
		return "<html>id=" + id + "<br>pw=" + pw +
				"<br>name=" + name + "<br>tel=" + tel + "</html>";
	}
}
