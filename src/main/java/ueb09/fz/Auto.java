package ueb09.fz;

public class Auto extends Kraftfahrzeug {

	private int sitze;
	private int tueren;
	private Scheibenbremse[] bremsen;

	public Auto(String hersteller, String modell, int ps, int hubraum, int tankvolumen, int sitze,int zulGesamtGewicht,int tueren  ) {
		super(hersteller,modell, new Scheibenbremse[] {
				new Scheibenbremse(),
				new Scheibenbremse(),
				new Scheibenbremse(),
				new Scheibenbremse()},ps,hubraum,tankvolumen,zulGesamtGewicht);
		this.sitze = sitze;
		this.tueren = tueren;


	}

	public String toString() {
		return super.toString()+ "mit"
				+ sitze + " Sitzen, "
				+ tueren + " Türen, "
				+ bremsen.length + " " + bremsen[0].toString();

	}
}
