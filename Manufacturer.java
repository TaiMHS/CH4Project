package CH4Project;

import java.util.ArrayList;

public class Manufacturer extends Company {
    private int totalProduce;
    private int totalRaw;
    private String name;

    public Manufacturer(){
        super(Employees,freeEmp);
        name = "";
        totalProduce = 0;
        totalRaw = 0;
    }

    public int getProd(){
        return totalProduce;
    }

    public void setProd(int newint){
        totalProduce = newint;
    }

    public int getRaw(){
        return totalRaw;
    }

    public void setRaw(int newint){
        totalRaw = newint;
    }

    public String getName(){
        return name;
    }

    public void setName(String newstring){
        name = newstring;
    }

    public void Produce(int amount){
        totalRaw -= amount;
        totalProduce += amount;
    }

    public void Produce(Supplier s, Manufacturer m, int a){
    }

    public void Stock(Manufacturer m, Market ma, int a){
    }

    public void Stock(int amount){
        totalProduce -= amount;
    }

    public void Obtain(int amount){
        totalRaw += amount;
    }

    public void Obtain(Supplier s, int a){
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

    public String toString(){
        int totalemp = Employees+freeEmp;
        return name+" Employees: "+totalemp+" total raw: "+totalRaw+" total produced: "+totalProduce;
    }

    public int inventory(){
        return totalProduce + totalRaw;
    }

    public void sellProd(int amount){
        totalProduce -= amount;
    }

    public void sellRaw(int amount){
        totalRaw -= amount;
    }
}
