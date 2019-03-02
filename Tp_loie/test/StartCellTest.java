import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Test;
import goosegame.*;
public class StartCellTest {

  private Cell c1;

  @Before
  public void setUp(){
    this.c1 = new StartCell();
  }

  @Test
  public void MoveTest(){
    assertEquals(5,c1.handleMove(5));
    assertTrue(c1.canBeLeft());
  }
  @Test
  public void isBusyTest(){
	assertTrue(c1.isBusy());
	
}
  public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(GooseCellTest.class);
  }

}
