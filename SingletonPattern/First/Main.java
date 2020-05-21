package First;

public class Main {
	public static void main(String[] args) {
		Database db, db1;
		db = Database.getInstance("University");
		db1 = Database.getInstance("Office");
		db.connecToDb();
		db1.connecToDb();
		/**
		 * Despite db1 having another name passed to the constructor, running this class
		 * we will see the same outputs because db1 does not create a new Database
		 * instead it uses the db that was instantiated before.
		 */
	}
}
