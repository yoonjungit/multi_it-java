# 29일차

## [1] SQL : Select 구현(결과행 2개 이상)

SELECT문 결과 행이 1개인 경우 DTO객체로 반환하였지만, 결과 행이 여러개인 경우 각 행을 DTO객체로 생성 한 후 이를 배열로 저장해 반환 해야 한다.

### 1. 코드

>DAO

```java
public ArrayList<SelectDTOTest> search() {
	ResultSet rs = null;		//오라클에서 정수가 아닌 표로 반환되기 때문
	SelectDTOTest result = null;	//결과 반환을 위한 MemberVO객체 생성
	ArrayList<SelectDTOTest> list = new ArrayList<>();		//여러 DTO객체 저장하기 위한 배열
	
	try {
		// 1. 오라클 드라이버
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
    	// 2. 자바-오라클 DB 연결
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "oracle";
		Connection con = DriverManager.getConnection(url, user, password);
		
		//3. SQL문 생성
		String sql = "SELECT * FROM HR.MEMBER";	
		PreparedStatement ps = con.prepareStatement(sql);
		
		//4. SQL문 오라클로 전송
		rs = ps.executeQuery();		//executeUpdate가 아닌 executeQuery(반환 결과가 정수가 아닌 데이터(표)이기 때문)
		
    	while (rs.next()) {
			String id2 = rs.getString(1);	//반환되는 열 데이터 값 순서대로 받기
			String pw2 = rs.getString(2);
			String name2 = rs.getString(3);
			String tel2 = rs.getString(4);
			
			result = new SelectDTOTest();
				
			result.setId(id2);
			result.setPw(pw2);
			result.setName(name2);
			result.setTel(tel2);
				
			list.add(result);		//배열에 DTO객체 저장
		}
			
	} catch (Exception e) {	//모든 예외 처리
		e.printStackTrace();
	}
		
	return list;		//배열 반환
		
	}
```

>UI

```java
import java.util.ArrayList;

public class SelectUITest {
	
	public static void main(String[] args) {
		SelectDAOTest test = new SelectDAOTest();		//Select문 실행을 위한 DAO객체 생성
		ArrayList<SelectDTOTest> result = test.search();	//Select문 실행 후 반환받은 배열 저장
		
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i).toString());	//배열 각 원소(행) 차례대로 프린트

		}
	}
}
```

>실습

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224492632-0c7f451d-e372-4c63-a2cb-0b352db4b132.JPG" width=300> </p>


Member테이블 전체 받아오기 : [UI](./src/SelectAll/SelectUITest.java), [DAO](./src/SelectAll/SelectDAOTest.java), [DTO](./src/SelectAll/SelectDTOTest.java)


## [2] 1차 프로젝트 (조별)

##### 자바 스윙, 오라클 DB활용한 간단한 프로그램 만들기

담당 메뉴 구현

[프로젝트 일지](../project01/BestRestaurant.md/#2-d-1-개발-3일차-수업-29일차)