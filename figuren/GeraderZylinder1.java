package figuren;

public class GeraderZylinder1{
    public double radius;
    public double hoehe;

    public GeraderZylinder1(double radius, double hoehe){
        this.radius = radius;
        this.hoehe = hoehe;
    }

    public void showFlaeche(){
        double flaeche = 2 * Math.PI * radius * (radius + hoehe);
        System.out.println("Die Fläche beträgt: " + flaeche);
    }

    public void showInhalt(){
    double inhalt = Math.PI * radius * radius * hoehe;
    System.out.println("Inhalt des Geraden Zylinders ist: " + inhalt);
  }
}



//2 x pi x r x (r + h)