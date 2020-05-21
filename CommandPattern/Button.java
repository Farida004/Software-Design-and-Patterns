package Lab6;

public class Button {
	/**
	 * Button is a receiver class that receives various actions and performs
	 * accordingly
	 */
	public Button() {
	}

	public void exit() {
		System.out.println("Bye bye.....");
	}

	public void cut() {
		System.out.println("The text is cut");
	}

	public void share() {
		System.out.println("Your post is shared on Facebook");
	}

	public void print() {
		System.out.println("Connection to printer is getting ready.....");
	}

	public void save() {
		System.out.println("The document is saved");
	}
}