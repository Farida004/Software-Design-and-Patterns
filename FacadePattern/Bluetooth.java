package Lab;

/**
 * This class is an element of Mobile Software facade that enables connection
 * between car and mobile.
 * 
 * @author Farida
 *
 */
public class Bluetooth {
	String deviceName;

	public Bluetooth(String deviceName) {
		this.deviceName = deviceName;
	}

	public void connect() {
		System.out.println(deviceName + " is connected to the car");
	}

	public void disconnect() {
		System.out.println(deviceName + " is dicconnected from the car");
	}
}
