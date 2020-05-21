package Lab;

/**
 * This class enables a Mobile Software to act like a Automobile Software
 * 
 * @author Farida
 *
 */
public class MobileSoftwareAdapter implements Software {
	MobileSoftware ms;

	public MobileSoftwareAdapter(MobileSoftware ms) {
		this.ms = ms;
	}

	@Override
	public void startTheCar() {
		ms.startTheCar();

	}

	@Override
	public void listenToCd(String cdTitle) {
		ms.musicFromPaylist(cdTitle);

	}

	@Override
	public void endCd() {
		ms.endMusicFromPaylist();

	}

	@Override
	public void listenToRadio(double frequency) {
		ms.listenToRadio(frequency);

	}

	@Override
	public void endRadio() {
		ms.endRadio();

	}

	@Override
	public void setSeatPosition() {
		ms.setSeatPosition();

	}

	@Override
	public void setTempHigher() {
		ms.setTempHigher();

	}

}