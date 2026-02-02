public class Schidsrichter
{
    private String muenze;
    private boolean gelbeKarte;
    private boolean roteKarte;
    private boolean pfeife;

    public Schidsrichter() {
        roteKarte = false;
        gelbeKarte = false;
        pfeife = false;
        muenze = "null";
    }

    public boolean getPfeife() {
        return pfeife;        
    }

    public boolean getGelbeKarte() {
        return gelbeKarte;    
    }

    public boolean getRoteKarte() {
        return roteKarte;    
    }

    public String getMuenze() {
        return muenze;
    }

    public void pfeifen() {
        System.out.println("PFEIFEN!");
        pfeife = true;
    }

    public void setGelbeKarte() {
        gelbeKarte = true;
    }

    public void setRoteKarte() {
        roteKarte = true;
    }

    public void muenzeEntscheidung(){
        if (Math.random() < 0.5) {
            muenze = "Kopf";    
        }
        else {
            muenze = "Zahl";
        }
        System.out.println(muenze);
    }

    public void test() {
        double test = Math.random();
        System.out.println(test);
    }
}
