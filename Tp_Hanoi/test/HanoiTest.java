import org.junit.*;
import static org.junit.Assert.*;
import hanoi.util.Tower; 
import hanoi.util.Disc; 
import hanoi.hanoi;

public class HanoiTest {
	
	
	@Test
	public void testCreationHanoi(){
		hanoi ha = new hanoi(6);
		assertEquals(ha.getTower(1).getNbDisc(),ha.getTower(2).getNbDisc());
		assertEquals(6,ha.getTower(0).getNbDisc());
	}
	
	
	@Test
	public void testmoveOneDisc(){
	    hanoi ha = new hanoi(6);
	    ha.moveOneDisc(0,1);
	    assertEquals(1,ha.getTower(1).getNbDisc());
	    assertEquals(5,ha.getTower(0).getNbDisc());
	    
	}	

	
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(HanoiTest.class);
    }

}
