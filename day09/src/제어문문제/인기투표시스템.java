package 제어문문제;

import java.util.Scanner;

public class 인기투표시스템 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0;		//변수 : 입력값
		int iu = 0;		//변수 : 아이유 표 
		int bts = 0;	//변수 : 방탄소년단 표
		int nj = 0;		//변수 : 뉴진스 표
		System.out.println("인기투표 시스템");
		System.out.println("===========");
			while (true) {
				System.out.print("1) 아이유, 2) 방탄, 3) 뉴진스, 4) 종료 >>");
				i = sc.nextInt();	//입력값 정수 변환 후 변수 i에 저장
				if(i==4){			//종료 선택 시
					System.out.println("시스템을 종료합니다.");
					System.out.println("---------------");
					break;
				}else if (i==1) {	//아이유 선택시
					iu+=1;
				} else if(i==2){	//방탄 선택시
					bts+=1;
				} else if(i==3){	//뉴진스 선택시
					nj+=1;
				}
			}
		//종료 후 투표 결과 프린트
		System.out.println("아이유 : "+ iu + "표");
		System.out.println("방탄 : "+ bts + "표");
		System.out.println("뉴진스 : "+ nj + "표");
		System.out.println("---------------");

		sc.close();		//스캐너 닫기
	}

}
