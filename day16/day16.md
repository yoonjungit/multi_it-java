# 16일차
## [1] 접근제어자 (복습)

클래스, 멤버변수, 메서드, 생성자 등에 선언 시 사용하여 외부에서 접근을 제한함.

```
(1) public : 모든 클래스, 패키지에서 접근 가능

(2) protected : 같은 클래스, 같은 패키지, 상속받은 클래스(자손 클래스)에서 접근 가능

(3) (default) : 같은 클래스, 같은 패키지에서 접근 가능

(4) private : 같은 클래스에서만 접근 가능
```

|접근 제어자|같은 클래스|같은 패키지|자손 클래스|전체|
|:---:|:---:|:---:|:---:|:---:|
|public|○|○|○|○|
|protected|○|○|○|X|
|(default)|○|○|X|X|
|private|○|X|X|X|X|

```java

```

> 예제

[직원 클래스](./src/복습/직원.java)

같은 패키지 : [직원 사용1](./src/복습/직원사용1.java)

다른 패키지 : [직원 사용2](./src/상속/직원사용2.java) / [직원 사용3(상속)](./src/상속/직원사용3.java)


<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221884117-85e42f6d-c390-4bcc-8373-9395b0d4f20e.PNG" width=700> </p>

***

## [2] 컬렉션 프레임워크
### 1. 개념
>정의

다수의 데이터를 저장할 수 있는 클래스들을 표준화한 설계

>주요 인터페이스

|인터페이스|특징|구현 클래스|
|:---:|:---:|:---:|
|List|순서가 있는 데이터의 집합, 데이터의 중복 허용|ArrayList, LinkedList, Stack, Vector|
|Set|순서를 유지하지 않는 데이터의 집합<br>데이터의 중복 허용 안함|HashSet, TreeSet|
|Map|키와 밸류의 쌍으로 이루어진 데이터의 집합<br>순서 유지 x, 키 중복x, 값은 중복○|HashMap, TreeMap|


- List와 Set은 공통부분이 많아 *Collections*란 인터페이스를 새로 만들어 상속 하였다.

<p align="center"><img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Ft1.daumcdn.net%2Fcfile%2Ftistory%2F99B88F3E5AC70FB419" width=500> </p>

### 2. List

- 순서가 있는 데이터의 집합, 데이터의 중복 허용

> 주요 구현 클래스

	ArrayList
	LinkedList

<p align="center"><img src="https://www.nextree.co.kr/content/images/2021/01/jdchoi_20140225_arrayvslinkedlist11.png" width=500> </p>

>주요 메서드

```java
ArrayList list = new ArrayList() ; 	//ArrayList 객체 생성
		list.add(0, "김길동");		//데이터 추가(파괴 함수)
		list.add("홍길동");	
		list.add(100);
		// ArrayList :["김길동", "홍길동", 100]	-> 데이터 형태는 String, int 등 다양하게 넣을 수 있음

		list.get(0);				//데이터 호출
		list.remove(0);				//데이터 원소 삭제(파괴 함수)
		list.set(0,  "정길동")		//데이터 원소 재정의(파괴 함수)
		// ArrayList :["정길동", 100]

		list.indexOf(100);			//원소 100의 위치(인덱스)
		list.contains("홍길동");	//데이터 포함여부

		LinkedList test = new LinkedList();		//LinkedList 객체 생성
		test.add("국어");						//데이터 추가
		test.add("수학");
		test.remove();							//데이터 원소 삭제
```

>실습

|번호|예제 내용|구현 클래스|구현 메소드|
|:---:|:---:|:---:|:---:|
|1|[컬렉션 테스트](./src/형변환/컬렉션테스트.java)|ArrayList|add, remove, set, indexOf, contains|
|2|[스키대회](./src/형변환/스키대회.java)|ArrayList|addAll|
|3|[냉장고 우유](./src/형변환/냉장고우유.java)|LinkedList|add, remove|
|4|[시험일정](./src/형변환/시험일정.java)|LinkedList|add, remove|


### 3. Set

- 순서를 유지하지 않는 데이터의 집합. 데이터의 중복 허용 안함


