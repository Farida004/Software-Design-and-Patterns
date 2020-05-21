package Fourth;

/**
 * This way of Singleton creating is useful when dealing with multithreading.
 * 
 * @author Farida
 *
 */
public class Database {

	private static Database uniqueDb;
	String name;

	private Database(String name) {
		this.name = name;
	}

	/**
	 * Additional synchronized keyword forces every incoming thread to wait for its
	 * turn before it can enter the getInstance method.Meaning that two threads
	 * would not be able to enter this method at the same time.
	 * 
	 * @param name
	 * @return Database
	 */
	public static synchronized Database getInstance(String name) {
		if (uniqueDb == null) {
			uniqueDb = new Database(name);
		}
		return uniqueDb;
	}

	public void connecToDb() {
		System.out.println("Now you are connected to DB " + name + ". Start reading the contents ");
	}
}
