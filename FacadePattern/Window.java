package Lab;

/**
 * This class is an element of both Automobile and Mobile Software that enables
 * regulation of the Window (up/down) in car
 * 
 * @author Farida
 *
 */
public class Window {
	String description;

	public Window(String description) {
		this.description = description;
	}

	public void up() {
		System.out.println(description + " is moving up");
	}

	public void down() {
		System.out.println(description + " is moving down");
	}
}
