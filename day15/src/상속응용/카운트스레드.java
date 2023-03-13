package ????;

import java.util.Date;

public class ?????? extends Thread {

	@Override
	public void run() {
		for (int i = 1000; i > 0; i--) {
			Date date = new Date();
			System.out.println("???>> " + date);
			try {
				Thread.sleep(1000); //1????!
			} catch (Exception e) {
				System.out.println("cpu ?? ?? ??.");
			}
		}
	}
}
