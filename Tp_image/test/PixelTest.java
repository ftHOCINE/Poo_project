import org.junit.*;
import static org.junit.Assert.*;

import image.color.GrayColor;
import image.Pixel;

public class PixelTest{

    @Test
    public void testGetColor(){
    GrayColor color1=new GrayColor(32);
    Pixel pixel1=new Pixel(color1);
    assertEquals(color1,pixel1.getColor());
}

  @Test
  public void testSetColor(){
  GrayColor color1=new GrayColor(64);
  GrayColor color2=new GrayColor(32);
  Pixel pixel1=new Pixel(color1);
  pixel1.setColor(color2);
  assertEquals(color2,pixel1.getColor());

}


    @Test
    public void testColorLevelDifference(){
      GrayColor color1=new GrayColor(64);
      GrayColor color2=new GrayColor(16);
      Pixel pixel1=new Pixel(color1);
      Pixel pixel2=new Pixel(color2);
      assertEquals(48,pixel1.colorLevelDifference(pixel2));


    }


    @Test
    public void equals(){
      GrayColor color1=new GrayColor(64);
      Pixel pixel1=new Pixel(color1);
      Pixel pixel2=new Pixel(color1);
      assertTrue(pixel1.equals(pixel2));


    }


        public static junit.framework.Test suite() {
            return new junit.framework.JUnit4TestAdapter(PixelTest.class);
        }

}
