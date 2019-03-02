package rental;
import static org.junit.Assert.*;
import org.junit.Test;

public class InterCriterionTest {

	@Test
	public void AddCriterionTest() {
	    InterCriterion l=new InterCriterion();
	    PriceCriterion prix=new PriceCriterion(100);
	    l.addCriterion(prix);
	    assertEquals(1,l.getCrit().size());
	}
	@Test
	public void isSatsified(){
		Vehicle v=new Vehicle("g","peug",2004,122);
		Vehicle v1=new Vehicle("k","peug",100,100);
		InterCriterion l=new InterCriterion();
		PriceCriterion prix=new PriceCriterion(100);
		l.addCriterion(prix);
		assertFalse(l.isSatisfiedBy(v));

		}
	public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(rental.InterCriterionTest.class);
    }
	}
