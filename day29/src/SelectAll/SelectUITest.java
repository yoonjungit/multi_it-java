package SelectAll;

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
