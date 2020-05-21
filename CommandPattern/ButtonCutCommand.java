package Lab6;

/**
 * Concrete example of a button
 * 
 * @author Farida
 *
 */
public class ButtonCutCommand implements Command {
	Button btn;

	public ButtonCutCommand(Button btn) {
		this.btn = btn;
	}

	@Override
	public void execute() {
		btn.cut();

	}

	@Override
	public void undo() {
		System.out.println("Here is your original version of text.");

	}

}
