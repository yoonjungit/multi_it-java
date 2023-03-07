# 26일차

## [1] DAO 구현 클래스

```
DAO(Data Access Object) : 데이터베이스에 접근하는 추상적 인터페이스 객체
```

<p align="center"><img src="https://java-design-patterns.com/assets/dao-7c93d40f.png" width=500> </p>

[출처](https://java-design-patterns.com/patterns/dao/#class-diagram)

### 1. JDBC 프로그래밍 4단계

```
(1) 드라이버 로딩

(2) DB연결
            => DBCP 라이브러리 : (1)+(2)
(3) SQL 객체화
            => 스프링, MYBATIS : (1)+(2)+(3)
(4) SQL 실행 요청
```

>코드

`PreparedStatement` : 미리 컴파일 된 SQL 구문 객체 [참고](https://docs.oracle.com/javase/7/docs/api/java/sql/PreparedStatement.html)

`executeUpdate()` : SQL(Insert, Update, Delete)구문 실행 [참고](https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html#executeUpdate(java.lang.String))

```java
package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class dbconnect {

	public static void main(String[] args) {

        try {
            // 1. 오라클 11g와 연결할 부품 설정(드라이버 로딩)
            Class.forName("oracle.jdbc.driver.OracleDriver");
                
            // 2. 오라클 11g에 연결해보자 (java-oracle DB 연결)
            // jdbc:연결할 DB=oracle:오라클버전=thin:ip:포트번호:xe버전 
            String url ="jdbc:oracle:thin:@localhost:1521:xe";
            String user = "system";
            String password = "oracle";
            Connection con = DriverManager.getConnection(url, user, password);
                    
            //3. SQL문 만들기
            String sql = "INSERT INTO HR.MEMBER VALUES('win2', 'win2', 'win2', 'win2')";
            PreparedStatement ps = con.prepareStatement(sql);		//PreparedStatement 객체 생성
            
            //4. SQL문 오라클로 보내기
            ps.executeUpdate();		//executeUpdate 메소드 실행
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

### 2. 실습

>데이터 삽입, 삭제, 수정

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/223413991-c25fa66c-1d58-486a-ab92-5939d09fa037.PNG" width=500> </p>

[실습 예제1](./src/javadb/dbconnect.java)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/223413999-f266fab4-6f2b-47fc-8c41-3b759260f2d4.PNG" width=500> </p>

[실습 예제2](./src/javadb/dbconnect2.java)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/223414004-39fbb1dc-6b21-4279-b8db-a6b96ebfcee8.PNG" width=500> </p>

[실습 예제3](./src/javadb/dbconnect3.java)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/223413980-67a9dafe-a7ce-47f4-b6b0-97f2cbe89738.PNG" width=500> </p>

[실습 예제4](./src/javadb/dbconnect4.java)

<br><br>

### 3. 메소드

>복습(메소드)

```java
public 반환여부/타입 메소드명 (입력값){
    처리 내용
}
//반환 있는 경우 : 처리 내용 마지막에 return
//반환 없는 경우(void) : return 입력x

package javadb;

public class test {
	public static int add(int x, int y){
	    return x+y;
	    }

	    public static void add2(int x, int y){
	    System.out.println(x+y);
	    }

	public static void main(String[] args) {
	    System.out.println(add(2, 3)); //5  
	    add2(2, 3); //5
	}	    
}
```

>Connection을 메소드로 변환 시

```java
package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class dbconnect5 {
	//Connection 메소드 (Connection 반환. 이때 catch(예외상황)에 대비해 con=null로 미리 지정해야 함)
	static Connection getConnection(String url, String user, String password) {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공");
			
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = getConnection(url, user, password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
```

[실습 예제](./src/javadb/dbconnect5.java)

### 4. DAO 클래스화

[첫번째 실습](./src/javadb/dbconnect.java)에서는 DAO를 메인 클래스로 구현하여 정해진 데이터 값만 넣을 수 있었지만, 이번에는 클래스화 해서 객체를 생성하고, 이후에는 데이터를 입력받아 넣을 수 있도록 하였다.

>1단계 : DAO 클래스화 

```java
package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class memberDAO1 {

	public void insert() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공");
			
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공");
			
            // 데이터 입력(INSERT)
			String sql = "INSERT INTO HR.MEMBER VALUES('win3', 'win3', 'win3', 'win3')";	
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 부품 만들기");
			
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공");
			
		} catch (Exception e) {	//모든 예외 처리
			e.printStackTrace();
		}
	}
}
```

```java
package javadb;

public class joinMember {

	public static void main(String[] args) {
		memberDAO1 dao = new memberDAO1();
		dao.insert();
	}

}
```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224083203-d09c5502-46c3-4421-82a9-c212c2e42938.png" width=300> </p>

실습 : [클래스 : memberDAO1](./src/javadb/memberDAO1.java) / [메인 실행 : memberDTO1](./src/javadb/memberDTO1.java)

>2단계 : 스캐너로 데이터 값 입력 받아 DAO로 넘기기 (Member테이블; 회원가입, 탈퇴, 비밀번호 수정)

```
구현 방법 : Member 테이블에 스캐너로 사용자로부터 입력 받은 데이터를 DAO객체로 생성 후 넘김. DAO에서는 이를 오라클 DB와 연결 후 원하는 기능(메소드 : Insert, Delete, Update)처리 
```

`setString` : `PreparedStatement` 객체에서 변수값 지정

```java

public void insert(String id, String pw, String name, String tel) {
    //입력 받은 값(id, pw, name, tel)을 변수로 넣을 때 변수 대신 ?를 넣고, setString으로 변수 지정
    String sql = "INSERT INTO HR.MEMBER VALUES(?, ?, ?, ?)"; 
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1, id);    //첫번째 물음표(이때 0이 아님에 주의) 자리에 id 대입
    ps.setString(2, pw);
    ps.setString(3, name);
    ps.setString(4, tel);
}
```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/223416099-864efe0d-4d21-4071-ac36-d3153ea16901.PNG" width=600> </p>

실습 : [클래스 : memberDAO2](./src/javadb/memberDAO2.java) / [메인 실행 : memberDTO2](./src/javadb/memberDTO2.java)


>2단계 : 스캐너로 데이터 값 입력 받아 DAO로 넘기기 (BBS테이블; 글 작성, 글 제목 수정, 글 내용 수정, 글 삭제)

```
구현 기능 : BBS테이블에 스캐너로 사용자로부터 입력받은 데이터를 DAO객체로 생성 후 넘김. DAO에서는 이를 오라클 DB와 연결 후 원하는 기능(메소드 : Insert, Delete, Update)처리 
```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/223416106-c252defb-28f9-4077-bfb5-dc465a579805.PNG" width=700> </p>

실습 : [클래스 : bbsDAO](./src/javadb/bbsDAO.java) / [메인 실행 : bbsDTO](./src/javadb/bbsDTO.java)

## [2] 자바 GUI 스윙을 활용한 DAO 구현

### 1. JFrame 생성

>회원가입, 게시판 프로그램

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/223416213-81bb7f1e-b2b2-46fa-a532-e64e7b93d125.PNG" width=400> </p>

[메인 실행 : joinWeb](./src/viewdb/joinWeb.java)

[메인 실행 : writeBbs](./src/viewdb/writeBbs.java)