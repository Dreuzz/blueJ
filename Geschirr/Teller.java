
/**
 * Beschreiben Sie hier die Klasse Teller.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Teller extends Geschirr

{

    private String tellerHöhe;
    private double Nahrungsaufnahme;

    public Teller(double pDurchmesser, double pHöhe, double pGewicht, String pTellerHöhe) {
        super(pDurchmesser, pHöhe, pGewicht);
        
        if(pTellerHöhe != "flach" || pTellerHöhe != "tief") {
            System.out.println("Teller höhe nur tief oder flach");
        } 
        else{
            tellerHöhe = pTellerHöhe;
            
        }
    }

    public String getTellerHöhe() {
        return tellerHöhe;
    }
    
    public double getNahrungsaufnahme() {
        return Nahrungsaufnahme;
    }
}
 