package ueb09.fz;

public class Kraftfahrzeug extends Fahrzeug {
    private int ps;
    private int hubraum;
    private int tankvolumen;
    private int zulGesamtGewicht;


    public Kraftfahrzeug(String hersteller, String modell, Bremsen[] bremsens, int hubraum, int ps, int tankvolumen,int  zulGesamtGewicht) {
        super(hersteller, modell, bremsens);
        this.hubraum = hubraum;
        this.ps = ps;
        this.tankvolumen = tankvolumen;
        this.zulGesamtGewicht =zulGesamtGewicht;
    }

    public String toString() {
        return super.toString()+ ps + " PS, "
                + hubraum + " Hubraum, "
                + tankvolumen + " Tankvolumen, "+ " und " + zulGesamtGewicht + " zul. Gesamtgewicht";

    }
}