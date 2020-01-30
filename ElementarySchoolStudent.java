package Lab;

public class ElementarySchoolStudent extends Student {

	public ElementarySchoolStudent() {

		transport = new ByBus();
		classes = new NoClasses();
	}
	public void display() {
		System.out.println("Im an Elementary Student");
	}
	

}
