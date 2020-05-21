package Lab;

/**
 * This class is an element of Automobile Software that regulates the operations
 * with CD player
 * 
 * @author Farida
 *
 */
public class CdPlayer {
	String description;
	int currentTrack;
	Controller controller;
	String title;

	public CdPlayer(String description, Controller controller) {
		this.description = description;
		this.controller = controller;
	}

	public void on() {
		System.out.println(description + " on");
	}

	public void off() {
		System.out.println(description + " off");
	}

	public void removeCD() {
		title = null;
		System.out.println(description + " removed");
	}

	public void play(String title) {
		this.title = title;
		currentTrack = 0;
		System.out.println(description + " playing \"" + title + "\"");
	}


	public void stop() {
		currentTrack = 0;
		System.out.println(description + " stopped");
	}

	public void pause() {
		System.out.println(description + " paused \"" + title + "\"");
	}

	public String toString() {
		return description;
	}
}
