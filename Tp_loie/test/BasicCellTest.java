import org.junit.*;
import static org.junit.Assert.*;

import org.junit.Test;
import goosegame.*;
public class BasicCellTest {

  private Cell c1;

  @Before
  public void setUp(){
    this.c1 = new BasicCell(1);
  }

  @Test
  public void canMoveTest(){
    assertTrue( c1.canBeLeft() );
  }
@Test
public void getTest(){
	assertEquals(1,c1.getIndex());

}
@Test
public void handleTest(){
	assertEquals(5,c1.handleMove(5));
}
   
  public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(BasicCellTest.class);
  }

}
