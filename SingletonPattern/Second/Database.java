package Second;

/**
 * This approach is called a double-checking locking. The main advantage of it
 * is that it reduces the use of synchronization as it is expensive. So, as
 * performance is a key aspect of Database work this approach of implementing
 * Singleton pattern suits better as it drastically reduces the overhead
 * compared to the previous examples.
 * 
 * @author Farida
 *
 */
public class Database {
	private volatile static Database uniqueDb;
	// The volatile keyword in this case ensures multiple threads handle the
	// Database instance correctly. In other words, prevents memory writes to be
	// chaotic.

	String name;

	private Database(String name) {
		this.name = name;
	}

	public static Database getInstance(String name) {
		if (uniqueDb == null) {
			synchronized (Database.class) {
				if (uniqueDb == null) {
					uniqueDb = new Database(name);

				}
			}
		}
		return uniqueDb;
	}

	public void connecToDb() {
		System.out.println("Now you are connected to DB " + name + ". Start reading the contents ");
	}

}