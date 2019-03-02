package rental;

public class Main4{
  public static void main(String[] args){
    Vehicle v1=new Vehicle("mercedes","cla",2018,100);
    Car v2=new Car("mercedes","clk",2017,120,5);
    MotorBike v3=new MotorBike("suzuki","c1100",2005,50,1000);
    Client client1= new Client("c1",16);
    System.out.println("Le client1 a :"+client1.getAge()+" ans"); 
    Client client2= new Client("c2",40);
    System.out.println("Le client2 a :"+client2.getAge()+" ans"); 
    Client client3= new Client("c3",30);
    System.out.println("Le client3 a :"+client3.getAge()+" ans"); 
    RentalAgency agency=new SuspiciousRentalAgency();
    agency.addVehicle(v1);
    agency.addVehicle(v2);
    agency.addVehicle(v3);
    float prix1=0;
    float prix2=0;
    float prix3=0;
    try{
    prix1= agency.rentVehicle(client1, v1);
    prix2= agency.rentVehicle(client2, v2);
    prix3= agency.rentVehicle(client3, v3);
    }
    catch( UnknownVehicleException e){
          System.out.println("error !!!");
    }
	 
    System.out.println("La voiture : "+v1.getBrand()+" "+v1.getDailyPrice()+" euro est louer pour client1 avec "+prix1+"euro");
     System.out.println("La voiture : "+v2.getBrand()+" "+v2.getDailyPrice()+" euro est louer pour client2 avec "+prix2+"euro");
      System.out.println("La voiture : "+v3.getBrand()+" "+v3.getDailyPrice()+" euro est louer pour client3 avec "+prix3+"euro");


  }

}


