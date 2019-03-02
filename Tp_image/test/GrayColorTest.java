import org.junit.*;
import static org.junit.Assert.*;

import image.color.GrayColor;

public class GrayColorTest{


  @Test
  public void testEquals(){
    GrayColor color1=new GrayColor(64);
    GrayColor color2=new GrayColor(64);
    GrayColor color3=new GrayColor(32);
    assertTrue(color1.equals(color2));
    assertFalse(color1.equals(color3));

  }

  @Test
  public void testGetGrayLevel(){
    GrayColor color1=new GrayColor(64);
    assertEquals(64,color1.getGrayLevel());
  }

  @Test
  public void equals(){
    GrayColor color1=new GrayColor(64);
    GrayColor color2=new GrayColor(64);
    assertTrue(color1.equals(color2));
  }

  public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(GrayColorTest.class);
  }
}
