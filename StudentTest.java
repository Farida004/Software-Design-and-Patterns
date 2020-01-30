package Lab;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new MiddleSchoolStudent();
		student.driveToSchool();
		student.chooseClasses();
		student.setEligibility(new NoClasses());
		student.chooseClasses();
		student.grow(new ByTaxi(), new FourClasses());
		student.driveToSchool();
		student.chooseClasses();
	}
}
