package Fifth;

public class StudentTable extends Database {
	protected static Database uniqueInstance;

	private StudentTable() {
		super();
	}

	public String toString() {
		return "Student Table";
	}
}
