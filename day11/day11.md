# 11일차

## [1] 배열 복습

### [1. 배열비교](./src/배열복습/배열비교.java) (토익 채점기)

(1) Random 함수를 이용해 두개의 랜덤 배열 만들기

(2) for문으로 두 랜덤 배열 원소 비교 후 채점

   ※ 배열 이름은 수업에서 편의를 위해 한글로 지정했지만, 현업에서는 영문으로 사용하는 것에 주의
   
### [2. 배열정렬순위](./src/배열복습/배열정렬순위.java)
  (1) Random 함수를 이용해 랜덤 배열 만들기

  (2) **sort** 함수를 이용해 랜덤 배열 정렬 
	  - 파괴형 함수(sort) vs 비파괴형 함수(Integer.parseInt()) : 원본 변경 유무

  (3) 상위 30% 혹은 하위 30% 점수 평균 구하기

### [3. 랜덤버튼배열1](./src/배열복습/랜덤버튼배열1.java)
  (1) **버튼배열 만들기** -> '''java JButton[] 배열명 = new JButton[원소 개수] >> *18 line*

  (2) **레이아웃 지정하지 않기** -> 프레임명.setLayout(null) >> *23 line*

  (3) **버튼 위치와 크기 지정** -> 버튼명.setBounds(x축, y축, 가로, 세로) >> *27 line*
     ※ 버튼 위치, 크기 랜덤 가능 (랜덤변수.nextInt())

### [4. 랜덤버튼배열2](./src/배열복습/랜덤버튼배열2.java)>>랜덤버튼배열1 심화
  랜덤버튼배열1에
  (1) **Color 배열** -> Color[] 배열명 = {Color.색상, Color.색상, ... , Color.색상} >> *40 line*

         for문과 Random 함수로 버튼 색 지정

  (2) 배경색 추가 -> 프레임명.getContentPane().setBackground(Color.색상) >> *48 line*

### [5. 극장예매시스템1](./src/배열복습/극장예매시스템.java)
  (1) **JFrame** 타이틀 설정

- 프레임명.setTitle("타이틀") >> *20 line*

 - JFrame 프레임명 = new JFrame("타이틀명") >> *18-19 line*

  (2) Font 설정

- Font 폰트명 = new Font(글씨체, 글씨체 스타일, 글씨 크기) >> *27 line*

```java
Font font = new Font("궁서체", Font.BOLD, 20) //or 글씨체 스타일에 목록 번호로 가능(Ctrl+Space)
Font font = new Font("궁서체", 1, 20)
```

 (3) 버튼 액션 중 ＊**버튼 텍스트** 가져오기

- String 변수명 = 액션이벤트명.getActionCommand(); >> *55 line*

		→  숫자여도 String 형태로 갖고와야 함.

		    (꼭 버튼이 아니어도, 정확히 말하자면 이벤트를 발생시킨 객체의 문자열을 가져오는 것이라 이해)

  (4) 이미 선택한 버튼 클릭 금지 시키기

- 버튼.setEnabled(false) >> *64 line*

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221524935-63cccf1f-a92d-45df-a740-de7a687f7e12.gif" width="500"></p>

### [6. 극장예매시스템2](./src/배열복습/극장예매시스템2.java)

  (1) 객체 크기 고정시키기 -> 객체.setPreferredSize(new Dimension(가로, 세로) >> *32 line*

	layout을 null로 변경시키지 않으면 JFrame처럼 setsize()가 안됨. 따라서 위와 같이 설정(버튼, 라벨 다 가능)

  (2) 객체 가운데 정렬 -> 객체.setHorizontalAlignment(객체종류.CENTER) >> *33 line*

	ex) label.setHorizontalAlignment(JLabel.CENTER)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221524942-16613b09-6cbc-4af4-af94-a179af10d2ea.gif" width="500"></p>

*BOLD : 복습시간에 새로 배운 것

##  [2] 본 수업
### [1. 배열 복사](./src/배열심화/배열깊은복사.java) (참조형 변수)
  (1) 얕은 복사 (주소만 복사)

  ```java
	int[] x = {100, 200};
	int[] y = x;
	x[0] = 30
	//y = {30, 200}
```

  (2) 깊은 복사 (값 복사)

  ```java
	int[] x = {100, 200};
	int[] y = x.clone();
	x[0] = 30
	//y : 100, 200
```

### [2. 이차원배열 {{}, {}, ..., {}}](./src/배열심화/이차원배열.java)

  ```java
  Integer[][] list = {{1,2,3}, {2,3,4}, {5,6,7}, {8,9,10}}
   ```

### [2-1. 자바 테이블 구성](./src/배열심화/이차원배열.java)

  (1) JTable.테이블명 = new JTable(이차원배열(row), 일차원배열(column)

  (2) 테이블에 스크롤 추가한 객체 생성 -> JScrollPane 스크롤변수명 = new JScrollPane(테이블명)

  - 테이블 변수에 스크롤을 추가하는 것이 아닌 따로 스크롤 객체가 생성

  (3) 프레임에 스크롤 추가 -> 프레임명.add(스크롤변수명)
  
  - 따라서 프레임에 테이블이 아닌 스크롤 추가 (테이블 추가시 스크롤 x)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221524924-1535ad43-b530-4216-b85e-8a2a10af7c80.gif" width=500></p>