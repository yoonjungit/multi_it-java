package ����ȯ;

import java.util.HashSet;
import java.util.Random;

public class �ζ�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(42);
		HashSet lotto = new HashSet();
		System.out.println(lotto.size());		//0(�� �ؽü�)
		for (int i = 0; i < 1000; i++) {
			lotto.add(r.nextInt(1000));
		}
		System.out.println(lotto.size());		//622(�ߺ� �� ����)
		System.out.println(lotto);
	}

}
