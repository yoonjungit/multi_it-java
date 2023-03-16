# 33일차

## [1] (복습) DAO 클래스/Insert, Delete, Update 메소드 생성 + JSP 연결

>복습 예제 : 게시판 테이블

*Overview*

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/225566638-af093421-60a2-49a8-b518-5386a3637a03.gif" width=400> </p>

[DAO](./src/multi/BbsDAO.java), [DTO](./src/multi/BbsVO.java)

|Insert|Update|Delete|
|:---:|:---:|:---:|
|[HTML](./WebContent/insert2.html), [JSP](./WebContent/insert2.jsp)|[HTML](./WebContent/update2.html), [JSP](./WebContent/update2.jsp)|[HTML](./WebContent/delete2.html), [JSP](./WebContent/delete2.jsp)|

- 게시판 글 등록 시(Insert) auto increment 설정으로 DAO SQL문 생성 시 NO 컬럼 값 생략

DB >

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/225563507-26a5e021-ba07-4376-a939-9ab1c1e5a630.png" width=400> </p>

DAO >
```java
public int insert(BbsVO vo) {
	int result = 0;
	try {
		//맨 첫번째  NO 컬럼이 있지만 (NO, TITLE, CONTENT, WRITER) auto increment 설정으로 생략, 이후 컬럼 값만 넣어줌
		String sql = "INSERT INTO BBS (TITLE, CONTENT, WRITER) VALUES(?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getTitle());
		ps.setString(2, vo.getContent());
		ps.setString(3, vo.getWriter());
		
		result = ps.executeUpdate();
	} catch (Exception e) {	//모든 예외 처리
		e.printStackTrace();
	}
	return result;
}
```

JSP > 마찬가지로 NO외의 컬럼 값만 가져옴

```jsp
<%
    String title = request.getParameter("TITLE"); 
    String content = request.getParameter("CONTENT");
    String writer = request.getParameter("WRITER");
    
    BbsVO vo = new BbsVO();
    vo.setTitle(title);
    vo.setContent(content);
    vo.setWriter(writer);
    
    BbsDAO dao = new BbsDAO();
    int result = dao.insert(vo);
%>
```

HTML > NO 입력 칸 없앰.

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/225568192-bdabb8e6-7b1a-48e9-810d-223ae5c4b1a7.gif" width=400></p>

## [2] JSP에서 DTO 객체 생성시 Java Bean 사용

`jsp:useBean` JSP, Bean을 사용해!

Bean???

>실습 : 상품테이블

*Overview*

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/225568896-f91b2e1a-e0de-4540-a8d5-d636696ad035.gif" width=400></p>

[DAO](./src/multi/ProductDAO.java), [DTO](./src/multi/ProductVO.java)

|Insert|Update|Delete|
|:---:|:---:|:---:|
|[HTML](./WebContent/insert3.html), [JSP](./WebContent/insert3.jsp)|[HTML](./WebContent/update3.html), [JSP](./WebContent/update3.jsp)|[HTML](./WebContent/delete3.html), [JSP](./WebContent/delete3.jsp)|

>Java Bean

그동안 HTML에서 클라이언트가 입력한 값은 다음과 같이 form태그로 지정한 jsp로 form태그 안의 데이터를 전송하였고,

*필요 없는 코드는 생략

```html
<!-- insert.html -->
<form action = "insert.jsp">
<table>
	<tr>
		<td class="t1">아이디 : </td>
		<td>
			<input name = "id">
		</td>
	</tr>
</table>
</form> 
```

```jsp
<!-- insert.jsp -->
<%
String id = request.getParameter("id");
MemberVO bag = new MemberVO();
bag.setId(id);
%>
```

request 내장객체와 getParameter(name) 메소드를 사용해 데이터를 가져 왔다.

<details>
<summary>내장객체란</summary>

`내장객체` : JSP 내에서 선언하지 않고 사용할 수 있는 객체로, JSP가 서블릿 형태로 자동 변환된 코드 내에 자동으로 포함되어 있는 멤버변수, 메서드 매개변수 등이다. <br><br>

