package Third;

/**
 * Another way to create a Database class and ensure it to be threadsafe, also
 * known as EAGER creation. Synchronizing the method can decrease the
 * performance so eager instantiation can be an option to prevent it. This
 * option relies heavily on JVM as it guarantees the creation of the unique
 * instance of the Database when the class is loaded
 * 
 * @author Farida
 *
 */
public class Database {
	private static Database uniqueDb = new Database();// creating instance of Database in a private static initializer
														// ensures
														// the code to be threadsafe

	private Database() {
	}

	/**
	 * In this case our getInstance method simply returns the static Database.
	 * 
	 * @return Database
	 */
	public static Database getInstance() {
		return uniqueDb;
	}

	public void connecToDb() {
		System.out.println("Now you are connected to DB. Start reading the contents ");
	}
}
