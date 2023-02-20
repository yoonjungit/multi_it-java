package 형변환;

import java.util.LinkedList;

public class 냉장고우유 {

	public static void main(String[] args) {
//		Queue 대기줄, 먼저 들어온 요소(element)가 먼저 나감
		LinkedList milk = new LinkedList();
		milk.add("어제 상한 우유");
		milk.add("오늘 싱싱한 우유");
		milk.add("내일 사올 우유");
		
		System.out.println(milk);	//[어제 상한 우유, 오늘 싱싱한 우유, 내일 사올 우유]
		milk.remove();		//맨 앞 요소 제거
		System.out.println(milk);	//[오늘 싱싱한 우유, 내일 사올 우유]

	}

}
