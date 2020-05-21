package Lab6;

public class Test {

	public static void main(String[] args) {
		Controller remote = new Controller();
		Button btn = new Button();
		ButtonCutCommand cb = new ButtonCutCommand(btn);
		remote.setCommand(0, cb);
		remote.buttonWasPressed(0);
		remote.undoButtonWasPressed();
		System.out.println("\n");
		ButtonExitCommand eb = new ButtonExitCommand(btn);
		remote.setCommand(0, eb);
		remote.buttonWasPressed(0);
		remote.undoButtonWasPressed();
		System.out.println("\n");
		ButtonShareCommand shb = new ButtonShareCommand(btn);
		remote.setCommand(0, shb);
		remote.buttonWasPressed(0);
		remote.undoButtonWasPressed();
	}
}