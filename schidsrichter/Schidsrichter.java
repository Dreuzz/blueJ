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
        this.münze = münze;
    }

    public String getName() {
        return name;
    }

    public void pfeifen() {
        System.out.println("PFEIFEN!");
    }

    public void zeigeKarte(String pSpieler, String pKarte) {
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

    public String wirfMünze() {
        return münze.wirfMünze();
    }
}
