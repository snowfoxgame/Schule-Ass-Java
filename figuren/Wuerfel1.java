package figuren;

public class Wuerfel1 {
  public double seiteA;
  
  public Wuerfel1(double seiteA){
    this.seiteA = seiteA;
  }
  
  public void showFlaeche(){
    double flaeche = 6 * seiteA * seiteA;
    System.out.println("Fläche des Würfels ist: " + flaeche);
  }

  public void showInhalt(){
    double inhalt = seiteA * seiteA * seiteA;
    System.out.println("Inhalt des Würfels ist: " + inhalt);
  }
}