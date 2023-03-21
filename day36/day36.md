# 36일차
## [1] 싱글톤(SingleTon Pattern)

### 1. 개념

> 싱글톤과 프로토타입


`싱글톤` : 객체를 하나만 만들어서 계속 사용 ex) 서블릿

- 멤버 변수 값이 객체 생성시 매번 똑같다고 하면, 객체를 여러개 생성할 필요 x

↔ `프로토타입` : 필요할 때 마다 객체를 만들어 사용

- 멤버 변수 값이 객체 생성시 변한다면, 매번 객체를 만들어야 함 ex) VO, DTO


### 2. 구현

> 프로토타입

[코드](./src/com/multi/www/web03/Car.java)

```java
//클래스
public class Car {
	String color;
	int price;
	int speed;
	
	public Car(String color, int price, int speed) {
		this.color = color;		//4byte
		this.price = price;		//4byte
		this.speed = speed;		//4byte
	}
}
```

[코드](./src/com/multi/www/web03/CarMain.java)

```java
//메인
public class CarMain {
	public static void main(String[] args) {
		Car car = new Car("white", 240000, 320);
		System.out.println(car);
		Car vehicle;
		
		for (int i = 0; i < 100; i++) {
			vehicle = new Car("red"+i, 10000, 280);		//각기 다른 객체 생성
			System.out.println(vehicle);		//따라서 주소값이 다 다름
		}
	}

}
```
주소 출력 결과 >
<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231659426-7413c1a1-4841-4bd4-9f97-54f36cd5bae2.png" width=250></p>


> 싱글톤

[코드](./src/com/multi/www/web03/Car2.java)


```java
//클래스
public class Car2 {
	String color;
	int price;
	int speed;
	//public : 만든 변수를 아무데서나 쓸 수 있도록 
	//static : 변수 하나만 만들 때
	public static Car2 car2;
	
	private Car2(String color, int price, int speed) {		//private : Car 클래스 외부에서 객체 생성 불가
		this.color = color;
		this.price = price;
		this.speed = speed;
	}
	
	public static Car2 getInstance() {
		if (car2==null) {
			car2 = new Car2("빨강", 100, 100);
		}
		return car2;
	}
}
```

[코드](./src/com/multi/www/web03/CarMain2.java)

```java
//메인
public class CarMain2 {
	public static void main(String[] args) {
		Car2 car2;      //private 클래스이기 때문에 외부에서 클래스 접근 및 new로 객체 생성 불가

		for (int i = 0; i < 100; i++) {
			car2 = Car2.getInstance();		//싱글톤 객체 생성
			System.out.println(car2);		//객체 1개 뿐이라 주소 다 같음
		}
	}

}
```

주소 출력 결과 >

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/231660081-62e570c3-c897-4d0d-825b-7257a8b3159f.png" width=250></p>


> 예제2
[프로토타입](./src/com/multi/www/web03/Coffee1.java), [메인](./src/com/multi/www/web03/CoffeeMain1.java)
[싱글톤](./src/com/multi/www/web03/Coffee2.java), [메인](./src/com/multi/www/web03/CoffeeMain2.java)

## [2] 웹(CSS, JavaScript) 복습

[예제1](./WebContent/index.html) : 외부 CSS 파일 불러오기
[예제2](./WebContent/index2.html) : <style>태그 입력
[예제3](./WebContent/index3.html) : 외부 JS 파일 불러오기
[예제4](./WebContent/index4.html) : getElementById(), innerHTML
[예제5](./WebContent/index5.html) : getElementById(), innerHTML, 유효성 검증
[연습](./WebContent/practice1.html)