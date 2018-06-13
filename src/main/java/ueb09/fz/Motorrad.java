package ueb09.fz;

public class Motorrad {
	private int ps;
	private int tankvolumen;
	private Scheibenbremse vorderbremse;
	private Trommelbremse hinterbremse;

	public Motorrad(String hersteller, String modell, int ps, int tankvolumen) {
		super(hersteller,modell,);
		this.ps = ps;
		this.tankvolumen = tankvolumen;

		this.vorderbremse = new Scheibenbremse();
		this.hinterbremse = new Trommelbremse();
	}

	public void anlassen() {
		System.out.println("Starte Motor...");
	}

	public String toString() {
		return super.toString()
				+ ps + " PS, "
				+ tankvolumen + " Litern Tankvolumen" +
				" sowie einer " + vorderbremse + " und " + hinterbremse;
	}
}
