package Lab;

/**
 * This class enables a Automobile Software to act like a Mobile Software
 * 
 * @author Farida
 *
 */
public class AutomobileSoftwareAdapter implements MobileSoftware {
	Software s;

	public AutomobileSoftwareAdapter(Software s) {
		this.s = s;
	}

	@Override
	public void startTheCar() {
		s.startTheCar();

	}

	@Override
	public void listenToRadio(double frequency) {
		s.listenToRadio(frequency);

	}

	@Override
	public void endRadio() {
		s.endRadio();
	}

	@Override
	public void setSeatPosition() {
		s.setSeatPosition();

	}

	@Override
	public void setTempHigher() {
		s.setTempHigher();

	}

	@Override
	public void musicFromPaylist(String song) {
		s.listenToCd(song);

	}

	@Override
	public void endMusicFromPaylist() {
		s.endCd();

	}

}
