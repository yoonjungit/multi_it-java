package 부품사용하기;

import 부품만들기.강아지;

public class 강아지키우기 {

	public static void main(String[] args) {
		강아지 dog1 = new 강아지();
		dog1.name = "똘이";
		dog1.age = 2;
		dog1.family = "시고르자브종";
		
		dog1.meal();
		dog1.stroll();
		dog1.hospital();
		강아지 dog2 = new 강아지();
		dog2.name = "맥스";
		dog2.age = 1;
		dog2.family = "골든 리트리버";
		
		dog2.meal();
		dog2.stroll();
		dog2.hospital();
	}

}
