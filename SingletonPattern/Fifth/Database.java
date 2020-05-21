package Fifth;

public class Database {
	protected static Database uniqueDb;

	protected Database() {
	}

	public static synchronized Database getInstance() {
		if (uniqueDb == null) {
			uniqueDb = new Database();
		}
		return uniqueDb;
	}

	public void connecToDb() {
		System.out.println("Now you are connected to DB. Start reading the contents from " + uniqueDb.toString());
	}

	public String toString() {
		return " Database ";
	}

}
