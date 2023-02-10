package 배열응용;

import java.util.Scanner;

public class 입력배열확인문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] last = new String[3];
		System.out.println("작년에 가고싶었던 세곳 입력(우선순위에 따라 입력) >>");
		for (int i = 0; i < last.length; i++) {
			last[i]=sc.next();
		}
		
		String[] this23 = new String[3];
		System.out.println("올해 가고싶은 세곳 입력(우선순위에 따라 입력) >>");
		for (int i = 0; i < this23.length; i++) {
			this23[i]=sc.next();
		}
		
		int count = 0;
		for (int i = 0; i < this23.length; i++) {
			if (this23[i].equals(last[i])) {
				count+=1;
			}
		}
		System.out.println("작년과 올해 똑같은 우선순위로 가고 싶은 곳은 총 "+ count+ "곳");
		sc.close();
		}
	}


