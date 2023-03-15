# 32일차

## [1] 31일차 수업 복습 (JSP)

## [2] 톰캣, 이클립스 설정 (트러블 슈팅)

>톰캣 기본 페이지

톰캣 설치시 index.html이 기본 페이지이기 때문에, 

http://localhost:8888/web00/index.html에서 다음과 같이 뒤에 index.html을 빼고 입력해도 (http://localhost:8888/web00/) 똑같이 나온다.

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/225209190-ab2cf50c-1177-48a4-aa81-9827d2ee07bc.JPG" width=400> </p>

만약 기본 페이지를 바꾸고 싶으면 톰캣 설치 폴더 > conf > web.xml 파일 선택> 메모장으로 열기

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/225209648-c32c8e9e-3b13-4334-acf1-7c4550061cca.png" width=400> </p>

하단 <welcome-file-list>에서 html, jsp 등 수정

>톰캣 소스 프리징

분명 이클립스에서 코드를 수정했는데 이를 실행했을 때 정상적으로 반영이 안되는 것을 소스 프리징이라 한다.

해결방법 :<br>
1. 브라우저 캐시 삭제<br>
크롬 설정 > 인터넷 사용 기록 삭제

2. 이클립스 톰캣 

    (1)환경설정<br>
    Windows > preferences > General > Workspace 의 Refresh on access, Refresh using native hooks or polling 체크<br>
    Windows > preferences > General > Startup and Shutdown > Refresh workspace on startup 체크<br><br>
    (2) 프로젝트 클린 : Servers > Tomcat~ 오른쪽 클릭 후 `Clean`, `Clean Tomcat Work Directory` 차례대로 선택
    <p align="center"><img src="https://user-images.githubusercontent.com/64455378/225213781-57a31b62-045b-46a3-9b60-d7e1c43171e7.png" width=300> </p>
    Work Directory의 실제 위치는 : 이클립스 워크 스페이스에서 <br>
    \.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost


>이클립스 메모리 설정

1. 메모리 사용량 보이기

    Window > Preferences > General > Show heap status 체크

    <p align="center"><img src="https://user-images.githubusercontent.com/64455378/225206694-d2486bed-a3b5-43cd-882b-32b97f789093.png" width=330> </p>

    다음과 같이 이클립스 하단에 메모리 사용량 확인 가능 <img src="https://user-images.githubusercontent.com/64455378/225223432-9d9d57e6-f2c9-441a-84cb-68e3a5aef78a.png" width=130>

2. 메모리 늘리기

    이클립스 폴더에서 eclipse.ini 파일 선택 > 메모장으로 열기
    <p align="center"><img src="https://user-images.githubusercontent.com/64455378/225204475-ae92c2d7-0663-4cc6-871c-cf8b7b6605e5.png" width=200> <img src="https://user-images.githubusercontent.com/64455378/225204652-9884c0a7-b439-492c-bb6d-3da7fbb8df55.png" width=200> </p>

    Xms : 힙 시작 램 크기<br>
    Xmx : 힙 최대 램 크기

    자신 노트북/컴퓨터 사양에 맞춰서(보통 사양의 1/2 이하)

>이클립스 파일 인코딩 (UTF-8)형식으로 변경

