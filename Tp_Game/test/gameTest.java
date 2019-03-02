import game.*;
import org.junit.*;
import static org.junit.Assert.*;
import game.strategie.*;

public class gameTest {


		@Test
		public void playGameTest(){
		strategie1 s= new strategie1();	
		Player p1= new Player("p1",s);
		Player p2= new Player("p2",s);
		game partie=new game(p1,p2,3);
		partie.playGame();
		assertEquals(3,p1.getScore());
		assertEquals(3,p2.getScore());
		assertEquals(3,partie.getNbTours());
		}
		
		
		
		public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(gameTest.class);
    }
	}
	
		
