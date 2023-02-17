package 상속기본;

public class 제트스트림 {

	public static void main(String[] args) {
		볼펜 jetstream = new 볼펜();
		
		jetstream.company = "pilot";
		jetstream.price = 2000;
		jetstream.thick = 0.7;
		
		jetstream.buy();
		jetstream.write();
	}
}
