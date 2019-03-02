package image;
import image.*;
import image.color.*;

public class ImageExample{
  public static void main(String[] args){
    GrayColor gris=new GrayColor(64);
    GrayColor gris_1=new GrayColor(230);
    Image nouvelleImage=new Image(100,200);
    for (int row=10;row<30;row++){
      for (int col=30;col<60;col++){
        nouvelleImage.getPixel(row,col).setColor(GrayColor.BLACK);
      }
    }
    for (int row=50;row<70;row++){
      for (int col=50;col<100;col++){
        nouvelleImage.getPixel(row,col).setColor(gris);
      }
    }
    for (int row=20;row<40;row++){
      for (int col=110;col<160;col++){
        nouvelleImage.getPixel(row,col).setColor(gris_1);
      }
    }



    ImageDisplayer imageDisplayer = new ImageDisplayer();
    imageDisplayer.display(nouvelleImage,"example",0,0);

	Image imageModifiee2=nouvelleImage.edge(5);
    imageDisplayer.display(imageModifiee2,"edge",600,0);
    
    GrayColor gris1=new GrayColor(64);
    GrayColor gris_2=new GrayColor(230);
    Image nouvelleImage2=new Image(100,200);
    for (int row=10;row<30;row++){
      for (int col=30;col<60;col++){
        nouvelleImage2.getPixel(row,col).setColor(GrayColor.BLACK);
      }
    }
    for (int row=50;row<70;row++){
      for (int col=50;col<100;col++){
        nouvelleImage2.getPixel(row,col).setColor(gris1);
      }
    }
    for (int row=20;row<40;row++){
      for (int col=110;col<160;col++){
        nouvelleImage2.getPixel(row,col).setColor(gris_2);
      }
    }
  
     Image imageModifiee=nouvelleImage2.decreaseNbGrayLevels(2);
    imageDisplayer.display(imageModifiee,"modifié",300,0);
}
}
