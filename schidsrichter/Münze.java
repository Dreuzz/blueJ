
/**
 * @author 
 * @version 
 */
public class Münze
{
    private boolean kopf;
    private int a;

    public Münze() {
        
    }
    
    public String wirfMünze(){
        if (Math.random() < 0.5) {
            kopf = true;
            a = a + 1;
            return "Kopf " + a;    
        }
        else {
            kopf = false;
            a = a + 1;
            return "Zahl " + a;
        }
        
    }
    
    public boolean getKopf() {
        return kopf;
    }
}