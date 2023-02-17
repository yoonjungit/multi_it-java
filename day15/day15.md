# 15일차
## [1] 복습
### 1. 생성자
>예제

[Mask 클래스](./src/복습/Mask.java) / [Mask 사용](./src/생성자/Mask사용.java)

### 2. 상속 + 생성자

>예제
<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221480649-f2820fab-ac3b-4f1e-9f9c-d3fc2843b970.PNG" width=800> </p>

|부모클래스|자식클래스|Use|
|:---:|:---:|:---:|
|[직원](./src/상속기본/직원.java)|[매니저](./src/상속기본/매니저.java)|[커피전문점](./src/상속기본/커피전문점.java)|
|[학용품](./src/상속기본/학용품.java)|[볼펜](./src/상속기본/볼펜.java)|[JetStream](./src/상속기본/제트스트림.java)|
|[Car](./src/상속기본/Car.java)|[Fly Car](./src/상속기본/FlyCar.java)|[Fly Car 사용](./src/상속기본/FlyCar사용.java)|

## [2] 상속 - 스레드

### 1. 개념
- 프로세스(Process) : 현재 실행중인 프로그램
- 스레드(Thread) : 프로세스 내에 실제 작업을 수행하는 주체. 하나의 프로세스 안에는 여러개의 스레드가 있을 수 있음 (멀티스레드)
- 사용목적 : 자바에서 여러가지 일을 동시에 처리하기 위해 사용

### 2. 구현

>`extends Thread` : 스레드 클래스를 상속받아 사용

>`run()` : 스레드 클래스를 상속받은 후 실행할 메소드는 run()에 작성

>`객체명.start` : 스레드 객체 실행

>`Thread.sleep` : 스레드 일시 정지

```java
    public class Crescend extends Thread{       //스레드1
        public void run() {}
        try {
			Thread.sleep(1000);		//1초 =1000
		} catch (Exception e) {
			System.out.println("cpu 연결 문제 생김");
		}
    }

    public class Descend extends Thread{        //스레드2
        public void run() {}
    }

    public static void main(String[] args) {    //스레드 객체 생성 및 실행
        Crescend cres = new Crescend();
        Descend desc = new Descend();

        cres.start();
        desc.start();
    }
```

### 3. 실습
#### 3-1. 예제 실습

|번호|스레드 1|스레드 2|스레드 3|Main|구현 내용|
|:---:|:---:|:---:|:---:|:---:|:---:|
|1|[$](./src/상속응용/one.java)|[@](./src/상속응용/two.java)|[&](./src/상속응용/three.java)|[Use](./src/상속응용/three.java)|$, @, & 각각 1000번씩 동시에 프린트|
|2|[이름](./src/상속응용/이름스레드.java)|[별](./src/상속응용/별스레드.java)||[Use](./src/상속응용/별이름스레드사용.java)|0부터 49999번 동안 이름 스레드는 이름 출력, 별은 ★ 출력|
|3|[증가](./src/상속응용/증가스레드.java)|[감소](./src/상속응용/감소스레드.java)||[Use](./src/상속응용/증가감소스레드사용.java)|증가 스레드는 0부터 49999 까지, 감소 스레드는 49999부터 0까지 거꾸로 출력|
|4|[Image](./src/상속응용/이미지스레드.java)|[Count](./src/상속응용/카운트스레드.java)|[Timer](./src/상속응용/타이머스레드.java)|[Use](./src/상속응용/PC방상황표.java)|Thread.sleep(1000)을 이용해 1초씩 스레드를 일시정지 하면서 <br> 각각 이미지, 몇초 경과 했는지, 현재 시간 출력


#### 3-2. 스윙을 이용해 프로그램 구현 실습 (3 6 9 게임)

- Thread 클래스 상속
- 상속자로 스레드 구현
- 예외처리 : 숫자만 입력

|구분|바로가기|
|:---:|:---:|
|스레드 1 |[숫자 카운트](./src/상속응용/Game369.java)|
|스레드 2 |[박수 이미지](./src/상속응용/Game369img.java)|
|메인함수|[스윙 구현](./src/상속응용/Game369Main.java)|

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221518023-fd0b515d-a862-4068-891b-2ade84c1e9ce.gif" width=400> </p>

