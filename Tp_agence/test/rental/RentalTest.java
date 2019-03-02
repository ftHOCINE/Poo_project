package rental;
import static org.junit.Assert.*;

import org.junit.Test;

public class RentalTest {
	@Test
	public void testGetAgence(){
		RentalAgency ag=new RentalAgency();
		assertEquals(0,ag.getAgence().size());
		Vehicle vehicle=new Vehicle("citroen","xara",2005,100);
		ag.addVehicle(vehicle);
		assertEquals(1,ag.getAgence().size());

	}
	@Test
	public void testGetRentedVehicles() throws IllegalStateException, UnknownVehicleException{
		RentalAgency ag=new RentalAgency();
		assertEquals(0,ag.getRentedVehicle().size());
		Vehicle vehicle=new Vehicle("citroen","xara",2005,100);
		Client c=new Client("a",21);
		ag.addVehicle(vehicle);
		ag.rentVehicle(c,vehicle);
		assertEquals(1,ag.getRentedVehicle().size());


	}
	@Test
	public void testAdvehicle() {
		RentalAgency ag=new RentalAgency();
		Vehicle vehicle=new Vehicle("citroen","xara",2005,100);
		assertFalse(ag.getAgence().contains(vehicle));
		ag.addVehicle(vehicle);
		assertTrue(ag.getAgence().contains(vehicle));
	}
	@Test
	public void testSelect(){
		RentalAgency ag=new RentalAgency();
		Vehicle vehicle=new Vehicle("citroen","xara",2005,100);
		Vehicle vehicle1=new Vehicle("renault","clio",2006,200);
		ag.addVehicle(vehicle);
		ag.addVehicle(vehicle1);
		PriceCriterion c=new PriceCriterion(120);
		assertEquals(1,ag.select(c).size());
		RentalAgency ag2=new RentalAgency();
		ag2.addVehicle(vehicle);
		ag2.addVehicle(vehicle1);
		PriceCriterion c2=new PriceCriterion(250);
		assertEquals(2,ag2.select(c2).size());
	}
	@Test(expected=UnknownVehicleException.class)
	  public void rentvehiclethrowsExceptionIfVehicleisUnknown() throws UnknownVehicleException {
		RentalAgency ag=new RentalAgency();
		Vehicle vehicle1=new Vehicle("citroen","xara",2005,100);
		ag.rentVehicle(new Client("a",21),vehicle1);
	  }


	@Test
	 public void rentVehicle() throws  UnknownVehicleException {
		RentalAgency ag=new RentalAgency();
		float a=100.66f;
		Vehicle vehicle1=new Vehicle("citroen","xara",2005,a);
		Client c=new Client("a",21);
		ag.addVehicle(vehicle1);
		assertEquals(a,ag.rentVehicle(c,vehicle1),0);
	}
   @Test
    public void hasrentedvehicl() throws UnknownVehicleException{
	   RentalAgency ag=new RentalAgency();
		Vehicle vehicle1=new Vehicle("citroen","xara",2005,100);
		Client c=new Client("a",21);
		Client c1=new Client("b",23);
		ag.addVehicle(vehicle1);
		ag.rentVehicle(c,vehicle1);
		assertTrue(ag.hasRentedAVehicle(c));
		assertFalse(ag.hasRentedAVehicle(c1));
   }
   @Test
    public void isRented() throws UnknownVehicleException{
	   RentalAgency ag=new RentalAgency();
		Vehicle vehicle=new Vehicle("citroen","xara",2005,100);
		Vehicle vehicle1=new Vehicle("renault","clio",2006,200);
		Client c=new Client("a",21);
		ag.addVehicle(vehicle);
		ag.rentVehicle(c,vehicle);
		assertTrue(ag.isRented(vehicle));
		assertFalse(ag.isRented(vehicle1));
   }
   @Test
   public void returnVehicles() throws UnknownVehicleException{
	   RentalAgency ag=new RentalAgency();
	   Vehicle vehicle=new Vehicle("citroen","xara",2005,100);
	   Client c=new Client("a",21);
	   ag.addVehicle(vehicle);
	   ag.rentVehicle(c,vehicle);
	   assertEquals(1,ag.getRentedVehicle().size());
	   ag.returnVehicle(c);
	   assertEquals(0,ag.getRentedVehicle().size());

   }
   @Test
   public void allRentedVehicl() throws UnknownVehicleException {
	   RentalAgency ag=new RentalAgency();
	   Vehicle vehicle=new Vehicle("citroen","xara",2005,100);
	   MotorBike motorbike=new MotorBike("zenati","renault",2005,180,6);
	   Vehicle v=new Vehicle("clio","renault",200,666);
	   Client c=new Client("a",21);
	   Client c1=new Client("b",27);
	   ag.addVehicle(v);
	   ag.addVehicle(vehicle);
	   ag.rentVehicle(c,vehicle);
	   ag.rentVehicle(c1,v);
	   assertEquals(2,ag.allRentedVehicles().size());

   }
    public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(rental.RentalTest.class);
    }

}
