package Lab;

/**
 * This class is an element of both Automobile and Mobile Software that enables
 * the regulation of both CD player and Radio in Car.
 * 
 * @author Farida
 *
 */
public class Controller {
	String description;
	Radio r;
	CdPlayer cd;
	int volume;

	public Controller(String description) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + " is On");
	}

	public void off() {
		System.out.println(description + " is Off");
	}

	public void setCd(CdPlayer cd) {
		this.cd = cd;
	}

	public void setRadio(Radio r) {
		this.r = r;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
}
