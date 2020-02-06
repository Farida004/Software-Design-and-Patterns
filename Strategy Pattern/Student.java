package Lab;

public abstract class Student {
	TransportationBehaviour transport;
	RegistrationEligibility classes;
	protected String studentname;
	private int id;

	public Student(String name, int id) {
		this.studentname = name;
		this.id = id;
	}

	public void driveToSchool() {
		transport.drive();
	}

	public void chooseClasses() {
		classes.register();
	}

	public void setTransport(TransportationBehaviour tb) {
		transport = tb;
	}

	public void setEligibility(RegistrationEligibility re) {
		classes = re;
	}

	public String display() {
		return "I am " + studentname + " " + "here is my id:" + id;
	}

	public void grow(TransportationBehaviour tb, RegistrationEligibility re) {
		setTransport(tb);
		setEligibility(re);
	}

}
