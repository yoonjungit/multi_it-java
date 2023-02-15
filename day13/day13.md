# 13일차
## [1] 복습
### 1. 클래스
(1) Car 예제
> 변수의 종류
```java
public, static 둘 다 안붙은거
```

***

## [2] 메소드
### 1. 반환값이 있는 메소드
>선언

```
반환값이 없는 메소드 : public void 메소드명 (매개변수)
void : 빈 => 반환값이 없는
```

```java
public void copy(){
};
 //반환값이 있는 메소드 : public 반환변수타입 메소드명 (매개변수)
public String sum(int x, int y){
    return x + y;
};
```

- 실습 : [선언](./src/메서드연습/계산기.java) / [main 함수](./src/메서드연습/내가게.java)

>반환변수타입: 매개변수의 타입에 따름

```java
public int add(int x, int y){
    return x + y;
};
public double divide(int x, double y){
    return x / y;
};    //매개변수 하나라도 double이면 double로 반환
```

>메소드이름 : 매개변수의 타입, 개수, 순서가 다르면 이름이 겹쳐도 됨 (오버로딩, 자바의 다형성)

- 다형성 : 하나의 객체가 여러 가지 타입을 가질 수 있는 것

```java
public int divide(int x, int y){
    return x / y;
};
public double divide(int x, double y){
    return x / y;
};
```

- 실습 : [반환변수, 다형성](./src/메서드연습/계산기2.java) / [main 함수](./src/메서드연습/내가게2.java)

### 2. 실습

[실습 예제](./src/메서드연습/계산기3.java) / [main 함수](./src/메서드연습/내가게3.java)

***


## [3] 실습(프로그램)

#### 배열 데이터를 활용한 간단한 스윙 프로그램 만들기(복습)

### 1. [넷플릭스 순위 1-5위](./src/메서드연습/나의넷플릭스.java)

>넷플릭스 인기 프로그램 정보 1위부터 5위까지 차례대로 배열에 넣기 (제목, 포스터, 순위)

```java
String[] title = {"일타스캔들", "빨간풍선", "여신강림", "피지컬100","사랑의 이해"};
String[] img = {"일타스캔들.jpg","빨간풍선.jpg", "여신강림.jpg","피지컬100.jpg","사랑의이해.jpg"};
int[] rank = {1, 2, 3, 4, 5};
```

#### 새로운 메소드 적용
>BorderLayout 레이아웃

<p align="center"><img src="https://1.bp.blogspot.com/-auaqCbENS-E/YA-XbPniRJI/AAAAAAAADtY/sp_-pwOJ2lkHBvYz56u2eUnLkwJoZ-wTACLcBGAsYHQ/w400-h300/java-38-1.png" width=300> </p>

```
프레임명.add(인스턴스명, BorderLayout.위치)
위치 : NORTH, SOUTH, WEST, EAST, CENTER
```
```java
frame.add(top, BorderLayout.NORTH);
```

>기본형, 참조형 변수의 형변환
```
기본형변수 : 변수타입.parse변수타입(매개변수)
      Integer.parseInt() : double, String, ... => int로 변환
참조형변수 : 변수타입.valueOf(매개변수)
      String.valueOf() : int, double, ... => String으로 변환
```
```java
JLabel under = new JLabel(String.valueOf(rank[2]));     //*56 line*
```
>윈도우 창 닫을 때 프로그램 실행 종료

```
프레임변수명.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
```
```java
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
```
- EXIT_ON_CLOSE는 JFrame에만 적용


#### 예외 처리
> 0번 인덱스 (1순위) 에서 왼쪽 버튼 클릭시 4번 인덱스(5순위)로 이동
<=> 4번 인덱스에서 오른쪽 버튼 클릭시 0번 인덱스로 이동

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221417226-b6e68fbc-d675-4791-9b3d-9337af82ca74.gif" width=400> </p>

***

### 2. [중국집 주문화면](./src/메서드연습/중국집주문.java)

>프로그램 메뉴 순서대로 데이터 배열에 넣기

```java
String[] menu = {"메인", "짜장면", "짬뽕", "탕수육"};		// 메인과 음식 메뉴 배열
String[] image = {"0.jpg", "1.jpg", "2.jpg", "3.jpg"};		// 이미지 배열
String[] price = {"어서오십시오", "6000", "7000", "15000"};		// 가격 배열
int[] count1 = {0, 0, 0, 0};		//각 메뉴별 주문 개수
int[] stock = {0, 5, 5, 5};		//주문 가능 개수
```

#### 새로운 메소드 적용

>인스턴스 숨기기 : JFrame뿐만 아니라 JButton, JLabel 등에도 적용 가능
```
숨기기 : 인스턴스명.setVisible(false)
보이기 : 인스턴스명.setVisible(true)
```
```java
button.setVisible(false);
```

>인스턴스 크기 설정 : 

    레이아웃이 설정된 경우 → setPrerredSize (컴포넌트 최적 크기 지정)
    레이아웃이 설정되지 않은 경우 → setSize (대신 setBound를 이용해 위치를 일일이 다 지정해야 함)
```
인스턴스명.setPreferredSize(new Dimension(가로, 세로))
```
```java
button.setPreferredSize(new Dimension(50, 50))
```
#### 예외 처리
<p align="center"><img src = "https://user-images.githubusercontent.com/64455378/221417888-06979019-f994-472a-9276-f0661ddb8c9a.gif" width=400></p>

> 최소 주문 가능액(10,000원) 미만 주문 시 알림 <br>
최대 주문 가능 수량(5) 초과 시 알림<br>
최소 주문 가능 수량(0) 미만 시 알림 