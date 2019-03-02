package rental;
import static org.junit.Assert.*;
import org.junit.Test;

public class SuspiciousRentalAgencyTest {

	 @Test
	 public void rentVehicleTest() throws  UnknownVehicleException {
		SuspiciousRentalAgency ag=new SuspiciousRentalAgency();
		float a=100.66f;
		Vehicle vehicle1=new Vehicle("citroen","xara",2005,a);
		Vehicle vehicle2=new Vehicle("c","peugeot",2005,a);
		Client c=new Client("a",21);
		Client c1=new Client("b",28);
		ag.addVehicle(vehicle1);
		ag.addVehicle(vehicle2);
		assertEquals(a*1.1f,ag.rentVehicle(c,vehicle1),0);
		assertEquals(a,ag.rentVehicle(c1,vehicle2),0);



	}
	public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(rental.SuspiciousRentalAgencyTest.class);
    }
}
