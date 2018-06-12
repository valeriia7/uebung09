package ueb09.fz;

public class Fahrrad extends Fahrzeug {
	private int gaenge;
	private boolean ruecktrittbremse;
	private Cantileverbremse[] bremsen;

	public Fahrrad(String hersteller, String modell, int gaenge, boolean ruecktrittbremse) {
		super(hersteller,modell,new Cantileverbremse[]);
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
