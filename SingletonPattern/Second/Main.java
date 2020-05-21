package Second;

public class Main {
	public static void main(String[] args) {
		Database db;
		db = Database.getInstance("Something");
		db.connecToDb();
	}

}
