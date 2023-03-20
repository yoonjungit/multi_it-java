# 35일차

## Servlet

## [1] 복습 : Http 요청 기본, JSP

### 1. Get/Post
    
<p align="center"><img src="https://velog.velcdn.com/images%2Fwelchs1423%2Fpost%2F1f61531d-36c3-41b7-9e25-7de77f398130%2Fimage.png" width=500></p>

[출처](https://velog.io/@welchs1423/GET-POST-%EB%B0%A9%EC%8B%9D%EC%9D%98-%EC%B0%A8%EC%9D%B4)

Post 예시 : 큰 파일 첨부, 보안에 민감한 데이터 등

### 2. URI

- URI : Uniform Resource Identifier

- 클라이언트의 요청 주소, 식별자 

- URL, URN과 비교

<p align="center"><img src="https://lh4.googleusercontent.com/K9t30Sjp6cIbsLg67B-amTH927yS3q06E68DvSLK_4t364b38otQLLibFbyj_I0JH6fLB8tp5zEgVObcaSj810X1Xs2XWuwxD-_ibK8JtfsUaGgm5JNVhUhfjcH3vairIchwhKfviglEmKYYk5aH4cc74ncEaW6N9fRS5VZtKS4EGmvGSYIUSLvx04r0xQ" width=350></p>


[출처](https://www.elancer.co.kr/blog/view?seq=74)

### 3. JSP

<p align="center"><img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Ft1.daumcdn.net%2Fcfile%2Ftistory%2F995DF6505C63B9A52E" width=500></p>

[출처](https://memory0136.tistory.com/76)

- 매 요청마다 JSP->class로 변환 되는 것은 아님. 최초 한 번만 변환, 이후에는 코드 변경 시에만 변환

- 클라이언트의 요청마다 메소드가 하나씩 실행 되는데, JSP안에는 이미 service()메소드가 정의 되어 자동으로 요청마다 service() 메소드 호출됨

<p align="center"><img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Ft1.daumcdn.net%2Fcfile%2Ftistory%2F99C2E04A5C637ED912" width=500></p>

- 여기서 service()메소드가 위의 JSP에서 호출되는 메소드

- doGet()/doPost() : 각각 Get/Post 방식에서 응답을 위해 호출되는 메소드 

## [2] Servlet 실습

- 프로젝트 폴더 구조

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231374693-22ddbcde-24d2-48e0-9cb8-895ccf1da452.PNG" width=400></p>



### 1. 이클립스 Dynamic Web Project 생성

- MySQL DB 사용을 위한 커넥터 라이브러리 넣기 : 프로젝트폴더 > WebContent > WEB-INF > lib

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231336151-a0d512d2-5643-4af8-989e-380719438be6.png" width=250></p>


### 2. Java Resources > src > 패키지 생성 및 Servlet 파일 생성

(1) Servlet 파일 설정

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231344733-9f8fe670-49a0-472c-9d5f-4f9bb51e320f.png" width=900></p>

클래스 이름 수정 및 Superclass(상속 클래스) 확인 → URL Mappings에서 매핑된 url 확인(수정 가능) → 사용할 메소드 선택


생성된 JSP 파일 >

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231345364-fff90780-7692-4945-9a03-38a86c9d7e10.png" width=700></p>


- @WebServlet어노테이션 옆에는 매핑된 url
- extends HttpServlet : HttpServlet 클래스 상속(파일 설정 시 맨 처음 Superclass)
- service()메소드 override<br>
    service(HttpServletRequest request, HttpServletResponse response)<br>
    HttpServletRequest : 요청 받을 때 받은 정보(클라이언트 요청, 쿠키, 세션)를 담은 객체<br>
    HttpServletResponse : 웹브라우저에 반환할 응답 객체(content-type, 응답 코드, 응답 메세지)<br>
    이 두 객체를 서블릿으로 전달

### 3. 예제

[예제1](./src/multi/Hi.java)

```java
package multi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hi")
public class Hi extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service() 메소드가 호출됨");
		String id = request.getParameter("id");
		System.out.println("서버에서 받은 데이터는 " + id);
	}
}

```
```java
String id = request.getParameter("id");
```
Get 방식으로 받은 파라미터 안의 값 추출
<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231351624-ccc93b05-f53f-4709-94c4-9c8ee00458d3.png" width=700></p>

[참고](https://docs.oracle.com/javaee/6/api/javax/servlet/ServletRequest.html#getParameter(java.lang.String))

> 결과

- id 파라미터 값 미지정

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231346342-2e27bbb9-4a85-4c3e-a167-d985de7faf7d.png" width=470></p>

- id 파라미터 값 지정시

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231345955-87d8d699-dc9e-48bc-bade-056d255599a5.png" width=500></p>

[예제2](./src/multi/Welcome.java)

```java
package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class Welcome extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service() 메소드가 호출됨");
		String id = request.getParameter("data");
		System.out.println("데이터는 " + id + "입니다.");
		PrintWriter out = response.getWriter();		//response : 서버가 브라우저에 응답할 때 사용
		//PrintWriter는 브라우저에 응답할 때 문자를 줄 수 있는 부품
		out.print("I am a web Programmer");
		out.close();
	}

}
```

```java
PrintWriter out = response.getWriter();	
```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231353035-128bc8bd-fbb9-4792-aea4-3bf07228d66b.png" width=500></p>



- PrintWriter : 텍스트 출력 스트림 [(출처)](https://docs.oracle.com/javase/7/docs/api/java/io/PrintWriter.html)

    스트림이란 : 데이터를 읽고(input) 쓸 수 있도록 (output) 하는 클래스 [(출처)](https://www.devtown.in/pages/java-stream-class)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231353512-cdf1ec79-f91d-4df6-97c2-f77647c0c98d.png" width=500></p>

<br>

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231350698-b8b4e00a-8b9a-4ca2-99e0-2e018e134e8a.png" width=700></p>

getWriter() : HttpServletResponse의 상위 클래스인 ServletResponse의 메소드. PrintWriter 객체를 반환 [(출처)](https://docs.oracle.com/javaee/7/api/javax/servlet/ServletResponse.html#getWriter--)

> 결과
<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231354637-d5939fb7-353f-4c45-ba0b-a943c9311640.png" width=300></p>



### 4. WebContent > html파일 생성

예제1[servlet](./src/multi/Login.java), [html](./WebContent/main.html)

(1) `get`요청

- Query String(질의 문자열) 

    - 웹 클라이언트가 웹 서버에 전달하는 문자열
    - name=value 형식으로 전달
    - 여러개의 name=value는 & 기호로 구분
    - 공백 문자는 + 기호로 변환되어 전달


```html
<!-- HTML -->
<h3>Get요청</h3>
<!-- <a> 태그는 get요청에서만 사용가능(주소로 정보를 전달하기 때문) -->
<a href="login?find=car">검색(get)</a>
<hr>
```

```java
//servlet
//doGet 메소드 오버라이드
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //response 객체 UTF-8로 인코딩
	response.setContentType("text/html;charset=UTF-8");
	PrintWriter out = response.getWriter();
	String find = request.getParameter("find");
	out.print("get요청 >> : " + find);
}
```

(2) `post` 요청

```html
<!-- HTML -->
<!-- form 태그에서 default method 형식은 get방식, 따라서 post인 경우 metod를 꼭 지정해줘야 함 -->
<form action="login" method="post">
    아이디 : <input name="id"> <br>
    패스워드 : <input name="pw"> <br>
    <button>로그인 처리(post)</button>
</form>
```

```java
//servlet
//doPost 메소드 오버라이드
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html;charset=UTF-8");
	PrintWriter out = response.getWriter();
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	out.print("post요청 >> id : " + id + ", " + "pw : " + pw);
	}
```
### 5. UTF-8 인코딩

문자열 인코딩이 깨지지 않도록 UTF-8로 인코딩을 해야함

(1) response : 문자열 데이터를 받을 때 문자열이 깨지지 않도록 인코딩을 해야함

> get 요청에서 받은 문자열 데이터 인코딩 하기

- 주소로 전달되는 데이터

- Server > Tomcat v8.5 Server at localhost-config > server.xml


<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231367173-c445733e-ff08-4f3a-b049-b8ff687a1da4.png" width=600></p>

<Connector> 설정에 URIEncoding="UTF-8" 추가

- 수정한 server.xml 톰캣 서버에 반영

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231367988-ba5accd4-d68c-44cc-9f58-d9bb6a03783a.png" width=600></p>

맨 오른쪽에 publish to the server 버튼 클릭 

> post 요청에서 받은 문자열 데이터 인코딩 하기

- body로 전달되는 데이터

doPost 메소드에 다음과 같이 인코딩 메소드 추가

```java
request.setCharacterEncoding("UTF-8");
```
request는 HttpServletRequest 객체

(2) request : 문자열 데이터를 반환할 때 문자열이 깨지지 않도록 인코딩을 해야함

get/post 둘다 doGet/doPost 메소드에 HttpServletResponse 객체에 인코딩 메소드 추가

```java
response.setContentType("text/html;charset=UTF-8");
```

- 인코딩 전
<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231370825-797f9cb0-78b9-41e5-95d9-f85c57c5e3cb.gif" width=400></p>

- 인코딩 후
<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231370819-0494450a-b611-4645-940b-1e1eff91bf1d.gif" width=400></p>

### 6. Get/Post 응용 예제

[servlet](./src/multi/Check.java), [html](./WebContent/check.html)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231373496-7245ca59-9895-4a4d-8ffd-be07c73dc2df.gif" width=500></p>


### 7. 서블릿 라이프사이클

`싱글톤` : 서블릿 객체는 매 요청마다 생성되는 것이 아닌, 최초 요청에 생긴 후 코드 변경 시에 파괴된 후 다시 생성된다 (클라이언트가 추가되어도 서블릿은 1개)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231378870-2d82a877-9052-4908-801b-0c750dfc9c1d.gif" width=700></p>

```java
@Override
public void init(ServletConfig config) throws ServletException {
	System.out.println("★서블릿 등장★");
}
@Override
public void destroy() {
	System.out.println("★서블릿 퇴장★");
}
```

## [3] web.xml

> XML

eXtensible Markup Language : 확장 가능한 마크업 언어(태그) = 태그업 확장 가능

> default Welcome 페이지 설정

- Servers > web.xml 

    톰캣 서버 실행 시 다음과 같이 메인 페이지는 index.html로 설정되어있음

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231382682-3ea3f0d7-3ce6-4723-b225-205781a98064.png" width=700></p>

이거를 이제 각 프로젝트마다 달리 설정할 수 있다.

- 프로젝트 별 web.xml 설정

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231382191-b90f4b12-16be-4496-a64d-fc03ac35074b.png" width=700></p>


각 프로젝트마다 참고하는 web.xml이 없으므로 만들어줘야 한다.

프로젝트 루트 폴더 오른쪽 클릭 > Java EE Tools > Generate Deployment Discruptor Stub 선택

그럼 다음과 같이 WEB-INF 폴더 아래 web.xml 파일이 생성된다.

여기서 Welcome File List 태그 안에 메인 페이지로 지정할 html과 jsp를 작성한다.

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231384477-ed51584c-6b9c-4f3c-9f42-39c984e70a9e.gif" width=400></p>

그럼 위와 같이 메인페이지 파일명을 지워도 direct 된다.

즉 프로젝트 default 페이지가 메인페이지가 된다.


> 서블릿 주소 지정(@WebServlet 어노테이션 역할) & init-param 초기화

[예제1](./src/multi/Test.java), [예제2](./src/multi/Monday.java)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231398718-e2648310-249b-4ed7-9805-d850a01cd2ed.png" width=800></p>

(1) 서블릿 주소 지정

@WebServlet 어노테이션을 사용할 수 없는 경우 (서블릿 파일 변경 불가한 경우) web.xml에 서블릿 이름과 주소를 써 사용할 수 있다. 

(2) Init-param 지정

특정 서블릿 파일 내에서만 사용할 수 있는 name/value 쌍인 init-param도 위와 같이 지정할 수 있다.

서블릿 내에서는 파라미터 있는 생성자 사용 불가하기 때문에 web.xml에 선언.

* context-param 과의 차이 :

init-param은 특정 서블릿 파일 하나 안에서만 접근 가능하고, context-parm은 웹 프로젝트(어플리케이션) 전체에서 접근 가능하다.



## [4] 트러블 슈팅

대개 에러들은 서버 / 프로젝트 각각 Clean 한 후 맞게 설정한 다음 재실행 순으로 한다.

### 1. 톰캣 실행 시 

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/226272991-d40b2ffa-a2d1-4ae6-97f4-0591dd0f6145.png" width=230></p>

Compile에 에러 확인 후 구글링. 같은 오류 메세지여도 오류 원인이 천차 만별

대개 환경변수 설정 (JAVA_HOME) 후 이클립스 Window > Preferences에서 자바 JRE다시 설정


### 2. 서블릿 파일 컴파일 오류

다음과 같이 서블릿 파일에 x 표시가 뜨면 서블릿 파일을 못읽어 오는 경우가 대부분 (Compile 창에 에러 메세지도 안뜬다.)

(1) Server>현재 설정되어있는 Tomcat서버 오른쪽 클릭 후 Clean Tomcat Work Directory

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/226273320-4f09f108-add2-491d-9c88-c984de9e9e23.png" width=400></p>


(2) Project 오른쪽 클릭 후 Properties > Build Path > Add Library 클릭 > Server Runtime > Apache Tomcat v8.5 선택

(3) Properties > Project Facets > Dynamic Web Module > Runtimes > Apache Tomcat v8.5 체크 후 Apply and Close

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/226274253-0e113cc0-f021-4f49-920c-55252204d050.png" width=700></p>

이렇게 하면 서블릿 파일 불러오면서 x표시가 사라진다.