package image.color;
public class GrayColor{
  private int grayLevel;
  public static final GrayColor BLACK = new GrayColor(0);
  public static final GrayColor WHITE = new GrayColor(255);

  /**
  *Constructor of the GrayColor
  *@param level the level of the color
  */

  public GrayColor(int level){
      this.grayLevel=level;
  }


  /**
  *allows to get the gray level
  *@return the level of the color
  */

  public int getGrayLevel(){
      return this.grayLevel;
  }


  /**
  *allows to check if two colors are equals or no
  *@return <code>true</code> if are equals  <code>false</code> if no
  */
  public boolean equals(Object o){
    if (o instanceof GrayColor){
      GrayColor other=(GrayColor) o;
        return this.grayLevel==other.grayLevel;
    }else{
      return false;
      }
  }
}
