import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;
import goosegame.*;
public class GooseCellTest {

  private Cell c1;

  @Before
  public void setUp(){
    this.c1 = new GooseCell(0);
  }


  @Test
  public void MoveTest(){
    assertEquals(10,c1.handleMove(5));
  }


  public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(GooseCellTest.class);
  }

}
