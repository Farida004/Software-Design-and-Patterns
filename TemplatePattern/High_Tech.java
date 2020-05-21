package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Child class that extends the functionality of a SummerHouse and adds the
 * implementations to abstract methods. HookL if a user wants a stone modern
 * garage to be build next to the house.
 * 
 * @author Farida
 *
 */
public class High_Tech extends SummerHouse {

	public boolean customerDetailes() {

		String answer = getUserInput();

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	private String getUserInput() {
		String answer = null;

		System.out.print("Would you like us to build a stone garage next to your house?(y/n)");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO error trying to read your answer");
		}
		if (answer == null) {
			return "no";
		}
		return answer;
	}

	@Override
	public void addSpecifications() {
		System.out.println("The garage construction has started.....");

	}

	@Override
	public void placeRoof() {
		System.out.println("Curved roof is placed");

	}

	@Override
	public void installDoors() {
		System.out.println("High-tech white doors are installed");

	}

	@Override
	public void installWindows() {
		System.out.println("High-tech plastic windows are installed");

	}

	@Override
	public void addMaterials() {
		System.out.println("Steel, glass and plastic are going to be used ");

	}
}