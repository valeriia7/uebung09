package ueb09.fz;

public class Fahrzeug {
    private String hersteller;
    private String modell;
    Bremsen[] bremsens;


    public Fahrzeug(String hersteller, String modell, Bremsen[]bremsens) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.bremsens = bremsens;


    }
    public String toString () {
        return "Ich bin ein " + hersteller + " " + modell + " mit ";
    }
}

