package 형변환;

import java.util.HashSet;
import java.util.Random;

public class 로또1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(42);
		HashSet lotto = new HashSet();
		System.out.println(lotto.size());		//0(빈 해시셋)
		for (int i = 0; i < 1000; i++) {
			lotto.add(r.nextInt(1000));
		}
		System.out.println(lotto.size());		//622(중복 값 제거)
		System.out.println(lotto);
	}

}
