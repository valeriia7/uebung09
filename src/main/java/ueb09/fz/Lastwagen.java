package ueb09.fz;

public class Lastwagen extends Kraftfahrzeug {
	private int achsen;
	private int maxNutzlast;
	private int zulGesamtGewicht;
	private Trommelbremse[] bremsen;

	public Lastwagen(String hersteller, String modell, int achsen, int ps, int hubraum, int tankvolumen, int maxNutzlast, int zulGesamtGewicht) {
		super(hersteller,modell, baueBremsen(achsen *2 ), ps, hubraum, tankvolumen);
		this.achsen = achsen;
		this.maxNutzlast = maxNutzlast;
		this.zulGesamtGewicht = zulGesamtGewicht;



	}
	private static Bremsen[] baueBremsen(int n) {
		Bremsen[] bremsen = new Trommelbremse[n];
		for (int i = 0; i < bremsen.length; i++)
			bremsen[i] = new Trommelbremse();
		return bremsen;
	}
	public String toString() {
		return super.toString()
				+ achsen + " Achsen, "
				+ maxNutzlast + " max. Nutzlast, "
				+ bremsen.length + " " + bremsen[0].toString()
				+ " und " + zulGesamtGewicht + " zul. Gesamtgewicht";
	}
}
