# 38일차

## [1] JQuery

### 1. JQuery 라이브러리 불러오기

(1) [구글CDN](https://developers.google.com/speed/libraries?hl=ko)

<br>or<br>

(2) 파일 [다운로드](https://jquery.com/download/) 후 html에 JQuery 위치 지정 → <script type="text/javascript" src="js/jquery-3.6.4.js"></script>

### 2. 서버로부터 데이터를 받을 때 : XML 혹은 JSON

XML : <key>value</key>
JSON : {key : value}

### 3. DOM: Document Object Model

```
문서 객체 모델(The Document Object Model, 이하 DOM) 은 HTML, XML 문서의 프로그래밍 interface 이다. DOM은 문서의 구조화된 표현(structured representation)을 제공하며 프로그래밍 언어가 DOM 구조에 접근할 수 있는 방법을 제공하여 그들이 문서 구조, 스타일, 내용 등을 변경할 수 있게 돕는다. DOM 은 nodes와 objects로 문서를 표현한다. 이들은 웹 페이지를 스크립트 또는 프로그래밍 언어들에서 사용될 수 있게 연결시켜주는 역할을 담당한다.


DOM은 문서를 논리 트리로 표현합니다. 트리의 각 브랜치는 노드에서 끝나며, 각 노드는 객체를 갖습니다. DOM 메서드를 사용하면 프로그래밍적으로 트리에 접근할 수 있습니다. 이를 통해 문서의 구조, 스타일, 콘텐츠를 변경할 수 있습니다.
```

[출처](https://developer.mozilla.org/ko/docs/Web/API/Document_Object_Model/Introduction)


<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231680284-d48e3380-14a8-4160-a9ae-ddef0b98d9c7.png" width=400></p>

[출처](https://ko.javascript.info/dom-nodes)

개발자도구에서도 확인 가능 >

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231686959-73946ceb-ad92-49a9-91ed-dce758b4316d.png" width=350></p>

- 즉 자바스크립트에서 HTML에 접근할 수 있도록 HTML을 파싱 후 객체로 바꿔준 것

ex) 자바스크립트 : `document.getElementById("today")`

→ 제이쿼리 : `$("today")` 

제이쿼리 문법이 좀 더 간결하다

## 4. 실습

>index7

- `$(#태그id)` : 태그 id로 연결 

```html
<button id="b1">나를 클릭하면?</button>

<script type="text/javascript">
	$(function() { //DOM Tree로 읽어온 후 실행
		// 자바스크립트에서는 document.getElementById("today") ==> $("#today")
		$("#b1").click(function() {
			alert('짜잔')
		})	
	})
</script>
```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231702157-c343dcd9-1491-4ed5-b502-de4a483957c0.gif" width=550></p>


>index8

- `text()` : 태그에 텍스트 추가

- `html()` : 태그에 html 태그 추가

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231702160-c3fd4632-c5f8-425b-9f23-26f6e0d26fb9.gif" width=510></p>

```html
<!-- script -->
<script>
	$(function() {
		$("#food").click(function() {
			foodEat = $("#foodEat").val()       //id=foodEat인 태그의 값 가져오기
			alert(foodEat + " 먹고싶다")
		})
		$("#netflix").click(function() {
			location.href="https://www.netflix.com/kr/"     //웹 사이트 이동
		})
		
		$("#text").click(function() {
			divTag=$("#result")
			divTag.text("안녕? 제이쿼리는 처음이지?")       //id=result인 태그안에 텍스트 넣기
		})
		$("#text2").click(function() {
			divTag=$("#result2")
			divTag.html("<font color=blue>안녕? 또 왔어. 다른 색깔로</font>")       //id=result2인 태그안에 html 넣기
		})
		
	})
</script>
```

>practice1

- `append` : 태그에 다른 태그 추가

```html
<button id="write">게시</button>
<div id="result"></div>

<script>
$(function() {
	$("#write").click(function() {
		comment=$("#comment").val()
		divTag=$("#result")
		divTag.append("<img src='https://user-images.githubusercontent.com/64455378/231707793-d2aa0bba-d504-411e-9d1f-e370b0ff5fd6.png' width='150px'>")
		divTag.append("<div>"+comment+"</div>")
	})
})
</script>
```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231712986-de17c030-9468-4937-baeb-0367104528f5.gif" width=510></p>

## [2] API 실습

### 1. 이니시스 결제

[api1](./WebContent/api1.html)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/233682702-b7b0d195-74a4-44fe-a0fd-5c997a210dfa.gif"></p>

### 2. 카카오맵 API

[api2](./WebContent/api2.html)


<p align="center"><img src="https://user-images.githubusercontent.com/64455378/233682704-85bfd375-5e54-433b-b54c-84e0e32dce05.JPG"></p>

### 3. 구글 Charts

[api3](./WebContent/api3.html)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/233682706-dc7a8ebd-13b7-4088-a5aa-e2d48c791a1a.JPG"></p>

## [3] Ajax

### 1. 개념

- `Ajax`(Asynchronous JavaScript and XML) : 웹 페이지 전체를 다시 로딩하지 않고도, 웹 페이지의 일부분만을 갱신

- 주고받는 데이터 형식 : JSON, XML, HTML, text

### 2. 실습(1)

- 로컬 내 외부 페이지 호출 (데이터 주고받기 X)

ajax : [ajax1](./WebContent/ajax1.html)



<p align="center"><img src="https://user-images.githubusercontent.com/64455378/233682927-b16a620e-3a97-437a-9c0b-71f474fda6d0.gif"></p>


 ```html
<script type="text/javascript">
	$(function(){
		$.ajax({
			url : "index7.html",	//index7.html 호출
			data : {},	//보낼 data는 없음
			success : function(){	//호출에 성공하면
				alert("ajax 성공1")
			}
		})
		$.ajax({
			url : "index8.html",
			data : {},
			success : function(){
				alert("ajax 성공2")
			}
		})
	})
</script>
 ```

### 3. 실습(2)

- 로컬 내 외부 페이지 데이터 받아오기

ajax : [ajax3](./WebContent/ajax3.html)

url : [ajax2-1](./WebContent/ajax2-1.html), [ajax2-2](./WebContent/ajax2-2.html), [ajax2-3](./WebContent/ajax2-3.html)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/233682933-9aad5f20-d0ff-4dff-90f4-0b8ac0a86d1e.gif"></p>


```html
<body>
<button id="b1">오늘 치킨 먹을까?</button>
<button id="b2">사당역 주변 맛집 알려줘</button>
<button id="b3">지금 선릉역 날씨 어때?</button>
<hr>
<div id="result"></div>
</body>
```

위의 버튼 b1, b2, b3 클릭 시 alert 혹은, result <div>에 결과 출력

```html
<script type="text/javascript">
	$(function(){
		$("#b1").click(function(){
			//b1클릭 시 ajax2-1 호출
			$.ajax({
				url:"ajax2-1.html",		//url호출
				success: function(x){	//x:ajax2-1내용
					alert(x)	//알림창 띄우기
				}
			})
		})
		$("#b2").click(function(){
			//b2클릭 시 ajax2-2 호출
			$.ajax({
				url:"ajax2-2.html",
				success: function(x){	//x:ajax2-2내용
					$("#result").append(x + '<br>')		//id=result에 x넣기
				}
			})
		})
		$("#b3").click(function(){
			//b3클릭 시 ajax2-3 호출
			$.ajax({
				url:"ajax2-3.html",
				success: function(x){	//x:ajax2-3내용
					alert(x)
					$("#result").append(x + '<br>')
				}
			})
		})
	})
</script>
```


### 4. 실습(3)

- 로컬 내 외부 페이지 데이터 보내고, 결과 값 받아오기

ajax : [ajax](./WebContent/ajax4.html)

url : [money.jsp](./WebContent/money.jsp), [idCheck.jsp](./WebContent/idCheck.jsp), [tel.jsp](./WebContent/tel.jsp)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/233682937-4f1792a0-3956-47d3-8cc6-e664dd4d6151.gif"></p>


```html
<body>
<h3>결제</h3>
<!-- 1. 결제수단 별 결제 총금액 계산 -->
<!-- 1) 계좌이체 1000원 할인 / 2) 신용카드 1000원 추가 / 3) 휴대폰 결제 수수료·할인 없음 -->
결제금액 : <input id="money" value="1000"> <br>
1) 계좌이체 2) 신용카드 3) 휴대폰 결제 <br>
결제수단 : <input id="choice" value="2"><button id="b1" style="background: #ffdd80">결제하기</button><br>

<hr>
<h3>회원가입</h3>
<!-- 2. 회원 가입시 ID 중복 여부 체크 -->
ID 입력 : <input id="id" value="root">
<button id="b2" style="background: #ffdd80">ID중복체크</button><span id="result">&nbsp;</span><br>

<!-- 3. 전화번호 앞 세자리에 따른 각각 다른 인증번호 반환 -->
전화번호 입력 : <input id="tel" value="01910041004">
<button  id="b3" style="background: #ffdd80">인증번호 받기</button><br><br>

<hr>

</body>
```

```html
<script type="text/javascript">
	$(function(){
		$("#b1").click(function() {
			$.ajax({
				url: "money.jsp",
				data: {
					money: $("#money").val(),
					choice: $("#choice").val()			
				},
				success: function(x) {	//성공시
					alert("결제 금액은 "+x)
				},
				error: function(e) {	//실패시
					alert(e)
				}
			})
		})
		$("#b2").click(function() {
			$.ajax({
				url: "idCheck.jsp",
				data: {
					id: $("#id").val()
				},
				success: function(x) {	//성공시
					alert(x)
					$("#result").append(x)
				},
				error: function(e) {	//실패시
					alert(e)
				}
			})
		})
		$("#b3").click(function() {
			$.ajax({
				url: "tel.jsp",
				data: {
					tel: $("#tel").val()
				},
				success: function(x) {	//성공시
					alert("인증번호 : "+x)
				},
				error: function(e) {	//실패시
					alert(x)
				}
			})
		})
	})
</script>
```


### 5. 예제 

원-달러 변환

ajax : [ajax](./WebContent/ajax5.html)

url : [coin.jsp](./WebContent/coin.jsp)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/233682938-2328e97b-36c3-4827-82f0-4e3286bcf57a.gif"></p>
