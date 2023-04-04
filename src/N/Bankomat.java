package N;

public class Bankomat {
	private double NovacNaRaspolaganju;
	private String lokacija;

	public Bankomat(double novacNaRaspolaganju, String lokacija) {
		super();
		NovacNaRaspolaganju = novacNaRaspolaganju;
		this.lokacija = lokacija;
	}
	public double getNovacNaRaspolaganju() {
		return NovacNaRaspolaganju;
	}

	public void setNovacNaRaspolaganju(double novacNaRaspolaganju) {
		NovacNaRaspolaganju = novacNaRaspolaganju;
	}

	public String getLokacija() {
		return lokacija;
	}
	public void setLokacija(String lokacija) {
		this.lokacija = lokacija;
	}

	public static String raspored()
	{
		return PocetnaStranaBanke.tBankovniBudzet.getText();
	}


	@Override
	public String toString() {
		return "NovacNaRaspolaganju=" + NovacNaRaspolaganju + "\n " + "lokacija=" + lokacija + "\n\n";
	}



	
}
