package N;

public class Nalog extends Korisnik{
	private int BrojNaloga;
	private int PIN;
	private double NaKartici;
	public Nalog(String ime, String prezime, int jMBG, int brojLicne, String prebivaliste, String adresa,
			int brojTelefona, int postanskiBroj, int brojNaloga, int pIN, double naKartici) {
		super(ime, prezime, jMBG, brojLicne, prebivaliste, adresa, brojTelefona, postanskiBroj);
		BrojNaloga = brojNaloga;
		PIN = pIN;
		NaKartici = naKartici;
	}
	public int getBrojNaloga() {
		return BrojNaloga;
	}
	public void setBrojNaloga(int brojNaloga) {
		BrojNaloga = brojNaloga;
	}
	public int getPIN() {
		return PIN;
	}
	public void setPIN(int pIN) {
		PIN = pIN;
	}
	public double getNaKartici() {
		return NaKartici;
	}
	public void setNaKartici(double naKartici) {
		NaKartici = naKartici;
	}
	



}
