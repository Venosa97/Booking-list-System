package compunereAgregare_Smartphone;

public class Speaker {
	
	private int maxVolume;
	private int crtVolume;
	
	public Speaker(int maxVolume) {
		this.maxVolume = maxVolume;
		this.crtVolume = (25 * maxVolume) / 100;
	}
	
	public Speaker(int maxVolume, int crtVolume) {
		
		if (crtVolume > maxVolume) {
			this.maxVolume = maxVolume;
			this.crtVolume = 0;
		}
		
		if (crtVolume <= maxVolume) {
			this.maxVolume = maxVolume;
			this.crtVolume = crtVolume;
		}
		
		if (crtVolume < 0) {
			this.crtVolume = 0;
		}

	}
	
	public boolean increaseVolume() {
		if (crtVolume == maxVolume) {
			return false;
		}
		crtVolume += 1;
		return true;
	}
	
	public boolean decreaseVolume() {
		if (crtVolume == 0) {
			return false;
		}
		crtVolume -= 1;
		return true;
	}
	
	public void setSilenceMode() {
		this.crtVolume = 0;
	}
	
}
