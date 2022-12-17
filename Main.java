package CH4Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static int ans;
    private static ArrayList<Company> companies = new ArrayList<Company>();
    private static ArrayList<Supplier> IndSupp = new ArrayList<Supplier>();
    private static Scanner a = new Scanner(System.in);
    public static void main(String args[]){
        while (ans != -1){
            System.out.println("1. Create Company");
            System.out.println("2. Create Market");
            System.out.println("3. Create Manufacturer");
            System.out.println("4. Create Supplier");
            System.out.println("5. Show All Companies");
            System.out.println("6. Show Company Markets");
            System.out.println("7. Show Company Manufacturers");
            System.out.println("8. Show Company Suppliers");
            ans = a.nextInt();
            switch(ans){
                case 1:
                System.out.print("Insert name: ");
                String newname = a.next();
                Company x = new Company();
                x.setName(newname);
                companies.add(x);
                break;
                case 2:
                if (companies.size() != 0){
                    int counter = 0;
                    for(Company comp: companies){
                        counter += 1;
                        System.out.println(counter+". "+comp);
                    }
                    System.out.println("Choose a company: ");
                    int case2ans = a.nextInt()-1;
                    System.out.print("Choose market name: ");
                    String case2v1ans = a.next();
                    companies.get(case2ans).createMarket(case2v1ans);
                }
                break;
                case 3:
                if (companies.size() != 0){
                    int counter = 0;
                    for(Company comp: companies){
                        counter += 1;
                        System.out.println(counter+". "+comp);
                    }
                    System.out.println("Choose a company: ");
                    int case3ans = a.nextInt()-1;
                    System.out.print("Choose manufacturer name: ");
                    String case3v1ans = a.next();
                    companies.get(case3ans).createManu(case3v1ans);
                }
                break;
                case 4:
                System.out.println("1.With Company\n2.No Company\nChoose an option: ");
                int case4v2ans = a.nextInt();
                if (companies.size() != 0 & case4v2ans == 1){
                    int counter = 0;
                    for(Company comp: companies){
                        counter += 1;
                        System.out.println(counter+". "+comp);
                    }
                    System.out.println("Choose a company: ");
                    int case4ans = a.nextInt()-1;
                    System.out.print("Choose supplier name: ");
                    String case4v1ans = a.next();
                    companies.get(case4ans).createManu(case4v1ans);
                }
                else if (case4v2ans == 2){
                    System.out.print("Choose supplier name: ");
                    String case4v1ans = a.next();
                    Supplier ns = new Supplier(case4v1ans);
                    IndSupp.add(ns);
                }
                break;
                case 5:
                for(Company comp: companies){
                    System.out.println(comp);
                }
                break;
                case 6:
                for(Company comp: companies){
                    System.out.println(comp);
                }
                if (companies.size() != 0){
                    int counter = 0;
                    for(Company comp: companies){
                        counter += 1;
                        System.out.println(counter+". "+comp);
                    }
                    System.out.println("Choose a company: ");
                    int case6ans = a.nextInt()-1;
                    for(Market m: companies.get(case6ans).getMarkets()){
                        System.out.println(m);
                    }
                }
                break;
                case 7:
                for(Company comp: companies){
                    System.out.println(comp);
                }
                if (companies.size() != 0){
                    int counter = 0;
                    for(Company comp: companies){
                        counter += 1;
                        System.out.println(counter+". "+comp);
                    }
                    System.out.println("Choose a company: ");
                    int case6ans = a.nextInt()-1;
                    for(Manufacturer m: companies.get(case6ans).getManu()){
                        System.out.println(m);
                    }
                }
                break;
                case 8:
                for(Company comp: companies){
                    System.out.println(comp);
                }
                if (companies.size() != 0){
                    int counter = 0;
                    for(Company comp: companies){
                        counter += 1;
                        System.out.println(counter+". "+comp);
                    }
                    System.out.println("Choose a company: ");
                    int case6ans = a.nextInt()-1;
                    for(Supplier m: companies.get(case6ans).getSupp()){
                        System.out.println(m);
                    }
                }
                try{
                for(Supplier m: IndSupp){
                    System.out.println(m);
                }
                }
                catch(Exception e){
                    System.out.println("No independent supplier"); //i don't think this try method would get here since index isn't used
                }
                break;
            }
            
        }
        
    }


}
