package Lab;

/**
 * This class is an element of Mobile Software that enables regulation of the
 * Phone Playlist and turns on the music from the phone in car
 * 
 * @author Farida
 *
 */
public class Playlist {
	String description;

	public Playlist(String description) {
		this.description = description;
	}

	public void shuffleSongs() {
		System.out.println("Your playlist is shuffled.....");
	}

	public void turnOnMusic() {
		System.out.println("The music is on.......");

	}

	public void turnOffMusic() {
		System.out.println("The music is off.......");

	}
}