`request`는 JSP에서 사용자 요청(request)를 처리하고 응답을 다른 페이지로 전달하는 기능을 제공하는 객체로, 원래 javax.servlet.http.HttpServletRequest 클래스의 객체이다. 그러나 편의를 위해 이를 따로 선언하지 않고 쓸 수 있다. 대신 객체명은 `request`로 고정되어있다. [참고](https://ybdeveloper.tistory.com/21#toc-request%C2%A0) <br><br>

- 주요 메서드

getParameterNames()	: 현재 요청에 포함된 매개변수의 이름을 열거 형태로 리턴
getParameter(name) : 문자열 name에 매칭된 value를 리턴
getParamterValues(name)	: 문자열 name에 매칭된 value를 배열 형태로 가져옴 <br>

</details> <br>

그러나 매번 클라이언트의 입력값을 받아와 DTO 객체를 생성하려면 매번 일일이 `getter`/`setter` 메소드를 입력해야 한다. 멤버변수가 많으면 JSP 페이지에 자바 코드가 길어지고 복잡해진다. 따라서 이를 해결하고자 `Java Bean` 개념이 나오게 되었다. <br><br>

*Learning Java*에서 자바 빈을 다음과 같이 정의 하고 있다.<br><br>

`Java beans` are ordinary Java objects that play by these rules. <br>

즉 자바 빈은 몇가지 규칙을 따르는 보통의 자바 객체이며, 규칙은 다음과 같다

1. Must implement `Serializable`. <br>`직렬화`가 가능해야 한다. 직렬화란 자바 내부에서 쓰는 데이터를 외부로 내보낼 때 byte형태로 변환하는 것으로, 반대로 byte형태의 데이터를 원래 데이터로 변환하는 것 모두이며 [여기](https://techblog.woowahan.com/2550/)를 참고
2. It should have a `public no-arg constructor`. <br>`기본 생성자`가 있어야 한다.
3. All `properties` in java bean must be `private` with `public getters and setter methods`. <br>모든 `property`(여기서 자바 빈이 관리하는 데이터)는 `private`이어야 하고, `getter/setter`메소드는 `public`이어야 한다.<br><br>


그리고 `getter`/`setter`메소드 관련 각각의 규칙은 다음과 같다.<br><br>

**Syntax for setter methods:**<br><br>

1. It should be public in nature.
2. The return-type should be void.
3. The setter method should be prefixed with set.
4. It should take some argument i.e. it should not be no-arg method.<br><br>

**Syntax for getter methods:**<br><br>

1. It should be public in nature.
2. The return-type should not be void i.e. according to our requirement we have to give return-type.
3. The getter method should be prefixed with get.
4. It should not take any argument.<br><br>

[출처](https://www.geeksforgeeks.org/javabean-class-java/)<br><br>

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/225673113-06178a87-4305-41bc-9d54-835924591e23.png" width=300></p>

[Java Bean 예제](https://devbin.kr/jsp-javabean-%EC%9D%98-%EA%B0%9C%EB%85%90%EA%B3%BC-%EA%B5%AC%EC%A1%B0-jsp-%EC%97%90%EC%84%9C-%EC%82%AC%EC%9A%A9%ED%95%98%EB%8A%94-%EB%B0%A9%EB%B2%95/)<br><br>

자바빈으로 생성할 DTO(VO)클래스를 다음과 같이 생성했고,

```java
package multi;

public class ProductVO {
	private String id;
	private String name;
	private String content;
	private int price;
	private String company;
	private String img;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
    //나머지 변수 생략
}
```
[HTML](./WebContent/insert3.html)에서 사용자가 각 멤버변수 데이터를 입력하였을때, [JSP](./WebContent/insert3.jsp)에서는 클라이언트가 입력한 데이터를 다음과 같이 Bean 객체 생성 후 get메소드를 실행한다.

```jsp
//자바빈 객체 생성 → jsp:usebean id = "자바빈객체이름" class="패키지위치 포함한 자바빈 대상 클래스명"
<jsp:useBean id="vo" class="multi.ProductVO"></jsp:useBean>
//여기서 자바빈 객체는 vo란 이름으로, multi패키지 안 ProductVO클래스로 빈을 생성한다.
//자바빈 객체를 어디서 이용할 지 범위 scope을 명시하기도 하는데, page, request, session, application 등이 있다.

//set 메소드 → jsp:setProperty property="가져올html데이터명" name="저장할 자바빈 객체명"
<jsp:setProperty property="*" name="vo"/>
//여기서 property=*는 연결되어있는 html <form>태그 안 데이터 전체를 가리키며 이로 vo자바빈 객체에 set을 실행하라는 것이다.
//특정 값만 가져오고 싶으면 property에 html내 그 데이터 변수명을 입력하고, value="멤버변수명"을 추가한다.
//get메소드는 getProperty → <jsp:getProperty property="company" name="vo"/> : vo객체의 회사명 가져오기
//혹은 빈즈 메소드 말고, DTO내 get메소드로 가져오고 싶으면 자바스크립트릿 <% %>으로  <% vo.getCompany() %>하면 가져올 수 있다.
```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/225647395-d3e0e41d-3799-43b1-9f1f-a9e7eae8d143.gif" width=400></p>


>실습 : 영화 테이블

Insert : [HTML](./WebContent/insert4.html), [JSP](./WebContent/insert4.jsp)


<p align="center"><img src="https://user-images.githubusercontent.com/64455378/225664058-2b39c1d4-f3ad-429b-a344-82b2017fe5c8.gif" width=300></p>


## [3] Select문

흐름은 Oracle DB - Java.Swing 수업 때와 같다. [28일차](../day28/day28.md/#1-sql--select-구현결과행-1개), [29일차](../day29/day29.md/#1-sql--select-구현결과행-2개-이상)

>실습 : 게시판 글 검색

[DAO](./src/multi/BbsDAO.java), [DTO](./src/multi/BbsVO.java)

글 번호로 검색 : [HTML](./WebContent/select2.html)[JSP](./WebContent/select2.jsp)

전체 글 리스트 : [JSP](./WebContent/selectAll2.jsp), 검색 화면은 생략(메인 페이지에서 바로 이동)

<br> 실습화면은 코드 설명 아래<br><br>
1. DAO 클래스 : Select 메소드

```java
public ArrayList selectAll() {
//public MemberDTO select() { : 결과 행이 하나인 경우 DTO(VO)객체 반환
    ArrayList<MemberVO> result = new ArrayList<>();

    //커넥션 생략
    String sql = "SELECT * FROM HR.MEMBER";	
    PreparedStatement ps = con.prepareStatement(sql);

    rs = ps.executeQuery();		//executeUpdate가 아닌 executeQuery(반환 결과가 정수가 아닌 데이터(표)이기 때문)
            
    while (rs.next()) {
        //DTO(VO)객체 get/set
        //행 여러개 있을 시 배열에 저장 후 배열 반환
    }
    return result;
    // return vo 행 한개인 경우 VO(DTO)객체 반환
}
```

2. JSP에서는 자바 스크립트릿으로 DAO객체 생성 및 Select메소드 실행 후, 결과 행수에 따라 DTO(VO)객체, 혹은 배열로 반환 받은 후 이를 클라이언트에 보여주면 된다. 

```jsp
<%
    //행 1개
    int no = Integer.parseInt(request.getParameter("no"));      //검색하고자 하는 글 번호 입력
    
    BbsDAO dao = new BbsDAO();
   	BbsVO vo = dao.select(no);
%>

<%
    //행 여러개
    BbsDAO dao = new BbsDAO();      //전체 리스트 받기
    ArrayList<BbsVO> listAll = dao.selectAll();
%>
```

```jsp
<!-- 글 제목 가져오기 -->
<%= vo.getTitle() %>
```
<br>
배열로 반환 받은 경우, 다음과 같이 자바 for-each 혹은 for문으로 하나씩 읽어오면 된다.

```jsp
<table>
<% 
for (BbsVO bbsVO : listAll) {
%>
	<tr class="table-warning">
    	<td><%= bbsVO.getNo() %></td>
		<td><%= bbsVO.getTitle() %></td>
		<td> <%= bbsVO.getContent() %> </td>
		<td> <%= bbsVO.getWriter() %> </td>
	</tr>
<% 
}
%>
</table>
```
<p align="center"><img src="https://user-images.githubusercontent.com/64455378/225660777-b9b1dbb1-a5fb-4989-9fdd-87724884e66b.gif" width=700></p>


java문법을 쓸 때 중간중간 자바스크립트릿 형태로 써야 하는게 복잡한거지, 어려운 것은 아니다. <br><br>

그리고 get방식으로 데이터를 전송하기 때문에 JSP 주소를 다음과 같이 입력 후 바로 이동할 수 있다. 

만약 게시판 테이블에서 글 no=2인 것을 가져오고자 한다면, <br><br>

http://localhost:8888/web01/select2.jsp?no=2<br><br>

그리고 이를 a태그로 html에 걸 수도 있다.

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/225657942-6eff895b-2d77-4744-a6a0-ee766374e84d.gif" width=700></p>
