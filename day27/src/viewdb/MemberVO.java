package viewdb;

public class MemberVO {
	/*	���α׷� ����
	 * 	UI : viewdb/nMemberUI2.java
	 * 	VO : viewdb/MemberVO.java
	 *	DAO :javadb/memberDAO3.java
	 */ 
	
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	//�ϳ��� ������ set/get �ϳ��� �������
	//�ڵ��ϼ� : Source -> Generate Getters/Setters
	
	//���濡 �ϳ��� ���� �־��־�� ��.
	public void setId(String id) {
		this.id = id;
	}
	//���濡 �ϳ��� ���� �����־�� ��.
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
