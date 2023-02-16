package 상속;

public class CoffeeTruckOb{
	public static void main(String[] args) {
		CoffeeTruck 커피트럭 = new CoffeeTruck();
		
		커피트럭.name = "커피신속배달";
		커피트럭.kind = "커피차";
		커피트럭.ppl = 3;
		커피트럭.cups = 500;
		커피트럭.ready = true;
				
		커피트럭.drive();
		System.out.println(커피트럭);
	}
}
