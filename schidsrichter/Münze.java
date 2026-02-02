
/**
 * @author 
 * @version 
 */
public class Münze
{
    private boolean kopf;
    

    public Münze() {
        
    }
    
    public void werfen(){
        if (Math.random() < 0.5) {
            kopf = true;    
        }
        else {
            kopf = false;
        }
        System.out.println("Kopf: " + kopf);
    }
    
    public boolean getKopf() {
        return kopf;
    }
}