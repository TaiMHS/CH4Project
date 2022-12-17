package CH4Project;

import java.util.ArrayList;

public class Supplier extends Company{
    private int totalraw;
    private String name;
    private int IEmployees = -1;
    private int IfreeEmp = -1;

    public Supplier(){
        super(Employees,freeEmp);
        totalraw = 0;
    }

    public Supplier(String Name){
        name = Name;
    }

    public int getRaw(){
        return totalraw;
    }

    public void setRaw(int newint){
        totalraw = newint;
    }

    public String getName(){
        return name;
    }

    public void setName(String newstring){
        name = newstring;
    }

    public void Produce(int amount){
        totalraw -= amount;
    }
    public void Produce(Supplier x, Manufacturer y, int a){
    }

    public void Stock(Manufacturer m, Market ma, int a){
    }

    public void Obtain(int amount){
        totalraw += amount;
    }

    public void Obtain(Supplier s, int amount){
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
        return name+" total raw: "+totalraw+" Employees: "+totalemp;
    }

    public int inventory(){
        return totalraw;
    }

    public void sell(int amount){
        totalraw -= amount;
    }

    public void setEmployee(int type, int amount){
        switch(type){
            case 1:
            if(IEmployees != -1){
                IEmployees = amount;
            }
            else{
                Employees = amount;
            }
            case 2:
            if(IfreeEmp != -1){
                IEmployees = amount;
            }
            else{
                freeEmp = amount;
            }
        }
    }

    public int getEmployee(int type){
        switch(type){
            case 1:
            if(IEmployees != -1){
                return IEmployees;
            }
            else{
                return Employees;
            }
            case 2:
            if(IfreeEmp != -1){
                return IfreeEmp;
            }
            else{
                return freeEmp;
            }
        }
        return -1;
    }

}
