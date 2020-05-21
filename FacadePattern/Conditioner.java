package Lab;

/**
 * This class is an element of both Automobile and Mobile Software that enables
 * regulation of the Conditioner in car
 * 
 * @author Farida
 *
 */
public class Conditioner {
	String description;
	int temp;

	public Conditioner(String description) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + " on");
	}

	public void off() {
		System.out.println(description + " off");
	}

	public void setTemp(int temp) {
		System.out.println(description + " setting temperature to " + temp);
		this.temp = temp;
	}

	public int getTemp() {
		return this.temp;
	}

	public void increaseTemp(int difference) {

		System.out.println(" temperature is increased by " + difference);
		this.temp += difference;
	}

	public void decreaseTemp(int difference) {
		System.out.println(" temperature is decreased by " + difference);
		this.temp -= difference;
	}

	public String toString() {
		return description;
	}
}
