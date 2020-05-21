package Lab6;

/**
 * Interface that is invoked by its execute and undo methods which asks a
 * receiver to perform the actions
 * 
 * @author Farida
 *
 */
public interface Command {
	public void execute();

	public void undo();
}
