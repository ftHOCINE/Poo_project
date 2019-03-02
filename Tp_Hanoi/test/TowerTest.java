import org.junit.*;
import static org.junit.Assert.*;
import hanoi.util.Tower; 
import hanoi.util.Disc; 

public class TowerTest {
	
	
	@Test
	public void testCreationTower(){
		Tower t1=new Tower(6);
		assertEquals(6,t1.getCapacity());
		assertEquals(0,t1.getNbDisc());
	}
	
	
	@Test
	public void testPush(){
		Tower t1=new Tower(6);
		Disc dis= new Disc(10);	
	    assertEquals(0,t1.getNbDisc());
	    t1.push(dis);
	    assertEquals(1,t1.getNbDisc());
	    
	}	

	@Test
	public void testPop(){
		Tower t1=new Tower(6);
		Disc dis= new Disc(10);	
	    assertEquals(0,t1.getNbDisc());
	    t1.push(dis);
	    assertEquals(1,t1.getNbDisc());
	    assertEquals(0,t1.top().compareTo(t1.pop()));
	    assertEquals(0,t1.getNbDisc());
	    
	}		
	@Test
	public void testIsEmpty(){
		Tower t1=new Tower(6);
		assertTrue(t1.isEmpty());
	}
	@Test
	public void testIsFull(){
		Tower t1=new Tower(1);
		Disc dis= new Disc(10);
		t1.push(dis);
		assertTrue(t1.isFull());
	}	
	
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(TowerTest.class);
    }

}
