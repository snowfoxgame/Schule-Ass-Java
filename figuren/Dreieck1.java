package figuren;

public class Dreieck1{
    public double seiteA;
    public double seiteB;
    public double seiteC;

    public Dreieck1(double seiteA, double seiteB, double seiteC){
        this.seiteA = seiteA;
        this.seiteB = seiteB;
        this.seiteC = seiteC;
    }

    public void showFlaeche(){
        double S = (seiteA + seiteB + seiteC) / 2;
        double inhalt = Math.sqrt(S * (S - seiteA) * (S - seiteB) * (S - seiteC));
        System.out.println("Das Ergebnis ist:" + inhalt);
    }
}