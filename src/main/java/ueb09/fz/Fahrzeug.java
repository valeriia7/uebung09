package ueb09.fz;

public class Fahrzeug {
    private String hersteller;
    private String modell;
    private Bremsen[] bremsen;

    public Fahrzeug(String hersteller, String modell, Bremsen[] bremsen) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.bremsen = bremsen;

    }
    public String toString () {
        return "Ich bin ein " + hersteller + " " + modell + " mit ";
    }
}

