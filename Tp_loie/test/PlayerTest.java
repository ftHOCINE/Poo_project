import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;
import goosegame.*;
public class PlayerTest {

  private Player p1;
  private Cell c1;
  private Cell c2;


  @Before
  public void setUp(){
    this.c1= new BasicCell(2);
    this.p1 = new Player("lounis",c1);
    this.c2= new BasicCell(2);
  }

  @Test
  public void getCellTest(){
    assertSame(c1,p1.getCell());
    assertTrue(c1.canBeLeft());
  }
@Test
  public void setCellTest(){
    p1.setCell(c2);
    assertSame(p1.getCell(),c2);
  }
  public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(PlayerTest.class);
  }

}
