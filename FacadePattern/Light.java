package Lab;

/**
 * This class is an element of both Automobile and Mobile Software that enables
 * regulation of the Light in car
 * 
 * @author Farida
 *
 */
public class Light {
	String description;

	public Light(String description) {
		this.description = description;
	}

	public void On() {
		System.out.println(description + " is turned On");
	}

	public void Off() {
		System.out.println(description + " is turned Off");
	}
}
