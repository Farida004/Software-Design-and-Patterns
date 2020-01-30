package Lab;

public class HIghSchoolStudent extends Student {
	public HIghSchoolStudent() {
		transport = new ByTrain();
		classes = new FourClasses();
	}

	public void display() {
		System.out.println("Im a high school student ");
	}
}
