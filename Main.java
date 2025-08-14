public class Main {
    public static void main(String []args) {
        User user = new User("Mariam");
        user.addAsset(new Cash(50000.0));
        user.addAsset(new Gold(80.0, 8000));
        user.addDebt(10000);
        ZakatCalculator c = new ZakatCalculator(user);
        if (c.isEligible())
            System.out.println("Amount of Zakat" + c.zakatCalculator());
        else
            System.out.println("Not eligible for zakat");


    }

}
