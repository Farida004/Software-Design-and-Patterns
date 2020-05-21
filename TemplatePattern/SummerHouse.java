package Lab;

/**
 * Construction of a summer house is performed here.Main class *
 * 
 * @author Farida
 *
 */
public abstract class SummerHouse {
	String material;

	void constructHouse() {
		addMaterials();
		constructFoundation();
		performFraming();
		installWindows();
		installDoors();
		placeRoof();
		if (customerDetailes()) {
			addSpecifications();
		}
	}

	abstract void addMaterials();

	abstract void addSpecifications();

	abstract void placeRoof();

	abstract void installDoors();

	abstract void installWindows();

	public void performFraming() {
		System.out.println("The framing support is built");

	}

	public void constructFoundation() {
		System.out.println("The foundation is ready");

	}

	public boolean customerDetailes() {
		return true;
	}

}