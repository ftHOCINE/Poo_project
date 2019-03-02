import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;
import goosegame.*;
public class WaitingCellTest {

  private Cell c1;

  @Before
  public void setUp(){
    this.c1 = new WaitingCell(0,1);
  }

  @Test
  public void canMoveTest(){
    assertFalse( c1.canBeLeft() );
    assertTrue( c1.canBeLeft() );
  }



  public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(WaitingCellTest.class);
  }

}
