package image;
import image.*;
import image.Image;
import image.color.*;
import image.Pixel;

import java.util.*;

public class Image implements ImageInterface {

  private int width;
  private int height;
  private Pixel[][] pixels;

  /**
  *Constructor of the picture
  *@param width the width of the picture
  *@param height the height of the picture
  */
  public Image(int width,int height){
    this.width=width;
    this.height=height;
    pixels=new Pixel[this.width][this.height];
    GrayColor color = new GrayColor(255);
    for(int i = 0;i<this.width;i++){
      for(int j = 0;j<this.height;j++){
       this.pixels[i][j]=new Pixel(color);
       ;
      }
    }
    }


    /**
    *allows to get the width of the picture
    *@return the width of the picture
    */
  public int getWidth(){
    return this.width;
}

 /**
 *allows to get the height of the picture
 *@return the height of the picture
 */
  public int getHeight(){
    return this.height;
   }


   /** gets pixel at coord (x,y) of this image. (0,0) is top left corner pixel.
    * @param x the horizontal coordinate
    * @param y the vertical coordinate
    * @return pixel at coord x,y of this image. (0,0) is top left corner pixel.
    * @exception UnknownPixelException if pixel of coord (x,y) does not exist
   */
   public Pixel getPixel(int x, int y) throws UnknownPixelException{
     if( (x<0 || y<0) || (x>this.width || y>this.height))
     throw new UnknownPixelException("invalid pixel coordinates");
     else{
       return this.pixels[x][y];
     }
   }

   /** sets pixel at coord (x,y) of this image. (0,0) is top left corner pixel.
    * @param x the horizontal coordinate
    * @param y the vertical coordinate
    * @param pixel the new pixel
    * @exception UnknownPixelException if pixel of coord (x,y) does not exist
   */

   public void setPixel(int x, int y, Pixel pixel) throws UnknownPixelException{
     if( (x<0 || y<0) || (x>this.width || y>this.height)){
     throw new UnknownPixelException("invalid pixel coordinates");
   }
     else{
       this.pixels[x][y]=pixel;
     }
       }


     public void changeColorPixel(int x,int y,GrayColor color){
       if( (x<0 || y<0) || (x>this.width || y>this.height))
       throw new UnknownPixelException("invalid pixel coordinates");
       else{
         this.pixels[x][y].setColor(color);
       }
}
    public Image edge(int threshold) {
      for (int row = 0; row <this.width-1; row++) {
        for (int col = 0;col <this.height-1; col++){
            if((this.pixels[row][col].colorLevelDifference(this.pixels[row+1][col])>threshold)||(this.pixels[row][col].colorLevelDifference(this.pixels[row][col+1])>threshold)) {
              this.getPixel(row,col).setColor(GrayColor.BLACK);
            }
            else{
                this.getPixel(row,col).setColor(GrayColor.WHITE);
            }
          }
        }


      return this;
  }




  public Image decreaseNbGrayLevels(int nbGrayLevels) {
    Image nouvelleImage=this;
    int intervalle=256/nbGrayLevels;
    for (int i = 0; i< this.width; i++){
      for (int j= 0; j< this.height; j++){
        Pixel pixel = nouvelleImage.getPixel(i, j);
        int newGrayLevel=(pixel.getColor().getGrayLevel());
        int a=1;
        int b=a*intervalle;
        while (b<newGrayLevel){
        a=a+1;
        b=a*intervalle;
        }
        if (b>255){
          b=255;
        }
        GrayColor newColor=new GrayColor(b);
        Pixel newPixel=new Pixel(newColor);
        nouvelleImage.setPixel(i,j,newPixel);
      }
    }
    return this;
    }

    // ======================================================================
    /** Reads a PGM image from file.
     * It is assumed that file respects the following PGM file syntax:
     *  <ul><li> first line with string "P2"</li>
     *  <li>second line : a comment</li>
     *  <li>one int for width <code>w</code>, one int for height<code>h</code></li>
     *  <li>one int for max gray level (not used here, we consider this level to be 255 in our images)</li>
     *  <li><code>w</code> x <code>h</code> integers between 0 and max (for us max=255) for each pixel</li></ul>
     *
     * @param fileName the name of the image file in PGM format
     * @return the image built from the file
     */
    public static Image initImagePGM(String fileName) {
        Scanner scan = new Scanner(Image.class.getResourceAsStream(fileName));

        scan.nextLine(); // line P2
        scan.nextLine(); // line comment
        // read width
        int width = scan.nextInt();
        // read height
        int height = scan.nextInt();
        // read max gray level (not used)
        scan.nextInt();
        // create an initially white image
        Image result = new Image(width, height);
        // rad pixels
        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                result.changeColorPixel(y, x, new GrayColor(scan.nextInt()));
            }
        }
        return result;
    }


}
