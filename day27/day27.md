# 27일차

## [1] 자바 GUI 스윙을 활용한 DAO 구현

프로그램 설계 순서 : 스윙으로 JFrame 레이아웃 구성 → VO 구성 

### 1. 실습

>1단계 : 레이아웃 구성

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224099223-6268b8af-6a81-4ccc-9834-3747246d14bd.png" width=200> </p>

>2단계 : 스캐너로 입력받은 데이터를 DAO 객체로 넘겨서 메소드 실행

```java
// 회원 가입 버튼 클릭 시
join.addActionListener(new ActionListener() {
			
	@Override
	public void actionPerformed(ActionEvent e) {
    	//1. 텍스트필드 입력값 가져오기
		String id2 = id.getText();
		String pw2 = pw.getText();
		String name2 = name.getText();
		String tel2 = tel.getText();
		
		//2-1. 만약 한 필드라도 빈 곳이 있으면 알림창 띄우기
		if (id2.equals("") || pw2.equals("") || name2.equals("") || tel2.equals("")) {
			JOptionPane.showMessageDialog(null, "필드를 채워주세요");
		}
		//2-2. 데이터가 다 채워졌으면 DAO 객체 생성 후 데이터 넘기기
		else {
			memberDAO2 mem = new memberDAO2();      //DAO 생성
			int result = mem.insert(id2, pw2, name2, tel2);     //DAO insert 메소드 실행
			
			//DAO에서 데이터 처리 결과 처리된 데이터의 수가 1이면 성공, 그외이면(0) 실패
			if (result == 1) {
				System.out.println("회원가입 성공");
			} else {
				System.out.println("회원가입 실패");
			}
		}
	}
});

public int insert(String id, String pw, String name, String tel) {
    //result : 메소드 실행 후 Oracle DB에서 처리된 행(row)수 받기
	int result = 0;
		
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("1. 오라클과 자바 연결할 부품 설정 성공");
		
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "oracle";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. 오라클 연결 성공");
		
		String sql = "INSERT INTO HR.MEMBER VALUES(?, ?, ?, ?)";	
		PreparedStatement ps = con.prepareStatement(sql);
		//?를 위치에 따라 각각 id, pw, name, tel로 차례대로 대입
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
	    System.out.println("3. SQL문 부품 만들기");
		
        //메소드 실행 후 결과 result로 받기
		result = ps.executeUpdate();
		System.out.println("4. SQL문 오라클로 보내기 성공");
		
	} catch (Exception e) {	//모든 예외 처리
		e.printStackTrace();
	}
    //결과 반환
	return result;
}
```

- Insert

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224098633-52ef5e12-715a-4a47-ba3e-a805a317c61c.gif" width=800> </p>

- Delete, Update

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224101465-366db7ff-34aa-456e-875b-b4cade671738.gif" width=800> </p>

- Search 기능은 아직 DAO에서 Select 구문을 구현하지 않아 X


코드 : [회원 UI](./src/viewdb/nMemberUI1.java), [회원 DAO](./src/viewdb/memberDAO2.java)


## [2] DTO 구현

```
DTO : 데이터를 한번에 클라이언트로부터 서버로 전송하기 위해 고안된 디자인 패턴
```

[25일차 참고](../day25/day25.md/#3-자바-어플리케이션-구조)



```java
//1. DTO
package viewdb;

    //get/set 메소드만 있으면 되지만, toString() 기능까지 구현해 VO로 명칭
public class MemberVO {

    //다른 클래스에서 변수 접근 못하게 private변수 설정
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	//하나의 변수당 set/get 하나씩 만들어줌 (나머지 변수 생략)
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
}

//2. UI
join.addActionListener(new ActionListener() {
			
    @Override
	public void actionPerformed(ActionEvent e) {
		//텍스트필드 입력값 가져오기
		String id2 = id.getText();
		String pw2 = pw.getText();
		String name2 = name.getText();
		String tel2 = tel.getText();
			
		//만약 한 필드라도 빈 곳이 있으면 알림창 띄우기
		if (id2.equals("") || pw2.equals("") || name2.equals("") || tel2.equals("")) {
    		JOptionPane.showMessageDialog(null, "필드를 채워주세요");
		} 
		// 데이터가 다 채워졌으면 VO클래스에 데이터를 넣고, DAO에 VO객체 전송
		else {
			memberDAO3 dao = new memberDAO3();
			MemberVO bag = new MemberVO();
			
			bag.setId(id2);
			bag.setPw(pw2);
			bag.setName(name2);
			bag.setTel(tel2);
			
			int result = dao.insert(bag);
			
			//DAO에서 데이터 처리 결과 처리된 데이터의 수가 1이면 성공, 그외이면(0) 실패
			if (result == 1) {
				System.out.println("회원가입 성공");
			} else {
				System.out.println("회원가입 실패");
			}
		}
	}
});

//3. DAO
public int insert(MemberVO bag) {
	int result = 0;
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "oracle";
		Connection con = DriverManager.getConnection(url, user, password);
			
		String sql = "INSERT INTO HR.MEMBER VALUES(?, ?, ?, ?)";	
		PreparedStatement ps = con.prepareStatement(sql);
		//MemberVO객체를 통해 데이터 받기
		ps.setString(1, bag.getId());
		ps.setString(2, bag.getPw());
		ps.setString(3, bag.getName());
		ps.setString(4, bag.getTel());
			
		//4. SQL문 오라클로 보내기
		result = ps.executeUpdate();
	
	} catch (Exception e) {	//모든 예외 처리
		e.printStackTrace();
	}
	return result;
}
```

- Delete 구현 (나머지는 위의 예제와 같음)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224117887-5f5cd6be-666d-4334-b1aa-fdaf0bf1fc5d.gif" width=800> </p>

코드 : [회원 UI](./src/viewdb/nMemberUI2.java), [회원 DTO](./src/viewdb/MemberVO.java), [회원 DAO](./src/javadb/memberDAO3.java)

## [3] 1차 프로젝트

##### 자바 스윙, 오라클 DB활용한 간단한 프로그램 만들기

프로그램 소개 PPT 만들기 (주제, 메뉴 등)

[프로젝트 일지](../project01/BestRestaurant.md)