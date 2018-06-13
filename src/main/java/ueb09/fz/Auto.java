package ueb09.fz;

public class Auto extends Kraftfahrzeug {
	private int zulGesamtGewicht;
	private int sitze;
	private int tueren;
	private Scheibenbremse[] bremsen;

	public Auto(String hersteller, String modell, int ps, int hubraum, int tankvolumen, int sitze, int tueren, int zulGesamtGewicht) {
		super(hersteller,modell, new Scheibenbremse[] {
				new Scheibenbremse(),
				new Scheibenbremse(),
				new Scheibenbremse(),
				new Scheibenbremse()},ps,hubraum,tankvolumen);
		this.sitze = sitze;
		this.zulGesamtGewicht = zulGesamtGewicht;

	}

	public String toString() {
		return super.toString()
				+ sitze + " Sitzen, "
				+ tueren + " Türen, "
				+ bremsen.length + " " + bremsen[0].toString()
				+ " und " + zulGesamtGewicht + " zul. Gesamtgewicht";
	}
}
