import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Test;
import goosegame.*;
public class TeleportCellTest {

  private Cell c1;

  @Before
  public void setUp(){
    this.c1 = new TeleportCell(0,1);
  }

  @Test
  public void canMoveTest(){
    assertEquals( 3,c1.handleMove(2) );
   }



  public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(TeleportCellTest.class);
  }

}