UTF-8 외에 다른 형식으로 파일 인코딩 시 영어 외 언어 입력 시 파일이 깨지므로 꼭 시작전 UTF-8로 인코딩 설정하기. 설정 방법은 [참고](https://living-only-today.tistory.com/166)

## [3] Java - MySQL 연결 및 SQL 실행

### 1. 프로그램 설치

- MySQL Connector 8.0.31(MySQL JDBC 드라이버) [다운로드](https://mvnrepository.com/artifact/com.mysql/mysql-connector-j)

JDBC : Java™ database connectivity (JDBC) is the JavaSoft specification of a standard application programming interface (API) that allows Java programs to access database management systems [출처](https://www.ibm.com/docs/en/informix-servers/12.10?topic=started-what-is-jdbc)

- JDBC 파일 넣기 : 자바 프로젝트와 달리 웹 프로젝트는 JDBC를 아래 폴더에 바로 복사-붙여넣기로 넣는다

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/225221232-373d60fc-250d-4d38-8cea-02f68d12bc27.png" width=300> </p>

### 2. 구현 (Insert, Update, Delete)

##### DAO, DTO로 MySQL DB와 연결

- DAO, DTO 파일 위치 : 프로젝트폴더 > Java Resources > src

- DTO는 오라클DB에서 만든 것과 같으므로 변경없이 그대로 가져오면 되고, DAO만 MySQL에 맞게 수정해주면 된다.

>DAO 클래스

Connection 설정 시 JDBC드라이버 위치를 MySQL로 바꾸는 것(1), DB위치 추가하는 것(2), 그리고 SQL문에서 DB위치 입력 생략하는 것(3) 외에는 오라클 DB와 크게 다른 점이 없다.

쿼리문을 소문자로 적었는데, 리눅스에서는 디폴트 값으로 대/소문자를 구분하기 때문이다.<br> 윈도우에서는 디폴트로 구분 안하기 때문에 상관 없다.
<details>
<summary>대/소문자 구분 확인 법</summary>

SQL문으로 다음 실행
```sql
show variables like 'lower_case_table_names'; 
```
1 - 구분안함, 0 - 구분함

</details>

<br>

```java
public class MemberDAO {
	public static Connection con;
	
	public MemberDAO() {
		//Connection 설정
		con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	//(1)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";	//(2)DB위치(multi), 타임존 입력
			String user = "root";
			String password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("MySQL 연결 완료");
		} catch (Exception e) {
			System.out.println("MySQL 연결중 오류 발생");
		}
	}
	public int insert(MemberVO bag) {
		int result = 0;
		try {
			String sql = "insert into member values (?, ?, ?, ?)";	//(3)DB위치는 Connection 설정 시 입력했으므로 생략
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());

			result = ps.executeUpdate(); //1
			if(result == 1) {
				System.out.println("회원가입 성공!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			}
		System.out.println(result);
		return result;
	}
}
```

##### JSP 파일에서 DAO 실행

>JSP

```jsp
<%@page import="multi.MemberDAO"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//1. HTML에서 클라아언트가 입력한 값 가져오기
        String id = request.getParameter("id"); //"apple"
        String pw = request.getParameter("pw"); //"1234"
        String name = request.getParameter("name"); //"apple"
        String tel = request.getParameter("tel"); //"010"
        
      	//2. 입력받은 데이터를 VO(DTO) 객체 생성 후 set
      	MemberVO bag = new MemberVO();
        bag.setId(id);
        bag.setPw(pw);
        bag.setName(name);
        bag.setTel(tel);

        //3. 이를 DAO에 전달 후 원하는 메소드 실행
        MemberDAO dao = new MemberDAO();
    	int result = dao.insert(bag);   //DAO에서 쿼리 실행 후 변경된 행수 result로 받기
    %>
<!-- 아래 HTML은 생략 -->
```

### 3. 실행결과

[MemberDAO](./src/multi/MemberDAO.java), [MemberDTO(VO)](./src/multi/MemberVO.java)

>회원가입 - Insert

[HTML](./WebContent/insert.html), [JSP](./WebContent/insert.jsp)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/225238333-8fb19707-efa5-4f06-8de8-1a23ab119e88.gif" width=500> </p>

>회원정보수정(전화번호) - Update

[HTML](./WebContent/update.html), [JSP](./WebContent/update.jsp)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/225238341-54b462bb-fdd5-48dc-acf1-83779b81f93e.gif" width=500> </p>

>회원탈퇴 - Delete

[HTML](./WebContent/delete.html), [JSP](./WebContent/delete.jsp)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/225238345-9a6194d7-f689-41ad-bd56-612e52e55de4.gif" width=500> </p>

