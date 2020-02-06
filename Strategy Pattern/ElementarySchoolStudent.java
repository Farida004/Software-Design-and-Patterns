package Lab;

public class ElementarySchoolStudent extends Student {

	public ElementarySchoolStudent(String name, int studentid) {
		super(name, studentid);
		transport = new ByBus();
		classes = new NoClasses();
	}

	public String display() {
		return "My name is " + " " + studentname + " Im an Elementary Student";
	}

}
