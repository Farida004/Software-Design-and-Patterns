package Lab;

/**
 * This class collects all necessary elements (classes) of Automobile software
 * in itself which hides the complexity of the system and simplifies the work to
 * a user(client)
 * 
 * @author Farida
 *
 */
public class AutomobileSoftwareFacade implements Software {
	Controller amp;
	Seat s;
	Window w;
	Conditioner c;
	Light l;
	CdPlayer cd;
	Radio r;

	public AutomobileSoftwareFacade(Controller amp, Seat s, Window w, Conditioner c, Light l, CdPlayer cd, Radio r) {
		this.amp = amp;
		this.s = s;
		this.w = w;
		this.c = c;
		this.l = l;
		this.cd = cd;
		this.r = r;
	}

	@Override
	public void startTheCar() {
		l.On();
		r.on();
		w.down();
		c.on();

	}

	@Override
	public void listenToCd(String cdTitle) {
		switch (cdTitle) {
		case "Dancing Queen":
			System.out.println("You are the dancing queen\r\n" + "Young and sweet\r\n" + "Only seventeen\r\n"
					+ "Dancing queen\r\n" + "Feel the beat from the tambourine, oh yeah............");
			break;
		case "Thunderstruck":
			System.out.println("Thunder, thunder, thunder, thunder\r\n" + "I was caught\r\n"
					+ "In the middle of a railroad track\r\n" + "I looked round\r\n"
					+ "And I knew there was no turning back\r\n" + "My mind raced\r\n"
					+ "And I thought what could I do\r\n" + "And I knew\r\n" + "There was no help, no help from you\r\n"
					+ "Sound of the drums\r\n" + "Beating in my heart\r\n" + "The thunder of guns\r\n"
					+ "Tore me apart\r\n" + "You've been\r\n" + "Thunderstruck");
			break;
		case "Time to say goodbye":
			System.out.println("Con te partir�\r\n" + "Paesi che non ho mai\r\n" + "Veduto e vissuto con te\r\n"
					+ "Adesso si li vivr�\r\n" + "Con te partir�\r\n" + "Su navi per mari\r\n" + "Che, io lo so\r\n"
					+ "No, no, non esistono pi�\r\n" + "Con te io li vivr�");
			break;
		case "Hotel California":
			System.out.println("\"Welcome to the Hotel California\r\n" + "Such a lovely place (Such a lovely place)\r\n"
					+ "Such a lovely face\r\n" + "Plenty of room at the Hotel California\r\n"
					+ "Any time of year (Any time of year)\r\n" + "You can find it here\"");
			break;
		}

	}

	@Override
	public void endCd() {
		System.out.println("Shutting down CD...");
		amp.off();
		amp.setCd(cd);
		cd.removeCD();
		cd.off();
	}

	@Override
	public void listenToRadio(double frequency) {
		System.out.println("Tuning in the airwaves...");
		r.on();
		r.setFrequency(frequency);
		amp.on();
		amp.setVolume(5);
		amp.setRadio(r);
	}

	@Override
	public void endRadio() {
		System.out.println("Shutting down the tuner...");
		r.off();
		amp.off();
	}

	@Override
	public void setSeatPosition() {
		System.out.println("Setting the most comfortable seat position....");
		s.foward();
	}

	@Override
	public void setTempHigher() {
		c.increaseTemp(3);

	}

}
