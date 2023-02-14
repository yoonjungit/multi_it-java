# 12일차
## [1] 복습
### 1. 스트링
[(1) String클래스의 메소드-1](./src/배열복습/스트링과배열1.java)

>concat, charAt, substring, endsWith, toUpperCase, toLowerCase, replace

```java
//concat, + : 합치기
String s = "나는 프로그래머야 ";
String s2 = "진짜!";

System.out.println(s+s2);	//나는 프로그래머야 진짜!
System.out.println(s.concat(s2));	//나는 프로그래머야 진짜!

//charAt : 문자 추출
System.out.println(s.charAt(0));	//나
char c = s.charAt(0);	// c="나"

//subString : 문자열 추출
String result2 = s.substring(3); // 인덱스 3이후 문자열 전체 -> 로그래머야 진짜!
String result3 = s.substring(3, 8);	//로그래머야

//endsWith : 특정 문자로 끝나는지 확인
boolean result = s.endsWith("야");

//toUpperCase(toLowerCase) : 대문자 or 소문자로 일괄변환
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());

//length : 문자열 길이 재기
System.out.println(s.length());

//replace : 문자열 대체 (비파괴 함수)
s.replace("나", "너");	//"나" -> "너"로 대체
System.out.println(s);	// 나는 프로그래머야 진짜!
```

[(2) String클래스의 메소드-2](./src/배열복습/스트링과배열2.java)

>split, trim, toCharArray

```java
//split : 문자열 나누기 -> 배열로 저장
String s = "감자,고구마,양파";
String[] s2 = s.split(",");	//s2 = {"감자", "고구마", "양파"}

//trim : 공백 제거
String s3 = ("     홍길동");
System.out.println(s3.trim());		//홍길동

//toCharArray : 문자열 -> 문자 배열 전환
String s6 = "홍길동";
char[] s7 = s6.toCharArray();
System.out.println(s7[0]);	//홍
System.out.println(s7[1]);	//길
System.out.println(s7[2]);	//동
```

[(3) String 메소드 복습 문제](./src/배열복습/스트링과배열3.java)

### 2. 이차원 배열
[(1) 이차원 배열](./src/배열복습/이차원배열프린트.java)

>이차원 배열의 초기화와 인덱스

```java
int[][] number = {
	{1, 2, 3},	//0
	{4, 5, 6}	//1
};
System.out.println(number[1][2]);	//6
```

[(2) 이차원 배열 실습](./src/배열복습/이차원배열프린트2.java)

## [2] 본 수업

### 1. 객체지향의 개념

- 함수 : 특정 작업을 수행하기 위해 설계된 기능

- 메소드 : 클래스 내부에 정의한 함수

	자바의 '함수'는 따로 존재하지 않고 클래스 내에 존재하기 때문에 모든 '함수'를 '메소드'라 한다.

- 클래스 : 객체를 정의하는 틀 또는 설계도

- 인스턴스(⊂객체) : 클래스의 구조로 컴퓨터 저장공간에서 할당된 실체


<p align="center"><img src = "https://cdn.imweb.me/upload/S201805315b0f7ff7afd7a/cm_upload/592688b622423.jpg" width = 300px></p>

<p align="center"><img src = "https://post-phinf.pstatic.net/MjAyMTAxMjZfMjEg/MDAxNjExNjMwMTg1MzQ3.LmyGsMz8xu8nYJ509NXxZXjH0JeOMK1PJudlvL15fu4g.FGWXa7JfxXc-ZiZTBVVaXX0r4gE4zM0Pv-xdXj920wAg.JPEG/d4b837aad7524462a1d0f5f552b7cd03.jpg?type=w1200" width=300></p>

**클래스 : 인스턴스 = 붕어빵틀 : 붕어빵**

### 2. 인스턴스의 구성 - 속성, 기능
(1) 속성 (멤버 변수):

```java
public int price ;
String shape;
// 변수 정의 시 public사용하면 다른 패키지에서도 사용 가능. 
```

(2) 기능(메소드)

### 3. 인스턴스의 생성과 사용
> new

```java
// new 메소드로 인스턴스 생성 -> 클래스명 변수명 = new 클래스명();
Tv t = new Tv();
```

### 2. 실습
##### 예제(기본)

|예제 구분|예제명|클래스|인스턴스|
|:---:|:---:|:---:|:---:|
|1|강아지|[클래스](./src/부품만들기/강아지.java)|[인스턴스](./src/부품사용하기/강아지키우기.java)|
|2|전화기|[클래스](./src/부품만들기/전화기.java)|[인스턴스](./src/부품사용하기/전화기사용하기.java)|
|3|TV|[클래스](./src/부품만들기/TV.java)|[인스턴스](./src/부품사용하기/TV사용하기.java)|

##### 예제(심화) 

|예제 구분|예제명|클래스|인스턴스|
|:---:|:---:|:---:|:---:|
|심화|일기장|[클래스](./src/부품응용하기/일기장쓰기.java)|[인스턴스](./src/부품응용하기/로그인화면.java)|

- 로그인 기능 → 로그인 성공 시 일기장 화면으로 넘어감

- 일기장 작성 후 텍스트 파일 저장. (제목 : 날짜, 내용 : 날짜 / 제목 / 내용)

<p align="center"><img src = "https://user-images.githubusercontent.com/64455378/221528268-a4a66a03-1f65-4cfc-bf7c-04a49546d134.gif" width=400></p>

> 텍스트 영역

```java
//JTextArea : 입력창, JTextField와 달리 줄바꿈 가능
//JTextArea 변수명 = new JTextArea(가로, 세로)
JTextArea contentText = new JTextArea(10, 10);      // 오늘의 내용 칸
```

> 파일입출력

```java
//FileWriter : 외부에 파일 생성 및 쓰기 클래스
//FileWriter 변수명 = new FileWriter(파일명과 확장자);
FileWriter file = new FileWriter(day2 + ".txt");
//write : 파일에 쓰기
file.write(day2 + "\n");
file.write(title2 + "\n");
file.write(content2 + "\n");
//파일 저장
file.close();       //이때 따로 위치를 지정하지 않을 시 프로젝트 루트 폴더에 저장
```

자바에서 외부 파일에 연결하는 경우 꼭 예외처리를 해줘야 함 (try, catch)

> 전역변수

```java
public class program {
	int iv; // 인스턴스 변수
	static int cv; // 클래스 변수
	
	void method() {
		int lv; // 지역 변수
	}
}
```