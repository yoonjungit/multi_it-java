package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 확인문제 {

	public static void main(String[] args) {
		//1.
		HashSet travel = new HashSet();
		travel.add("스페인");
		travel.add("미국");
		travel.add("캐나다");
		travel.add("멕시코");
		travel.add("영국");
		travel.add("스페인");
		//1-1. 전체 출력 (중복되는 마지막 스페인은 제거된 후 출력)
		System.out.println(travel);		//[스페인, 캐나다, 미국, 영국, 멕시코]
		
		//2.
		HashMap room = new HashMap();
		room.put("안방", "TV");
		room.put("거실", "쇼파");
		room.put("부엌", "냉장고");
		room.put("현관", "신발");
		//2-1. 전체 출력
		System.out.println(room);		//{거실=쇼파, 현관=신발, 안방=TV, 부엌=냉장고}
		//2-2. 현관(key)의 value?
		System.out.println(room.get("현관"));		//신발
		//2-3. 거실(key)의 value를 책상으로 변경 후 전체 출력
		room.replace("거실", "책상");
		System.out.println(room);		//{거실=책상, 현관=신발, 안방=TV, 부엌=냉장고}
		
		//3.
		ArrayList todo = new ArrayList();
		todo.add("빨래");
		todo.add("설거지");
		todo.add("화장실 청소");
		todo.add("청소기");
		todo.add("창틀 닦기");
		//3-1. 전체 출력
		System.out.println(todo);		//[빨래, 설거지, 화장실 청소, 청소기, 창틀 닦기]
		//3-2. 첫번째와 마지막 할일만 출력
		System.out.println("첫번째 할일 : "+todo.get(0)+" \n마지막으로 할일 : "+todo.get(todo.size()-1));
		//첫번째 할일 : 빨래 
		//마지막으로 할일 : 창틀 닦기
		//3-3. 두번째 원소를 청소로 변경 후 전체 출력
		todo.set(1, "청소");
		System.out.println(todo);		//[빨래, 청소, 화장실 청소, 청소기, 창틀 닦기]
	}

}
