package ueb09.fz;

public class Fahrrad extends Fahrzeug  {
	private int gaenge;
	private boolean ruecktrittbremse;
	private Cantileverbremse[] bremsen;

	public Fahrrad(String hersteller, String modell, int gaenge, boolean ruecktrittbremse) {
		super(hersteller,modell, new Cantileverbremse[] { new Cantileverbremse(), new Cantileverbremse() });
		this.gaenge = gaenge;
		this.ruecktrittbremse = ruecktrittbremse;


	}

	public String toString() {
		return super.toString()+ gaenge + " Gängen"
				+ (ruecktrittbremse ? ", Rücktrittbremse" : "")
				+ " und " + bremsen.length + " " + bremsen[0].toString();
	}
}
