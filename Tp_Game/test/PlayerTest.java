import org.junit.*;
import static org.junit.Assert.*;
import game.strategie.*;
import game.*;



public class PlayerTest {



	@Test
	public void testconstplay(){
	strategie1 s= new strategie1();
	Player p1= new Player("p1",s);
	String c=p1.getName();
	assertEquals("p1",c);
	}
	
	
	
	@Test
	public void testAddP(){
		strategie1 s= new strategie1();
	Player p1= new Player("p1",s);
	int i =p1.getScore();
	assertEquals(i,0);
	p1.addPoints(2);
	int p=p1.getScore();
	assertEquals(p,2);
	}
	
public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(PlayerTest.class);
    }

}
