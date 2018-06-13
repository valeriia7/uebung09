package ueb09.fz;

public class Kraftfahrzeug extends Fahrzeug{
    private int ps;
    private int hubraum;
    private int tankvolumen;




    public Kraftfahrzeug(String hersteller, String modell, Bremsen[] bremsens, int hubraum, int ps, int tankvolumen) {
        super(hersteller, modell, bremsens);
        this.hubraum = hubraum;
        this.ps = ps;
        this.tankvolumen = tankvolumen;
    }

}