>주요 구현 클래스
	
	HashSet

```java
HashSet bag = new HashSet();	//HashSet 객체 생성
		bag.add("휴대폰");		//데이터 추가
		bag.add("휴지");
		bag.add("볼펜");
		bag.add("볼펜");
		bag.add("휴대폰");
		System.out.println(bag);			//[휴지, 볼펜, 휴대폰]
		System.out.println(bag.size());		//3
```

>실습

|예제|구현 메소드|
|:---:|:---:|
|[가방](./src/형변환/가방.java)|add|
|[로또1](./src/형변환/로또1.java)|add, size|
|[로또2](./src/형변환/로또2.java)|add, size|

### 5. Map

- 키와 밸류의 쌍으로 이루어진 데이터의 집합. 순서 유지 x, 키 중복x, 값은 중복○

>주요 구현 클래스

	HashMap

```java
HashMap map = new HashMap();				//HashMap 객체 생성
		map.put("사과", "apple");				//(키, 밸류)원소 추가
		map.put("메론", "melon");
		map.put("물", "water");
		System.out.println(map);				//{사과=apple, 메론=melon, 물=water}

		System.out.println(map.get("사과"));	//밸류 호출

		map.remove("물");						//데이터 삭제
		map.replace("메론", "melons");			//밸류 재정의
		System.out.println(map);				//{사과=apple, 메론=melons}
```

>실습

[사전](./src/형변환/사전.java)

<br><br>

[**전체 컬렉션 복습 문제**](./src/형변환/확인문제.java)


***

## [3] 내부클래스
### 1. 예외 처리 (try-catch 구문 복습)
> 입력

```java
try {
	//에러가 발생할 것 같은 코드 >>
	System.out.println(10/0);
	} catch (Exception e) {
	//문제발생 시 프로그램을 멈추지 않고 어떻게 처리할 지 코딩
	System.out.println("에러 발생");
    //에러발생한 줄 출력
	e.printStackTrace();
	}
```

>출력

```
에러 발생
java.lang.ArithmeticException: / by zero
	at 상속.예외처리1.main(예외처리1.java:9)		//-> 에러 발생한 줄
```

>예제

[예외처리1 : 수식 오류](./src/상속/예외처리1.java) <br> 
[예외처리2 : 외부 파일과 연결 시 필수적 예외처리](./src/상속/예외처리2.java) <br> 
[예외처리3 : 배열 인덱스 오류](./src/상속/예외처리3.java)

### 2. 내부 클래스

>개념

- 하나의 클래스 내부에 선언된 또 다른 클래스

- 내부 클래스와 외부 클래스가 서로 긴밀한 관계를 맺고 있을 때 선언할 수 있음.

- 외부에서는 내부 클래스에 접근할 수 없음


```java
public class 클래스명 {
	//전역변수 선언 시 내부클래스와 공유 가능
	int count;
	public static void main(String[] args) {
		count = 3;
	}
	public class 내부클래스1{
		count++;
	}
	public class 내부클래스2{
		
	}
}

```

### 3. 실습
##### 티켓팅 타이머

>개요

티켓팅 오픈 전까지 남은 시간(default:500초)을 초단위로 보여주는 프로그램.<br>
5초마다 티켓팅 과정을 담은 이미지 5개가 순서대로 반복되며, 남은 시간 뿐만 아니라 현재 시각도 같이 표시된다.


<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222188140-f78f3c3f-e9a6-439c-a113-29ac51c7799b.gif" width=500> </p>

##### 무궁화 꽃이 피었습니다.

>개요

세명의 참가자들이 각각 0.3초 마다 결승선(술래)을 향해 달려나간다. <br>
이때 0부터 99까지 랜덤으로 주어진 숫자만큼 움직일 수 있으며, 먼저 도착한 사람이 술래를 건들어 술래는 뒤돌아보고 게임은 종료된다.<br>
술래가 뒤돌아 보기 전까지 술래의 위치(1000)까지 오지 못한다면, Uh-oh 탈락


<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222971084-ddf5bcbe-96b0-4327-90aa-f6549a2dd11d.gif" width=600> </p>