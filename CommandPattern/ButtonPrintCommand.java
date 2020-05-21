package Lab6;

/**
 * Concrete example of a button
 * 
 * @author Farida
 *
 */
public class ButtonPrintCommand implements Command {
	Button btn;

	public ButtonPrintCommand(Button btn) {
		this.btn = btn;
	}

	@Override
	public void execute() {
		btn.print();

	}

	@Override
	public void undo() {
		btn.exit();

	}

}
