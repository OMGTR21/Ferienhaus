package ch.omgtr.ferienhaus;

public class Solarpanel {

	private Wetter wetter = new Wetter();
	private float energie;
	
	public Solarpanel(Wetter wetter) {
		
		this.wetter = wetter;
	}
	
	public Solarpanel() {
		
	}
	
	public float getEnergie() {
		
		return this.energie;
	}
}
