package rental;

public class Main{
  public static void main(String[] args){
    Vehicle v1=new Vehicle("mercedes","cla",2018,100);
    Vehicle v2=new Vehicle("mercedes","clk",2017,120);
    Vehicle v3=new Vehicle("suzuki","marutti",2005,10);
    Vehicle v4=new Vehicle("suzuki","alto",2009,10);
    RentalAgency agency=new RentalAgency();
    agency.addVehicle(v1);
    agency.addVehicle(v2);
    agency.addVehicle(v3);
    agency.addVehicle(v4);
    System.out.println("Les voitures de marque mercedes sont :");
    agency.displaySelection(new BrandCriterion("mercedes"));
    System.out.println("Les voitures de marque suzuki sont :");
    agency.displaySelection(new BrandCriterion("suzuki"));
    System.out.println("Les voitures de loyer maximal 20 sont:");
    agency.displaySelection(new PriceCriterion(20));
    System.out.println("Les voitures de loyer maximal 150 sont:");
    agency.displaySelection(new PriceCriterion(150));






  }

}
