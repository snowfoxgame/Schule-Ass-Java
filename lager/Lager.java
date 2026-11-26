package lager;

public class Lager  { 
    private int bestand; 
    private final int MAXIMALE_KAPAZITAET = 1000;

    public Lager(int bestand) { 
        this.bestand = bestand; 
    } 

    public int getBestand() {
        return bestand;
    }

    public boolean entnehmeProdukte(int anzahl) { 
        if (anzahl <= 0) {
            System.out.println("Ungültige Anzahl.");
            return false;
        }

        if (bestand >= anzahl){
            bestand = bestand - anzahl;
            System.out.println("Es gibt genug im Lager, es wurden " + anzahl + " ausgegeben und es sind " + bestand + " übrig.");
            return true;
        }
        else {
            int ausgegeben = bestand;
            bestand = 0;
            System.out.println("Es gibt nicht genug im Lager, es wurden " + ausgegeben + " ausgegeben und das lager ist nun Leer.");
            return false;
        }
    } 

    public boolean produkteEinlagern(int anzahl) {
        if (anzahl <= 0) {
            System.out.println("Ungültige Anzahl.");
            return false;
        }

        if (bestand + anzahl <= MAXIMALE_KAPAZITAET) {
            bestand = bestand + anzahl;
            System.out.println("Es wurden " + anzahl + " Produkte eingelagert. Neuer Bestand: " + bestand);
            return true;
        }
        else {
            int eingelagert = MAXIMALE_KAPAZITAET - bestand;
            bestand = MAXIMALE_KAPAZITAET;
            System.out.println("Lager ist nun voll! Es konnten nur " + eingelagert + " Produkte eingelagert werden.");
            return false;
        }
    }
}
