
/**
 * @author 
 * @version 
 */
public class Karte
{
    private String farbe;
    
    public Karte(String pFarbe) {
        farbe = pFarbe;
    }
    
    public void zeigen() {
        System.out.println(farbe + "e Karte wird gezeigt");
    }
    
    public String getFarbe() {
        return farbe;
    }
}