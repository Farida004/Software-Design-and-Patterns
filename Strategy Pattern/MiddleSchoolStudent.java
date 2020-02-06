package Lab;

public class MiddleSchoolStudent extends Student {

	public MiddleSchoolStudent(String name, int id) {
		super(name, id);
		transport = new ByTrain();
		classes = new TwoClasses();
	}

	public String display() {
		return "My name is " + " " + studentname + " Im a middle School Student";
	}

}
