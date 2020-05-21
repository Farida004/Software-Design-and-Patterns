package Lab6;

/**
 * It is an invoker which holds a command and asks that commands to carry our
 * the requests by execute method
 * 
 * @author Farida
 *
 */
public class Controller {
	Command[] Commands;
	Command undoCommand;

	public Controller() {
		Commands = new Command[5];
		Command noCommand = new noCommand();
		for (int i = 0; i < 5; i++) {
			Commands[i] = noCommand;
		}
	}

	public void setCommand(int slot, Command command) {
		Commands[slot] = command;
	}

	public void buttonWasPressed(int slot) {
		Commands[slot].execute();
		undoCommand = Commands[slot];
	}

	public void undoButtonWasPressed() {
		undoCommand.undo();
	}
}