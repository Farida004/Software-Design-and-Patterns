package Lab;

public class Test {
	public static void main(String[] args) {

		High_Tech htHouse = new High_Tech();
		Classic cHouse = new Classic();

		System.out.println("\nBuilding High tech style house.....");
		htHouse.constructHouse();

		System.out.println("\nBuilding Classic style house.....");
		cHouse.constructHouse();
	}
}
