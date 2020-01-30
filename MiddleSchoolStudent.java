package Lab;

public class MiddleSchoolStudent extends Student{

	public MiddleSchoolStudent() {
		transport = new ByTrain();
		classes = new TwoClasses();
	}
	public void display() {
		System.out.println("Im a middle School Student");
	}
}
