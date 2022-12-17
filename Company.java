package CH4Project;
import java.util.ArrayList;

public class Company {
    private String Name;
    protected static int Employees;
    protected static int freeEmp;
    private ArrayList<Market> markets;
    private ArrayList<Manufacturer> manus;
    private ArrayList<Supplier> supps;

    public Company(){
        Employees = 0;
        freeEmp = 0;
        markets = new ArrayList<Market>();
        manus = new ArrayList<Manufacturer>();
        supps = new ArrayList<Supplier>();
        Name = "";
    }

    public Company(int emp, int FEmp){
        Employees = emp;
        freeEmp = FEmp;
    }

    public int getEmp(){
        return Employees;
    }

    public String getName(){
        return Name;
    }

    public int getFEmp(){
        return freeEmp;
    }

    public int inventory(){// will be my source of polymorphism
        int totalitems = 0;
        for(Market x: markets){
            int item = x.getStock();
            totalitems += item;
        }

        for(Manufacturer x: manus){
            int itemprod = x.getProd();
            int itemraw = x.getRaw();
            totalitems += itemprod + itemraw;
        }

        for(Supplier x: supps){
            int item = x.getRaw();
            totalitems += item;
        }

        return totalitems;
    }

    public void setEmp(int newint){
        Employees = newint;
    }

    public void setName(String newstring){
        Name = newstring;
    }

    public void setFEmp(int newint){
        freeEmp = newint;
    }

    public void createMarket(String cname){
        Market newM = new Market(this);
        newM.setName(cname);
        markets.add(newM);
    }

    public void createManu(String cname){
        Manufacturer newM = new Manufacturer();
        newM.setName(cname);
        manus.add(newM);
    }

    public void createSupp(String cname){
        Supplier newM = new Supplier();
        newM.setName(cname);
        supps.add(newM);
    }

    public ArrayList<Market> getMarkets(){//1 = mark 2 = manu 3 = supp
        return markets;
    }

    public ArrayList<Manufacturer> getManu(){//1 = mark 2 = manu 3 = supp
        return manus;
    }

    public ArrayList<Supplier> getSupp(){//1 = mark 2 = manu 3 = supp
        return supps;
    }

    public void Produce(Supplier s, Manufacturer m, int amount){
        s.Produce(amount);
        m.Obtain(amount);
        m.Produce(amount);
    }

    public void Stock(Manufacturer m, Market mark, int amount){
        m.Stock(amount);
        mark.Stock(amount);
    }

    public void Obtain(Supplier s, int amount){
        s.Obtain(amount);
    }

    public String toString(){
        int totalemp = Employees + freeEmp;
        return Name+" Employees: "+totalemp;
    }
}
