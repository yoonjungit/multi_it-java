package SelectAll;

import java.util.ArrayList;

public class SelectUITest {
	
	public static void main(String[] args) {
		SelectDAOTest test = new SelectDAOTest();		//Select�� ������ ���� DAO��ü ����
		ArrayList<SelectDTOTest> result = test.search();	//Select�� ���� �� ��ȯ���� �迭 ����
		
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i).toString());	//�迭 �� ����(��) ���ʴ�� ����Ʈ

		}
	}
}
