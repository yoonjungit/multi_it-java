# 31일차

## [1] 자바 웹 프로그래밍 기초

### 1. 프로그램 설치(환경설정)

>새로 설치한 프로그램, 설정

- Tomcat 8.5.87  [설치](https://tomcat.apache.org/)

    <details>
    <summary> Web Server (Apache), Web Application Server (Tomcat) 비교</summary>

    `Web Server`<br>
    - (HW)웹서버가 설치되어 있는 컴퓨터<br>
    - (SW)정적컨텐츠(HTML, CSS 등)을 클라이언트에게 제공하는 서버<br>
    기능 : <br>
    - 정적컨텐츠의 경우 WAS를 통하지 않고 바로 클라이언트에 전달,<br>
    - 동적컨텐츠는 WAS를 통해 처리 후 클라이언트에 전달<br>
    (정적컨텐츠 : 고정된 요소, 동적컨텐츠 : 요청에 따라 달라지는 요소)<br>
   
    `Web Application Server`<br>
    - 동적컨텐츠 처리를 위해 DB조회 등 다양 한 로직 처리. 서블릿(Servlet) 컨테이너라고도 불림. <br>
    - 컨테이너란 JSP, 서블릿을 실행할 수 있는 환경을 제공하는 소프트웨어로, WAS는 필요한 JSP와 서블릿 파일을 구동시킨 후 결과를 클라이언트에 전달한다.
    - 정적컨텐츠 처리도 가능하지만, 아직까지 웹 서버가 더 처리 속도가 빠르므로 잘 사용하지 않는다.<br>
    [참고](https://gmlwjd9405.github.io/2018/10/27/webserver-vs-was.html)
    </details>


- DB : MySQL 5.5.62 [설치](https://downloads.mysql.com/archives/community/)

- Eclipse-Tomcat 연결, Eclipse 브라우저 크롬 설정

- DBeaver-MySQL 추가

>기존 설치된 프로그램

- Java 11.0.16.1 [설치](https://www.oracle.com/kr/java/technologies/javase/jdk11-archive-downloads.html)

- Eclipse IDE 2020-03 R Packages [설치](https://www.eclipse.org/downloads/packages/release/2020-03/r)

<br><br>

<p align="center"><img src="https://file.okky.kr/images/1587276759346.png" width=400> </p>

- 필요하진 않지만 이클립스에서 web프로젝트 실행 시 node.js 가 없는 경우 위와 같이 `Missing Node.js` 오류가 떠서 설치 해줌.<br>
위의 이클립스 버전으로는 node.js 10~13버전만 지원하므로 13버전을 설치해줌.<br>
이클립스 플러그인은 Eclipse MarketPlace → Wild Web Developer 설치



### 2. HTML 간단 복습

참고 > HTML 수업 : [1일차](./day01/day01.md), [2일차](./day02/day02.md), [3일차](./day03/day03.md), [4일차](./day04/day04.md), [5일차](./day05/day05.md)


## [2] JSP 

### 1. 개념

웹 서버에서 동적으로 웹 페이지를 생성하여 웹 브라우저에 돌려주는 서버 사이드 스크립트 언어

Servlet(서블릿)과 기능은 같고 역할은 다르다. > [Servlet, JSP 비교](https://gmlwjd9405.github.io/2018/11/04/servlet-vs-jsp.html)

> Web Service의 동작 방법
<p align="center"><img src="https://gmlwjd9405.github.io/images/web/web-service-architecture.png" width=700> </p>

1. Web Server는 웹 브라우저 클라이언트로부터 HTTP 요청을 받는다.
2. Web Server는 클라이언트의 요청(Request)을 WAS에 보낸다.
3. WAS는 관련된 Servlet을 메모리에 올린다.
4. WAS는 web.xml을 참조하여 해당 Servlet에 대한 Thread를 생성한다. (Thread Pool 이용)
HttpServletRequest와 HttpServletResponse 객체를 생성하여 Servlet에 전달한다.
5. Thread는 Servlet의 service() 메서드를 호출한다.(1)<br>
service() 메서드는 요청에 맞게 doGet() 또는 doPost() 메서드를 호출한다.(2)<br>
protected doGet(HttpServletRequest request, HttpServletResponse response)<br>
6. doGet() 또는 doPost() 메서드는 인자에 맞게 생성된 적절한 동적 페이지를 Response 객체에 담아 WAS에 전달한다.
7. WAS는 Response 객체를 HttpResponse 형태로 바꾸어 Web Server에 전달한다.
8. 생성된 Thread를 종료하고, HttpServletRequest와 HttpServletResponse 객체를 제거한다.<br>
[출처](https://gmlwjd9405.github.io/2018/10/27/webserver-vs-was.html)

### 2. 구현

HTML코드 안에 Java 코드가 있는 형태

> 회원가입 HTML에 연결된 insert.jsp

```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //<% %> : 자바 코드 넣는 부분
    //tomcat은 미리 request를 내장시켰기 때문에 따로 import x
    String id = request.getParameter("id"); //"apple"
    String pw = request.getParameter("pw"); //"1234"
    String name = request.getParameter("name"); //"apple"
    String tel = request.getParameter("tel"); //"010"
    %>
    <!-- 브라우저에게 결과를 알려주기 위한 html 코드 - 클라이언트가 입력한 텍스트 그대로 보여줌 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body{
	background:#8aedd3;
	}
</style>
</head>
<body>
회원 가입 요청 되었음<br>

ID : <%= id %><br>
PW : <%= pw %><br>
NAME : <%= name %><br>
TEL : <%= tel %><br>

</body>
</html>
```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/225021217-d2e79901-00ae-4e2e-909e-d706dbe33926.gif" width=700> </p>

> 23.03.16추가

이때 JSP가 HTML에서 사용자가 입력한 값을 받아오기 위해서는 다음과 같이 `form` 태그를 사용해야 하며, 이 태그 안에 있는 데이터만 가져올 수 있다. 더불어 `action` 속성으로 다음과 같이 데이터가 도착할 문서의 주소를 지정해준다.

```html
<!-- insert.html -->
<!-- <form action = URL> -->
<form action = "insert.jsp"> 
<table border="1">
	<tr>
		<td class="t1">아이디 : </td>
		<td>
			<input name = "id">
		</td>
	</tr>
	<tr>
		<td class="t1">비밀번호 : </td>
		<td>
			<input name = "pw">
		</td>
	</tr>
	<tr>
		<td class="t1">회원이름 : </td>
		<td>
			<input name = "name">
		</td>
	</tr>
	<tr>
		<td class="t1">회원전화 : </td>
		<td>
			<input name = "tel">
		</td>
	</tr>
	<tr>
		<td colspan = "2">
			<button id = "b1">회원가입 요청</button>
	</tr>
</table>
</form> 
<!-- 아래 주소는 form 태그 밖에 있으므로 jsp에서 읽어오지 못한다.-->
<table>
	<tr>주소 : <input name = "addresss"></tr>
</table>
```

```jsp
<!-- insert.jsp -->
<!-- 필요하지 않은 부분은 생략 ex)style-->
<%
    String id = request.getParameter("id"); //"apple"
    String pw = request.getParameter("pw"); //"1234"
    String name = request.getParameter("name"); //"apple"
    String tel = request.getParameter("tel"); //"010"
    String address = request.getParameter("address");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원 가입 요청 되었음<br>

ID : <%= id %><br>
PW : <%= pw %><br>
NAME : <%= name %><br>
TEL : <%= tel %><br>
ADDRESS : <%= address %> <br>

</body>
</html>
```

다음과 같이 Address 값은 받아오지 못했으므로 `null`로 뜬다. (DB처리에는 문제가 없다.)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/225612395-cef594b8-94b0-4e9c-8990-2520de1e1027.gif" width=400> </p>

> 오늘 코드 Overview

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/225021210-6e229649-68a9-415d-ab70-5406d01df7ff.gif" width=700> </p>

[Main Page](./WebContent/index.html)

|참조 DB테이블|Insert|Delete|Update|
|:---:|:---:|:---:|:---:|
|[Member](./WebContent/member.html)|[HTML](./WebContent/insert.html), [jsp](./WebContent/insert.jsp)|[HTML](./WebContent/delete.html), [jsp](./WebContent/delete.jsp)|[HTML](./WebContent/update.html), [jsp](./WebContent/update.jsp)
|[BBS](./WebContent/bbs.html)|[HTML](./WebContent/insert2.html), [jsp](./WebContent/insert2.jsp)|[HTML](./WebContent/delete2.html), [jsp](./WebContent/delete2.jsp)|[HTML](./WebContent/update2.html), [jsp](./WebContent/update2.jsp)


## [3] MySQL 

>Oracle, MySQL 문법 비교

|문법|Oracle|MySQL|
|:---:|:---:|:---:|
|문자열|varchar2|varchar|
|정수|number|int|

+MySQL에서는 따옴표를 쓰지 않음

```sql
-- Oracle DB에서 테이블 생성시

CREATE TABLE "HR"."BBS" 
   (	"NO" VARCHAR2(100), 
	"TITLE" VARCHAR2(100), 
	"CONTENT" VARCHAR2(100), 
	"WRITER" VARCHAR2(100), 


-- MySQL에서 테이블 생성시(따옴표 쓰면 오류남)

CREATE table bbs (
	no int(10) primary key,
	title varchar(100),
	content varchar(100),
	writer varchar(100)
)
```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/225028424-4c02e614-58c2-4adf-9108-ff61463a19f4.png" width=500> </p>

[오늘코드](./DAY31.sql)