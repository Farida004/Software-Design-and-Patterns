package Lab;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new MiddleSchoolStudent("Farida", 3842);
		student.driveToSchool();
		System.out.println(student.display());
		student.chooseClasses();
		student.setEligibility(new NoClasses());
		student.chooseClasses();
		student.grow(new ByTaxi(), new FourClasses());
		student.driveToSchool();
		student.chooseClasses();
	}
}
