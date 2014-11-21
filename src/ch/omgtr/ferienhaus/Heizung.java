package ch.omgtr.ferienhaus;

public class Heizung {

	private float timer;
	private int stufe;
	private float temperatur;
	private float watt;
	
	public Heizung(float watt, int stufe) {
		
		this.stufe = stufe;
	}
	
	public Heizung() {}

	public float getTimer() {
		return timer;
	}

	public void setTimer(float timer) {
		this.timer = timer;
	}

	public int getStufe() {
		return stufe;
	}

	public void setStufe(int stufe) {
		this.stufe = stufe;
	}

	public float getTemperatur() {
		return temperatur;
	}

	public void setTemperatur(float temperatur) {
		this.temperatur = temperatur;
	}
	
	
}
