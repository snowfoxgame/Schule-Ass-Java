import java.util.Scanner;
import fahrzeug.*;
import lager.*;
import figuren.*;


public class Main {
    static final String CYAN  = "\u001B[36m";
    static final String ROT   = "\u001B[31m";
    static final String GELB  = "\u001B[33m";
    static final String RESET = "\u001B[0m";

    public static void main(String[] args) {

        // Scanner für Benutzereingaben erstellen
        Scanner eingabe = new Scanner(System.in);
        boolean laeuft = true;

        while (laeuft) {
            // Menü anzeigen
            System.out.println("\n================Willkommen in Snow's Hauptmenü :3 ================\n");
            System.out.println(CYAN + "Bitte wählen Sie eine Option:\n" + RESET);
            System.out.println(CYAN + "[1. Figurenberechnung]" + "[2. Lagerverwaltung]" + "\n[3. Fahrzeugverwaltung]" + RESET + ROT + "[4. Abbrechen]" + RESET);
            // Benutzereingabe einlesen
            int auswahl = eingabe.nextInt();
            eingabe.nextLine();

            switch (auswahl) {
                case 1: // Figuren Berechnen
                    System.out.println("\n================Welche Figur möchten Sie berechnen?================\n");
                    System.out.println(CYAN + "\n[1. Würfel]" + "[2. Kegel]" + "\n[3. Quader]" + "[4. Gerader-Zylinder]" + "\n[5. Dreieck]" + RESET + ROT + "[6. Abbrechen]" + RESET);

                    int figurAuswahl = eingabe.nextInt();
                    eingabe.nextLine(); // Zeilenumbruch einlesen

                    switch (figurAuswahl) {
                        case 1: // Würfel Berechnung
                            System.out.println(CYAN + "\nBitte geben Sie die Seitenlänge a des Würfels ein:\n" + RESET);
                            double a = eingabe.nextDouble();
                            // Wuerfel1-Objekt erstellen und Berechnungen durchführen
                            Wuerfel1 w1 = new Wuerfel1(a);
                            w1.showFlaeche();
                            w1.showInhalt();
                            break;
                        case 2:{ // Kegel Berechnung
                            System.out.println(CYAN + "\nBitte geben Sie den Radius r des Kegels ein:\n" + RESET);
                            double r = eingabe.nextDouble();
                            // Kegel1-Objekt erstellen und Berechnungen durchführen
                            Kegel1 k1 = new Kegel1(r); 
                            k1.showFlaeche();
                            break;
                        }
                        case 3:{ // Quader Berechnung
                            System.out.println(CYAN + "\nBitte geben Sie die Länge l des Quaders ein:\n" + RESET);
                            double l = eingabe.nextDouble();
                            System.out.println(CYAN + "\nBitte geben Sie die Breite b des Quaders ein:\n" + RESET);
                            double b = eingabe.nextDouble();
                            System.out.println(CYAN + "\nBitte geben Sie die Höhe h des Quaders ein:\n" + RESET);
                            double hq = eingabe.nextDouble();
                            // Quader1-Objekt erstellen und Berechnungen durchführen
                            Quader1 q1 = new Quader1(l, b, hq);
                            q1.showFlaeche();
                            q1.showInhalt();
                            break;
                        }
                        case 4:{ // Gerader-Zylinder Berechnung
                            System.out.println(CYAN + "\nBitte geben Sie die Höhe h des Zylinders ein:\n" + RESET);
                            double h = eingabe.nextDouble();
                            System.out.println(CYAN + "\nBitte geben Sie den Radius r des Zylinders ein:\n" + RESET);
                            double r = eingabe.nextDouble();
                            // GeraderZylinder1-Objekt erstellen und Berechnungen durchführen
                            GeraderZylinder1 z1 = new GeraderZylinder1(r, h);
                            z1.showFlaeche();
                            z1.showInhalt();
                            break;
                        }
                        case 5: //Dreieck Berechnung
                            System.out.println(CYAN + "\nBitte geben Sie die Länge der Seite A des Dreiecks ein:\n" + RESET);
                            double seiteA = eingabe.nextDouble();
                            System.out.println(CYAN + "\nBitte geben Sie die Länge der Seite B des Dreiecks ein:\n" + RESET);
                            double seiteB = eingabe.nextDouble();
                            System.out.println(CYAN + "\nBitte geben Sie die Länge der Seite C des Dreiecks ein:\n" + RESET);
                            double seiteC = eingabe.nextDouble();
                            // Dreieck1-Objekt erstellen und Berechnungen durchführen
                            Dreieck1 d1 = new Dreieck1(seiteA, seiteB, seiteC);
                            d1.showFlaeche();
                            break;
                        case 6: // Abbrechen
                            break;
                        default:
                            System.out.println(GELB + "\nUngültige Auswahl. Bitte versuchen Sie es erneut. 1-5\n" + RESET);
                    }
                    break;
                case 2:
                    // Lagerverwaltung
                    System.out.println("\nStartbestand des Lagers eingeben:\n");
                    int startbestand = eingabe.nextInt();
                    Lager l1 = new Lager(startbestand);
                    boolean lagerLäuft = true;
                    // Lagerverwaltung Menü
                    while (lagerLäuft) {
                        System.out.println("\n================Lagerverwaltung================\n");
                        System.out.println(CYAN + "\n[1. Einlagern]       " + " [2. Auslagern]" + RESET);
                        System.out.println(CYAN + "[3. Bestand anzeigen]" + RESET + ROT + " [4. Beenden]" + RESET);
                        int aktion = eingabe.nextInt();
                        switch (aktion) {
                            case 1: {
                                // Einlagern
                                System.out.println("\nMenge zum Einlagern eingeben:\n");
                                int anzahl = eingabe.nextInt();
                                l1.produkteEinlagern(anzahl);
                                break;
                            }
                            case 2: {
                                // Auslagern
                                System.out.println("\nMenge zum Auslagern eingeben:\n");
                                int anzahl = eingabe.nextInt();
                                l1.entnehmeProdukte(anzahl);
                                break;
                            }
                            case 3: {
                                // Bestand anzeigen
                                System.out.println("\nAktueller Bestand: " + l1.getBestand() + "\n");
                                break;
                            }
                            case 4: {
                                // Beenden
                                lagerLäuft = false;
                                break;
                            }
                            default:{
                                System.out.println("\nUngültige Auswahl.\n");
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                    // Fahrzeugverwaltung
                    System.out.println("\nGib die Marke des Autos ein:\n");
                    String marke = eingabe.next();
                    Auto auto = new Auto();
                    boolean fahrzeugLäuft = true;

                    while (fahrzeugLäuft) {
                        System.out.println(CYAN + "\n================Fahrzeugverwaltung================\n" + RESET);
                        System.out.println(CYAN + "\n[1. Fahren]" + "[2. Hupen]" + "\n[3. Auto Eintragen]" + "[4. Auto Auslesen]" + RESET + ROT + "\n[5. Beenden]" + RESET);
                        int FahrzeugVerwaltungWahl = eingabe.nextInt();
                        switch (FahrzeugVerwaltungWahl) {
                            case 1:
                                auto.fahren(marke);
                                break;
                            case 2:
                                auto.hupen(marke);
                                break;
                            case 3:
                                System.out.println(CYAN + "\nGib die Marke des Autos ein:" + RESET);
                                marke = eingabe.next();
                                break;
                            case 4:
                                System.out.println(CYAN + "\nDie Marke des Autos ist: " + RESET + marke);
                                break;
                            case 5:
                                fahrzeugLäuft = false;
                                break;
                            default:
                                System.out.println(GELB + "\nUngültige Auswahl." + RESET);
                                break;
                        }
                    }
                    break;
                case 4:
                    laeuft = false;
                    System.out.println(ROT + "\nProgramm wird beendet." + RESET);
                    break;
                default:
                    System.out.println(GELB + "\nUngültige Auswahl. Bitte versuchen Sie es erneut." + RESET);
            }
        }
    }
}
