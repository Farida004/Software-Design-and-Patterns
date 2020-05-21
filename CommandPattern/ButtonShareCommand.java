package Lab6;

/**
 * Concrete example of a button
 * 
 * @author Farida
 *
 */
public class ButtonShareCommand implements Command {
	Button btn;

	public ButtonShareCommand(Button btn) {
		this.btn = btn;
	}

	@Override
	public void execute() {
		btn.share();

	}

	@Override
	public void undo() {
		btn.exit();

	}

}
