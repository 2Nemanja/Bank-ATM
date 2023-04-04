package N;

public class Trenutni {
	int brojNaloga;
	double kes;
	int pin;
	public Trenutni(int brojNaloga, double kes, int pin) {
		super();
		this.brojNaloga = brojNaloga;
		this.kes = kes;
		this.pin = pin;
	}
	public int getBrojNaloga() {
		return brojNaloga;
	}
	public void setBrojNaloga(int brojNaloga) {
		this.brojNaloga = brojNaloga;
	}
	public double getKes() {
		return kes;
	}
	public void setKes(double kes) {
		this.kes = kes;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
}
