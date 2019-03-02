import org.junit.*;
import static org.junit.Assert.*;
import hanoi.util.Disc; 


public class DiscTest {
	
	
	@Test
	public void testCreationDisc(){
		Disc dis= new Disc(10);
		assertNotNull(dis);
		assertEquals(10, dis.getSize());
	}
	
	
	@Test
	public void testGetSize(){
		Disc dis= new Disc(10);	
	    assertEquals(10, dis.getSize());
	    
	}	
	
	@Test
	public void testCompareTo(){
		Disc dis= new Disc(10);
		Disc dis1= new Disc(20);
		Disc dis2= new Disc(5);
		assertEquals(1, dis.compareTo(dis2));
		assertEquals(-1, dis.compareTo(dis1));
		assertEquals(0, dis.compareTo(dis));
	}
	
	
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(DiscTest.class);
    }

}	
			
