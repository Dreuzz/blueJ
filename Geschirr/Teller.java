public class Teller extends Nahrung {
    private String tellerHöhe;

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
}
 