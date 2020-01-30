package Lab;

public abstract class Student {
	TransportationBehaviour transport;
	RegistrationEligibility classes;

	public Student() {
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

	public void grow(TransportationBehaviour tb, RegistrationEligibility re) {
		setTransport(tb);
		setEligibility(re);
	}

}
