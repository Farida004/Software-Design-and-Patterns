package Third;

public class Client {

	public static void main(String[] args) {
		Database db = Database.getInstance();
		db.connecToDb();
	}
}
