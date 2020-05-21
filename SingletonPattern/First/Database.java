package First;

/**
 * This way of instantiation ensures a class will only have one instance and
 * also provides a global access to it. So, we are creating a Database and
 * letting it manage a single instance of itself.
 * 
 * @author Farida
 *
 */
public class Database {

	private static Database uniqueDb;// unique instance of our Database class(Signleton)

	/**
	 * private constructor ensures only Database can instantiate this class
	 */
	String name;

	private Database(String name) {
		this.name = name;
	}

	/**
	 * This method gives us ability to instantiate the class and return an instance
	 * of this class
	 * 
	 * @return Database
	 */
	public static Database getInstance(String name) {
		if (uniqueDb == null) {
			uniqueDb = new Database(name);
		}
		return uniqueDb;
	}

	/**
	 * Method responsible for connection establishment to the Database
	 */
	public void connecToDb() {
		System.out.println("Now you are connected to DB " + name + ". Start reading the contents ");
	}

}
