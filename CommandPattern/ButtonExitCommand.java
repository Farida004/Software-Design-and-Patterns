package Lab6;

/**
 * Concrete example of a button
 * 
 * @author Farida
 *
 */
public class ButtonExitCommand implements Command {
	Button btn;

	public ButtonExitCommand(Button btn) {
		this.btn = btn;
	}

	public void execute() {
		btn.exit();
	}

	@Override
	public void undo() {

	}
}
