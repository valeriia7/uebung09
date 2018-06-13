package ueb09.fz;

public class Auto extends Fahrzeug {
	private int ps;
	private int hubraum;
	private int tankvolumen;
	private int zulGesamtGewicht;
	private int sitze;
	private int tueren;
	private Scheibenbremse[] bremsen;

	public Auto(String hersteller, String modell, int ps, int hubraum, int tankvolumen, int sitze, int tueren, int zulGesamtGewicht) {
		super(hersteller,modell, );
		this.ps = ps;
		this.hubraum = hubraum;
		this.tankvolumen = tankvolumen;
		this.sitze = sitze;
		this.zulGesamtGewicht = zulGesamtGewicht;

		this.bremsen = new Scheibenbremse[] {
				new Scheibenbremse(),
				new Scheibenbremse(),
				new Scheibenbremse(),
				new Scheibenbremse()
		};
	}

	public String toString() {
		return super.toString()
				+ ps + " PS, "
				+ hubraum + " Hubraum, "
				+ tankvolumen + " Tankvolumen, "
				+ sitze + " Sitzen, "
				+ tueren + " Türen, "
				+ bremsen.length + " " + bremsen[0].toString()
				+ " und " + zulGesamtGewicht + " zul. Gesamtgewicht";
	}
}
