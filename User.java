import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private double debt;
    private List<Asset> assetList;

   public User(String name){
       this.name=name;
       this.assetList=new ArrayList<>();
       this.debt=0;
   }
public void addAsset(Asset a){
       assetList.add(a);
}
public void addDebt(double amount){
       debt+=amount;
}
public double totalAsset(){
      double  total=0;
       for(Asset a:assetList){
            total+= a.getValue();
       }
       return total;
}
public double netWorth(){
       return totalAsset()-debt;
}



}
