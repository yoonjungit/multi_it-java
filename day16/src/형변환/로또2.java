package ����ȯ;

import java.util.HashSet;
import java.util.Random;

public class �ζ�2 {
	
	public static void main(String[] args) {
		Random r = new Random();
		HashSet lotto = new HashSet();
		System.out.println(lotto.size());
		for (int i = 0; i < 6; i++) {
			lotto.add(r.nextInt(45)+1);
		}
		System.out.println(lotto.size());
		System.out.println(lotto);
	}
}
