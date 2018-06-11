package ueb09.fz;

public class Lastwagen {
	private String hersteller;
	private String modell;
	private int achsen;
	private int ps;
	private int hubraum;
	private int maxNutzlast;
	private int tankvolumen;
	private int zulGesamtGewicht;
	private Trommelbremse[] bremsen;

	public Lastwagen(String hersteller, String modell, int achsen, int ps, int hubraum, int tankvolumen, int maxNutzlast, int zulGesamtGewicht) {
		this.hersteller = hersteller;
		this.modell = modell;
		this.achsen = achsen;
		this.ps = ps;
		this.hubraum = hubraum;
		this.tankvolumen = tankvolumen;
		this.maxNutzlast = maxNutzlast;
		this.zulGesamtGewicht = zulGesamtGewicht;

		bremsen = new Trommelbremse[achsen * 2];
		for (int i = 0; i < bremsen.length; i++)
			bremsen[i] = new Trommelbremse();

	}

	public String toString() {
		return "Ich bin ein " + hersteller + " " + modell + " mit "
				+ achsen + " Achsen, "
				+ ps + " PS, "
				+ hubraum + " Hubraum, "
				+ tankvolumen + " Tankvolumen, "
				+ maxNutzlast + " max. Nutzlast, "
				+ bremsen.length + " " + bremsen[0].toString()
				+ " und " + zulGesamtGewicht + " zul. Gesamtgewicht";
	}
}
