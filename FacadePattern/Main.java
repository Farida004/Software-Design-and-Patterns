package Lab;

public class Main {
	public static void main(String[] args) {
		Controller amp = new Controller("AC Controller 5000");
		Radio radio = new Radio("Pioneer", amp);
		CdPlayer cd = new CdPlayer("JVC", amp);
		Conditioner c = new Conditioner("Mitsubishi");
		Light l = new Light("Front Light");
		Seat s = new Seat("Front Seat");
		Window w = new Window("Front window");
		Bluetooth b = new Bluetooth("Samsung S7 edge");
		Playlist p = new Playlist("Farida's playlist");
		AutomobileSoftwareFacade asf = new AutomobileSoftwareFacade(amp, s, w, c, l, cd, radio);
		MobileSoftwareFacade msf = new MobileSoftwareFacade(s, w, c, l, radio, p, b);
		asf.startTheCar();
		asf.listenToCd("Dancing Queen");
		System.out.println("\n");
		asf.endCd();
		asf.setTempHigher();
		System.out.println("\n");

		Software mobsoft = new MobileSoftwareAdapter(msf);
		testAdapterS(mobsoft);
		System.out.println("\n");
		MobileSoftware soft = new AutomobileSoftwareAdapter(asf);
		testAdapterM(soft);

	}

	static void testAdapterS(Software s) {
		s.startTheCar();
		s.listenToCd("Time to say goodbye");

	}

	static void testAdapterM(MobileSoftware mss) {
		mss.startTheCar();
		mss.musicFromPaylist("Time to say goodbye");

	}
}
