package 순차문;

//부품이 있는 위치를 알려주는 역할
import javax.swing.JOptionPane;

public class 순차문1 {
	public static void main(String[] args) {
		//기본 순차문 == 입략 -> 처리 -> 출력
		//입력 -> 부품사용, 망치같은 언제나 바로 사용할 수 있는 것!!
		String data1 = JOptionPane.showInputDialog("What's your hobby?");
		String data2 = JOptionPane.showInputDialog("When do you do your hobby?");
		
		String result = data1 + data2;
		System.out.println(result);
		
		//처리 -> 글자연결
		//출력 -> 모니터 화면에 보이고 싶음
		
		
	}
}
