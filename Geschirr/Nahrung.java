public class Nahrung extends Geschirr {
    public Nahrung(double pDurchmesser, double pHöhe, double pGewicht) {
        super(pDurchmesser, pHöhe, pGewicht);
    }

    public void Nahrungaufnehmen() {
        System.out.println("Nahrung aufgenommen.");
    }
}