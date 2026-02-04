
/**
 * @author 
 * @version 
 */
public class Pfeife
{
    private int lautstärke;
    
    public Pfeife(int pLautstärke) {
        lautstärke = pLautstärke;
    }

    public int getLautstärke() {
        return lautstärke;    
    }
    
    public void setLautstärke(int pLautstärke) {
        lautstärke = pLautstärke;
    }
    
    public void pfeifen() {
        System.out.println("PFEIFEN");
    }
}