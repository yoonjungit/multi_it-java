# 14일차
## [1] 생성자
### 1. 기본 생성자

특별히 생성자를 정의하지 않고도 인스턴스 생성이 가능할 수 있게 자바에서는 기본 생성자를 제공.

``` java
class Car{
    public String color = "yellow";
}
public static void main(String[] args) {
    Car myCar = new Car();
}
```

위와 같이 기본 생성자로 인스턴스를 생성하면 아무 매개변수도 전달받지 않고, 동작도 하지 않음.

### 2. 생성자
객체의 생성과 동시에 인스턴수 변수를 원하는 값으로 초기화할 수 있는 메소드
객체 생성과 동시에 이루어져야 하므로 생성자 메소드 이름은 클래스 이름과 같아야 함.
<br>
- 생성자 메소드는 반환값이 없음, 그러나 메소드에서 반환 타입을 void로 하지도 않음
- 여러 개의 생성자를 가질 수 있음 (메소드 오버라이딩 가능)

```java
public class TV {
    public int ch; //0
	public int vol; //0
	public boolean onOff; //false
}
//생성자1
public TV(int ch, int vol, boolean onOff) {
		this.ch = ch;
		this.vol = vol;
		this.onOff = onOff;
	}
//생성자2
public TV(int ch, int vol) {
		this.ch = ch;
		this.vol = vol;
	}    
//메인 메소드
public static void main(String[] args) {
    TV tv1 = new TV(1, 10, true);
    TV tv2 = new TV(7, 20);     //두가지 생성자 메소드로 객체 생성 가능
}
```

#### 클래스 출력
생성자는 아니지만, 수업에서 클래스 출력 시 원하는 형식으로 출력할 수 있도록 하기 위해 `toString()` 메소드를 사용한다.

```java
//toString 추가하기 전
System.out.println(tv1);        //생성자.TV@56f4468b

//toString 추가한 후
public String toString() {
	return "TV [ch=" + ch + ", vol=" + vol + ", onOff=" + onOff + "]";
}

System.out.println(tv1);        //TV [ch=1, vol=10, onOff=true]
```

>예제

|번호|클래스|메인|
|:---:|:---:|:---:|
|1|[TV](./src/생성자/TV.java)|[main](./src/생성자/TV사용하기.java)|
|2|[게시판](./src/생성자/bbs.java)|[main](./src/생성자/게시판글쓰기.java)|
|3|[학원 수강신청](./src/생성자/수강신청.java)|[main](./src/생성자/학원.java)|
|4|[Mask](./src/생성자/Mask.java)|[main](./src/생성자/MaskUse.java)|
|5|[통장만들기](./src/생성자/통장.java)|[main](./src/생성자/은행통장사용하기.java)|
|6|[컴퓨터](./src/생성자/컴퓨터.java)|[main](./src/생성자/컴퓨터조립.java)|


***


## [2] 스태틱(Static)
### 1. 개념

객체 생성과 상관없이 클래스에 1개만 가지고 있으면서 생성된 여러개의 객체들이 공유할 목적으로 만든 변수

- static 변수 : RAM에서 클래스의 원본 영역에 저장
- 인스턴스 변수 : 힙 영역

```java
public class 직원 {
	String name;
	int age;
	String gender;
	static int count;
	static int sum;
    
    //생성자
    public 직원(String name, int age, String gender) {
		count++;        //직원 수 카운트
		sum += age;     //나이 총합
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

    //static 메소드 (평균 나이 구하기)
    public static void getAvg() {           //static 메소드에서는 static 변수만 접근 가능
		System.out.println(sum/count);
	}
}

public static void main(String[] args) {
	직원 work1 = new 직원("홍길동", 25, "여");
	직원 work2 = new 직원("김길동", 24, "남");
	직원 work3 = new 직원("송길동", 26, "여");
    
    //평균 나이 구하기
    System.out.println(직원.sum/직원.count);        //25
    직원.getAvg();      //25    →   둘 다 static 변수, 메소드를 부르기 때문에 객체 호출 x
}
```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221460558-bd0ca262-cc2e-4968-9384-8a759e3a1088.PNG" width=270> </p>
static 변수가 아닌 경우 static메소드에서 호출 시 에러

### 2. 실습

>예제

|번호|클래스|메인|
|:---:|:---:|:---:|
|1|[다이어리](./src/스태틱/Day.java)|[main](./src/스태틱/나의일지.java)|
|2|[직원 명단](./src/스태틱/직원.java)|[main](./src/스태틱/회사창업.java)|
|3|[딸 출산](./src/스태틱/딸.java)|[main](./src/스태틱/우리집.java)|

>프로그램

[1 더하기, 1 빼기](./src/스태틱/counter.java)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221460180-f8589130-2624-42ef-ab20-1d3d768279ca.gif" width=300> </p>

***

## [3] 상속
### 1. 정의 

기존에 있던 클래스를 확장해서 새로운 클래스를 만드는 것 (≒재사용)

- 단일 상속만 가능(부모는 하나여야 함. 다중상속 불가)

**부모클래스**(슈퍼클래스) : 기존에 있던 클래스. 물려주는 클래스

**자식클래스**(서브클래스) : 새로 만드는 클래스. 물려받는 클래스

```
비교>
생성자 : 객체 생성에 필요한 틀을 만듦
스태틱 : 객체를 생성하지 않아도 언제든지 사용할 수 있도록 하는 것
```

### 2. 구현

>`extends` : 상속받기

```java
// class 자식클래스명 extends 부모클래스명

public class Man extends Human {

}
```

### 3. 실습

>예제 1 (영웅) : 상속 +  생성자 + 스태틱

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221473782-e9c55848-f902-4d13-b51c-01940dd4ad26.png" width=600> </p>

[Human](./src/상속/사람.java) 

[Man](./src/상속/맨.java)   /   [Woman](./src/상속/우먼.java)

[Super Man](./src/상속/수퍼맨.java)   /   [Wonder Woman](./src/상속/원더우먼.java)

[Heroes](./src/상속/영웅사용.java)

>예제2 (커피 트럭)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221475346-13a58fc0-22ee-487e-a8fd-f6e9c5707734.png" width=600> </p>

[Car](./src/상속/Car.java) ← [Truck](./src/상속/Truck.java) ← [Coffee Truck](./src/상속/CoffeeTruck.java) ← [Coffee Truck Object](./src/상속/CoffeeTruckOb.java) 