	package Fifth;

public class Main {
	public static void main(String[] args) {
		Database student = StudentTable.getInstance();
		Database instructor = InstructorTable.getInstance();
		System.out.println(student);
		System.out.println(instructor);
		student.connecToDb();
	}
}
