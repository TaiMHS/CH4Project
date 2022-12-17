package CH4Project;

import java.util.ArrayList;

public class Market extends Company {
    private int totalStocked;
    private Company Ownership;
    private String Name;

    public Market(Company O){
        super(Employees,freeEmp);
        Ownership = O;
        Name = "";
    }

    public String getName(){
        return Name;
    }

    public int getStock(){
        return totalStocked;
    }

    public void setStock(int newint){
        totalStocked = newint;
    }

    public Company getOwned(){
        return Ownership;
    }

    public void setName(String newstring){
        Name = newstring;
    }

    public void setOwned(Company c){
        Ownership = c;
    }

    public void bundle(int amount){// can't unbundle >:)
        totalStocked-= (amount-1);
    }

    public void sell(int amount){
        totalStocked -= amount;
    }

    public String toString(){
        return Name+" Stock: "+totalStocked+" Owned by: "+Ownership;
    }

    public void Produce(Supplier s, Manufacturer m, int a){
    }

    public void Stock(int amount){
        totalStocked += amount;
    }

    public void Stock(Manufacturer m, Market ma, int a){
    }

    public void Obtain(){
    }

    public void createMarket(String cname){
    }

    public void createManu(String cname){
    }

    public void createSupp(String cname){
    }

    public ArrayList<Market> getMarkets(){
        ArrayList<Market> x = null;
        return x;
    }

    public ArrayList<Manufacturer> getManu(){
        ArrayList<Manufacturer> x = null;
        return x;
    }

    public ArrayList<Supplier> getSupp(){
        ArrayList<Supplier> x = null;
        return x;
    }

    public int inventory(){
        return totalStocked;
    }
}
