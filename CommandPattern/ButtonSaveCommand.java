package Lab6;

/**
 * Concrete example of a button
 * 
 * @author Farida
 *
 */
public class ButtonSaveCommand implements Command {
	Button btn;

	public ButtonSaveCommand(Button btn) {
		this.btn = btn;
	}

	@Override
	public void execute() {
		btn.save();

	}

	@Override
	public void undo() {
		System.out.println("No way dude, you have already saved it ;)");

	}

}
