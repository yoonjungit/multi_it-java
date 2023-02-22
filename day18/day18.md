# 18일차
## [1] 인터페이스(Interface)
### 1. 정의와 선언방법
- 다른 클래스를 작성할 때 기본이 되는 틀을 제공하면서, 다른 클래스 사이의 중간 매개 역할까지 담당하는 일종의 추상 클래스

- 기능 중심으로 규칙을 정의 : 메서드 이름, 반환값, 입력값 (변수는 제외)

- 선언 : public abstract 메소드명

단, 클래스와는 달리 인터페이스의 모든 필드는 public static final이어야 하며, 모든 메소드는 public abstract이어야 함. 
이 부분은 모든 인터페이스에 공통으로 적용되는 부분이므로 이 제어자는 생략할 수 있음

[인터페이스 예시](./src/인터페이스/아이폰잭.java)

```java
public interface 아이폰잭 {
	public abstract void 납작하게만들다();
	void 이센치로만들다();
}
```

### 2. 구현(implements)

- 구현 방법 : class 클래스명 implements 인터페이스명

이때 상속과 유사하게 생겼지만, 상속(extends)이 아닌 구현(implements)임에 주의

[구현 예시1](./src/인터페이스/애플잭.java)[구현 예시2](./src/인터페이스/바나나잭.java)

```java
public class 애플잭 implements 아이폰잭{
	@Override
	public void 납작하게만들다() {
		System.out.println("흰색으로 납작하게 만들다");
	}

	@Override
	public void 이센치로만들다() {
		System.out.println("긴 줄을 사용하여 이센치로 만들다");
	}
	}
```

### 3. 메인 함수에서 사용

[사용](./src/인터페이스/아이폰잭사용.java)

```java
public static void main(String[] args) {
		애플잭 jack = new 애플잭();
		바나나잭 jack2 = new 바나나잭();
		jack.납작하게만들다();
		jack.이센치로만들다();
		jack2.납작하게만들다();
		jack2.이센치로만들다();
	}
```

### 4. 상속이 아닌 인터페이스를 사용하는 이유

- 규칙이 정해져 있어 협업시 메소드명을 통일 할 수 있음

- 새로운 클래스 개발 시, 정해진 규칙을 따르면 되므로 교체 용이

- 다중구현 가능

*Computer예제*

|예제 구분|파일명|
|:---:|:---:|
|선언|[Computer](./src/인터페이스/Computer.java)|
|구현1|[Apple Computer](./src/인터페이스/AppleComputer.java)|
|구현2|[Banana Computer](./src/인터페이스/BananaComputer.java)|
|사용|[Computer Use](./src/인터페이스/Computer.java)|

## [2] 소켓 프로그래밍

### 1. 정의

- 소켓을 이용한 통신 프로그래밍
- 소켓 : 프로세스간의 통신에서 사용되는 양 끝단 ≒ 핸드폰

### 2. TCP와 UDP

|항목|TCP|UDP|
|:---:|:---:|:---:|
|연결방식|연결방식|비연결방식|
|특징|데이터의 전송 순서가 보장됨<br>데이터의 수신여부를 확인함 <br>UDP보다 전송속도가 느림|데이터의 전송순서가 바뀔 수 있음<br>데이터의 수신여부를 확인하지 않음<br>TCP보다 전송속도가 빠름|
|관련 클래스|Socket<br>ServerSocket|DatagramSocket<br>DatagramPacket<br>MulticastSocket|

<p align="center"><img src="https://image.slidesharecdn.com/tcp-150426214109-conversion-gate01/95/tcp-22-1024.jpg?cb=1430085440" width=600> </p>

### 3. 구현

#### (1)TCP

	<TCP 전송의 흐름>
	① 서버 프로그램 : 서버 소켓을 생성하고, 이를 서버 컴퓨터의 특정 포트에서 클라이언트의 연결요청 처리를 준비
	② 클라이언트 프로그램 : 접속할 서버의 IP주소와 포트정보를 갖고 소켓을 생성 해 서버에 연결요청
	③ 서버소켓은 연결요청을 받으면 서버에 새로운 소켓을 생성해 클라이언트 소켓과 연결
	④ 클라이언트의 소켓과 새로 생성된 서버의 소켓은 서버소켓과 관계 없이 일대일 통신

>서버 프로그램

