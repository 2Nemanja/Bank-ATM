package N;

public class Korisnik {
	private String ime;
	private String prezime;
	private int JMBG;
	private int BrojLicne;
	private String prebivaliste;
	private String Adresa;
	private int BrojTelefona;
	private int PostanskiBroj;
	public Korisnik(String ime, String prezime, int jMBG, int brojLicne, String prebivaliste, String adresa,
			int brojTelefona, int postanskiBroj) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		JMBG = jMBG;
		BrojLicne = brojLicne;
		this.prebivaliste = prebivaliste;
		Adresa = adresa;
		BrojTelefona = brojTelefona;
		PostanskiBroj = postanskiBroj;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getJMBG() {
		return JMBG;
	}
	public void setJMBG(int jMBG) {
		JMBG = jMBG;
	}
	public int getBrojLicne() {
		return BrojLicne;
	}
	public void setBrojLicne(int brojLicne) {
		BrojLicne = brojLicne;
	}
	public String getPrebivaliste() {
		return prebivaliste;
	}
	public void setPrebivaliste(String prebivaliste) {
		this.prebivaliste = prebivaliste;
	}
	public String getAdresa() {
		return Adresa;
	}
	public void setAdresa(String adresa) {
		Adresa = adresa;
	}
	public int getBrojTelefona() {
		return BrojTelefona;
	}
	public void setBrojTelefona(int brojTelefona) {
		BrojTelefona = brojTelefona;
	}
	public int getPostanskiBroj() {
		return PostanskiBroj;
	}
	public void setPostanskiBroj(int postanskiBroj) {
		PostanskiBroj = postanskiBroj;
	}
	

	

	
	
	

}
