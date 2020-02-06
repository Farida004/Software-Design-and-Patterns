package Lab;

public class HIghSchoolStudent extends Student {
	public HIghSchoolStudent(String name, int id) {
		super(name, id);
		transport = new ByTrain();
		classes = new FourClasses();
	}

	public String display() {
		return "My name is " + " " + studentname + " Im a high school student ";
	}

}
