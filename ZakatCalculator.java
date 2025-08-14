public class ZakatCalculator {
private User u;
private double nisabAmount;


    public ZakatCalculator(User u,double nisabAmount) {
        this.u=u;
        this.nisabAmount = 87.48*9714;  //87.48 grams at ~BDT 9,714/gram
    }
public boolean calculateZakat() {
    return u.netWorth()>=nisabAmount;
}
public double zakatCalculator(){
        double u.netWorth()*.025;
}
}
