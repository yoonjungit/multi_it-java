package 순차문;

//부품이 있는 위치를 알려주는 역할
import javax.swing.JOptionPane;

public class 순차문2 {
	public static void main(String[] args) {
		//기본 순차문 == 입략 -> 처리 -> 출력
		//입력 -> 부품사용, 망치같은 언제나 바로 사용할 수 있는 것!!
		String data1 = JOptionPane.showInputDialog("정수 입력하시오-1");
		String data2 = JOptionPane.showInputDialog("정수 입력하시오-2");
		
		//처리 -> 숫자 더하기 연산
		//		String -> int 형 변환
		int data11 = Integer.parseInt(data1); //이때 바꾸고자 하는 형태를 대문자로 Integer, Double, Float 등
		int data22 = Integer.parseInt(data2);
		int data33 = Integer.parseInt(data1);
		int data44 = Integer.parseInt(data2);
		
		int result = data11 + data22;
		double result2 = data33 + data44;
		System.out.println(result + result2);
		
		//출력 -> 모니터 화면에 보이고 싶음
		
		
	}
}
