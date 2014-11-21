package ch.omgtr.ferienhaus;

public class Elektrogeraet {
	
	private boolean geraetEingeschalten = false;
	private float wattWert;
	
	public Elektrogeraet(float wattWert) {
		
		this.wattWert = wattWert;
	}
	
	public Elektrogeraet() {}

	public boolean isGeraetEingeschalten() {
		return geraetEingeschalten;
	}

	public void setGeraetEingeschalten(boolean geraetEingeschalten) {
		this.geraetEingeschalten = geraetEingeschalten;
	}

	public float getWattWert() {
		return wattWert;
	}

	public void setWattWert(float wattWert) {
		this.wattWert = wattWert;
	}
	
	
}
