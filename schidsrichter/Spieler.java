
/**
 * @author 
 * @version 
 */
public class Spieler
{
    private String name;
    private int nummer;
    private int anzGelb;
    private boolean imSpiel;
    
    public Spieler(String pName, int pNummer, int pAnzGelb, boolean pImSpiel)
    {
        name = pName;
        nummer = pNummer;
        anzGelb = pAnzGelb;
        imSpiel = pImSpiel;
    }

    public String getName() {
        return name;
    }
    
    public int getNummer() {
        return nummer;
    }
    
    public int getGelbeKarte() {
        return anzGelb;
    }
    
    public void erhöheAnzahlGelberKarten() {
        anzGelb = anzGelb+1;
    }
    
    public boolean getImSpiel() {
        return imSpiel;
    }
    
    public void setImSpiel(boolean pImSpiel) {
        imSpiel = pImSpiel;
    }
    
    public void begeheFoul() {
        erhöheAnzahlGelberKarten();
        System.out.println(name + "hat ein Foul begangen. Anzahl an Gelben Karten: " + anzGelb);
    }
}