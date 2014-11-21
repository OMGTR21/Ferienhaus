package ch.omgtr.ferienhaus;

public class Batterie {
	
	float MAX_KAPAZITAET = 15000;
	float batEnergie; 
	
	public Batterie(float prozent) {
		
		this.batEnergie = prozent;
	}
	
	public Batterie() {}

	public float getBatEnergie() {
		return batEnergie;
	}

	public void setBatEnergie(float batEnergie) {
		this.batEnergie = batEnergie;
	}
	
	
	
}
