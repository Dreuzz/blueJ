public class Geschirr
{
   private double durchmesser;
   private double hoehe;
   private double gewicht;
   public Geschirr(double pDurchmesser, double pHöhe, double pGewicht)
   {
       durchmesser = pDurchmesser;
       hoehe = pHöhe;
       gewicht = pGewicht;
   }
   
   public double getDurchmesser()
   {
       return durchmesser;
   }
   
   public double getHoehe()
   {
       return hoehe;
   }
   
   public double getGewicht()
   {
       return gewicht;
   }
   
   public void stapeln()
   {
       System.out.println("stapeln");
   }
}