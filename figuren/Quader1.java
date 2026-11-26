package figuren;

public class Quader1{
  public double seiteA;
  public double seiteB;
  public double seiteC;
  
  public Quader1(double seiteA, double seiteB, double seiteC) {
    this.seiteA = seiteA;
    this.seiteB = seiteB;
    this.seiteC = seiteC;
  }
  
  public void showFlaeche(){
    double flaeche = 2 * (seiteA * seiteB + seiteA * seiteC + seiteB * seiteC);
    System.out.println("Fläche des Quaders ist: " + flaeche);
  }

  public void showInhalt(){
    double inhalt = seiteA * seiteB * seiteC;
    System.out.println("Inhalt des Quaders ist: " + inhalt);
  }
}