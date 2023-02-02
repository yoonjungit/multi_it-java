# 4일차

## [1] 복습

>연산자

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222962260-d59c39a7-9b83-4060-a05e-34a3a3363c6a.gif" width=300> </p>

[실습 예제1 : page2](./page2.html)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222962255-cd34724e-dfba-441c-82c6-640d1bfbfc90.gif" width=300> </p>


[실습 예제2 : page3](./page3.html)

## [2] 자바스크립트 변수 선언

### 1. 변수 종류

```javascript
var name = 'bathingape'
console.log(name) // bathingape

var name = 'javascript'
console.log(name) // javascript

let name = 'bathingape'
console.log(name) // bathingape

let name = 'javascript'
console.log(name) 
// Uncaught SyntaxError: Identifier 'name' has already been declared

const name = 'bathingape'
console.log(name) // bathingape

const name = 'javascript'
console.log(name) 
// Uncaught SyntaxError: Identifier 'name' has already been declared
```

|변수 종류|재선언|재할당|
|:---|:---:|---:|
|var|○|○|
|let|○|X|
|const|X|X|

<br>

[실습 예제 : page1](./page1.html)

## [3] if문 / for문

자바 문법과 같음

>if문
```javascript
<script>
    food = prompt("당신은 점심을 무엇을 드실 건가요?");
    if (food == "자장면") {
        alert("중국집으로 가자!!");
    } else if (food = '우동') {
        alert("편의점으로 가자!!");
    } else {
        alert("집에서 먹자자");
    }
</script>
```
<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222962257-f71d1ce5-a8ee-4e8b-ac5b-6901a2708452.gif" width=300> </p>


[실습 예제 : page4](./page4.html)<br><br>


>for문

```javascript
<script>
    for (let index = 0 ; index<5; index++){
        document.write('<h4>환영합니다.</h4><br>')
    }
    for (let index = 0 ; index<3; index++){
        alert('안녕히가세요~★')
    }
</script>
```
<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222962258-e37d059a-469e-40c6-8491-7a2d5957fbdd.gif" width=300> </p>

[실습 예제 : page5](./page5.html)<br><br>

## [4] function 선언, 호출

>`<script></script>`안에서 function 선언 후 호출

```javascript
<script>
    function 빨래하다() {       //function 선언
        console.log("1. 먼지를 털자")
        console.log("2. 물에 집어 넣는다.")
        console.log("3. 비누를 바른다.")
        console.log("4. 오물조물 비빈다")
        console.log("5. 물에 여러번 헹군다.")
        console.log("6. 짠다.")
        console.log("7. 넌다")
    }

    빨래하다() // 함수 사용(기능 사용)      //function 호출
</script>
```

- 콘솔 창 결과

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222961726-a36ca020-4e41-4fb7-aaa2-7d544e59795f.PNG" width=300> </p>

[실습 예제 : page6](./page6.html)

>외부 javascript 파일에서 불러오기

```javascript
<script src="out.js"></script>      //<script>태그를 따로 써줘야 함
<script>
    청소하다()
    빨래하다()
</script>
```

[실습 예제 : page7](./page7.html) / [javascript파일](./out.js)<br><br>

## [5] 복습

[복습 예제 : page8](./page8.html)<br><br>


## [6] document.getElementById('아이디명')

```주어진 아이디명과 일치하는 id 속성을 가진 요소를 찾고, 이 객체를 반환```

>요소의 값 가져오기

```javascript
// document.getElementById('아이디명').value
id2 = document.getElementById('id2').value     //아이디가 id인 요소 찾고 id로 반환 받기
```

>요소 내용 변경하기

```javascript
//'객체'.innerHTML = 변경할 내용
result.innerHTML = "<img src='./image/html_image/yes.jpg' width = 400px><br><font color = blue>로그인 성공!!!<font> "
```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222964048-92a72684-e409-40fb-8e67-dc918b02923e.gif" width=600> </p>

[로그인 실습 예제 : page9](./page9.html)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222964465-5709f313-7dc6-4cbc-ad15-0a01eaa11039.gif" width=600> </p>

[회원가입 실습 예제 : page10](./page10.html)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222964231-7feeb59b-499c-452c-9146-692a3eb56eec.gif" width=500> </p>

[결제창 실습 예제 : page11](./page11.html)