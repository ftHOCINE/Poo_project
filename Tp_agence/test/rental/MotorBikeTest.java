package rental;
import static org.junit.Assert.*;
import org.junit.Test;

public class MotorBikeTest {

	@Test
	public void GetCylTest() {
	    MotorBike b= new MotorBike("brand1","model1",2015,100.0f,6);
		assertEquals(6,b.getCylindre());

	}
	public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(rental.MotorBikeTest.class);
    }
	}
