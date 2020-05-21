package Lab;

/**
 * This class is an element of both Automobile and Mobile Software that enables
 * regulation of the Seat position in car
 * 
 * @author Farida
 *
 */
public class Seat {
	String description;

	public Seat(String description) {
		this.description = description;
	}

	public void up() {
		System.out.println(description + " is moving up");
	}

	public void down() {
		System.out.println(description + " is moving down");
	}

	public void back() {
		System.out.println(description + " is moving back");
	}

	public void foward() {
		System.out.println(description + " is moving forward");
	}

	public void heatTheSeat() {
		System.out.println(description + " is getting warm");
	}

	public void seatheatingOff() {
		System.out.println(description + " stopped heating");
	}
}
