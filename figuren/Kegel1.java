package figuren;

public class Kegel1 {

    public double radius;
    
    public Kegel1(double radius) {
        this.radius = radius;
    }

    public void showFlaeche() {
        // Formel für Kreisfläche: Pi * r * r
        double flaeche = Math.PI * radius * radius;
        System.out.println("Grundfläche des Kegels: " + flaeche);
    }

}