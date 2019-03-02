package rental;
import static org.junit.Assert.*;
import org.junit.Test;

public class CarTest {

	@Test
	public void GetNbtTest() {
	    Car c= new Car("brand1","model1",2015,100.0f,5);
		assertEquals(5,c.getNbOfPlace());

	}
	public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(rental.CarTest.class);
    }
	}
