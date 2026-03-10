public class Geschirr {
    private double durchmesser;
    private double höhe;
    private double gewicht;
    
    public Geschirr(double pDurchmesser, double pHöhe, double pGewicht) {
        durchmesser = pDurchmesser;
        höhe = pHöhe;
        gewicht = pGewicht;
    }

    public double getDurchmesser() {
        return durchmesser;
    }

    public double getHöhe() {
        return höhe;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void stapeln() {
        System.out.println("stapeln");
    }
}