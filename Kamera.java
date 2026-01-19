
/**
 * Write a description of class Kamera here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kamera
{
    private int aufloesungHor;
    private int aufloesungVer;

    private double speicherGesamt;
    private double speicherBelegt;
    
    public Kamera(int pHor, int pVer, double pGes) {
        aufloesungHor = pHor;
        aufloesungVer = pVer;
        speicherGesamt = pGes;
        speicherBelegt = 0;
    }
    
    public int getHor() {
        return aufloesungHor;
    }
    
    public int getVer() {
        return aufloesungVer;
    }
    
    public double getGes() {
        return speicherGesamt;
    }
    
    public double getBel() {
        return speicherBelegt;
    }
    
    public void filmen() {
        //...
    }
}