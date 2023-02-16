package 생성자;

public class 통장 {

		String name;
		String ssn;
		int money;
		
		//이름, 주민번호, 돈을 입력해야 통장을 만들 수 있음
		
		public 통장(String name, String ssn, int money) {
			super();		//생략가능
			this.name = name;
			this.ssn = ssn;
			this.money = money;
		}
		
		//toString() : 주소 대신 그 주소가 가리키는 멤버 변수 값들을 프린트 
		@Override
		public String toString() {
			return "통장 [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
		}
		
		
		
}
