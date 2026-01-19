
/**
 * Write a description of class Zapfsaeule here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zapfsaeule
{
    private double preisBenzin;
    private double preisDiesel;
    private double abgegebeneLiter;
    private String gewaehlterKraffstoff;
    
    // konstruktor
    public Zapfsaeule(double pPB, double pPD) {
        preisBenzin = pPB;
        preisDiesel = pPD;
    }
    
    // get
    public double getPB() {
        return preisBenzin;
    }
    
    public double getPD() {
        return preisDiesel;
    }
    
    public double getAL() {
        return abgegebeneLiter;
    }
    
    public String getGK() {
        return gewaehlterKraffstoff;
    }
    
    // set
    public void setPB(double pPreis) {
        preisBenzin = pPreis;
    }
    
    public void setPD(double pPreis) {
        preisDiesel = pPreis;
    }
    
    // methoden
    public void gibKraftstoffAb() {
        //...
    }
}
