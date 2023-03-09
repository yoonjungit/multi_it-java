# 28일차

## [1] SQL : Select 구현(결과행 1개)

```
다른 SQL구문과 달리 Select문은 테이블을 반환해야 한다. 따라서 DAO에서 Select문 실행 후 DTO에 테이블을 반환 해 UI로 보내 클라이언트에 결과를 보여주어야 한다.
```

### 1. 코드

`ResultSet` : SQL실행 결과를 나타내는 테이블 [참고](https://docs.oracle.com/javase/7/docs/api/java/sql/ResultSet.html)

`executeQuery` : SQL문 실행 후 ResultSet을 반환 하기 위한 메소드. PreparedStatement와는 사용할 수 없음(테이블을 반환하지 않으므로) [참고](https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html#executeQuery(java.lang.String))

>DAO

```java
public MemberVO search(MemberVO bag) {
	ResultSet rs = null;                //Resultset 객체 생성
	MemberVO result = new MemberVO();	//결과 반환을 위한 MemberVO객체(DTO) 생성
			
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "oracle";
		Connection con = DriverManager.getConnection(url, user, password);
	
		String sql = "SELECT * FROM HR.MEMBER WHERE id = ?";	
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getId());	
	
		rs = ps.executeQuery();		//executeQuery
		
		if (rs.next()) {	//rs.next()만약 반환된게 있으면(이때 조회되는 데이터가 없으면 null 반환. else 구문은 필요 없음)
			String id2 = rs.getString(1);	//반환되는 열 데이터 값 순서대로 받기
			String pw2 = rs.getString(2);
			String name2 = rs.getString(3);
			String tel2 = rs.getString(4);
					
			result.setId(id2);		//result MemberVO객체에 값 set하기
			result.setPw(pw2);
			result.setName(name2);
			result.setTel(tel2);
		}
	} catch (Exception e) {	//모든 예외 처리
		e.printStackTrace();
	}
	return result;		//result 반환
}
```

>UI

```java
//조회 버튼 클릭 시
search.addActionListener(new ActionListener() {
			
	@Override
	public void actionPerformed(ActionEvent e) {
		MemberVO bag = new MemberVO();      //결과 값을 받기 위한 DTO객체
		memberDAO4 dao = new memberDAO4();  //Select문 실행을 위한 DAO 실행
		
		String id2 = id.getText();      //조회하려는 id 텍스트 필드 값에서 가져오기
		bag.setId(id2);     //DTO객체에 조회하려는 id값 넣기
		
		MemberVO result1 = dao.search(bag); //Select문 실행. 이때 결과 DTO를 받기 위한 새로운 DTO 객체(result) 생성
		
		result.setVisible(true);
		
		if (result1==null) {
			result.setText("검색 결과 없음");
		}else {
			result.setText(result1.toString());	//반환받은 result(DTO)객체 toString 메소드 실행
		}
	}
});
```

>실습1

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224474570-b61e4530-2f8c-4dae-940c-d89708c4b9b6.gif" width=700> </p>

Member 테이블 참조 : [회원 UI](./src/viewdb/nMemberUI3.java), [회원 DTO](./src/viewdb/MemberVO.java), [회원 DAO](./src/javadb/memberDAO4.java)

>실습2

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224475877-92d57aa4-e1dd-40cd-827d-914e0cf5e6b6.gif" width=700> </p>

Product 테이블 참조 : [Product UI](./src/viewdb/ProductUI.java), [Product DTO](./src/viewdb/ProductVO.java), [Product DAO](./src/viewdb/ProductDAO.java)

>실습3

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224477863-2d6d4f3e-d275-49c2-886a-399a69660a2b.gif" width=700> </p>

BBS 테이블 참조 : [BBS UI](./src/viewdb/nBbsUI2.java), [BBS DTO](./src/viewdb/BbsVO.java), [BBS DAO](./src/javadb/bbsDAO2.java)

>실습4

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224477862-8d0bbd92-8348-4b84-aa15-cf110c579fe0.gif" width=300> </p>

Member 테이블 참조 : [회원 UI](./src/viewdb/LoginUI.java), [회원 DTO](./src/viewdb/MemberVO.java), [회원 DAO](./src/javadb/memberDAO4.java)


## [2] 1차 프로젝트 (조별)

##### 자바 스윙, 오라클 DB활용한 간단한 프로그램 만들기

DB설계, 기초UI 구현

[프로젝트 일지](../project01/BestRestaurant.md/#2-구현-1단계-28일차)