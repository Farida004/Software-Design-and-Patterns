package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Child class that extends the functionality of a SummerHouse and adds the
 * implementations to abstract methods. Hook: if a user wants a nice garden with
 * decorations to be build next to the house.
 * 
 * @author Farida
 *
 */
public class Classic extends SummerHouse {

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

		System.out.print("Would you like us to build a garden next to your house?(y/n) ");

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
		System.out.println("The trees are planted and decorations placed....");

	}

	@Override
	public void placeRoof() {
		System.out.println("Hip Roof is placed");

	}

	@Override
	public void installDoors() {
		System.out.println("Four panelArchtop textured doors are installed");

	}

	@Override
	public void installWindows() {
		System.out.println("Custom shaped wooden windows are installed");

	}

	@Override
	public void addMaterials() {
		System.out.println("Stone , wood and bamboo are going to be used");

	}
}