```
1. 서버 소켓 생성 → ServerSocket 소켓명 = new ServerSocket(포트번호);
	이때 포트번호는 1023 이상의 네자리 숫자중 쓰지 않는 번호 선택 
	네트워크 연결시 에러 발생 대비해 예외처리 하기
2. 클라이언트 프로그램의 요청이 들어올 시 새로운 소켓 생성 → Socket 소켓명 = 서버소켓.accept();
	지속적으로 처리하기 위해 무한 반복문 처리

```

```java
public static void main(String[] args) throws Exception {	//예외처리(try-catch문도 가능)

		ServerSocket server = new ServerSocket(9100);	//1. 서버 소켓 생성
		
		while (true) {
			Socket socket = server.accept();	//2.
			System.out.println(count + ">> 번째 승인완료! Socket 생성됨");
		}
	}
```

>클라이언트 프로그램

```
1. 소켓 생성 후 연결 요청 보내기 
	→ Socket 소켓명 = new Socket(IP주소, 포트번호)
	로컬호스트인 경우 "localhost"입력 가능(127.0.0.1)
```

```java
public static void main(String[] args) throws Exception {
		
		Socket socket = new Socket("localhost", 9100);
		System.out.println("클라이언트 승인 요청 보냄.");
		
	}
```

TCP 예제 : [서버](./src/네트워크프로그램/TCPServer.java), [클라이언트](./src/네트워크프로그램/TCPClient.java)

#### (2) UDP

	<UDP 전송의 흐름>
	① 서버 프로그램 : 연결을 위한 소켓 생성 및 데이터를 받을 빈 배열 및 패킷 생성 
	② 클라이언트 프로그램 : 
	소켓 생성 후 보낼 데이터를 바이트 단위로 쪼갬>
	IP주소를 InetAddress 클래스를 통해 IP주소를 객체로 저장>
	패킷을 이용해 데이터를 전송
	③ 서버소켓은 연결요청을 받으면 서버에 새로운 소켓을 생성해 클라이언트 소켓과 연결
	④ 서버에서 패킷을 통해 데이터를 받음

패킷 : 네트워크를 통해 전송하기 쉽도록 자른 데이터의 전송 단위

>서버 프로그램

```
1. 소켓 생성 → DatagramSocket 소켓명 = new Datagram(포트번호);
	예외처리 반드시
2. 빈 바이트 배열 생성 → byte[] 배열명 = new byte[배열길이];
3. 데이터 수신을 위한 패킷 생성 → DatagramPacket 패킷명 = new DatagramPacket(바이트배열, 바이트배열길이)
4. 소켓으로 데이터 수신
```

```java
public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(8888);		//1.
		
		byte[] data = new byte[256];			//2.
		DatagramPacket packet = new DatagramPacket(data, data.length);		//3.
		
		socket.receive(packet);				//4.
	
		System.out.println("받은 데이터는 " + new String(data));		//받은 데이터 출력

		socket.close();		//소켓 닫기
	}
```
> 클라이언트 프로그램

```
1. 소켓 생성 → DatagramSocket 소켓명 = new Datagram(포트번호);
	예외처리 반드시
2. 보낼 데이터를 바이트 단위로 쪼개기 → byte[] 배열명 = 데이터.getBytes();
3. InetAddress 클래스를 통해 IP주소 객체 생성 → InetAddress 객체명 = InetAddress.getByName("도메인")
	도메인 : 로컬호스트인 경우 "localhost" 혹은 "127.0.0.1" 입력
4. 패킷 생성 → DatagramPacket 패킷명 = new DatagramPacket(데이터배열, 데이터배열길이, IP객체, 호스트포트번호)
5. 소켓으로 데이터 송신
```


```java
public static void main(String[] args) throws Exception {
		
		DatagramSocket socket = new DatagramSocket();
		
		String s = "I am a Java Programmer";
		byte[] data = s.getBytes();
		InetAddress ip = InetAddress.getByName("localhost");
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 8888);
		
		socket.send(packet);

		socket.close();
	}
```

UDP예제 : [서버](./src/네트워크프로그램/UDPReceiver.java), [클라이언트](./src/네트워크프로그램/UDPSender.java)

### 4. 실습

UDP를 이용한 채팅 프로그램 

[사용자A](./src/네트워크프로그램/chatA.java), [사용자B](./src/네트워크프로그램/chatA.java)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221398195-5e412f58-6de9-4144-9406-431a2e5fdfaa.gif" width=600> </p>