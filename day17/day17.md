# 17일차
## [1] 복습
### [배열](./src/복습/아무거나.java)
#### 배열 원소 넣기
```java
ArrayList list = new ArrayList();
list.add("홍길동");	
list.add(100);
list.add(11.22);
list.add(new JButton());

String name = (String)list.get(0);
int age = (Integer)list.get(1);
```
간단해보이지만 사실 여기에는 많은 과정이 숨겨져 있다. 바로 **형변환**

## [2] 형변환
형변환 = 캐스팅(casting) : 다른 타입으로 변화하는 것

### 1. [기본형 형변환](./src/형변환/기본형형변환.java)

>byte : -128 ~127 (1바이트)<br>int : -2,147,483,648 ~ 2,147,483,647 (4바이트)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221409070-ed0b388f-d754-4f3f-bc9f-5328d0a9c10c.PNG" width=300> </p>

⇒ 둘다 정수형이나 int가 byte보다 더 큰 타입이다. byte ⊂ int<br>
따라서 byte → int의 형변환은 자동으로 이루어지지만(자동형변환, 형변환 생략),<br>
int → byte 변환은 자동으로 이루어지지 않는다.(강제형변환, 형변환 필요)<br>
그리고 int ⊂ double이므로 마찬가지로 형변환의 방향에 따라 자동으로 될 수 있거나, 강제로 형변환이 필요할 수 있다.


```java
byte byte1 = 10;
int int1;

//byte, int
int i = b;		    //큰 ← 작, 자동형변환
b = (byte)i;	    //작 ← 큰, 강제형변환;(byte)

//int, double
double d = i;	        //자동형변환
i = (int)d;   	    //강제형변환;(int)
```

#### 박싱&언박싱
```
박싱 : 기본형 → 래퍼클래스
언박싱 : 래퍼클래스 → 기본형
```
**래퍼 클래스**(Wrapper Class) : 객체가 아닌 기본형 변수를 객체로 저장해야할 때 사용하는 클래스

<p align="center"><img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fbrryw5%2FbtrbhYdkjlR%2Fkd888gYsrnmPgcTGuXNpXk%2Fimg.png" width=500> </p>

```java
// 박싱
int i = 10;
Integer num = new Integer(i);

// 언박싱
Integer num = new Integer(10);
int i = num.intValue();
```


### 2. [참조형 형변환](./src/형변환/참조형형변환.java)
>조건 : 상속관계에 있는 클래스 사이에서만 가능하다.

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221409953-0945ba38-57db-4905-b441-01f08045f339.PNG" width=300> </p>


```java
public class Car {

}
public class Truck extends Car{
    //부모클래스 - Car, 자식클래스 - Truck
}

Car c = new Car();
Truck t = new Truck();
t = (Truck) c;  //다운캐스팅
c = t;          //업캐스팅
```

### 3. [그래픽 형변환](./src/형변환/그래픽형변환.java)

```java
    JFrame f = new JFrame();
    f.add(new JButton("나는 버튼"));	//Component <- JButton (자동형변환) 
	f.add(new JLabel("라벨"));		    //Component <- JButton (자동형변환) 
```



## [3] 크롤링

### 1. 라이브러리 설치
[JSoup 1.9.2](https://mvnrepository.com/artifact/org.jsoup/jsoup/1.9.2)(HTML 파싱 라이브러리) > .jar 파일 다운로드 

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221411305-c2826bee-e2e8-46d1-893e-06a8b43cfb6e.PNG" width=400> </p>
>프로젝트에 라이브러리 추가

### 2. 구현

> 웹사이트와 연결 (예외처리 필수)
```java
//Connection 객체명 = JSoup.connect("웹사이트");
Connection con = Jsoup.connect("http://www.naver.com");
```

>HTML 코드 전체 가져오기
```java
//Document 객체명 = 연결.get();
Document doc = con.get();
```

>원하는 코드만 가져오기
```java
/*Elements Element배열 = 도큐먼트.select(원하는항목(*));
* : 
① 클래스명으로 찾을 때 : .클래스명
② id명으로 찾을 때 : #id명
③ 특정 클래스명 안에서 a태그만 가져올 때 : .클래스명 a
④ 특정 태그 안 클래스명 : 태그명.클래스명 → ex) span.blind : span태그 중 blind클래스
*/
Elements list = doc.select(".nav");
```

>코드에서 태그 사이 텍스트 가져오기
```java
/*코드.text();
ex)
<a href="https://comic.naver.com/" class="nav" data-clk="svc.webtoon">웹툰</a>
에서 "웹툰"가져오기

비교 : 코드중 특정 태그사이 텍스트가져오기.
태그.ownText();
ex)
<p>Hello <b>there</b> now!</p>
p.ownText();    →   Hello now!
*/

String text = list.get(i).text();
```

### 3. 실습
>예제

[네이버 홈페이지 크롤링](./src/주식정보시스템/네이버메인크롤링.java), [네이버 웹툰 크롤링](./src/주식정보시스템/네이버웹툰크롤링.java), [네이버 증권 크롤링](./src/주식정보시스템/네이버증권크롤링.java)

<br>
>프로그램

[네이버 주식 크롤링](./src/주식정보시스템/네이버주식정보시스템.java)
<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221416392-afa21da7-3872-4d05-9b82-9e4d1b09afbb.gif" width=400> </p>