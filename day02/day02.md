# 2일차

## [1] CSS

1. CSS 파일 생성

[out.css](./out.css)

2. 적용할 html <head> 부분에 링크 걸기

```html
<link rel="stylesheet" href="out.css">
```

>예제

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222950864-4c968301-e34c-4d0c-9724-452615c22099.gif" width=500> </p>

css에서 `<body>` 배경색 yellow로 지정 후 일괄적용

[index.html](./index.html) / [mail.html](./mail.html) / [cafe.html](./cafe.html) / [news.html](./news.html)

 ## [2] `<style>` 태그로 css 없이 스타일 적용

 ### 1. 특정 태그에 스타일 적용하는 법

```
<style></style> 태그 안에 다음과 같이 입력

태그로 구분 : 
ex)
h1 {
    color : red;
    background: black;
}
<h1> 태그에 일괄 적용 
```
```
id로 구분 : 

#you {
    color: lime;
}
id = you 태그에 적용
```
```
클래스로 구분 :
ex)
.one{
    font-size: 100px;
}
class = one 태그에 적용
```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222950859-6fe69081-2ddc-404d-b136-3ed367a54d52.PNG" width=400> </p>

[실습 예제](./page11.html)

### 2. `hover` 마우스 오버 효과

```
적용할태그:hover{적용할 스타일}
```
```html
<style>
    button:hover{
        color: green;
        background : yellow;
    }
</style>
```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222951029-22b850cf-ca51-43c2-ae4c-621a63e199cc.gif" width=300> </p>

[실습 예제](./page2.html)

### 3. 일부 특정 태그에만 적용하고 싶을 때

```html
<!-- class=d1 태그에 속해있는 태그 중 바로 아래 p 태그에만 적용 -->
<style>
    #d1 > p {     
        background: gold;
    }
</style>
```

```html
<!-- img 태그 중 src에 png가 포함되어있는 태그에만 적용 -->
<style>
    img[src$="png"] {
        border: 20px dotted blue;
    }
</style>
```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222950865-bfd39d0f-035a-4711-aa0f-f151daf14411.gif" width=300> </p>

[실습 예제](./page3.html)

### 4. `<ul><li>` 순서 없는 목록 만들기

```html
<ul>
    <li>리스트1</li>
    <li>리스트2</li>
    <li>리스트3</li>
</ul>
```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222950860-d123f9e3-e2cd-4947-b932-a23a5643b7dc.PNG" width=200> </p>

### 5. 특정 순서의 태그에만 적용하기 

```html
<style>
/* li 태그 전체에 적용 */
    li {
        list-style: none;
        float: left;
        padding: 15px;
        width: 70px;
        height: 20px;
    }
/* 첫번 째 li 태그 */
    li:first-child{
        border-radius: 50px;
    }
/* 마지막 li 태그 */
    li:last-child{
        border-radius: 10px 20px 30px 40px;
    }
/* 짝수번 li 태그 */
    li:nth-child(2n){
        background: orange;
    }
/* 홀수번 li 태그 */
    li:nth-child(2n+1){
        background: yellowgreen;
    }
</style>
```
<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222950857-9916e5a7-9e1e-4464-adb7-c253499c2da6.PNG" width=300> </p>


[실습 예제](./page9.html) : [회원가입](./page1.html) / [제품정보](./page2.html) / [게시판](./page3.html) / [장바구니](./page4.html)


## [3] 복습

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222950862-7bdfa390-6e1d-4dd6-bb51-bcaa3d66541b.gif" width=500> </p>


햄버거 주문 : [회원가입](./page20.html) / [제품정보](./page10.html) / [게시판](./page30.html) / [장바구니](./page40.html)


***

모든 이미지 출처 : [픽사베이](https://pixabay.com/ko/)