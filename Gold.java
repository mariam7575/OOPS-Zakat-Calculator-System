public class Gold extends Asset{
    private double weight;
private double pricePerGram;

   Gold(double weight,double pricePerGram){
       super( weight*pricePerGram);
       this.weight=weight;
       this.pricePerGram=pricePerGram;
   }




}
