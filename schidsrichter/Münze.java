
/**
 * @author 
 * @version 
 */
public class Münze
{
    private boolean kopf;

    public Münze() {
    }
    
    public void wirfMünze(){
        if (Math.random() < 0.5) {
            kopf = true;
            System.out.println("Kopf");    
        }
        else {
            kopf = false;
            System.out.println("Zahl");
        }
        
    }
    
    public boolean getKopf() {
        return kopf;
    }
}