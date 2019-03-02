import org.junit.*;
import static org.junit.Assert.*;
import image.color.*;
import image.*;

public class ImageTest{
  private Image image = new Image(10,5);

  @Before
  public void before(){
    this.image = new Image(100,200);
  }

  @Test
  public void testgetWidth(){
    assertEquals (100,this.image.getWidth());

  }
  @Test
  public void testgetHeight(){
    assertEquals (this.image.getHeight(),200);
  }



  @Test(expected=UnknownPixelException.class)
  public void getPixelthrowsExceptionIfxandyisnotvalide(){
    this.image.getPixel(102,202);
  }

  @Test(expected=UnknownPixelException.class)
  public void getPixelthrowsExceptionIfxisnotvalide(){
    this.image.getPixel(110,150);
  }

  @Test(expected=UnknownPixelException.class)
  public void getPixelthrowsExceptionIfyisnotvalide(){
    this.image.getPixel(105,205);
  }
  @Test
  public void testsetPixel(){
    GrayColor color = new GrayColor(64);
    Pixel pixel =  new  Pixel (color);
    this.image.setPixel(64,12,pixel);
    assertEquals(this.image.getPixel(64,12),pixel);



  }


// ---Pour permettre l'exécution des tests----------------------
    public static junit.framework.Test suite() {
      return new junit.framework.JUnit4TestAdapter(ImageTest.class);
    }

}
