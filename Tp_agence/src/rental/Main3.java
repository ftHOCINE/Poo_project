package rental;

public class Main3{
  public static void main(String[] args){
    Vehicle v1=new Vehicle("mercedes","cla",2018,100);
    Car v2=new Car("mercedes","clk",2017,120,5);
    MotorBike v3=new MotorBike("suzuki","c1100",2005,50,1000);
    RentalAgency agency=new RentalAgency();
    agency.addVehicle(v1);
    agency.addVehicle(v2);
    agency.addVehicle(v3);

    System.out.println("Les voitures de loye moin de 100 sont:");
    agency.displaySelection(new PriceCriterion(60));
    System.out.println("sinon :");
    agency.displaySelection(new PriceCriterion(150));





  }

}
