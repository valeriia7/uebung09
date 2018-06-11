package ueb09.fz;

public class Fahrrad {
	private String hersteller;
	private String modell;
	private int gaenge;
	private boolean ruecktrittbremse;
	private Cantileverbremse[] bremsen;

	public Fahrrad(String hersteller, String modell, int gaenge, boolean ruecktrittbremse) {
		this.hersteller = hersteller;
		this.modell = modell;
		this.gaenge = gaenge;
		this.ruecktrittbremse = ruecktrittbremse;

		this.bremsen = new Cantileverbremse[] { new Cantileverbremse(), new Cantileverbremse() };
	}

	public String toString() {
		return "Ich bin ein " + hersteller + " " + modell + " mit "
				+ gaenge + " Gängen"
				+ (ruecktrittbremse ? ", Rücktrittbremse" : "")
				+ " und " + bremsen.length + " " + bremsen[0].toString();
	}
}
