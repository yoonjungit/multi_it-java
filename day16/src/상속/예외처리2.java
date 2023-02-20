package 상속;

import java.io.FileWriter;
import java.io.IOException;

public class 예외처리2 {

	public static void main(String[] args) {
		try {
			FileWriter file = new FileWriter("test.txt");
			file.write("안녕\n");
			file.write("바이바이\n");
			file.close();
		} catch (IOException e) {
			//에러가 발생할 때 대응하는 코드!!!
			//에러가 발생할 때만 실행됨.
			e.printStackTrace();
		}
	}
}
