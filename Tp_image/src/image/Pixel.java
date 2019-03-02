package image;
import image.color.*;
import java.lang.Math.*;

public class Pixel{
    private GrayColor color;


/**
*Constructor of pixel
*@param n the value of color
*/
public Pixel(GrayColor num){
  this.color=num;
}
/**
*allows to change the value of color
*@param c the new color value
*/
public void setColor(GrayColor col ){
  this.color=col;

}
/**
*allows to get the color value
*@return the color value
*/
public  GrayColor getColor(){
  return this.color;
}

/**
*allows to check if two pixel are equals
*@param o the object with witch will be compared
*@return <code>true</code> if are equals <code>false</code> else
*/
public boolean equals(Object o){
  if (o instanceof Pixel){
    Pixel other=(Pixel)o;
    return this.getColor().equals(other.getColor());
  }else{
    return false;
  }

}
/**
*allows to get the difference between to pixel
*@param p pixel  with witch will be compared
*@return the difference value between the two  pixels
*/
public int colorLevelDifference(Pixel pix){
  return Math.abs(this.color.getGrayLevel()-pix.getColor().getGrayLevel());
}
}
