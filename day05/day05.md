# 5일차

## [1] 복습

`function`, `document.getElementById`, `.innerHTML`, `parseInt`, `if-elseif`

[실습 예제1 : page1](./page1.html) / [실습 예제2 : page2](./page2.html)


## [2] 외부 API 사용

### 1. [Google Charts](https://developers.google.com/chart?hl=ko)

사용 : [타임라인 차트](https://developers.google.com/chart/interactive/docs/gallery/timeline?hl=ko)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222965632-19da319e-9d1c-4e42-9661-20d26031fd0e.PNG" width=500> </p>

[실습 예제 : page3](./page3.html)


### 2. [Kakao Developers](https://developers.kakao.com/)

>사용 방법

구글과 달리 로그인 후 앱키를 받아야 한다.
<br><br>
[앱키 받는 방법](https://discover.tistory.com/39)
<br><br>

>실습

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222965999-93dd6ac0-03db-4ff0-9ad2-dcead6781555.gif" width=300> </p>

[실습 예제 : page5](./page5.html)


## [3] JQuery 사용하기

```제이쿼리(jQuery)는 오픈 소스 기반의 자바스크립트 라이브러리```

### 1. CDN으로 JQuery 연결하기

```네트워크(인터넷)를 통해서 콘텐츠(jQuery 라이브러리 파일)를 배포하는 방식```

[JQuery 구글 라이브러리](https://developers.google.com/speed/libraries?hl=ko#jquery) <br>
혹은 [Jquery](https://jquery.com/) : Downloads > Other CDNs <br><br>

```javascript
//사용한 cdn 및 버전
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
```

### 2. 실습

>실습 1

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222967189-15243612-3346-437a-aea8-e9317e482539.gif" width=400> </p>

[실습 예제 : page8](./page8.html)

>결제 API

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222967351-2ba999cc-6cdd-4a7b-b29d-467ffee16215.gif" width=600> </p>

[실습 예제 : page9](./page9.html)

### 3. Ajax

```웹 페이지 전체를 다시 로딩하지 않고도, 웹 페이지의 일부분만을 갱신할 수 있는 동적인 웹 페이지를 만들기 위한 개발 기법```

>버튼 클릭 시 ajax 실행

```javascript
<head>
    <script>
    $('#b1').click(function () {        //id = b1인 버튼 클릭 시
        $.ajax({                        //JSON 형식으로 데이터 요청
            url : "ok.html",            //해당 url 접속 후
            success : function(x){      //성공 시 x(=해당 url) 내용 가져오기
            $('#d1').html(x)
            }
        })
    })
    </script>
</head>

<body>
<button id="b1">AjaxTest 받아오기</button><br>
<div id = "d1"></div>
</body>

```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222969779-4c710cfe-d2f2-4fe1-a347-72cfb8d4fde6.gif" width=400> </p>

[실습 예제 : page 10](./page10.html) : [ok.html](./ok.html) / [weather.html](./weather.html) / [tour.html](./tour.html) <br> <br>

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222969781-dbb196b1-0335-4264-83e2-313a7d0fc6be.gif" width=400> </p>

[실습 예제 : page 11](./page11.html) : [info.html](./info.html) / [info2.html](./info2.html) / [info3.html](./info3.html)

## [4] 복습

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222969938-c635ce3d-b2fc-4340-b6b4-837ad3ba7b5b.gif" width=400> </p>

[실습 예제 : myproject](./myproject.html), [css](./myproject.css)