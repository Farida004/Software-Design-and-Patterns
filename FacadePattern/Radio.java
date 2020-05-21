package Lab;

/**
 * This class is an element of both Automobile and Mobile Software that enables
 * regulation of the Radio by setting the frequency to find a chanel in car
 * 
 * @author Farida
 *
 */
public class Radio {
	String description;
	Controller controller;
	double frequency;

	public Radio(String description, Controller controller) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + " on");
	}

	public void off() {
		System.out.println(description + " off");
	}

	public void setFrequency(double frequency) {
		System.out.println(description + " setting frequency to " + frequency);
		this.frequency = frequency;
	}

	public void setAm() {
		System.out.println(description + " setting AM mode");
	}

	public void setFm() {
		System.out.println(description + " setting FM mode");
	}

	public String toString() {
		return description;
	}
}
