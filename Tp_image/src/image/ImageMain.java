package image;
import image.*;
import image.color.*;
import java.util.*;


public class ImageMain{

  public static void main(String[] args){
	  Image newimage= Image.initImagePGM(args[0]);
	  ImageDisplayer imageDisplayer = new ImageDisplayer();
    imageDisplayer.display(newimage,"example",0,0);
    Image imageModifiee2=newimage.edge(Integer.parseInt(args[1]));
    imageDisplayer.display(imageModifiee2,"edge",600,0);
     Image newimage2= Image.initImagePGM(args[0]);
     Image imageModifiee=newimage2.decreaseNbGrayLevels(Integer.parseInt(args[2]));
    imageDisplayer.display(imageModifiee,"modifié",300,0);
}}
