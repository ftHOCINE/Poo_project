import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Test;
import goosegame.*;
public class TrapCellTest {

  private Cell c1;
  private Cell c2;

  @Before
  public void setUp(){
    this.c1 = new TrapCell(0);
    this.c2 = new TrapCell(1);
  }

  @Test
  public void canMoveTest(){
    assertFalse( c1.canBeLeft() );
    assertFalse( c2.canBeLeft() );
  }


  public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(TrapCellTest.class);
  }

}
