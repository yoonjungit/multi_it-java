package ���;

import java.io.FileWriter;
import java.io.IOException;

public class ����ó��2 {

	public static void main(String[] args) {
		try {
			FileWriter file = new FileWriter("test.txt");
			file.write("�ȳ�\n");
			file.write("���̹���\n");
			file.close();
		} catch (IOException e) {
			//������ �߻��� �� �����ϴ� �ڵ�!!!
			//������ �߻��� ���� �����.
			e.printStackTrace();
		}
	}
}
