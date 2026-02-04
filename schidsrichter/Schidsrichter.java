public class Schidsrichter
{
    private Münze münze;
    private Karte gelbeKarte;
    private Karte roteKarte;
    private Pfeife pfeife;
    private String name;

    public Schidsrichter(String pName, Münze pMünze, Karte pGelbeKarte, Karte pRoteKarte, Pfeife pPfeife) {
        roteKarte = pRoteKarte;
        gelbeKarte = pGelbeKarte;
        pfeife = pPfeife;
        münze = pMünze;
    }

    public String getName() {
        return name;
    }
    
    public int getLautstärke() {
        return pfeife.getLautstärke();
    }

    public void pfeifen(int pLautstärke) {
        pfeife.setLautstärke(pLautstärke);
        
        if (pLautstärke <= 50) {
            System.out.println("pfeifen!");
        }
        else if (pLautstärke > 50) {
            System.out.println("PFEIFEN!");           
        }
        else if (pLautstärke == 0) {
            System.out.println("SHHHH!");           
        }
    }

    public void zeigeKarte(int pSpieler, String pKarte) {
        if (pKarte == "gelb") {
            System.out.println("Gelbe Karte an" + pSpieler);
        }

        if (pKarte == "rot") {
            System.out.println("Rote Karte an" + pSpieler);
        }
        
        else{
            System.out.println("Ungültige Karte");
        }
    }

    public void wirfMünze() {
        münze.wirfMünze();
    }
}
